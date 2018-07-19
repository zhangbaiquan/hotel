package com.zhangbaiquan.pro.service.reservation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangbaiquan.pro.mapper.reservation.ReservationMapper;
import com.zhangbaiquan.pro.po.reservation.Reservation;
import com.zhangbaiquan.pro.po.reservation.ReservationExample;

@Service("ReservationService")
public class ReservationServiceImpl implements ReservationService{
	
	@Autowired ReservationMapper reservationMapper;
	
	@Override
	public int countByExample(ReservationExample example) {
		// TODO Auto-generated method stub
		return reservationMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(ReservationExample example) {
		// TODO Auto-generated method stub
		return reservationMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer reserveid) {
		// TODO Auto-generated method stub
		return reservationMapper.deleteByPrimaryKey(reserveid);
	}

	@Override
	public int insert(Reservation record) {
		// TODO Auto-generated method stub
		return reservationMapper.insert(record);
	}

	@Override
	public int insertSelective(Reservation record) {
		// TODO Auto-generated method stub
		return reservationMapper.insertSelective(record);
	}

	@Override
	public List<Reservation> selectByExample(ReservationExample example) {
		// TODO Auto-generated method stub
		return reservationMapper.selectByExample(example);
	}

	@Override
	public Reservation selectByPrimaryKey(Integer reserveid) {
		// TODO Auto-generated method stub
		return reservationMapper.selectByPrimaryKey(reserveid);
	}

	@Override
	public int updateByExampleSelective(Reservation record, ReservationExample example) {
		// TODO Auto-generated method stub
		return reservationMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Reservation record, ReservationExample example) {
		// TODO Auto-generated method stub
		return reservationMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Reservation record) {
		// TODO Auto-generated method stub
		return reservationMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Reservation record) {
		// TODO Auto-generated method stub
		return reservationMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Reservation> selectByPageAndExample(ReservationExample example) {
		// TODO Auto-generated method stub
		return reservationMapper.selectByPageAndExample(example);
	}

	@Override
	public Integer getMaxReservationId() {
		// TODO Auto-generated method stub
		return reservationMapper.getMaxReservationId();
	}

	@Override
	public Integer getId(String roomnum) {
		// TODO Auto-generated method stub
		return reservationMapper.getId(roomnum);
	}


}
