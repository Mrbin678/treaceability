package com.hx.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hx.mapper.LoggingMapper;
import com.hx.model.Logging;
import com.hx.service.LogService;

@Service("logService")
public class LogServiceImpl implements LogService{
	
	@Autowired
	private LoggingMapper loggingsMapper;
	
	//查询所有日志
	@Override
	public List<Logging> findAll() {
		return loggingsMapper.findAll();
	}
	//访问量
	@Override
	public Integer pageView() {
		return loggingsMapper.pageView();
	}
}
