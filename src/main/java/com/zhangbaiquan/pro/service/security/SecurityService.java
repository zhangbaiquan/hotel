package com.zhangbaiquan.pro.service.security;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhangbaiquan.pro.po.security.Security;
import com.zhangbaiquan.pro.po.security.SecurityExample;

public interface SecurityService {
	int countByExample(SecurityExample example);

    int deleteByExample(SecurityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Security record);

    int insertSelective(Security record);

    List<Security> selectByExample(SecurityExample example);

    Security selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Security record, @Param("example") SecurityExample example);

    int updateByExample(@Param("record") Security record, @Param("example") SecurityExample example);

    int updateByPrimaryKeySelective(Security record);

    int updateByPrimaryKey(Security record);
    
    List<Security> selectByPageAndExample(SecurityExample example);
}
