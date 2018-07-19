package com.zhangbaiquan.pro.service.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangbaiquan.pro.mapper.base.DepartmentMapper;
import com.zhangbaiquan.pro.po.base.Department;
import com.zhangbaiquan.pro.po.base.DepartmentExample;

@Service("deptService")
public class DeptServiceImpl implements DeptService {
	@Autowired
	private DepartmentMapper departmentMapper;

	@Override
	public int countByExample(DepartmentExample example) {
		return departmentMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(DepartmentExample example) {
		return departmentMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String deptid) {
		return departmentMapper.deleteByPrimaryKey(deptid);
	}

	@Override
	public int insert(Department record) {
		return departmentMapper.insert(record);
	}

	@Override
	public int insertSelective(Department record) {
		return departmentMapper.insertSelective(record);
	}

	@Override
	public List<Department> selectByExample(DepartmentExample example) {
		return departmentMapper.selectByExample(example);
	}

	@Override
	public Department selectByPrimaryKey(String deptid) {
		return departmentMapper.selectByPrimaryKey(deptid);
	}

	@Override
	public int updateByExampleSelective(Department record, DepartmentExample example) {
		return departmentMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Department record, DepartmentExample example) {
		return departmentMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Department record) {
		return departmentMapper.updateByPrimaryKey(record);
	}

	@Override
	public int updateByPrimaryKey(Department record) {
		return departmentMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Department> selectByPageAndExample(DepartmentExample example) {
		return departmentMapper.selectByPageAndExample(example);
	}

	@Override
	public String selectByExampleDeptId(String deptid) {
		Department department = departmentMapper.selectByPrimaryKey(deptid);
		return department.getEx3();
	}

}
