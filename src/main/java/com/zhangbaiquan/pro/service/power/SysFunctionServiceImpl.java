package com.zhangbaiquan.pro.service.power;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangbaiquan.pro.mapper.power.MSysFuncsecurityMapper;
import com.zhangbaiquan.pro.po.power.MSysFuncsecurity;
import com.zhangbaiquan.pro.po.power.MSysFuncsecurityExample;
@Service("sysFunctionService")
public class SysFunctionServiceImpl implements SysFunctionService {
	@Autowired
	private MSysFuncsecurityMapper mSysFuncsecurityMapper;
	@Override
	public int countByExample(MSysFuncsecurityExample example) {
		// TODO Auto-generated method stub
		return mSysFuncsecurityMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(MSysFuncsecurityExample example) {
		// TODO Auto-generated method stub
		return mSysFuncsecurityMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer fid) {
		// TODO Auto-generated method stub
		return mSysFuncsecurityMapper.deleteByPrimaryKey(fid);
	}

	@Override
	public int insert(MSysFuncsecurity record) {
		// TODO Auto-generated method stub
		return mSysFuncsecurityMapper.insert(record);
	}

	@Override
	public int insertSelective(MSysFuncsecurity record) {
		// TODO Auto-generated method stub
		return mSysFuncsecurityMapper.insertSelective(record);
	}

	@Override
	public List<MSysFuncsecurity> selectByExample(MSysFuncsecurityExample example) {
		// TODO Auto-generated method stub
		return mSysFuncsecurityMapper.selectByExample(example);
	}

	@Override
	public MSysFuncsecurity selectByPrimaryKey(Integer fid) {
		// TODO Auto-generated method stub
		return mSysFuncsecurityMapper.selectByPrimaryKey(fid);
	}

	@Override
	public int updateByExampleSelective(MSysFuncsecurity record, MSysFuncsecurityExample example) {
		// TODO Auto-generated method stub
		return mSysFuncsecurityMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(MSysFuncsecurity record, MSysFuncsecurityExample example) {
		// TODO Auto-generated method stub
		return mSysFuncsecurityMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(MSysFuncsecurity record) {
		// TODO Auto-generated method stub
		return mSysFuncsecurityMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(MSysFuncsecurity record) {
		// TODO Auto-generated method stub
		return mSysFuncsecurityMapper.updateByPrimaryKey(record);
	}


}
