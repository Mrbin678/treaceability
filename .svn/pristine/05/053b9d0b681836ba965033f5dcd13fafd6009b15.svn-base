package com.hx.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hx.mapper.RoleMapper;
import com.hx.model.Role;
import com.hx.model.RoleRight;
import com.hx.service.RoleService;

@Service("roleService")
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleMapper roleMapper;
	
	@Override
	public List<Role> findAll() {
		return roleMapper.findAll();
	}
	
	@Override
	public int addRole(Role role) {
		return roleMapper.addRole(role);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return roleMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteRights(Integer roleId) {
		return roleMapper.deleteRights(roleId);
	}

	@Override
	public void addRights(RoleRight rr) {
		roleMapper.addRights(rr);
	}

	@Override
	public String getRoleName(Integer roleId) {
		return roleMapper.getRoleName(roleId);
	}

}
