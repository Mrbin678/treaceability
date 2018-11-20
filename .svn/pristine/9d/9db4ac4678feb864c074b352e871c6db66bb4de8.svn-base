package com.hx.service;

import java.util.List;

import com.hx.model.Work;

public interface WorkService {

	// 新建上工信息
	int createWork(Work w);

	// 查询上工信息
	List<Work> findAll();

	// 通过ID查询上工信息
	Work findById(Integer id);

	// 添加上工信息
	int addWork(Work work);

	// 删除上工信息
	int deleteById(Integer id);

	// 修改上工信息
	int updateWork(Work work);

	// 根据订单编号查询，验证创建/编辑 上工信息时订单是否重复
	List<Work> findByOrderCode(String orderNum);

}
