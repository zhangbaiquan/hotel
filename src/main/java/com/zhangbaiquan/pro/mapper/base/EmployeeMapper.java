package com.zhangbaiquan.pro.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.zhangbaiquan.pro.po.base.Employee;
import com.zhangbaiquan.pro.po.base.EmployeeExample;

public interface EmployeeMapper {
    int countByExample(EmployeeExample example);

    int deleteByExample(EmployeeExample example);

    int deleteByPrimaryKey(String emplyeeid);

    int insert(Employee record);

    int insertSelective(Employee record);

    List<Employee> selectByExample(EmployeeExample example);
    List<Employee> selectByPageAndExample(EmployeeExample example);
    Employee selectByPrimaryKey(String emplyeeid);

    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}