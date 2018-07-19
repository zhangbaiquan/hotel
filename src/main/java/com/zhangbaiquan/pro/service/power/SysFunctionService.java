package com.zhangbaiquan.pro.service.power;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhangbaiquan.pro.po.power.MSysFuncsecurity;
import com.zhangbaiquan.pro.po.power.MSysFuncsecurityExample;

public interface SysFunctionService {
	 int countByExample(MSysFuncsecurityExample example);

	    int deleteByExample(MSysFuncsecurityExample example);

	    int deleteByPrimaryKey(Integer fid);

	    int insert(MSysFuncsecurity record);

	    int insertSelective(MSysFuncsecurity record);

	    List<MSysFuncsecurity> selectByExample(MSysFuncsecurityExample example);

	    MSysFuncsecurity selectByPrimaryKey(Integer fid);

	    int updateByExampleSelective(@Param("record") MSysFuncsecurity record, @Param("example") MSysFuncsecurityExample example);

	    int updateByExample(@Param("record") MSysFuncsecurity record, @Param("example") MSysFuncsecurityExample example);

	    int updateByPrimaryKeySelective(MSysFuncsecurity record);

	    int updateByPrimaryKey(MSysFuncsecurity record);
}
