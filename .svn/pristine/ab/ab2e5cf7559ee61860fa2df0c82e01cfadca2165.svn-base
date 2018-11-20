package com.hx.service;

import java.util.List;

import com.hx.model.Counter;

public interface CounterService {
	//查询计数器
	List<Counter> findAll();
	//通过ID查询计数器	
	Counter findById(Integer id);
	//
	Counter findByCode(String code);
	//添加计数器
	int addCounter(Counter counter);
	//删除计数器	
	int deleteById(Integer id);
	//修改计数器	
	int updateCounter(Counter counter);
	//根据计数器编号查询，验证创建、编辑新计数器时是否重复	
	List<Counter> findByCounterCode(String counterNum);
	//app
	int create(Counter counter);
}
