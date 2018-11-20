package com.hx.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hx.mapper.RightMapper;
import com.hx.model.Right;
import com.hx.service.RightService;
@Service("rightService")
public class RightServiceImpl implements RightService {
	
	@Autowired
	private RightMapper rightMapper;
	
	@Override
	public List<Right> findAll() {
		return rightMapper.findAll();
	}

	@Override
	public int addRight(Right right) {
		return rightMapper.addRight(right);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return rightMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Set<String> selectRightNames(Integer id) {
		return rightMapper.selectRightName(id);
	}

	@Override
	public Right selectByPrimaryKey(Integer id) {
		return rightMapper.selectByPrimaryKey(id);
	}

	@Override
	public int update(Right right) {
		return rightMapper.updateByPrimaryKeySelective(right);
	}


}
