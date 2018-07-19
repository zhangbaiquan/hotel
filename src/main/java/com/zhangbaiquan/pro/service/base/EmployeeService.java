package com.zhangbaiquan.pro.service.base;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhangbaiquan.pro.po.base.Employee;
import com.zhangbaiquan.pro.po.base.EmployeeExample;
import com.zhangbaiquan.pro.po.base.Title;
import com.zhangbaiquan.pro.po.base.TitleExample;

public interface EmployeeService {
	 int countByExample(EmployeeExample example);

	    int deleteByExample(EmployeeExample example);

	    int deleteByPrimaryKey(String emplyeeid);

	    int insert(Employee record);

	    int insertSelective(Employee record);

	    List<Employee> selectByExample(EmployeeExample example);
	    List<Employee> selectByPageAndExample(EmployeeExample example);
	    List<Title> selectTitleExample(TitleExample example);
	    Title selectByTitleKey(String titleid);
	    Employee selectByPrimaryKey(String emplyeeid);

	    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

	    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

	    int updateByPrimaryKeySelective(Employee record);

	    int updateByPrimaryKey(Employee record);
	    
	    Employee selectByExampleDeptLeader(DeptService deptService,Employee employee);//获取传入员工信息，得到相应领导的
	    
}
