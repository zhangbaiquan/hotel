package com.zhangbaiquan.pro.service.reservation;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhangbaiquan.pro.po.reservation.Reservation;
import com.zhangbaiquan.pro.po.reservation.ReservationExample;

public interface ReservationService {
	int countByExample(ReservationExample example);

    int deleteByExample(ReservationExample example);

    int deleteByPrimaryKey(Integer reserveid);

    int insert(Reservation record);

    int insertSelective(Reservation record);

    List<Reservation> selectByExample(ReservationExample example);

    Reservation selectByPrimaryKey(Integer reserveid);

    int updateByExampleSelective(@Param("record") Reservation record, @Param("example") ReservationExample example);

    int updateByExample(@Param("record") Reservation record, @Param("example") ReservationExample example);

    int updateByPrimaryKeySelective(Reservation record);

    int updateByPrimaryKey(Reservation record);
    
    public List<Reservation> selectByPageAndExample(ReservationExample example);

	Integer getMaxReservationId();
	
	public Integer getId(String roomnum);
}
