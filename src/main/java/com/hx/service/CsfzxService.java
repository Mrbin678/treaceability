package com.hx.service;

import java.util.List;

import com.hx.model.Csfzk;
//流量检测服务层
public interface CsfzxService {

	//
	int create(Csfzk m);

	// 查询流量检测信息
	List<Csfzk> findAll();

	// 通过ID查询流量检测信息
	Csfzk findById(Long id);
	// 通过表号查流量信息
	Csfzk findByCode(String code);

	// 添加流量检测信息
	int addCsfzk(Csfzk csfzk);

	// 删除流量检测信息
	int deleteById(Long id);

	// 修改流量检测信息
	int updateCsfzk(Csfzk Csfzk);

	// 根据基表条码查询，验证创建新流量检测信息时是否重复
	List<Csfzk> findByMeterCode(String meterCodeNum);
}
