package com.zhangbaiquan.pro.controller.reservation;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.aliyuncs.exceptions.ClientException;
import com.zhangbaiquan.pro.po.base.Employee;
import com.zhangbaiquan.pro.po.livein.Livein;
import com.zhangbaiquan.pro.po.reservation.Reservation;
import com.zhangbaiquan.pro.po.reservation.ReservationExample;
import com.zhangbaiquan.pro.po.roommanagement.Room;
import com.zhangbaiquan.pro.po.security.Security;
import com.zhangbaiquan.pro.po.security.SecurityExample;
import com.zhangbaiquan.pro.service.livein.LiveinService;
import com.zhangbaiquan.pro.service.reservation.ReservationService;
import com.zhangbaiquan.pro.service.roommanagement.RoomService;
import com.zhangbaiquan.pro.util.AliyunSMSUtil;
import com.zhangbaiquan.pro.util.DateUtil;
import com.zhangbaiquan.pro.util.PageBean;
import com.zhangbaiquan.pro.util.ValidIdCardUtil;
import com.zhangbaiquan.pro.vo.SMSVO;

/**
 * 客房预定
 * @author ZhangBaiQuan
 *
 */

@Controller
@RequestMapping(value="/reservation")
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	@Autowired
	private RoomService roomService;
	@Autowired
	private LiveinService liveinService;
	
	
	/**
	 * 跳转至客房预定页面
	 * @param mv
	 * @param page
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/toreservation.action")
	public ModelAndView toreservation(ModelAndView mv, Integer page, HttpSession session){
		
		Employee user=(Employee) session.getAttribute("user");
		if(user==null){
			mv.setViewName("redirect:/loginPage.action");
			return mv;
		}
		
		mv.setViewName("reservation/reservation");
		return mv;	
	}
	/**
	 * 
	 * @param mv
	 * @param page
	 * @param session
	 * @param roomid
	 * @return
	 */
	@RequestMapping(value="/toreservationgrap.action")
	public ModelAndView toreservationgrap(ModelAndView mv, Integer page, HttpSession session,Integer roomid){
		
		Employee user=(Employee) session.getAttribute("user");
		if(user==null){
			mv.setViewName("redirect:/loginPage.action");
			return mv;
		}
		
		Room room = roomService.selectByPrimaryKey(roomid);
		String roomnum = room.getRoomnum();
		System.out.println("room = "+room);
		mv.addObject("roomid", roomid);
		mv.addObject("roomnum",roomnum);
		mv.setViewName("reservation/reservation");
		return mv;	
	}
	
	/**
	 * 取消预定
	 * @param mv
	 * @param page
	 * @param session
	 * @param roomid
	 * @return
	 */
	@RequestMapping(value="/cancelReservation.action")
	public ModelAndView cancelReservation(ModelAndView mv, Integer page, HttpSession session,String reserveidAndroomid){
		
		Employee user=(Employee) session.getAttribute("user");
		if(user==null){
			mv.setViewName("redirect:/loginPage.action");
			return mv;
		}
		String[] idarray = reserveidAndroomid.split(",");
		Integer reserveid = Integer.parseInt(idarray[0]);
		Integer roomid = Integer.parseInt(idarray[1]);
		
		Room room = roomService.selectByPrimaryKey(roomid);
		room.setCustomerid(-1);
		room.setReserveid(-1);
		room.setState(room.EMPTYNETROOM);
		roomService.updateByPrimaryKey(room);
		
		Reservation reservation = reservationService.selectByPrimaryKey(reserveid);
		reservation.setEx1("0");
		reservationService.updateByPrimaryKey(reservation);
		
		mv.setViewName("redirect:/roommanagement/realtime_data.action");
		return mv;	
	}
	
	/**
	 * 新增预定
	 * @param mv
	 * @param session
	 * @param livein
	 * @param roomid
	 * @return
	 * @throws InterruptedException 
	 * @throws ClientException 
	 */
	@RequestMapping(value="/reservationAdd.action")
	public ModelAndView reservationAdd(ModelAndView mv, HttpSession session,Reservation reservation,Integer roomid) throws ClientException, InterruptedException{
		
		Employee user=(Employee) session.getAttribute("user");
		if(user==null){
			mv.setViewName("redirect:/loginPage.action");
			return mv;
		}
		Room room = new Room();
		
//		roomid = roomService.getId(roomnum);
		
		roomid = roomService.getId(reservation.getRoomnum());
		room = roomService.selectByPrimaryKey(roomid);
		room.setState(room.RESERVATION);
		
		reservation.setEx1("1");
		reservation.setRoomid(roomid);
		reservation.setRoomnum(reservation.getRoomnum());
		reservation.setName(reservation.getName());
		reservation.setCardnum(reservation.getCardnum());
		reservation.setNumofpeople(reservation.getNumofpeople());
		reservation.setReservationtime(reservation.getReservationtime());
		reservation.setPhonenum(reservation.getPhonenum());
		reservation.setNote(reservation.getNote());

		reservationService.insertSelective(reservation);
		Integer maxReservationId = reservationService.getMaxReservationId();
		room.setCustomerid(null);
		room.setReserveid(maxReservationId);
		
		roomService.updateByPrimaryKeySelective(room);
		//调用短信接口发送预定成功短信
//		AliyunSMSUtil.MessagesSendDetails(reservation.getPhonenum(),reservation.getName(),reservation.getRoomnum(),SMSVO.RESERVATIONSUCCESS);
		mv.setViewName("redirect:/roommanagement/realtime_data.action");
		return mv;
	}
	@RequestMapping(value="/reservationlist.action")
	public ModelAndView reservationList(ModelAndView mv,Integer page,String cardnum,HttpSession session,String beginDate,String endDate,Reservation reservation,Integer roomid){
		
		Employee user=(Employee) session.getAttribute("user");
		if(user==null){
			mv.setViewName("redirect:/loginPage.action");
			return mv;
		}
		PageBean paging = new PageBean();
		paging.setPageSize(5);
		
		if (page != null && page > 0) {
			paging.setCurrentPage(page);
		}
		
		ReservationExample example = new ReservationExample();
		ReservationExample.Criteria criteria = example.createCriteria();
		criteria.andEx1EqualTo("1");
		
		if (cardnum != null && cardnum.length() > 0) {
			criteria.andCardnumLike("%"+cardnum+"%");
			mv.addObject("cardnum", cardnum);
		}
		if (beginDate != null && beginDate.length() > 0) {
			criteria.andReservationtimeGreaterThanOrEqualTo(DateUtil.String2Date(beginDate));
			mv.addObject("beginDate", beginDate);
		}
		if (endDate != null && endDate.length() > 0) {
			criteria.andReservationtimeLessThanOrEqualTo(DateUtil.String2Date(endDate));
			mv.addObject("endDate", endDate);
		}

		example.setOrderByClause("reservationtime desc");

		example.setPageSize(paging.getPageSize());
		example.setStartPos(paging.getStartPos());
		
		paging.setTotalRows(reservationService.countByExample(example));
		paging.setList(reservationService.selectByPageAndExample(example));
		mv.addObject("paging", paging);
		
		mv.setViewName("reservation/reservationlist");
		return mv;
	}
	
	/**
	 * Ajax验证该房间状态是否为空净房
	 * @param roomnum
	 * @return
	 * @throws ParseException
	 */
	@SuppressWarnings("unused")
	@RequestMapping("/validRoomNum.action")
	public @ResponseBody boolean validRoomNum(String roomnum) throws ParseException {
		
		Room room = new Room();
		
		if(roomnum == "" && roomnum == null) {
			return false;
		}else {
			Integer roomid = reservationService.getId(roomnum);
			if(roomid == null) {
				return false;
			}else {
				room = roomService.selectByPrimaryKey(roomid);
				String roomState = room.getState();
				if (room.EMPTYNETROOM.equals(roomState)) {
					return true;
				} else {
					return false;
				}
			}
		}
	}
	
	/**
	 * 转到修改
	 * @param mv
	 * @param session
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/toreservationModify")
	public ModelAndView toreservationModify(ModelAndView mv,HttpSession session,Integer reserveid,Integer roomid){
		
		Employee user=(Employee) session.getAttribute("user");
		if(user==null){
			mv.setViewName("redirect:/loginPage.action");
			return mv;
		}
		System.out.println("reserveid = "+reserveid);
		System.out.println("roomid = "+roomid);
		
		Room room = roomService.selectByPrimaryKey(roomid);
		
		reserveid = room.getReserveid();
		
		Reservation reservation = reservationService.selectByPrimaryKey(reserveid);
		mv.addObject("reservation",reservation);
		mv.addObject("roomid",roomid);
		System.out.println("reservation = "+reservation);
		mv.setViewName("reservation/reservationmodify");
		return mv;				
	}
	
	/**
	 * 修改
	 * @param mv
	 * @param request
	 * @param reservation
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/reservationmodify.action")
	public ModelAndView reservationmodify(ModelAndView mv, HttpServletRequest request,Reservation reservation,HttpSession session) {
		Employee user = (Employee) session.getAttribute("user");
		if (user == null) {
			mv.addObject("msg", "登录超时，请重新登录");
			mv.setViewName("login");
			return mv;
		}
		
		Reservation record = reservationService.selectByPrimaryKey(reservation.getReserveid());
		System.out.println();
		record.setRoomnum(reservation.getRoomnum());
		record.setName(reservation.getName());
		record.setCardnum(reservation.getCardnum());
		record.setNumofpeople(reservation.getNumofpeople());
		record.setReservationtime(reservation.getReservetime());
		record.setPhonenum(reservation.getPhonenum());
		record.setNote(reservation.getNote());
		
		reservationService.updateByPrimaryKeySelective(record);
		
		mv.setViewName("redirect:/reservation/reservationlist.action");
		return mv;
	}
	
	/**
	 * 单个删除
	 * @param mv
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/delete")
	public String delete(ModelAndView mv,Integer reserveid){
		
//		reservationService.deleteByPrimaryKey(id);
		
		Reservation reservation = reservationService.selectByPrimaryKey(reserveid);
		//做假删除
		reservation.setEx1("0");
		
		Integer roomid = reservation.getRoomid();
		Room room = roomService.selectByPrimaryKey(roomid);
		//做预定删除
		room.setCustomerid(-1);
		room.setReserveid(-1);
		
//		Integer id = null;
//		room.setCustomerid(id);
//		room.setReserveid(id);
		room.setState(room.EMPTYNETROOM);
		
		roomService.updateByPrimaryKeySelective(room);
		reservationService.updateByPrimaryKey(reservation);
		return "redirect:/reservation/reservationlist.action";		
	}
	
	/**
	 * 多个删除操作
	 * @param ids
	 * @return
	 */
	@RequestMapping(value = "deletelist")
	@ResponseBody
	public String delete(String ids) {
		String[] idarray = ids.split(",");
		int rows = 0;
		for (String id : idarray) {
			int reserveid = Integer.parseInt(id);
			
			Reservation reservation = reservationService.selectByPrimaryKey(reserveid);
			//做假删除
			reservation.setEx1("0");
//			int row = reservationService.deleteByPrimaryKey(reserveid);
			int row = reservationService.updateByPrimaryKey(reservation);
			
			
			if (row > 0) {
				ReservationExample example = new ReservationExample();
				ReservationExample.Criteria criteria = example.createCriteria();
				criteria.andReserveidEqualTo(reserveid);
//				reservationService.deleteByExample(example);
				
				//删除的预定时候设置好房间状态为空净房，同时清空顾客id 和预定id
				Integer roomid = reservation.getRoomid();
				Room room = roomService.selectByPrimaryKey(roomid);
				//设为null不行，只能设为整型，先设置-1看有没有问题
				room.setCustomerid(-1);
				room.setReserveid(-1);
				room.setState(room.EMPTYNETROOM);
				
				roomService.updateByPrimaryKeySelective(room);
				
				reservationService.updateByPrimaryKeySelective(reservation);
				
				rows += row;
			}
		}
		if (rows > 0) {
			return "success";
		} else {
			return "error";
		}
	}
	
}
