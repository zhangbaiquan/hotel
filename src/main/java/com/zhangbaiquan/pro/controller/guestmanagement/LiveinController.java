package com.zhangbaiquan.pro.controller.guestmanagement;

import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.aliyuncs.exceptions.ClientException;
import com.zhangbaiquan.pro.po.base.Employee;
import com.zhangbaiquan.pro.po.changeroom.Changeroom;
import com.zhangbaiquan.pro.po.livein.Livein;
import com.zhangbaiquan.pro.po.livein.LiveinExample;
import com.zhangbaiquan.pro.po.reservation.Reservation;
import com.zhangbaiquan.pro.po.roommanagement.Room;
import com.zhangbaiquan.pro.service.changeroom.ChangeroomService;
import com.zhangbaiquan.pro.service.livein.LiveinService;
import com.zhangbaiquan.pro.service.reservation.ReservationService;
import com.zhangbaiquan.pro.service.roommanagement.RoomService;
import com.zhangbaiquan.pro.util.AliyunSMSUtil;
import com.zhangbaiquan.pro.util.DateUtil;
import com.zhangbaiquan.pro.util.PageBean;
import com.zhangbaiquan.pro.util.ValidIdCardUtil;
import com.zhangbaiquan.pro.vo.SMSVO;

/**
 * 客人入住控制层
 * @author ZhangBaiQuan
 *
 */
@Controller
@RequestMapping(value="/guestmanagement")
public class LiveinController {
	
	@Autowired
	private LiveinService liveinService;
	@Autowired
	private RoomService roomService;
	@Autowired 
	private ChangeroomService changeroomService;
	@Autowired
	private ReservationService reservationService;
	
	/**
	 * 跳转至客人入住页面
	 * @param mv
	 * @param page
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/livein.action")
	public ModelAndView livein(ModelAndView mv, Integer page, HttpSession session){
		
		Employee user=(Employee) session.getAttribute("user");
		if(user==null){
			mv.setViewName("redirect:/loginPage.action");
			return mv;
		}
		mv.setViewName("guestmanagement/livein");
		return mv;
		
	}
	/**
	 * 图形化点击已预定类型房间    重定向过来的
	 * @param mv
	 * @param page
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/liveingrap.action")
	public ModelAndView liveingrap(ModelAndView mv, Integer page, HttpSession session,Integer roomid,Integer reserveid,String roomnum){
		
		Employee user=(Employee) session.getAttribute("user");
		if(user==null){
			mv.setViewName("redirect:/loginPage.action");
			return mv;
		}
		Reservation reservation = reservationService.selectByPrimaryKey(reserveid);
		
		System.out.println("name = "+reservation.getName());
		mv.addObject("reservation",reservation);
		mv.addObject("roomnum",roomnum);
		mv.addObject("roomid",roomid);
		mv.setViewName("guestmanagement/liveingrap");
		return mv;
		
	}
	/**
	 * 客人入住插入操作
	 * @param mv
	 * @param session
	 * @param livein
	 * @param roomid
	 * @return
	 * @throws InterruptedException 
	 * @throws ClientException 
	 */
	@RequestMapping(value="/liveinAdd.action")
	public ModelAndView liveinAdd(ModelAndView mv, HttpSession session,Livein livein,Integer roomid) throws ClientException, InterruptedException{
		
		Employee user=(Employee) session.getAttribute("user");
		if(user==null){
			mv.setViewName("redirect:/loginPage.action");
			return mv;
		}

		Room room = roomService.selectByPrimaryKey(roomid);
//		room.setState("已入住");
		//已入住
		room.setState(room.HASBEENIN);
		livein.setRoomnum(livein.getRoomnum());
		livein.setName(livein.getName());
		livein.setEx1("1");
		livein.setGender(livein.getGender());
		livein.setCheckintime(new java.util.Date(System.currentTimeMillis()));
		livein.setCertificatetype(livein.getCertificatetype());
		livein.setCertificatenum(livein.getCertificatenum());
		livein.setNote(livein.getNote());
		liveinService.insertSelective(livein);
		
		Integer maxReservationId = reservationService.getMaxReservationId();
		System.out.println("maxReservationId = "+maxReservationId);
		Integer maxId = liveinService.getMaxId();
		
		room.setCustomerid(maxId);
//		room.setReserveid(null);
		room.setReserveid(-1);
//		room.setReserveid();
		roomService.updateByPrimaryKeySelective(room);
		//调用短信接口发送入住成功短信
//		AliyunSMSUtil.MessagesSendDetails(livein.getEx2(),livein.getName(),livein.getRoomnum(),SMSVO.LIVEINSUCCESS);
		mv.setViewName("redirect:/roommanagement/realtime_data.action");
		return mv;
	}
	
