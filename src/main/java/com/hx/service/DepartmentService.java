package com.hx.service;

import java.util.List;

import com.hx.model.Department;

public interface DepartmentService {

	List<Department> findAll();

	int addDepartment(Department department);

	int updateDepartment(Department department);

	Department selectByPrimaryKey(Integer id);

	int deleteById(Integer id);

}
