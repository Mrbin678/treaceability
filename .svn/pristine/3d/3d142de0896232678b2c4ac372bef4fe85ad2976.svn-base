package com.hx.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hx.mapper.ShellDetectionMapper;
import com.hx.model.ShellDetection;
import com.hx.service.ShellDetectionService;

@Service("shellDetectionService")
public class ShellDetectionServiceImpl implements ShellDetectionService {
	
	
	@Autowired
	private ShellDetectionMapper shellDetectionMapper;
	
	@Override
	public int create(ShellDetection s) {
		shellDetectionMapper.insertSelective(s);
		return s.getId();
	}

	@Override
	public ShellDetection findByCode(String shell_code) {
		return shellDetectionMapper.findByCode(shell_code);
	}

	@Override
	public List<ShellDetection> findByShellCode(String code) {
		return shellDetectionMapper.findByShellCode(code);
	}

	@Override
	public List<ShellDetection> findAll() {
		return shellDetectionMapper.findAll();
	}

	@Override
	public ShellDetection findById(Integer id) {
		return shellDetectionMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateShellDetection(ShellDetection shellDetection) {
		return shellDetectionMapper.updateByPrimaryKeySelective(shellDetection);
	}

	@Override
	public int deleteById(Integer id) {
		return shellDetectionMapper.deleteByPrimaryKey(id);
	}

}