	/**
	 * ajax验证合法身份证号
	 * @param certificatenum
	 * @return
	 * @throws ParseException 
	 */
	@RequestMapping("/validIdCard.action")
	public @ResponseBody boolean validIdCard(String certificatenum,String certificatetype) throws ParseException {
		String IdCard = certificatenum;
		String cardtype  =certificatetype;
		System.out.println("certificatenum = "+certificatenum);
		System.out.println("certificatetype = "+certificatetype );
		if("身份证".equals(cardtype)) {
			IdCard = IdCard.toUpperCase();
			if ("true" == ValidIdCardUtil.IDCardValidate(IdCard)) {
				return true;
			} else {
				return false;
			}
		}else {
			return true;
		}
		
		
	}
	
	
	@RequestMapping("/validIdCardtwo.action")
	public @ResponseBody boolean validIdCardtwo(String certificatenum) throws ParseException {
		String IdCard = certificatenum;
			IdCard = IdCard.toUpperCase();
			if ("true" == ValidIdCardUtil.IDCardValidate(IdCard)) {
				return true;
			} else {
				return false;
			}
		
	}
	
	/**
	 * 客人入住列表查询（列表方式）
	 * @param mv
	 * @param page
	 * @param customernum
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/liveinlist.action")
	public ModelAndView realtime_list(ModelAndView mv, Integer page,String customernum,String beginDate,String endDate,String certificatenum,HttpSession session){
		
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
		
		LiveinExample example = new LiveinExample();
		LiveinExample.Criteria criteria = example.createCriteria();
		criteria.andEx1EqualTo("1");
		
		if (customernum != null && customernum.length() > 0) {
//			criteria.andCustomernumEqualTo(customernum);
			criteria.andCustomernumLike("%"+customernum+"%");
			mv.addObject("certificatenum", customernum);
		}
		if (certificatenum != null && certificatenum.length() > 0) {
			criteria.andCertificatenumLike("%"+certificatenum+"%");
			mv.addObject("certificatenum", certificatenum);
		}
		
		if (beginDate != null && beginDate.length() > 0) {
			criteria.andCheckintimeGreaterThan(DateUtil.String2Date(beginDate));
			mv.addObject("beginDate", beginDate);
		}
		if (endDate != null && endDate.length() > 0) {
			criteria.andCheckintimeLessThan(DateUtil.String2Date(endDate));
			mv.addObject("endDate", endDate);
		}

		example.setOrderByClause("checkintime desc");
		
		example.setPageSize(paging.getPageSize());
		example.setStartPos(paging.getStartPos());
		
			
		paging.setTotalRows(liveinService.countByExample(example));
		paging.setList(liveinService.selectByPageAndExample(example));
		mv.addObject("paging", paging);
		

		mv.setViewName("guestmanagement/liveinlist");
		return mv;
		
	}
	
	/**
	 * 跳转至客人入住修改页面
	 * @param mv
	 * @param customerid
	 * @param roomid
	 * @return
	 */
	@RequestMapping(value="/toLiveinModify")
	public ModelAndView toLiveinModify(ModelAndView mv,Integer customerid,Integer roomid){
		Livein livein = new Livein();
		livein = liveinService.selectByPrimaryKey(customerid);
		String roomnum = livein.getRoomnum();
		livein.setRoomnum(livein.getRoomnum());
		mv.addObject("livein",livein);
//		System.out.println("roomid = "+roomid);
//		System.out.println("roomnum = "+roomnum);
		mv.addObject("roomid",roomid);
//		System.out.println("customerid = "+customerid);
//		System.out.println("livein = "+livein);
		mv.setViewName("guestmanagement/liveinModify");
		return mv;				
	}
	
