package com.hx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hx.mapper.RepairMapper;
import com.hx.model.Repair;
import com.hx.service.RepairService;
@Service("repair")
public class RepairServiceImpl implements RepairService {
	
	@Autowired
	private RepairMapper repairMapper;
	
	@Override
	public List<Repair> findAll() {
		// TODO Auto-generated method stub
		return repairMapper.findAll();
	}

	@Override
	public Repair findById(Integer id) {
		// TODO Auto-generated method stub
		return repairMapper.selectByPrimaryKey(id);
	}

	@Override
	public int addRepair(Repair repair) {
		// TODO Auto-generated method stub
		return repairMapper.insertSelective(repair);
	}

	@Override
	public int deleteById(Integer id) {
		// TODO Auto-generated method stub
		return repairMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateRepair(Repair repair) {
		// TODO Auto-generated method stub
		return repairMapper.updateByPrimaryKeySelective(repair);
	}

	@Override
	public List<Repair> findByDeviceCode(String repairNum) {
		// TODO Auto-generated method stub
		return repairMapper.findByDeviceCode(repairNum);
	}

}
