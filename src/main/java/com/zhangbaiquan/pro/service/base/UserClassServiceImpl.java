package com.zhangbaiquan.pro.service.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangbaiquan.pro.mapper.base.UserclassinfoMapper;
import com.zhangbaiquan.pro.po.base.Userclassinfo;
import com.zhangbaiquan.pro.po.base.UserclassinfoExample;
import com.zhangbaiquan.pro.util.PageBean;
@Service("userClassService")
public class UserClassServiceImpl implements UserClassService {
	@Autowired
	private UserclassinfoMapper userclassinfoMapper;
	@Override
	public int countByExample(UserclassinfoExample example) {
		// TODO Auto-generated method stub
		return userclassinfoMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(UserclassinfoExample example) {
		// TODO Auto-generated method stub
		return userclassinfoMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer userclassid) {
		// TODO Auto-generated method stub
		return userclassinfoMapper.deleteByPrimaryKey(userclassid);
	}

	@Override
	public int insert(Userclassinfo record) {
		// TODO Auto-generated method stub
		return userclassinfoMapper.insert(record);
	}

	@Override
	public int insertSelective(Userclassinfo record) {
		// TODO Auto-generated method stub
		return userclassinfoMapper.insertSelective(record);
	}

	@Override
	public List<Userclassinfo> selectByExampleWithBLOBs(UserclassinfoExample example) {
		// TODO Auto-generated method stub
		return userclassinfoMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<Userclassinfo> selectByExample(UserclassinfoExample example) {
		// TODO Auto-generated method stub
		return userclassinfoMapper.selectByExample(example);
	}

	@Override
	public Userclassinfo selectByPrimaryKey(Integer userclassid) {
		// TODO Auto-generated method stub
		return userclassinfoMapper.selectByPrimaryKey(userclassid);
	}

	@Override
	public int updateByExampleSelective(Userclassinfo record, UserclassinfoExample example) {
		// TODO Auto-generated method stub
		return userclassinfoMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExampleWithBLOBs(Userclassinfo record, UserclassinfoExample example) {
		// TODO Auto-generated method stub
		return userclassinfoMapper.updateByExampleWithBLOBs(record, example);
	}

	@Override
	public int updateByExample(Userclassinfo record, UserclassinfoExample example) {
		// TODO Auto-generated method stub
		return userclassinfoMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Userclassinfo record) {
		// TODO Auto-generated method stub
		return userclassinfoMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(Userclassinfo record) {
		// TODO Auto-generated method stub
		return userclassinfoMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(Userclassinfo record) {
		// TODO Auto-generated method stub
		return userclassinfoMapper.updateByPrimaryKey(record);
	}

	@Override
	public void selectByPage(PageBean paging) {
		// TODO Auto-generated method stub
		paging.setList(userclassinfoMapper.selectByPage(paging.getStartPos(), paging.getPageSize()));
		paging.setTotalRows(userclassinfoMapper.countByExample(new UserclassinfoExample()));
		
	}

	@Override
	public Integer selectMaxId() {
		// TODO Auto-generated method stub
		return userclassinfoMapper.selectMaxId();
	}

}
