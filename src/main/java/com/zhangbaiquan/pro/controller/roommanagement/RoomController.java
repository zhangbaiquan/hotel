package com.zhangbaiquan.pro.controller.roommanagement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.zhangbaiquan.pro.po.base.Employee;
import com.zhangbaiquan.pro.po.livein.Livein;
import com.zhangbaiquan.pro.po.roommanagement.Room;
import com.zhangbaiquan.pro.po.roommanagement.RoomExample;
import com.zhangbaiquan.pro.service.livein.LiveinService;
import com.zhangbaiquan.pro.service.roommanagement.RoomService;
import com.zhangbaiquan.pro.util.PageBean;


@Controller
@RequestMapping(value="/roommanagement")
public class RoomController {
	
	@Autowired
	private RoomService roomService;
	@Autowired
	private LiveinService liveinService;
	
	@RequestMapping(value="/realtime_room.action")
	public ModelAndView realtime_room(ModelAndView mv, Integer page, HttpSession session){
		
		Employee user=(Employee) session.getAttribute("user");
		if(user==null){
			mv.setViewName("redirect:/loginPage.action");
			return mv;
		}
		
		mv.setViewName("roommanagement/realtime_room");
		return mv;
		
	}
	@RequestMapping(value="/room.action")
	public ModelAndView room(ModelAndView mv, Integer page, HttpSession session,Room room,Livein livein,Integer roomid){
		
		Employee user=(Employee) session.getAttribute("user");
		if(user==null){
			mv.setViewName("redirect:/loginPage.action");
			return mv;
		}
		System.out.println("roomid = "+roomid);
		
		room = roomService.selectByPrimaryKey(roomid);
		String roomnum = room.getRoomnum();
		Integer customerid = room.getCustomerid();
		//预定
		Integer reserveid = room.getReserveid();
		livein = liveinService.selectByPrimaryKey(customerid);
		String state = room.getState();

		mv.addObject("roomid", roomid);
		mv.addObject("roomnum",roomnum);
		mv.addObject("state",state);
		mv.addObject("livein",livein);
//		mv.addObject("liveinMap",liveinMap);
		
		switch (state)
		{
		    case "已入住":
		    	//此状态设置除了房间状态栏
		    	customerid = room.getCustomerid();
				//还能用这种方式给redirect传形参 666了
		    	mv.addObject("customerid",customerid);
		    	mv.addObject("roomid", roomid);
		    	mv.setViewName("redirect:/guestmanagement/toLiveinModify.action");break;
		    case "空净房":
		    	mv.setViewName("guestmanagement/livein");break;
		    case "脏房":
		    	customerid = room.getCustomerid();
		    	mv.addObject("roomid", roomid);
		    	mv.addObject("roomnum",roomnum);
		    	mv.addObject("customerid",customerid);
//		    	mv.setViewName("redirect:/guestmanagement/toLiveinModify.action");break;
		    	mv.setViewName("guestmanagement/checkout");break;
//		    	mv.setViewName("redirect:/guestmanagement/checkoutToEmpty");break;
		    case "已预定":
		    	reserveid = room.getReserveid();
				System.out.println("reserveid = "+reserveid);
		    	mv.addObject("reserveid",reserveid);
		    	mv.addObject("roomid", roomid);
		    	mv.setViewName("redirect:/reservation/toreservationModify.action");break;
		    default:
		    	mv.setViewName("default");break;
		}
//		mv.setViewName("default");
		return mv;
		
	}
	
