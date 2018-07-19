package com.zhangbaiquan.pro.service.power;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhangbaiquan.pro.po.power.MFunctioncontrol;
import com.zhangbaiquan.pro.po.power.MFunctioncontrolExample;

public interface FunctionControlService {
	 int countByExample(MFunctioncontrolExample example);

	    int deleteByExample(MFunctioncontrolExample example);

	    int deleteByPrimaryKey(String id);

	    int insert(MFunctioncontrol record);

	    int insertSelective(MFunctioncontrol record);

	    List<MFunctioncontrol> selectByExample(MFunctioncontrolExample example);

	    MFunctioncontrol selectByPrimaryKey(String id);

	    int updateByExampleSelective(@Param("record") MFunctioncontrol record, @Param("example") MFunctioncontrolExample example);

	    int updateByExample(@Param("record") MFunctioncontrol record, @Param("example") MFunctioncontrolExample example);

	    int updateByPrimaryKeySelective(MFunctioncontrol record);

	    int updateByPrimaryKey(MFunctioncontrol record);
	    
	    List<MFunctioncontrol> selectParent();
	    
	    List<MFunctioncontrol> selectChild();
	   
	    String selectMaxId();
}	