	/**
	 * 客人入住信息修改
	 * @param mv
	 * @param request
	 * @param livein
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/modify.action")
	public ModelAndView modify(ModelAndView mv, HttpServletRequest request,Livein livein, HttpSession session) {
		Employee user = (Employee) session.getAttribute("user");
		if (user == null) {
			mv.addObject("msg", "登录超时，请重新登录");
			mv.setViewName("login");
			return mv;
		}
		Livein liveina = liveinService.selectByPrimaryKey(livein.getCustomerid());
		
		livein.setName(livein.getName());
		livein.setGender(livein.getGender());
		//入住时间不能修改
//		livein.setCheckintime(new java.util.Date(System.currentTimeMillis()));
		livein.setCertificatetype(livein.getCertificatetype());
		livein.setCertificatenum(livein.getCertificatenum());
		livein.setLeavetime(livein.getLeavetime());
		livein.setNote(livein.getNote());
		System.out.println(livein);
		liveinService.updateByPrimaryKeySelective(livein);
		
		mv.setViewName("redirect:/guestmanagement/liveinlist.action");
		return mv;
	}
	
	/**
	 * 客人入住信息列表方式下会单个删除操作
	 * @param mv
	 * @param customerid
	 * @return
	 */
	@RequestMapping(value="/delete")
	public String delete(ModelAndView mv,Integer customerid){
			liveinService.deleteByPrimaryKey(customerid);
			
			
		return "redirect:/guestmanagement/liveinlist.action";		
	}
	
	/**
	 * 客人入住信息列表方式下会单或多个删除操作，使用了ajax
	 * @param ids
	 * @return
	 */
	@RequestMapping(value = "deletelist")
	@ResponseBody
	public String delete(String ids) {
		
		String[] idarray = ids.split(",");
		int rows = 0;
		for (String id : idarray) {
			Integer customerid = Integer.parseInt(id);
			Integer rooid = roomService.customeridGetRoomid(customerid);
			
			
			
			Livein livein = liveinService.selectByPrimaryKey(customerid);
			int row = liveinService.deleteByPrimaryKey(customerid);
			if (row > 0) {
				LiveinExample example = new LiveinExample();
				LiveinExample.Criteria criteria = example.createCriteria();
				criteria.andCustomeridEqualTo(customerid);
				liveinService.deleteByExample(example);
				
				rows += row;
			}
		}
		if (rows > 0) {
			return "success";
		} else {
			return "error";
		}
	}
	
