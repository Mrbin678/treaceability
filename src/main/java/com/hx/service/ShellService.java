package com.hx.service;

import java.util.List;

import com.hx.model.Shell;

public interface ShellService {
	//app
	int creat(Shell shell);
	
	//查询所有记录
	List<Shell> findAll();
	
	//根据code查询记录
	List<Shell> findByCode(String code);
	
	//
	Shell selectByCode(String code);
	
	//根据id查询记录
	Shell findById(Integer id);
	
	//添加表壳记录
	int addShell(Shell shell);
	
	//删除表壳记录
	int delShell(Integer id);
	
	//修改表壳记录
	int updateShell(Shell shell);
}
