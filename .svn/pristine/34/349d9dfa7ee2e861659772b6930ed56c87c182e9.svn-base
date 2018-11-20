package com.hx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hx.mapper.CounterDetectionMapper;
import com.hx.model.CounterDetection;
import com.hx.service.CounterDetectionService;

@Service("counterDetectionService")
public class CounterDetectionServiceImpl implements CounterDetectionService {
	
	
	@Autowired
	private CounterDetectionMapper counterDetectionMapper;
	
	@Override
	public int create(CounterDetection c) {
		counterDetectionMapper.insertSelective(c);
		return c.getId();
	}

	@Override
	public List<CounterDetection> findAll() {
		return counterDetectionMapper.findAll();
	}

	@Override
	public CounterDetection findById(Integer id) {
		return counterDetectionMapper.selectByPrimaryKey(id);
	}

	@Override
	public int addCounterDetection(CounterDetection counterDetection) {
		return counterDetectionMapper.insertSelective(counterDetection);
	}

	@Override
	public int deleteById(Integer id) {
		return counterDetectionMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateCounterDetection(CounterDetection counterDetection) {
		return counterDetectionMapper.updateByPrimaryKeySelective(counterDetection);
	}

	@Override
	public List<CounterDetection> findByCounterCode(String counterCodeNum) {
		return counterDetectionMapper.findByCounterCode(counterCodeNum);
	}

	@Override
	public CounterDetection findByCode(String code) {
		return counterDetectionMapper.findByCode(code);
	}

}
