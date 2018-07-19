package com.zhangbaiquan.pro.service.changeroom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangbaiquan.pro.mapper.changeroom.ChangeroomMapper;
import com.zhangbaiquan.pro.po.changeroom.Changeroom;
import com.zhangbaiquan.pro.po.changeroom.ChangeroomExample;
import com.zhangbaiquan.pro.vo.ChangeRoomVo;

@Service("ChangeroomService")
public class ChangeroomServiceImpl implements ChangeroomService{

	@Autowired ChangeroomMapper changeroomMapper;
	
	@Override
	public int countByExample(ChangeroomExample example) {
		// TODO Auto-generated method stub
		return changeroomMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(ChangeroomExample example) {
		// TODO Auto-generated method stub
		return changeroomMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return changeroomMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Changeroom record) {
		// TODO Auto-generated method stub
		return changeroomMapper.insert(record);
	}

	@Override
	public int insertSelective(Changeroom record) {
		// TODO Auto-generated method stub
		return changeroomMapper.insertSelective(record);
	}

	@Override
	public List<Changeroom> selectByExample(ChangeroomExample example) {
		// TODO Auto-generated method stub
		return changeroomMapper.selectByExample(example);
	}

	@Override
	public Changeroom selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return changeroomMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Changeroom record, ChangeroomExample example) {
		// TODO Auto-generated method stub
		return changeroomMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Changeroom record, ChangeroomExample example) {
		// TODO Auto-generated method stub
		return changeroomMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Changeroom record) {
		// TODO Auto-generated method stub
		return changeroomMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Changeroom record) {
		// TODO Auto-generated method stub
		return changeroomMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Changeroom> selectByPageAndExample(ChangeroomExample example) {
		// TODO Auto-generated method stub
		return changeroomMapper.selectByPageAndExample(example);
	}

	@Override
	public List<ChangeRoomVo> selectAll(ChangeroomExample example) {
		// TODO Auto-generated method stub
		return changeroomMapper.selectAll(example);
	}

	@Override
	public Integer countChangeRoomByExample(ChangeroomExample example) {
		// TODO Auto-generated method stub
		return changeroomMapper.countChangeRoomByExample(example);
	}

	@Override
	public Integer getChangeRoomId(int customerid) {
		// TODO Auto-generated method stub
		return changeroomMapper.getChangeRoomId(customerid);
	}

	@Override
	public List<Integer> getChangeRoomListId(int customerid) {
		// TODO Auto-generated method stub
		return changeroomMapper.getChangeRoomListId(customerid);
	}

}
