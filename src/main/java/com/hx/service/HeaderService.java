package com.hx.service;

import java.util.List;

import com.hx.model.Header;

public interface HeaderService {
	// 查询表头板
	List<Header> findAll();

	// 通过ID查询表头板
	Header findById(Integer id);
	//
	Header findByCode(String code);
	// 添加表头板
	int addHeader(Header header);

	// 删除表头板
	int deleteById(Integer id);

	// 修改表头板
	int updateHeader(Header header);

	// 根据表头板编号查询，验证创建/编辑新计数器时是否重复
	List<Header> findByHeaderCode(String headerNum);
	
	//app
	int create(Header h);
}
