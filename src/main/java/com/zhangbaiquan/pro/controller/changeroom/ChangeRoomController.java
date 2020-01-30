package com.zhangbaiquan.pro.controller.changeroom;


import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zhangbaiquan.pro.po.base.Employee;
import com.zhangbaiquan.pro.po.changeroom.Changeroom;
import com.zhangbaiquan.pro.po.changeroom.ChangeroomExample;
import com.zhangbaiquan.pro.po.livein.Livein;
import com.zhangbaiquan.pro.po.roommanagement.Room;
import com.zhangbaiquan.pro.service.base.EmployeeService;
import com.zhangbaiquan.pro.service.changeroom.ChangeroomService;
import com.zhangbaiquan.pro.service.livein.LiveinService;
import com.zhangbaiquan.pro.service.roommanagement.RoomService;
import com.zhangbaiquan.pro.util.DateUtil;
import com.zhangbaiquan.pro.util.PageBean;
import com.zhangbaiquan.pro.vo.ChangeRoomVo;

@Controller
@RequestMapping(value="/changeroom")
public class ChangeRoomController {
	
	@Autowired
	private ChangeroomService changeroomService;
	@Autowired
	private LiveinService liveinService;
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private RoomService roomService;
	
	/**
	 * 跳转至换房action
	 * @param mv
	 * @param page
	 * @param session
	 * @param customeridAndroomid
	 * @return
	 */
	@RequestMapping(value="/tochangeroomadd.action")
	public ModelAndView tochangeroomadd(ModelAndView mv, Integer page, HttpSession session,String customeridAndroomid) {
		
		Employee user=(Employee) session.getAttribute("user");
		if(user==null){
			mv.setViewName("redirect:/loginPage.action");
			return mv;
		}
		String[] idarray = customeridAndroomid.split(",");
		System.out.println("customeridAndroomid = "+customeridAndroomid);
		Integer customerid = Integer.parseInt(idarray[0]);
		Integer roomid = Integer.parseInt(idarray[1]);
		Livein livein = new Livein();
		livein = liveinService.selectByPrimaryKey(customerid);
		livein.setRoomnum(livein.getRoomnum());
		mv.addObject("livein",livein);
		mv.addObject("roomid",roomid);
		mv.setViewName("changeroom/changeroomadd");
		return mv;
	}
	/**
	 * 新增换房
	 * @param mv
	 * @param page
	 * @param session
	 * @param changeroom
	 * @param changetoroom
	 * @param customerid
	 * @param roomid
	 * @return
	 */
	@RequestMapping(value="/changeroomadd.action")
	public ModelAndView changeroomadd(ModelAndView mv, Integer page, HttpSession session,Changeroom changeroom,String changetoroom,Integer customerid,Integer roomid) {
		
		Employee user=(Employee) session.getAttribute("user");
		if(user==null){
			mv.setViewName("redirect:/loginPage.action");
			return mv;
		}
		String emplyeeid = user.getEmplyeeid();
		user =  employeeService.selectByPrimaryKey(emplyeeid);
		user.setRealname(user.getRealname());
		
		Livein livein = new Livein();
		Room room = new Room();
		room = roomService.selectByPrimaryKey(roomid);
		String roomnum = room.getRoomnum();
		
		livein = liveinService.selectByPrimaryKey(customerid);
		String name = livein.getName();
		int newroomid = roomService.getId(changetoroom);
		Room newroom = roomService.selectByPrimaryKey(newroomid);
		newroom.setCustomerid(customerid);
		newroom.setState(room.HASBEENIN);
		
		roomService.updateByPrimaryKey(newroom);
		
		livein.setName(livein.getName());
		livein.setEx3(livein.CHANGEROOM);
		livein.setRoomnum(changetoroom);
		
		//changeroom.getChangeroom()  因jsp 提交时name属性值改了，所以这里也直接改为name属性值
		changeroom.setChangeroom(changetoroom);
		changeroom.setEx1("1");
		changeroom.setChangetime(new java.util.Date(System.currentTimeMillis()));
		changeroom.setCustomerid(changeroom.getCustomerid());
		changeroom.setOriginalroom(roomnum);
		changeroom.setEmplyeeid(changeroom.getEmplyeeid());
		changeroom.setReason(changeroom.getReason());
		changeroom.setNote(changeroom.getNote());
		changeroom.setEmplyeeid(emplyeeid);

		room.setState(room.DIRTYROOM);
		
		//因为目前换房后原房间设置的状态为“脏房”,脏房可以显示上一个入住客人信息，所以在未打扫之前就不要删除id了
		//room.setCustomerid(null);
		
		roomService.updateByPrimaryKey(room);
		liveinService.updateByPrimaryKey(livein);
		
		changeroomService.insertSelective(changeroom);
		
		mv.addObject("livein", livein);
		mv.addObject("roomid", roomid);
		mv.addObject("user", user);
		mv.addObject("customerid", customerid);
		mv.setViewName("redirect:/roommanagement/realtime_data.action");
		return mv;
	}
	
	
	/**
	 * 换房列表查询
	 * @param mv
	 * @param page
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/changeroomlist.action")
	public ModelAndView changeroomlist(ModelAndView mv, Integer page, HttpSession session,String name,String realname,String certificatenum,Date beginDate,Date endDate) {
		
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
		
		/**
		 * 可以连表查询优化
		 */
//		Livein livein = new Livein();
		
		ChangeroomExample example = new ChangeroomExample();
//		ChangeroomExample.Criteria criteria = example.createCriteria();
//		criteria.andEx1EqualTo("1");

//		if (beginDate != null && beginDate.length() > 0) {
//			criteria.andChangetimeGreaterThanOrEqualTo(DateUtil.String2Date(beginDate));
//			mv.addObject("beginDate", beginDate);
//		}
//		if (endDate != null && endDate.length() > 0) {
//			System.out.println("endDate = " + endDate);
//			criteria.andChangetimeLessThanOrEqualTo(DateUtil.String2Date(endDate));
//			mv.addObject("endDate", endDate);
//		}
		example.setEx1("1");
		if (beginDate != null) {
			example.setBeginDate(beginDate);
			mv.addObject("beginDate", DateUtil.Date2String(beginDate));
		}
		if (endDate != null) {
			example.setEndDate(endDate);
			mv.addObject("endDate", DateUtil.Date2String(endDate));
		}
		if(name!=null&&!"".equals(name)){
			example.setName(name);
			mv.addObject("name", name);
		}
		if(realname!=null&&!"".equals(realname)){
			example.setRealname(realname);
			mv.addObject("realname", realname);
		}
		if(certificatenum!=null&&!"".equals(certificatenum)){
			example.setCertificatenum(certificatenum);
			mv.addObject("certificatenum", certificatenum);
		}
		
		example.setOrderByClause("changetime desc");
		example.setPageSize(paging.getPageSize());
		example.setStartPos(paging.getStartPos());
		
		List<ChangeRoomVo> list = changeroomService.selectAll(example);
		
			
//		paging.setTotalRows(changeroomService.countByExample(example));
//		paging.setList(changeroomService.selectByPageAndExample(example));
		
		paging.setTotalRows(changeroomService.countChangeRoomByExample(example));
		paging.setList(list);
		mv.addObject("paging", paging);
		mv.setViewName("changeroom/changeroomlist");
		return mv;
	}
	
}
