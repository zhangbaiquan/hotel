package com.zhangbaiquan.pro.controller.msgboard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zhangbaiquan.pro.mapper.msgboard.MsgboardMapper;
import com.zhangbaiquan.pro.po.base.Employee;
import com.zhangbaiquan.pro.po.msgboard.Msgboard;
import com.zhangbaiquan.pro.po.msgboard.MsgboardExample;
import com.zhangbaiquan.pro.util.DateUtil;
import com.zhangbaiquan.pro.util.PageBean;

@Controller
@RequestMapping(value="/msgboard")
public class MsgboardController {

	@Autowired
	private MsgboardMapper msgboardMapper;
	
	@RequestMapping(value="/msgboard.action")
	public ModelAndView msgboard(ModelAndView mv, Integer page, HttpSession session){
		
		Employee user=(Employee) session.getAttribute("user");
		if(user==null){
			mv.setViewName("redirect:/loginPage.action");
			return mv;
		}
		mv.setViewName("security/msgboard");
		return mv;	
	}
	/**
	 * 
	 * @param mv
	 * @param msgboard
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/msgboardAdd.action")
	public ModelAndView msgboardAdd(ModelAndView mv,Msgboard msgboard,HttpSession session){
		
		Employee user=(Employee) session.getAttribute("user");
		if(user==null){
			mv.setViewName("redirect:/loginPage.action");
			return mv;
		}
		System.out.println(msgboard.getMsgboardname());
		msgboard.setMsgboardname(msgboard.getMsgboardname());
		msgboard.setMsgboardtime(new java.util.Date(System.currentTimeMillis()));
		msgboard.setMsgboardphone(msgboard.getMsgboardphone());
		msgboard.setEx1(msgboard.getEx1());
		
		msgboardMapper.insertSelective(msgboard);
		
		mv.setViewName("redirect:/msgboard/msgboardlist.action");
		return mv;	
	}
	
	
	@RequestMapping(value="/msgboardlist.action")
	public ModelAndView msgboardlist(ModelAndView mv,Integer page,String msgboardname,String beginDate,String endDate,HttpSession session){
		
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
		
		MsgboardExample example = new MsgboardExample();
		MsgboardExample.Criteria criteria = example.createCriteria();
		
		//假删除
//		criteria.andEx2EqualTo("1");
		
		if (msgboardname != null && msgboardname.length() > 0) {
			criteria.andMsgboardnameLike("%"+msgboardname+"%");
			mv.addObject("msgboardname", msgboardname);
		}
		if (beginDate != null && beginDate.length() > 0) {
			criteria.andMsgboardtimeGreaterThanOrEqualTo(DateUtil.String2Date(beginDate));
			mv.addObject("beginDate", beginDate);
		}
		if (endDate != null && endDate.length() > 0) {
			criteria.andMsgboardtimeLessThanOrEqualTo(DateUtil.String2Date(endDate));
			mv.addObject("endDate", endDate);
		}

		example.setOrderByClause("msgboardtime desc");
		
		
		example.setPageSize(paging.getPageSize());
		example.setStartPos(paging.getStartPos());
		
		paging.setTotalRows(msgboardMapper.countByExample(example));
		paging.setList(msgboardMapper.selectByPageAndExample(example));
		mv.addObject("paging", paging);
		
		mv.setViewName("security/msgboardlist");
		return mv;
	}
	

	@RequestMapping(value="/toMsgboardModify")
	public ModelAndView toMsgboardModify(ModelAndView mv,HttpSession session,Integer id){
		
		Employee user=(Employee) session.getAttribute("user");
		if(user==null){
			mv.setViewName("redirect:/loginPage.action");
			return mv;
		}
		Msgboard msgboard = new Msgboard();
		msgboard = msgboardMapper.selectByPrimaryKey(id);
		mv.addObject("msgboard",msgboard);
		mv.setViewName("security/msgboardmodify");
		return mv;				
	}
	

	@RequestMapping(value = "/msgboardmodify.action")
	public ModelAndView emergencyeventsmodify(ModelAndView mv, HttpServletRequest request,Msgboard msgboard,HttpSession session) {
		Employee user = (Employee) session.getAttribute("user");
		if (user == null) {
			mv.addObject("msg", "登录超时，请重新登录");
			mv.setViewName("login");
			return mv;
		}
		Msgboard record = msgboardMapper.selectByPrimaryKey(msgboard.getMsgboardid());
		record.setMsgboardname(msgboard.getMsgboardname());
		record.setMsgboardtime(msgboard.getMsgboardtime());
		record.setMsgboardphone(msgboard.getMsgboardphone());
		record.setEx1(msgboard.getEx1());
		
		msgboardMapper.updateByPrimaryKeySelective(record);
		
		mv.setViewName("redirect:/msgboard/msgboardlist.action");
		return mv;
	}
	
	/**
	 * 单个删除
	 * @param mv
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/delete")
	public String delete(ModelAndView mv,Integer id){
		
		msgboardMapper.deleteByPrimaryKey(id);
		return "redirect:/msgboard/msgboardlist.action";		
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
			int msgboardid = Integer.parseInt(id);
			
			Msgboard msgboard = msgboardMapper.selectByPrimaryKey(msgboardid);
			int row = msgboardMapper.deleteByPrimaryKey(msgboardid);
			if (row > 0) {
				MsgboardExample example = new MsgboardExample();
				MsgboardExample.Criteria criteria = example.createCriteria();
				criteria.andMsgboardidEqualTo(msgboardid);
				msgboardMapper.deleteByExample(example);
				
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
