package com.hx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hx.mapper.HeaderMapper;
import com.hx.model.Header;
import com.hx.service.HeaderService;
@Service("headerService")
public class HeaderServiceImpl implements HeaderService {

	@Autowired
	private HeaderMapper headerMapper;
	@Override
	public List<Header> findAll() {
		return headerMapper.findAll();
	}

	@Override
	public Header findById(Integer id) {
		return headerMapper.selectByPrimaryKey(id);
	}

	@Override
	public int addHeader(Header header) {
		return headerMapper.insertSelective(header);
	}

	@Override
	public int deleteById(Integer id) {
		return headerMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateHeader(Header header) {
		return headerMapper.updateByPrimaryKeySelective(header);
	}

	@Override
	public List<Header> findByHeaderCode(String headerNum) {
		return headerMapper.findByHeaderCode(headerNum);
	}
	//app
	@Override
	public int create(Header h) {
		return headerMapper.insertSelective(h);
	}

	@Override
	public Header findByCode(String code) {
		return headerMapper.findByCode(code);
	}
}
