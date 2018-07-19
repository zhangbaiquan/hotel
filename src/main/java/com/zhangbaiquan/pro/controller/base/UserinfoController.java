package com.zhangbaiquan.pro.controller.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.zhangbaiquan.pro.po.base.Department;
import com.zhangbaiquan.pro.po.base.DepartmentExample;
import com.zhangbaiquan.pro.po.base.Employee;
import com.zhangbaiquan.pro.po.base.EmployeeExample;
import com.zhangbaiquan.pro.po.base.Title;
import com.zhangbaiquan.pro.po.base.Userclassinfo;
import com.zhangbaiquan.pro.service.base.DeptService;
import com.zhangbaiquan.pro.service.base.EmployeeService;
import com.zhangbaiquan.pro.service.base.UserClassService;
import com.zhangbaiquan.pro.util.PageBean;
@Controller
@RequestMapping("user")
public class UserinfoController {
	@Autowired
	private DeptService deptService;
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private UserClassService userClassService;
	@RequestMapping(value="list")
	public ModelAndView list(ModelAndView mv,Integer page,String key,String dept){
		PageBean paging=new PageBean();
		paging.setPageSize(5);
		if(page!=null&&page>0){
			paging.setCurrentPage(page);
		}		
		EmployeeExample example=new EmployeeExample();
		EmployeeExample.Criteria criteria=example.createCriteria();
		criteria.andIsdeleteEqualTo(0);
		if(key!=null&&key!=""){
			criteria.andRealnameLike("%"+key+"%");
		}
		if(dept!=null&&dept!=""){
			criteria.andDeptnameEqualTo(dept);
		}
		criteria.andIsdeleteEqualTo(0);
		example.setPageSize(paging.getPageSize());
		example.setStartPos(paging.getStartPos());
		List<Employee> list= employeeService.selectByPageAndExample(example);
		List<Object> jsonList=new ArrayList<Object>();
		for (int i = 0; i < list.size(); i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			Employee employee=list.get(i);
			if(employee.getTitleid()!=null&&!"".equals(employee.getTitleid())){
				String[] idarray=employee.getTitleid().split(",");
				 StringBuffer permission = new StringBuffer(); 
				for (String id : idarray) {
					Title tList=employeeService.selectByTitleKey(id);
					String titlename=null;
					titlename=tList.getTitlename();
					if (permission.toString().equals("")) {
						permission.append(titlename); 
					}
					else{
						permission.append(","+titlename);
					} 
				}
				map.put("titlename", permission.toString());
			}
		
				//Map<String, Object> map = new HashMap<String, Object>();
				map.put("emplyeeid",list.get(i).getEmplyeeid());
				map.put("usename", list.get(i).getUsename());
				map.put("realname", list.get(i).getRealname());
				map.put("phone", list.get(i).getPhone());
				map.put("deptname", list.get(i).getDeptname());
				
				jsonList.add(map);
		}
		
		paging.setList(jsonList);
		paging.setTotalRows(employeeService.countByExample(example));
		mv.addObject("paging", paging);
		mv.addObject("key", key);
		mv.addObject("dept", dept);
		mv.addObject("deptList", deptService.selectByExample(null));
		mv.setViewName("base/user/list");
		return mv;
		
	}

