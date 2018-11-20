package com.hx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hx.mapper.HeaderDetectionMapper;
import com.hx.model.HeaderDetection;
import com.hx.service.HeaderDetectionService;

@Service("headerDetectionService")
public class HeaderDetectionServiceImpl implements HeaderDetectionService {
	
	
	@Autowired
	private HeaderDetectionMapper headerDetectionMapper;
	
	@Override
	public int create(HeaderDetection h) {
		headerDetectionMapper.insertSelective(h);
		return h.getId();
	}

	@Override
	public HeaderDetection findByCode(String code) {
		return headerDetectionMapper.findByCode(code);
	}

	@Override
	public List<HeaderDetection> findByHeaderCode(String searchName) {
		return headerDetectionMapper.findByHeaderCode(searchName);
	}

	@Override
	public List<HeaderDetection> findAll() {
		return headerDetectionMapper.findAll();
	}

	@Override
	public HeaderDetection findById(Integer id) {
		return headerDetectionMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateHeaderDetection(HeaderDetection headerDetection) {
		return headerDetectionMapper.updateByPrimaryKeySelective(headerDetection);
	}

	@Override
	public int deleteById(Integer id) {
		return headerDetectionMapper.deleteByPrimaryKey(id);
	}

}
