package com.zhangbaiquan.pro.service.livein;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangbaiquan.pro.mapper.livein.LiveinMapper;
import com.zhangbaiquan.pro.po.livein.Livein;
import com.zhangbaiquan.pro.po.livein.LiveinExample;

@Service("LiveinService")
public class LiveinServiceImpl implements LiveinService{

	@Autowired
	private LiveinMapper liveinMapper;
		
	@Override
	public int countByExample(LiveinExample example) {
		// TODO Auto-generated method stub
		return liveinMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(LiveinExample example) {
		// TODO Auto-generated method stub
		return liveinMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer customerid) {
		// TODO Auto-generated method stub
		return liveinMapper.deleteByPrimaryKey(customerid);
	}

	@Override
	public int insert(Livein record) {
		// TODO Auto-generated method stub
		return liveinMapper.insert(record);
	}

	@Override
	public int insertSelective(Livein record) {
		// TODO Auto-generated method stub
		return liveinMapper.insertSelective(record);
	}

	@Override
	public List<Livein> selectByExample(LiveinExample example) {
		// TODO Auto-generated method stub
		return liveinMapper.selectByExample(example);
	}

	@Override
	public Livein selectByPrimaryKey(Integer customerid) {
		// TODO Auto-generated method stub
		return liveinMapper.selectByPrimaryKey(customerid);
	}

	@Override
	public int updateByExampleSelective(Livein record, LiveinExample example) {
		// TODO Auto-generated method stub
		return liveinMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Livein record, LiveinExample example) {
		// TODO Auto-generated method stub
		return liveinMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Livein record) {
		// TODO Auto-generated method stub
		return liveinMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Livein record) {
		// TODO Auto-generated method stub
		return liveinMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Livein> selectByPageAndExample(LiveinExample example) {
		// TODO Auto-generated method stub
		return liveinMapper.selectByPageAndExample(example);
	}

	@Override
	public int getMaxId() {
		// TODO Auto-generated method stub
		return liveinMapper.getMaxId();
	}

}
