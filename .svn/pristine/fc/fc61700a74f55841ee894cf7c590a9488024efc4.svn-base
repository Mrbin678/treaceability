package com.hx.service;

import java.util.List;
import com.hx.model.MeterDetection;

public interface MeterDetectionService {

	//
	int create(MeterDetection m);

	// 查询基表检测信息
	List<MeterDetection> findAll();

	// 通过ID查询基表检测信息
	MeterDetection findById(Integer id);

	// 添加基表检测信息
	int addMeterDetection(MeterDetection meterDetection);

	// 删除基表检测信息
	int deleteById(Integer id);

	// 修改基表检测信息
	int updateMeterDetection(MeterDetection meterDetection);

	// 根据基表条码查询，验证创建新基表检测信息时是否重复
	List<MeterDetection> findByMeterCode(String meterCodeNum);

	MeterDetection findByCode(String factoryCode);
}
