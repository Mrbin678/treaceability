package com.hx.service;

import java.util.List;

import com.hx.model.Role;
import com.hx.model.RoleRight;

public interface RoleService {
	//所以角色
	List<Role> findAll();
	//添加角色
	int addRole(Role role);
	//删除角色
	int deleteByPrimaryKey(Integer id);
	//删除权限
	int deleteRights(Integer roleId);
	//添加权限
	void addRights(RoleRight rr);
	//
	String getRoleName(Integer roleId);
}
