package com.zhangbaiquan.pro.service.roommanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangbaiquan.pro.mapper.roommanagement.RoomMapper;
import com.zhangbaiquan.pro.po.roommanagement.Room;
import com.zhangbaiquan.pro.po.roommanagement.RoomExample;

@Service("RoomService")
public class RoomServiceImpl implements RoomService{
	
	@Autowired
	private RoomMapper roomMapper;

	@Override
	public int countByExample(RoomExample example) {
		// TODO Auto-generated method stub
		return roomMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(RoomExample example) {
		// TODO Auto-generated method stub
		return roomMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer roomid) {
		// TODO Auto-generated method stub
		return roomMapper.deleteByPrimaryKey(roomid);
	}

	@Override
	public int insert(Room record) {
		// TODO Auto-generated method stub
		return roomMapper.insert(record);
	}

	@Override
	public int insertSelective(Room record) {
		// TODO Auto-generated method stub
		return roomMapper.insertSelective(record);
	}

	@Override
	public List<Room> selectByExample(RoomExample example) {
		// TODO Auto-generated method stub
		return roomMapper.selectByExample(example);
	}

	@Override
	public Room selectByPrimaryKey(Integer roomid) {
		// TODO Auto-generated method stub
		return roomMapper.selectByPrimaryKey(roomid);
	}

	@Override
	public int updateByExampleSelective(Room record, RoomExample example) {
		// TODO Auto-generated method stub
		return roomMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Room record, RoomExample example) {
		// TODO Auto-generated method stub
		return roomMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Room record) {
		// TODO Auto-generated method stub
		return roomMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Room record) {
		// TODO Auto-generated method stub
		return roomMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Room> selectByPageAndExample(RoomExample example) {
		// TODO Auto-generated method stub
		return roomMapper.selectByPageAndExample(example);
	}

	@Override
	public Integer getId(String roomnum) {
		// TODO Auto-generated method stub
		return roomMapper.getId(roomnum);
	}

	@Override
	public String getstate(Integer roomid) {
		// TODO Auto-generated method stub
		return roomMapper.getstate(roomid);
	}

	@Override
	public Integer customeridGetRoomid(Integer customerid) {
		// TODO Auto-generated method stub
		return roomMapper.customeridGetRoomid(customerid);
	}


}
