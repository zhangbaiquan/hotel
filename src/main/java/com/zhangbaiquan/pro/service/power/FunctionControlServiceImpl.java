package com.zhangbaiquan.pro.service.power;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangbaiquan.pro.mapper.power.MFunctioncontrolMapper;
import com.zhangbaiquan.pro.po.power.MFunctioncontrol;
import com.zhangbaiquan.pro.po.power.MFunctioncontrolExample;
import com.zhangbaiquan.pro.po.power.MFunctioncontrolExample.Criteria;
@Service("functionControlService")
public class FunctionControlServiceImpl implements FunctionControlService {
	@Autowired
	private MFunctioncontrolMapper mFunctioncontrollermapper;
	@Override
	public int countByExample(MFunctioncontrolExample example) {
		// TODO Auto-generated method stub
		return mFunctioncontrollermapper.countByExample(example);
	}

	@Override
	public int deleteByExample(MFunctioncontrolExample example) {
		// TODO Auto-generated method stub
		return mFunctioncontrollermapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return mFunctioncontrollermapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(MFunctioncontrol record) {
		// TODO Auto-generated method stub
		return mFunctioncontrollermapper.insert(record);
	}

	@Override
	public int insertSelective(MFunctioncontrol record) {
		// TODO Auto-generated method stub
		return mFunctioncontrollermapper.insertSelective(record);
	}

	@Override
	public List<MFunctioncontrol> selectByExample(MFunctioncontrolExample example) {
		// TODO Auto-generated method stub
		return mFunctioncontrollermapper.selectByExample(example);
	}

	@Override
	public MFunctioncontrol selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return mFunctioncontrollermapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(MFunctioncontrol record, MFunctioncontrolExample example) {
		// TODO Auto-generated method stub
		return mFunctioncontrollermapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(MFunctioncontrol record, MFunctioncontrolExample example) {
		// TODO Auto-generated method stub
		return mFunctioncontrollermapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(MFunctioncontrol record) {
		// TODO Auto-generated method stub
		return mFunctioncontrollermapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(MFunctioncontrol record) {
		// TODO Auto-generated method stub
		return mFunctioncontrollermapper.updateByPrimaryKey(record);
	}

	@Override
	public List<MFunctioncontrol> selectParent() {
		// TODO Auto-generated method stub
		MFunctioncontrolExample example=new MFunctioncontrolExample();
		Criteria criteria=example.createCriteria();
		criteria.andPidEqualTo("0");
		example.setOrderByClause("pxid");
		return mFunctioncontrollermapper.selectByExample(example);
	}

	@Override
	public List<MFunctioncontrol> selectChild() {
		// TODO Auto-generated method stub
		MFunctioncontrolExample example=new MFunctioncontrolExample();
		Criteria criteria=example.createCriteria();
		criteria.andPidNotEqualTo("0");
		example.setOrderByClause("pxid");
		return mFunctioncontrollermapper.selectByExample(example);
	}

	@Override
	public String selectMaxId() {
		// TODO Auto-generated method stub
		return mFunctioncontrollermapper.selectMaxId();
	}


}
