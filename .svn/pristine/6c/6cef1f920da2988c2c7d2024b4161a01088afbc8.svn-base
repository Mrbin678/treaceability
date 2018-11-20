package com.hx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hx.mapper.DepartmentMapper;
import com.hx.model.Department;
import com.hx.service.DepartmentService;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentMapper departmentMapper;
	
	@Override
	public List<Department> findAll() {
		return departmentMapper.findAll();
	}

	@Override
	public int addDepartment(Department department) {
		return departmentMapper.insertSelective(department);
	}

	@Override
	public int updateDepartment(Department department) {
		return departmentMapper.updateByPrimaryKeySelective(department);
	}

	@Override
	public Department selectByPrimaryKey(Integer id) {
		return departmentMapper.selectByPrimaryKey(id);
	}

	@Override
	public int deleteById(Integer id) {
		return departmentMapper.deleteByPrimaryKey(id);
	}

}
