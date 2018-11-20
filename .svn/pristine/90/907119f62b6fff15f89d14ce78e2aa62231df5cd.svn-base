package com.hx.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hx.mapper.ShellMapper;
import com.hx.model.Shell;
import com.hx.service.ShellService;

@Service("shellService")
public class ShellServiceImpl  implements ShellService{
	
	@Autowired
	private ShellMapper shellMapper;
	
	@Override
	public int creat(Shell shell) {
		return shellMapper.insertSelective(shell);
	}

	@Override
	public List<Shell> findAll() {
		return shellMapper.findAll();
	}

	@Override
	public List<Shell> findByCode(String code) {
		return shellMapper.findByCode(code);
	}

	@Override
	public Shell findById(Integer id) {
		return shellMapper.findById(id);
	}

	@Override
	public int addShell(Shell shell) {
		return shellMapper.addShell(shell);
	}

	@Override
	public int delShell(Integer id) {
		return shellMapper.delShell(id);
	}

	@Override
	public int updateShell(Shell shell) {
		return shellMapper.updateByPrimaryKeySelective(shell);
	}

	@Override
	public Shell selectByCode(String code) {
		return shellMapper.selectByCode(code);
	}

}
