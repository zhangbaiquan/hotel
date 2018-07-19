package com.zhangbaiquan.pro.mapper.base;

import com.zhangbaiquan.pro.po.base.Userinfo;
import com.zhangbaiquan.pro.po.base.UserinfoExample;
import com.zhangbaiquan.pro.vo.UserVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserinfoMapper {
    int countByExample(UserinfoExample example);

    int deleteByExample(UserinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    List<Userinfo> selectByExample(UserinfoExample example);

    Userinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    int updateByExample(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);
    
    List<Userinfo> selectByPage(@Param("startPos") Integer startPos,@Param("pageSize") Integer pageSize,@Param("key") String key);
    List<UserVo> selectVoByExample(UserinfoExample example);
}