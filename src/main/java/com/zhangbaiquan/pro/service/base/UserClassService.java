package com.zhangbaiquan.pro.service.base;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhangbaiquan.pro.po.base.Userclassinfo;
import com.zhangbaiquan.pro.po.base.UserclassinfoExample;
import com.zhangbaiquan.pro.util.PageBean;

public interface UserClassService {
	 int countByExample(UserclassinfoExample example);

	    int deleteByExample(UserclassinfoExample example);

	    int deleteByPrimaryKey(Integer userclassid);

	    int insert(Userclassinfo record);

	    int insertSelective(Userclassinfo record);

	    List<Userclassinfo> selectByExampleWithBLOBs(UserclassinfoExample example);

	    List<Userclassinfo> selectByExample(UserclassinfoExample example);

	    Userclassinfo selectByPrimaryKey(Integer userclassid);

	    int updateByExampleSelective(@Param("record") Userclassinfo record, @Param("example") UserclassinfoExample example);

	    int updateByExampleWithBLOBs(@Param("record") Userclassinfo record, @Param("example") UserclassinfoExample example);

	    int updateByExample(@Param("record") Userclassinfo record, @Param("example") UserclassinfoExample example);

	    int updateByPrimaryKeySelective(Userclassinfo record);

	    int updateByPrimaryKeyWithBLOBs(Userclassinfo record);

	    int updateByPrimaryKey(Userclassinfo record);
	    
	    void selectByPage(PageBean paging);
	    
	    Integer selectMaxId();
}
