package com.zhangbaiquan.pro.service.msgboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangbaiquan.pro.mapper.msgboard.MsgboardMapper;
import com.zhangbaiquan.pro.po.msgboard.Msgboard;
import com.zhangbaiquan.pro.po.msgboard.MsgboardExample;

@Service("MsgboardService")
public class MsgboardServiceImpl implements MsgboardService{

	@Autowired
	private MsgboardMapper msgboardMapper;
	
	@Override
	public int countByExample(MsgboardExample example) {
		// TODO Auto-generated method stub
		return msgboardMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(MsgboardExample example) {
		// TODO Auto-generated method stub
		return msgboardMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer msgboardid) {
		// TODO Auto-generated method stub
		return msgboardMapper.deleteByPrimaryKey(msgboardid);
	}

	@Override
	public int insert(Msgboard record) {
		// TODO Auto-generated method stub
		return msgboardMapper.insert(record);
	}

	@Override
	public int insertSelective(Msgboard record) {
		// TODO Auto-generated method stub
		return msgboardMapper.insertSelective(record);
	}

	@Override
	public List<Msgboard> selectByExample(MsgboardExample example) {
		// TODO Auto-generated method stub
		return msgboardMapper.selectByExample(example);
	}

	@Override
	public Msgboard selectByPrimaryKey(Integer msgboardid) {
		// TODO Auto-generated method stub
		return msgboardMapper.selectByPrimaryKey(msgboardid);
	}

	@Override
	public int updateByExampleSelective(Msgboard record, MsgboardExample example) {
		// TODO Auto-generated method stub
		return msgboardMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Msgboard record, MsgboardExample example) {
		// TODO Auto-generated method stub
		return msgboardMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Msgboard record) {
		// TODO Auto-generated method stub
		return msgboardMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Msgboard record) {
		// TODO Auto-generated method stub
		return msgboardMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Msgboard> selectByPageAndExample(MsgboardExample example) {
		// TODO Auto-generated method stub
		return msgboardMapper.selectByPageAndExample(example);
	}

}
