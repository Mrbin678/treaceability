package com.hx.service;

import java.util.List;

import com.hx.model.CounterDetection;

public interface CounterDetectionService {

	//
	int create(CounterDetection c);

	// 查询计数器检测信息
	List<CounterDetection> findAll();

	// 通过ID查询计数器检测信息
	CounterDetection findById(Integer id);
	
	//
	CounterDetection findByCode(String code);

	// 添加计数器检测信息
	int addCounterDetection(CounterDetection counterDetection);

	// 删除计数器检测信息
	int deleteById(Integer id);

	// 修改计数器检测信息
	int updateCounterDetection(CounterDetection counterDetection);

	// 根据计数器条码查询，验证创建/编辑新计数器检测信息时是否重复
	List<CounterDetection> findByCounterCode(String counterCodeNum);

}
