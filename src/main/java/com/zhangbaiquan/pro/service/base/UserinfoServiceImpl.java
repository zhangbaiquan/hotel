package com.zhangbaiquan.pro.service.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangbaiquan.pro.mapper.base.UserinfoMapper;
import com.zhangbaiquan.pro.po.base.Userinfo;
import com.zhangbaiquan.pro.po.base.UserinfoExample;
import com.zhangbaiquan.pro.vo.UserVo;

@Service("userinfoService")
public class UserinfoServiceImpl implements UserinfoService {
	@Autowired
	private UserinfoMapper  userinfoMapper;

	@Override
	public int countByExample(UserinfoExample example) {
		// TODO Auto-generated method stub
		return userinfoMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(UserinfoExample example) {
		// TODO Auto-generated method stub
		return userinfoMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return userinfoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Userinfo record) {
		// TODO Auto-generated method stub
		return userinfoMapper.insert(record);
	}

	@Override
	public int insertSelective(Userinfo record) {
		// TODO Auto-generated method stub
		return userinfoMapper.insertSelective(record);
	}

	@Override
	public List<Userinfo> selectByExample(UserinfoExample example) {
		// TODO Auto-generated method stub
		return userinfoMapper.selectByExample(example);
	}

	@Override
	public Userinfo selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return userinfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Userinfo record, UserinfoExample example) {
		// TODO Auto-generated method stub
		return userinfoMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Userinfo record, UserinfoExample example) {
		// TODO Auto-generated method stub
		return userinfoMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Userinfo record) {
		// TODO Auto-generated method stub
		return userinfoMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Userinfo record) {
		// TODO Auto-generated method stub
		return userinfoMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Userinfo> selectByPage(Integer startPos, Integer pageSize, String key) {
		// TODO Auto-generated method stub
		return userinfoMapper.selectByPage(startPos, pageSize, key);
	}

	@Override
	public List<UserVo> selectVoByExample(UserinfoExample example) {
		// TODO Auto-generated method stub
		return userinfoMapper.selectVoByExample(example);
	}
	
	
}
