package com.hx.service;

import java.util.List;
import java.util.Map;

import com.hx.model.User;

public interface UserService {
	User login(String loginName,String password);
	List<User> getAll();
	User findById(Integer id);
	int addUser(User user);
	int deleteById(Integer id);
	int updateUser(User user);
	List<User> findByName(String loginName);
	List<User> findByOp(String operator);
	List<User> findByDepartment(String name);
	Integer userCount();
	//app
	User findByOperator(String operator);
	Map<Integer, String> chart2();
}