	/**
	 * 客人入住信息详情页面
	 * @param mv
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/showdetail")
	public ModelAndView showInfo(ModelAndView mv, Integer id) {
		Livein record = liveinService.selectByPrimaryKey(id);
		System.out.println(id);
		System.out.println(record);
		if (record == null) {
			mv.setViewName("errorPage");
			return mv;
		}
		LiveinExample example = new LiveinExample();
		LiveinExample.Criteria criteria = example.createCriteria();
		criteria.andCustomeridEqualTo(record.getCustomerid());
		List<Livein> list = liveinService.selectByExample(example);
		
	
		mv.addObject("details", list);
		mv.setViewName("guestmanagement/showinfo");
		return mv;

	}
	/**
	 * 退房
	 * @param mv
	 * @param request
	 * @param session
	 * @param customeridAndroomid
	 * @return
	 */
	@RequestMapping(value = "/checkout.action")
	public ModelAndView checkout(ModelAndView mv, HttpServletRequest request, HttpSession session,String customeridAndroomid) {
		Employee user = (Employee) session.getAttribute("user");
		if (user == null) {
			mv.addObject("msg", "登录超时，请重新登录");
			mv.setViewName("login");
			return mv;
		}

		
		String[] idarray = customeridAndroomid.split(",");
		Integer customerid = Integer.parseInt(idarray[0]);
		
		Changeroom changeroom = new Changeroom();
		System.out.println("customerid = "+customerid);
		//由customerid获取changeroom表主键id
//		Integer id = changeroomService.getChangeRoomId(customerid);
		List<Integer> ids = changeroomService.getChangeRoomListId(customerid);
	
		for(Integer id:ids) {
			changeroom = changeroomService.selectByPrimaryKey(id); 
			System.out.println("集合id = "+id);
			if("1".equals(changeroom.getEx1())) {
				changeroom.setEx1("0");
			}
			changeroomService.updateByPrimaryKeySelective(changeroom);
		}
		
//		changeroom = changeroomService.selectByPrimaryKey(id); 
//		System.out.println("id = "+id);
		System.out.println("changeroom = "+changeroom);
		
		System.out.println("changeroom.getEx1() = "+changeroom.getEx1());
		
		
//		if("1".equals(changeroom.getEx1())) {
//			changeroom.setEx1("0");
//		}
		
		
		
//		Integer roomid = Integer.parseInt(idarray[1]);
		
		
		Integer roomid = Integer.parseInt(idarray[1]);
		
		
		
//		System.out.println("customerid = "+customerid);
		Livein livein = liveinService.selectByPrimaryKey(customerid);
		//设置ex1备用字段为假删除标志
		livein.setEx1("0");
		livein.setLeavetime(new java.util.Date(System.currentTimeMillis()));
		String roomnum = livein.getRoomnum();
		Room room = roomService.selectByPrimaryKey(roomid);
		
		//想了想顾客id非主键，为了将脏房置为空净房的时候可以再查看一下上一个入住的顾客信息，这个字段可以先不置为空
//		room.setCustomerid(null);
//		room.setCustomerid(0);
		room.setState(room.DIRTYROOM);
		
//		changeroomService.updateByPrimaryKeySelective(changeroom);
		roomService.updateByPrimaryKey(room);
		
		//理应做假删除
		liveinService.updateByPrimaryKeySelective(livein);
//		liveinService.deleteByPrimaryKey(customerid);
		mv.setViewName("redirect:/roommanagement/realtime_data.action");
		return mv;
	}
	
	/**
	 * 已退房置为空房
	 * @param mv
	 * @param request
	 * @param room
	 * @param session
	 * @param roomid
	 * @return
	 */
	@RequestMapping(value = "/checkoutToEmpty.action")
	public ModelAndView checkoutToEmpty(ModelAndView mv, HttpServletRequest request,Room room, HttpSession session,Integer roomid,Integer customerid) {
		Employee user = (Employee) session.getAttribute("user");
		if (user == null) {
			mv.addObject("msg", "登录超时，请重新登录");
			mv.setViewName("login");
			return mv;
		}
		room = roomService.selectByPrimaryKey(roomid);
		room.setState(room.EMPTYNETROOM);
		System.out.println("roomid === "+roomid);
		System.out.println("customerid === "+customerid);
		roomService.updateByPrimaryKey(room);
		
		
		
		mv.setViewName("redirect:/roommanagement/realtime_data.action");
		return mv;
	}
	
	@RequestMapping(value = "/reservationToLivein.action")
	public ModelAndView reservationToLivein(ModelAndView mv, HttpServletRequest request,Room room, HttpSession session,String reserveidAndroomid) {
		Employee user = (Employee) session.getAttribute("user");
		if (user == null) {
			mv.addObject("msg", "登录超时，请重新登录");
			mv.setViewName("login");
			return mv;
		}
		
		String[] idarray = reserveidAndroomid.split(",");
		Integer reserveid = Integer.parseInt(idarray[0]);
		Integer roomid = Integer.parseInt(idarray[1]);
		
		Reservation reservation = reservationService.selectByPrimaryKey(reserveid);
		//此时预定的的确可以直接点击入住，但是预定信息真实性全面性不完整；所以携带预定信息跳至入住登记页面
		
		
		reservation.setEx1("0");
		
		reservationService.updateByPrimaryKey(reservation);
		room = roomService.selectByPrimaryKey(roomid);
//		room.setState(room.HASBEENIN);
//		System.out.println("roomid === "+roomid);
//		System.out.println("customerid === "+reserveid);
//		roomService.updateByPrimaryKey(room);
		String roomnum = room.getRoomnum();
		
		mv.addObject("roomnum", roomnum);
		mv.addObject("reserveid",reserveid);
		mv.addObject("roomid",roomid);
//		mv.addObject("reservation",reservation);
		mv.setViewName("redirect:/guestmanagement/liveingrap.action");
		return mv;
	}
	
	

	
}
