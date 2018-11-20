package com.hx.service;

import java.util.List;

import com.hx.model.SystemParam;

public interface SystemParamService {
	List<SystemParam> findAll();
	int addSystemParam(SystemParam systemParam);
	int updateSystemParam(SystemParam systemParam);
	int deleteById(Integer id);
	SystemParam selectByPrimaryKey(Integer id);
	int deleteAll();
	String getCompanyCode();
	String getMeterType();
	
	List<SystemParam> findAllByParamType(String paramType);//通过参数类型查询系统参数(基表类型、规格型号等)
	//app
	List<SystemParam> queryFactories();
	List<SystemParam> querySMS();
	List<SystemParam> queryLora();
}
