package com.hx.service;

import java.util.List;

import com.hx.model.Echart;
import com.hx.model.Meter;

public interface MeterService {

	//
	int create(Meter m);

	// 查询基表
	List<Meter> findAll();

	// 通过ID查询基表
	Meter findById(Integer id);
	
	//
	Meter slelectByMeterCode(String code);
	Meter slelectByOrderCode(String code);
	Meter selectByCounterCode(String code);
	Meter selectByHeaderCode(String code);
	Meter selectByShellCode(String code);
	// 添加基表
	int addMeter(Meter meter);

	// 删除基表
	int deleteById(Integer id);

	// 修改基表
	int updateMeter(Meter meter);
	
	// 根据基表出厂编号查询，验证创建/编辑新基表时是否重复
	List<Meter> findByMeterCode(String meterNum);
	// 根据表头板编号查询，验证创建/编辑新基表时是否重复
	List<Meter> findByHeaderCode(String headerNum);
	// 根据计数器编号查询，验证创建/编辑新基表时是否重复
	List<Meter> findByCounterCode(String counterNum);
	// 根据表壳编号查询，验证创建/编辑新基表时是否重复
	List<Meter> findByShellCode(String shellCodeNum);

	//首页图表
	List<Echart> chart();
	
	Integer meterCount();
}
