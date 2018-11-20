package com.hx.service;

import java.util.List;

import com.hx.model.Package;

public interface PackageService {
	
	int create(Package p);
	
	//查询所有包装信息
	List<Package> findAll();
	//通过code查询信息
	List<Package> findByCode(String code);
	//通过id查询信息
	Package findById(Integer id);
	//更新
	int update(Package p);
	//删除
	int deleteById(Integer id);
}
