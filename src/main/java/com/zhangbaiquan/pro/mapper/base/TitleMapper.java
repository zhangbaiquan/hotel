package com.zhangbaiquan.pro.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.zhangbaiquan.pro.po.base.Title;
import com.zhangbaiquan.pro.po.base.TitleExample;

public interface TitleMapper {
    int countByExample(TitleExample example);

    int deleteByExample(TitleExample example);

    int deleteByPrimaryKey(String titleid);

    int insert(Title record);

    int insertSelective(Title record);

    List<Title> selectByExample(TitleExample example);

    Title selectByPrimaryKey(String titleid);

    int updateByExampleSelective(@Param("record") Title record, @Param("example") TitleExample example);

    int updateByExample(@Param("record") Title record, @Param("example") TitleExample example);

    int updateByPrimaryKeySelective(Title record);

    int updateByPrimaryKey(Title record);
}