	@RequestMapping(value="/realtime_data.action")
	public ModelAndView realtime_data(ModelAndView mv, Integer page,String roomnum,String floor,String type,String state,HttpSession session){
		
		Employee user=(Employee) session.getAttribute("user");
		if(user==null){
			mv.setViewName("redirect:/loginPage.action");
			return mv;
		}
		PageBean paging = new PageBean();
		paging.setPageSize(200);
		
		if (page != null && page > 0) {
			paging.setCurrentPage(page);
		}
		
		RoomExample example = new RoomExample();
		RoomExample.Criteria criteria = example.createCriteria();
		
		if (roomnum != null && roomnum.length() > 0) {
			criteria.andRoomnumEqualTo(roomnum);
			mv.addObject("roomnum", roomnum);
		}
		if (state != null && state.length() > 0) {
			criteria.andStateEqualTo(state);
			mv.addObject("state", state);
		}
		if (floor != null && floor.length() > 0) {
			criteria.andFloorEqualTo(floor);
			mv.addObject("floor", floor);
		}
		if (type != null && type.length() > 0) {
			criteria.andTypeEqualTo(type);
			mv.addObject("type", type);
		}
		
		
		example.setPageSize(paging.getPageSize());
//		example.setStartPos(paging.getStartPos());
		
			
		paging.setTotalRows(roomService.countByExample(example));
		paging.setList(roomService.selectByPageAndExample(example));
		mv.addObject("paging", paging);
		mv.addObject("roomnum", roomnum);
		mv.addObject("state", state);
		mv.addObject("floor", floor);
		mv.addObject("type", type);
		mv.setViewName("roommanagement/realtime_data");
		return mv;
		
	}
	@RequestMapping(value="/reservation.action")
	public ModelAndView reservation(ModelAndView mv, Integer page,String roomnum,String floor,String type,String state,HttpSession session){
		
		Employee user=(Employee) session.getAttribute("user");
		if(user==null){
			mv.setViewName("redirect:/loginPage.action");
			return mv;
		}
		PageBean paging = new PageBean();
		paging.setPageSize(200);
		
		if (page != null && page > 0) {
			paging.setCurrentPage(page);
		}
		
		RoomExample example = new RoomExample();
		RoomExample.Criteria criteria = example.createCriteria();
		
		if (roomnum != null && roomnum.length() > 0) {
			criteria.andRoomnumEqualTo(roomnum);
			mv.addObject("roomnum", roomnum);
		}
		if (state != null && state.length() > 0) {
			criteria.andStateEqualTo(state);
			mv.addObject("state", state);
		}
		if (floor != null && floor.length() > 0) {
			criteria.andFloorEqualTo(floor);
			mv.addObject("floor", floor);
		}
		if (type != null && type.length() > 0) {
			criteria.andTypeEqualTo(type);
			mv.addObject("type", type);
		}
		
		
		example.setPageSize(paging.getPageSize());
//		example.setStartPos(paging.getStartPos());
		
		
		paging.setTotalRows(roomService.countByExample(example));
		paging.setList(roomService.selectByPageAndExample(example));
		mv.addObject("paging", paging);
		
		mv.setViewName("roommanagement/reservation_data");
		return mv;
		
	}
	
	@RequestMapping(value="/toroomadd.action")
	public ModelAndView toroomadd(ModelAndView mv, HttpSession session){
		
		Employee user=(Employee) session.getAttribute("user");
		if(user==null){
			mv.setViewName("redirect:/loginPage.action");
			return mv;
		}
		mv.setViewName("roommanagement/roomadd");
		return mv;
	}
	@RequestMapping(value="/roomadd.action")
	public ModelAndView roomadd(ModelAndView mv, HttpSession session,Room room){
		
		Employee user=(Employee) session.getAttribute("user");
		if(user==null){
			mv.setViewName("redirect:/loginPage.action");
			return mv;
		}
		
		room.setRoomnum(room.getRoomnum());
		room.setFloor(room.getFloor());
		room.setType(room.getType());
		room.setPrice(room.getPrice());
		room.setState(room.getState());
		room.setIsreservation(room.getIsreservation());
		room.setInstructions(room.getInstructions());
		roomService.insertSelective(room);

		mv.setViewName("redirect:/roommanagement/realtime_list.action");
		return mv;
	}
	
	@RequestMapping(value="/toRoomModify")
	public ModelAndView toRoomModify(ModelAndView mv,Integer roomid){
		Room room = roomService.selectByPrimaryKey(roomid);
		mv.addObject("room",room);
		mv.setViewName("roommanagement/roomModify");
		return mv;				
	}
	
