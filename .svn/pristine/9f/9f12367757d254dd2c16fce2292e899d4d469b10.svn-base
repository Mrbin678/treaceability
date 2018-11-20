package com.hx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hx.mapper.PackageMapper;
import com.hx.model.Package;
import com.hx.service.PackageService;

@Service("packageService")
public class PackageServiceImpl implements PackageService{
	
	@Autowired
	private PackageMapper packageMapper;

	@Override
	public int create(Package p) {
		return packageMapper.insertSelective(p);
	}

	@Override
	public List<Package> findAll() {
		return packageMapper.findAll();
	}

	@Override
	public List<Package> findByCode(String code) {
		return packageMapper.findByCode(code);
	}

	@Override
	public Package findById(Integer id) {
		return packageMapper.selectByPrimaryKey(id);
	}

	@Override
	public int update(Package p) {
		return packageMapper.updateByPrimaryKeySelective(p);
	}

	@Override
	public int deleteById(Integer id) {
		return packageMapper.deleteByPrimaryKey(id);
	}

}
