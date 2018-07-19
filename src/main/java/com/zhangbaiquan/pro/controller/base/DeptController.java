package com.zhangbaiquan.pro.controller.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zhangbaiquan.pro.po.base.Department;
import com.zhangbaiquan.pro.po.base.DepartmentExample;
import com.zhangbaiquan.pro.po.base.Employee;
import com.zhangbaiquan.pro.po.base.EmployeeExample;
import com.zhangbaiquan.pro.po.base.DepartmentExample.Criteria;
import com.zhangbaiquan.pro.service.base.DeptService;
import com.zhangbaiquan.pro.service.base.EmployeeService;
import com.zhangbaiquan.pro.util.PageBean;
@Controller
@RequestMapping("/dept")
public class DeptController {
	@Autowired
	private DeptService deptService;
	@Autowired
	private EmployeeService employeeService;
	@RequestMapping(value="list")
	public ModelAndView showList(ModelAndView mv,Integer page,String sname) {
		DepartmentExample example=new DepartmentExample();
		Criteria criteria=example.createCriteria();
		PageBean paging=new PageBean();
		paging.setPageSize(5);
		if(page!=null&&page>0){
			paging.setCurrentPage(page);
		}
		if (sname!=null&&sname!="") {
			
			criteria.andDeptnameLike("%"+sname+"%");
		}
		criteria.andIsdeleteEqualTo(0);
		example.setPageSize(paging.getPageSize());
		example.setStartPos(paging.getStartPos());
		paging.setList(deptService.selectByPageAndExample(example));
		paging.setTotalRows(deptService.countByExample(example));
		mv.addObject("sname",sname );
		mv.addObject("childlist",paging );
		mv.setViewName("base/dept/list");
		return mv;
		
	}
	@RequestMapping(value="sendAdd")
	public ModelAndView sendAdd(ModelAndView mv) {
		DepartmentExample example=new DepartmentExample();
		Criteria criteria=example.createCriteria();
		criteria.andIsdeleteEqualTo(0);
		mv.addObject("childlist", deptService.selectByExample(example));
		mv.setViewName("base/dept/add");
		return mv;
		
	}
	@RequestMapping(value="addDept")
	public ModelAndView addDept(ModelAndView mv,Department dept) {
		dept.setIsdelete(0);
		int row=deptService.insert(dept);
		if(row>0) {
			mv.addObject("message", "添加成功");
			mv.setViewName("redirect:/dept/list.action");
		}else {
			mv.addObject("message", "添加失败");
			mv.setViewName("base/dept/add");
		}
		return mv;
		
	}
	@RequestMapping(value="sendUpdate")
	public ModelAndView sendUpdate(ModelAndView mv,String deptid) {
		DepartmentExample example=new DepartmentExample();
		Criteria criteria=example.createCriteria();
		criteria.andIsdeleteEqualTo(0);
		mv.addObject("childlist", deptService.selectByExample(example));
		mv.addObject("dept", deptService.selectByPrimaryKey(deptid));
		EmployeeExample EMP=new EmployeeExample();
		EmployeeExample.Criteria CRT=EMP.createCriteria();
		CRT.andDeptidEqualTo(deptid);
		mv.addObject("employee", employeeService.selectByExample(EMP));
		mv.setViewName("base/dept/update");
		return mv;
		
	}
	@RequestMapping(value="updateDept")
	public ModelAndView updateDept(ModelAndView mv,Department dept) {
		
		Employee employee= employeeService.selectByPrimaryKey(dept.getEx3());
		dept.setEx2(employee.getRealname());
		dept.setIsdelete(0);
		int row=deptService.updateByPrimaryKey(dept);
		if(row>0) {
			mv.addObject("message", "修改成功");
			mv.setViewName("redirect:/dept/list.action");
		}else {
			mv.addObject("message", "添加失败");
			mv.setViewName("base/dept/update");
		}
		return mv;
		
	}
	
	@ResponseBody
	@RequestMapping(value="delete")
	public String delete(String deptid) {
		DepartmentExample example=new DepartmentExample();
		Criteria criteria=example.createCriteria();
		criteria.andParentidEqualTo(deptid);
		deptService.deleteByExample(example);
		int row=deptService.deleteByPrimaryKey(deptid);
		if(row>0) {
			return "success";
		}else {
			return "error";
		}
	}
		
	@RequestMapping(value="getList")
	@ResponseBody
	public List<Department> getlist(){
		DepartmentExample example=new DepartmentExample();
		Criteria criteria=example.createCriteria();
		criteria.andIsdeleteEqualTo(0);
		List<Department> list=deptService.selectByExample(example);
		return list;
	}
	@RequestMapping(value="getdeptById")
	@ResponseBody
	public Department getdeptById(String deptid){
		Department list=deptService.selectByPrimaryKey(deptid);
		return list;
	}
}
