package com.zhangbaiquan.pro.controller.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zhangbaiquan.pro.po.base.Employee;
import com.zhangbaiquan.pro.po.security.Security;
import com.zhangbaiquan.pro.po.security.SecurityExample;
import com.zhangbaiquan.pro.service.security.SecurityService;
import com.zhangbaiquan.pro.util.DateUtil;
import com.zhangbaiquan.pro.util.PageBean;

@Controller
@RequestMapping(value = "/security")
public class SecurityController {
	
	@Autowired
	private SecurityService securityService;
	
	/**
	 * 去应急事件添加页面
	 * @param mv
	 * @param page
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/emergencyevents.action")
	public ModelAndView emergencyevents(ModelAndView mv, Integer page, HttpSession session){
		
		Employee user=(Employee) session.getAttribute("user");
		if(user==null){
			mv.setViewName("redirect:/loginPage.action");
			return mv;
		}
		mv.setViewName("security/emergencyevents");
		return mv;	
	}
	/**
	 * 实际添加操作
	 * @param mv
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/emergencyeventsAdd.action")
	public ModelAndView emergencyeventsAdd(ModelAndView mv,Security security,HttpSession session){
		
		Employee user=(Employee) session.getAttribute("user");
		if(user==null){
			mv.setViewName("redirect:/loginPage.action");
			return mv;
		}
		System.out.println(security.getName());
		security.setName(security.getName());
		security.setType(security.getType());
		security.setTime(security.getTime());
		security.setNote(security.getNote());
		
		securityService.insertSelective(security);
		
		mv.setViewName("redirect:/security/emergencyeventslist.action");
		return mv;	
	}
	
	/**
	 * 应急事件列表
	 * @param mv
	 * @param page
	 * @param name
	 * @param time
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/emergencyeventslist.action")
	public ModelAndView emergencyeventslist(ModelAndView mv,Integer page,String name,String beginDate,String endDate,HttpSession session){
		
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
		
		SecurityExample example = new SecurityExample();
		SecurityExample.Criteria criteria = example.createCriteria();
		
		//假删除
//		criteria.andEx1EqualTo("1");
		
		if (name != null && name.length() > 0) {
			criteria.andNameLike("%"+name+"%");
			mv.addObject("name", name);
		}
		if (beginDate != null && beginDate.length() > 0) {
			criteria.andTimeGreaterThan(DateUtil.String2Date(beginDate));
			mv.addObject("beginDate", beginDate);
		}
		if (endDate != null && endDate.length() > 0) {
			criteria.andTimeLessThan(DateUtil.String2Date(endDate));
			mv.addObject("endDate", endDate);
		}

		example.setOrderByClause("time desc");
		
		
		example.setPageSize(paging.getPageSize());
		example.setStartPos(paging.getStartPos());
		
		paging.setTotalRows(securityService.countByExample(example));
		paging.setList(securityService.selectByPageAndExample(example));
		mv.addObject("paging", paging);
		
		mv.setViewName("security/emergencyeventslist");
		return mv;
	}
	
	/**
	 * 去应急事件修改页面
	 * @param mv
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/toEmergencyeventsModify")
	public ModelAndView toEmergencyeventsModify(ModelAndView mv,HttpSession session,Integer id){
		
		Employee user=(Employee) session.getAttribute("user");
		if(user==null){
			mv.setViewName("redirect:/loginPage.action");
			return mv;
		}
		Security security = new Security();
		security = securityService.selectByPrimaryKey(id);
		mv.addObject("security",security);
		mv.setViewName("security/emergencyeventsmodify");
		return mv;				
	}
	
	/**
	 * 应急事件修改
	 * @param mv
	 * @param request
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/emergencyeventsmodify.action")
	public ModelAndView emergencyeventsmodify(ModelAndView mv, HttpServletRequest request,Security security,HttpSession session) {
		Employee user = (Employee) session.getAttribute("user");
		if (user == null) {
			mv.addObject("msg", "登录超时，请重新登录");
			mv.setViewName("login");
			return mv;
		}
		Security record = securityService.selectByPrimaryKey(security.getId());
		record.setName(security.getName());
		record.setType(security.getType());
		record.setTime(security.getTime());
		record.setNote(security.getNote());
		
		securityService.updateByPrimaryKeySelective(record);
		
		mv.setViewName("redirect:/security/emergencyeventslist.action");
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
		
		securityService.deleteByPrimaryKey(id);
		return "redirect:/security/emergencyeventslist.action";		
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
			int securityid = Integer.parseInt(id);
			
			Security security = securityService.selectByPrimaryKey(securityid);
			int row = securityService.deleteByPrimaryKey(securityid);
			if (row > 0) {
				SecurityExample example = new SecurityExample();
				SecurityExample.Criteria criteria = example.createCriteria();
				criteria.andIdEqualTo(securityid);
				securityService.deleteByExample(example);
				
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
