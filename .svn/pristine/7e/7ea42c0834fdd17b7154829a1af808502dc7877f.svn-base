package com.hx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hx.mapper.CounterMapper;
import com.hx.model.Counter;
import com.hx.service.CounterService;
@Service("counterService")
public class CounterServiceImpl implements CounterService {

	@Autowired
	private CounterMapper counterMapper;

	@Override
	public List<Counter> findAll() {
		return counterMapper.findAll();
	}

	@Override
	public Counter findById(Integer id) {
		return counterMapper.selectByPrimaryKey(id);
	}

	@Override
	public int addCounter(Counter counter) {
		return 0;
	}

	@Override
	public int deleteById(Integer id) {
		return counterMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateCounter(Counter counter) {
		return counterMapper.updateByPrimaryKeySelective(counter);
	}

	@Override
	public List<Counter> findByCounterCode(String counterNum) {
		return counterMapper.findByCounterCode(counterNum);
	}
	//app
	@Override
	public int create(Counter counter) {
		return counterMapper.insertSelective(counter);
	}

	@Override
	public Counter findByCode(String code) {
		return counterMapper.findByCode(code);
	}

}
