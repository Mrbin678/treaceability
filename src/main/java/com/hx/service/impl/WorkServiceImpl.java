package com.hx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hx.mapper.WorkMapper;
import com.hx.model.Work;
import com.hx.service.WorkService;

@Service("workService")
public class WorkServiceImpl implements WorkService{
	
	@Autowired
	private WorkMapper workMapper;

	@Override
	public int createWork(Work w) {
		workMapper.insertSelective(w);
		return w.getId();
	}

	@Override
	public List<Work> findAll() {
		// TODO Auto-generated method stub
		return workMapper.findAll();
	}

	@Override
	public Work findById(Integer id) {
		// TODO Auto-generated method stub
		return workMapper.selectByPrimaryKey(id);
	}

	@Override
	public int addWork(Work work) {
		// TODO Auto-generated method stub
		return workMapper.insertSelective(work);
	}

	@Override
	public int deleteById(Integer id) {
		// TODO Auto-generated method stub
		return workMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateWork(Work work) {
		// TODO Auto-generated method stub
		return workMapper.updateByPrimaryKeySelective(work);
	}

	@Override
	public List<Work> findByOrderCode(String orderNum) {
		// TODO Auto-generated method stub
		return workMapper.findByOrderCode(orderNum);
	}

	
	
}
