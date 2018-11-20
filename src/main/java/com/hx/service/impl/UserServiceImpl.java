package com.hx.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hx.mapper.UserMapper;
import com.hx.model.User;
import com.hx.service.UserService;

@Service("userService")
public class UserServiceImpl  implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	
	//登录验证
	@Override
	public User login(String loginName, String password) {
		return userMapper.findWithLoginnameAndPassword(loginName,password);
	}
    //查询所有用户
	@Override
	public List<User> getAll() {
		return userMapper.findAll();
	}
	//通过id查询
	@Override
	public User findById(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}
	//通过名字查询(验证创建新用户时是否同名)
	@Override
	public List<User> findByName(String loginName) {
		return userMapper.findByName(loginName);
	}
	//增加用户
	@Override
	public int addUser(User user) {
		return userMapper.insertSelective(user);
	}
	//删除用户
	@Override
	public int deleteById(Integer id) {
		return userMapper.deleteByPrimaryKey(id);
	}
    //修改用户
	@Override
	public int updateUser(User user) {
		return userMapper.updateByPrimaryKeySelective(user);
	}
	//app
	@Override
	public User findByOperator(String operator) {
		return userMapper.findByOperator(operator);
	}
	@Override
	public List<User> findByOp(String operator) {
		return userMapper.findByOp(operator);
	}
	@Override
	public List<User> findByDepartment(String name) {
		return userMapper.findByDepartment(name);
	}
	@Override
	public Integer userCount() {
		return userMapper.userCount();
	}
	@Override
	public Map<Integer, String> chart2() {
		return userMapper.chart2();
	}
}