	@RequestMapping(value = "/modify.action")
	public ModelAndView modify(ModelAndView mv, HttpServletRequest request,Room room, HttpSession session) {
		Employee user = (Employee) session.getAttribute("user");
		if (user == null) {
			mv.addObject("msg", "登录超时，请重新登录");
			mv.setViewName("login");
			return mv;
		}
		Room rooma = roomService.selectByPrimaryKey(room.getRoomid());
		
//		room.setRoomid(room.getRoomid());
		room.setRoomnum(room.getRoomnum());
		room.setFloor(room.getFloor());
		room.setType(room.getType());
		room.setPrice(room.getPrice());
		room.setState(room.getState());
		room.setIsreservation(room.getIsreservation());
		room.setInstructions(room.getInstructions());
		System.out.println(room);
		roomService.updateByPrimaryKeySelective(room);
		
		mv.setViewName("redirect:/roommanagement/realtime_list.action");
		return mv;
	}
	
	@RequestMapping(value="/delete")
	public String delete(ModelAndView mv,Integer roomid){
			roomService.deleteByPrimaryKey(roomid);
		return "redirect:/roommanagement/realtime_list.action";		
	}
	
	@RequestMapping(value = "deletelist")
	@ResponseBody
	public String delete(String roomids) {
		String[] idarray = roomids.split(",");
		int rows = 0;
		for (String id : idarray) {
			int roomid = Integer.parseInt(id);
			Room room = roomService.selectByPrimaryKey(roomid);
			int row = roomService.deleteByPrimaryKey(roomid);
			if (row > 0) {
				RoomExample example = new RoomExample();
				RoomExample.Criteria criteria = example.createCriteria();
				criteria.andRoomidEqualTo(roomid);
				roomService.deleteByExample(example);
				
				rows += row;
			}
		}
		if (rows > 0) {
			return "success";
		} else {
			return "error";
		}
	}
	
	
	
	@RequestMapping(value="/realtime_list.action")
	public ModelAndView realtime_list(ModelAndView mv, Integer page,String roomnum,String floor,String type,String state,HttpSession session){
		
		Employee user=(Employee) session.getAttribute("user");
		if(user==null){
			mv.setViewName("redirect:/loginPage.action");
			return mv;
		}
		
		PageBean paging = new PageBean();
		paging.setPageSize(9);
		
		if (page != null && page > 0) {
			paging.setCurrentPage(page);
		}
		
		RoomExample example = new RoomExample();
		RoomExample.Criteria criteria = example.createCriteria();
		
		if (roomnum != null && roomnum.length() > 0) {
			criteria.andRoomnumEqualTo(roomnum);
			mv.addObject("roomnum", roomnum);
		}
		if (state != null && state.length() > 0) {
			criteria.andStateEqualTo(state);
			mv.addObject("state", state);
		}
		if (floor != null && floor.length() > 0) {
			criteria.andFloorEqualTo(floor);
			mv.addObject("floor", floor);
		}
		if (type != null && type.length() > 0) {
			criteria.andTypeEqualTo(type);
			mv.addObject("type", type);
		}
		
		example.setPageSize(paging.getPageSize());
		example.setStartPos(paging.getStartPos());
		
			
		paging.setTotalRows(roomService.countByExample(example));
		paging.setList(roomService.selectByPageAndExample(example));
		mv.addObject("paging", paging);
		
//		System.out.println("PageSize = "+paging.getPageSize());
//		System.out.println("StartPos = "+paging.getStartPos());
//		System.out.println("TotalPages = "+paging.getTotalPages());
//		System.out.println("TotalRows = "+paging.getTotalRows());
//		System.out.println("CurrentPage = "+paging.getCurrentPage());
//		System.out.println("page = "+page);
		
		mv.addObject("roomnum", roomnum);
		mv.addObject("state", state);
		mv.addObject("floor", floor);
		mv.addObject("type", type);
		
		mv.setViewName("roommanagement/realtime_list");
		return mv;
		
	}
	
	/**
	 * ajax验证房间状态
	 * @param roomid
	 * @return
	 */
	@RequestMapping(value = "getstate")
	@ResponseBody
	public String getstate(Integer roomid) {
		// TODO Auto-generated method stub
		Room room = roomService.selectByPrimaryKey(roomid);
		String state = room.getState();
		System.out.println("state = "+state);
		if("空净房".equals(state)) {
//			return "success";
			return "EMPTYNETROOM";
		}else if("已预定".equals(state)){
			return "RESERVATION";
		}else {
			return "error";
		}
	}
	
}