	@RequestMapping(value="sendAdd")
	public ModelAndView sendAdd(ModelAndView mv,Integer deptid){
		DepartmentExample example=new DepartmentExample();
		DepartmentExample.Criteria criteria=example.createCriteria();
		criteria.andIsdeleteEqualTo(0);
		List<Department> deptList= deptService.selectByExample(example);
		mv.addObject("deptList", deptList);
		mv.addObject("grouplist", userClassService.selectByExample(null));
		mv.addObject("titlelist", employeeService.selectTitleExample(null));
		mv.setViewName("base/user/add");
		mv.addObject("deptid", deptid);
		return mv;
	}
	@RequestMapping(value="titlelist")
	@ResponseBody
	public List<Title> titlelist(){
		return null;
	}
	@RequestMapping(value="add")
	public ModelAndView add(ModelAndView mv,Employee user){
		DepartmentExample example=new DepartmentExample();
		DepartmentExample.Criteria criteria=example.createCriteria();
		criteria.andDeptidEqualTo(user.getDeptid());
		List<Department> deptList= deptService.selectByExample(example);
		user.setDeptname(deptList.get(0).getDeptname());
		user.setIsdelete(0);
		int row=employeeService.insertSelective(user);
		if(row>0){
			mv.setViewName("redirect://user/list.action");
		}else{
			mv.addObject("message", "添加失败，请重试");
			mv.setViewName("redirect://user/sendAdd.action");
		}
		return mv;
		
	}
	@RequestMapping(value="deleteUser")
	@ResponseBody
	public String deleteUser(String id){
		int row=employeeService.deleteByPrimaryKey(id);
		if(row>0){
			return "success";
		}else{
			return "error"; 
		}
	}
	@RequestMapping(value="sendUpdate")
	public ModelAndView sendUpdate(ModelAndView mv,String id){
		Employee list=employeeService.selectByPrimaryKey(id);
		String[] idarray=list.getTitleid().split(",");
		 StringBuffer permission = new StringBuffer(); 
		for (String ids : idarray) {
			Title tList=employeeService.selectByTitleKey(ids);
			String titlename=null;
			titlename=tList.getTitlename();
			if (permission.toString().equals("")) {
				permission.append(titlename); 
			}
			else{
				permission.append(","+titlename);
			}
			  
		}
		mv.addObject("user",list);
		mv.addObject("titlename",permission.toString());
		Integer groupid=Integer.parseInt(list.getGroupid());
		Userclassinfo group=userClassService.selectByPrimaryKey(groupid);
		mv.addObject("grouping",group);
		DepartmentExample example=new DepartmentExample();
		DepartmentExample.Criteria criteria=example.createCriteria();
		criteria.andIsdeleteEqualTo(0);
		List<Department> deptList= deptService.selectByExample(example);
		mv.addObject("deptList", deptList);
		mv.addObject("grouplist", userClassService.selectByExample(null));
		mv.addObject("titlelist", employeeService.selectTitleExample(null));
		mv.setViewName("base/user/update");
		return mv;
		
	}
	@RequestMapping(value="update")
	public ModelAndView update(ModelAndView mv,Employee user){
		DepartmentExample example=new DepartmentExample();
		DepartmentExample.Criteria criteria=example.createCriteria();
		criteria.andDeptidEqualTo(user.getDeptid());
		List<Department> deptList= deptService.selectByExample(example);
		user.setDeptname(deptList.get(0).getDeptname());
		int row=employeeService.updateByPrimaryKeySelective(user);
		if(row>0){
			mv.setViewName("redirect://user/list.action");
		}else{
			mv.addObject("message", "添加失败，请重试");
			mv.setViewName("redirect://user/sendUpdate.action?id="+user.getEmplyeeid());
		}
		return mv;
		
	}
	@RequestMapping(value="login")
	public ModelAndView login(ModelAndView mv,RedirectAttributes redirectAttributes,String username,String securityCode,String pwd,HttpSession session){
		EmployeeExample example=new EmployeeExample();
		com.zhangbaiquan.pro.po.base.EmployeeExample.Criteria criteria=example.createCriteria();
		criteria.andUsenameEqualTo(username);
		criteria.andIsdeleteNotEqualTo(1);
		List<Employee> list=employeeService.selectByExample(example);
		Employee user=null;
		
		String code=(String) session.getAttribute("code");
		System.out.println("securityCode = "+securityCode);
		System.out.println("code = "+code);
		
		if(securityCode==null||securityCode=="") {
//			mv.addObject("message", "请输入验证码!");
			redirectAttributes.addFlashAttribute("message", "请输入验证码!");
			mv.setViewName("redirect:/loginPage.action");
			return mv;
		}else {
			if(securityCode.equalsIgnoreCase(code)) {
				System.out.println(0);
				if(list!=null&&list.size()>0){
					user=list.get(0);
					session.setAttribute("user", user);
					Department dept=deptService.selectByPrimaryKey(user.getDeptid());
					session.setAttribute("dept", dept);
					if(pwd != null && pwd != "" && pwd.equals(user.getEx1())) {
						System.out.println(1);
						mv.setViewName("redirect:/index.action");
						return mv;
					}else {
						System.out.println(2);
//						mv.addObject("message", "密码错误");
						redirectAttributes.addFlashAttribute("message", "密码错误!");
						mv.setViewName("redirect:/loginPage.action");
						return mv;
					}
//					mv.setViewName("redirect:/index.action");
				}else{
					System.out.println(3);
//					mv.addObject("message", "用户帐号不存在!");
					redirectAttributes.addFlashAttribute("message", "用户帐号不存在!");
					mv.setViewName("redirect:/loginPage.action");
					return mv;
				}
				
			}else {
				System.out.println(4);
//				mv.addObject("message", "验证码错误!");
				redirectAttributes.addFlashAttribute("message", "验证码错误!");
				mv.setViewName("redirect:/loginPage.action");
				return mv;
			}

		}
		
	}
	
}