package com.zhangbaiquan.pro.service.changeroom;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhangbaiquan.pro.po.changeroom.Changeroom;
import com.zhangbaiquan.pro.po.changeroom.ChangeroomExample;
import com.zhangbaiquan.pro.vo.ChangeRoomVo;

public interface ChangeroomService {
	int countByExample(ChangeroomExample example);

    int deleteByExample(ChangeroomExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Changeroom record);

    int insertSelective(Changeroom record);

    List<Changeroom> selectByExample(ChangeroomExample example);

    Changeroom selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Changeroom record, @Param("example") ChangeroomExample example);

    int updateByExample(@Param("record") Changeroom record, @Param("example") ChangeroomExample example);

    int updateByPrimaryKeySelective(Changeroom record);

    int updateByPrimaryKey(Changeroom record);
    
    List<Changeroom> selectByPageAndExample(ChangeroomExample example);
    
    List<ChangeRoomVo> selectAll(ChangeroomExample example);
    
    Integer countChangeRoomByExample(ChangeroomExample example);
    
    Integer getChangeRoomId(int customerid);
    
    List<Integer> getChangeRoomListId(int customerid);
}
