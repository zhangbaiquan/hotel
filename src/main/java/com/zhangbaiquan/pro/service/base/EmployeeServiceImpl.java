package com.zhangbaiquan.pro.service.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangbaiquan.pro.mapper.base.EmployeeMapper;
import com.zhangbaiquan.pro.mapper.base.TitleMapper;
import com.zhangbaiquan.pro.po.base.Department;
import com.zhangbaiquan.pro.po.base.Employee;
import com.zhangbaiquan.pro.po.base.EmployeeExample;
import com.zhangbaiquan.pro.po.base.Title;
import com.zhangbaiquan.pro.po.base.TitleExample;
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeMapper  employeeMapper;
	@Autowired
	private TitleMapper  titleMapper;
	@Override
	public int countByExample(EmployeeExample example) {
		return employeeMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(EmployeeExample example) {
		return employeeMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String emplyeeid) {
		return employeeMapper.deleteByPrimaryKey(emplyeeid);
	}

	@Override
	public int insert(Employee record) {
		return employeeMapper.insert(record);
	}

	@Override
	public int insertSelective(Employee record) {
		return employeeMapper.insertSelective(record);
	}

	@Override
	public List<Employee> selectByExample(EmployeeExample example) {
		return employeeMapper.selectByExample(example);
	}

	@Override
	public Employee selectByPrimaryKey(String emplyeeid) {
		return employeeMapper.selectByPrimaryKey(emplyeeid);
	}

	@Override
	public int updateByExampleSelective(Employee record, EmployeeExample example) {
		return employeeMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Employee record, EmployeeExample example) {
		return employeeMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Employee record) {
		return employeeMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Employee record) {
		return employeeMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Employee> selectByPageAndExample(EmployeeExample example) {
		return employeeMapper.selectByPageAndExample(example);
	}

	@Override
	public List<Title> selectTitleExample(TitleExample example) {
		return titleMapper.selectByExample(example);
	}

	@Override
	public Title selectByTitleKey(String titleid) {
		return titleMapper.selectByPrimaryKey(titleid);
	}

	@Override
	public Employee selectByExampleDeptLeader(DeptService deptService,Employee employee) {
		//获取传入员工信息，得到相应领导的
		String deptId=employee.getDeptid();
		Department department=deptService.selectByPrimaryKey(deptId);
		String leaderId=department.getEx3();
		return employeeMapper.selectByPrimaryKey(leaderId);
	}

}
