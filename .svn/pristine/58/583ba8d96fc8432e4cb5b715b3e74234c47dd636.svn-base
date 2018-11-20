package com.hx.service;

import java.util.List;
import com.hx.model.Repair;

//维修业务层
public interface RepairService {
	// 查询所有维修记录
	List<Repair> findAll();

	// 通过ID查询维修记录
	Repair findById(Integer id);

	// 添加维修记录
	int addRepair(Repair repair);

	// 删除维修记录
	int deleteById(Integer id);

	// 修改维修记录
	int updateRepair(Repair repair);

	// 根据维修编号查询，验证创建/编辑维修记录时是否重复
	List<Repair> findByDeviceCode(String repairNum);
}
