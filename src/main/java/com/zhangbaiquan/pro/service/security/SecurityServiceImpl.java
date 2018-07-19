package com.zhangbaiquan.pro.service.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangbaiquan.pro.mapper.security.SecurityMapper;
import com.zhangbaiquan.pro.po.security.Security;
import com.zhangbaiquan.pro.po.security.SecurityExample;

@Service("SecurityService")
public class SecurityServiceImpl implements SecurityService{

	@Autowired
	private SecurityMapper securityMapper;
	@Override
	public int countByExample(SecurityExample example) {
		// TODO Auto-generated method stub
		return securityMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(SecurityExample example) {
		// TODO Auto-generated method stub
		return securityMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return securityMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Security record) {
		// TODO Auto-generated method stub
		return securityMapper.insert(record);
	}

	@Override
	public int insertSelective(Security record) {
		// TODO Auto-generated method stub
		return securityMapper.insertSelective(record);
	}

	@Override
	public List<Security> selectByExample(SecurityExample example) {
		// TODO Auto-generated method stub
		return securityMapper.selectByExample(example);
	}

	@Override
	public Security selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return securityMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Security record, SecurityExample example) {
		// TODO Auto-generated method stub
		return securityMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Security record, SecurityExample example) {
		// TODO Auto-generated method stub
		return securityMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Security record) {
		// TODO Auto-generated method stub
		return securityMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Security record) {
		// TODO Auto-generated method stub
		return securityMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Security> selectByPageAndExample(SecurityExample example) {
		// TODO Auto-generated method stub
		return securityMapper.selectByPageAndExample(example);
	}

}
