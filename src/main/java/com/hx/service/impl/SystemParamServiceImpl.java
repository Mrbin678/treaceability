package com.hx.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hx.mapper.SystemParamMapper;
import com.hx.model.SystemParam;
import com.hx.service.SystemParamService;

@Service("systemParamService")
public class SystemParamServiceImpl implements SystemParamService{
	
	@Autowired
	private SystemParamMapper systemParamMapper;

	@Override
	public List<SystemParam> findAll() {
		//查询所有系統參數
		return systemParamMapper.findAll();
	}

	@Override
	public int addSystemParam(SystemParam systemParam) {
		//添加系统参数
		return systemParamMapper.addSystemParam(systemParam);
	}

	@Override
	public int updateSystemParam(SystemParam systemParam) {
		//更新系统参数
		return systemParamMapper.updateSystemParam(systemParam);
	}

	@Override
	public int deleteById(Integer id) {
		//删除系统参数
		return systemParamMapper.deleteByPrimaryKey(id);
	}

	@Override
	public SystemParam selectByPrimaryKey(Integer id) {
		//根据id查找系统参数
		return systemParamMapper.selectByPrimaryKey(id);
	}

	@Override
	public int deleteAll() {
		return systemParamMapper.deleteAll();
	}

	@Override
	public String getCompanyCode() {
		return systemParamMapper.getCompanyCode();
	}

	@Override
	public String getMeterType() {
		return systemParamMapper.getMeterType();
	}

	@Override
	public List<SystemParam> findAllByParamType(String paramType) {
		//根据参数类型查询对应的系统参数集合		
		return systemParamMapper.findAllByParamType(paramType);
	}

	@Override
	public List<SystemParam> queryFactories() {
		//查询基表厂家
		return systemParamMapper.queryFactories();
	}

	@Override
	public List<SystemParam> querySMS() {
		// 查询所有短信版本
		return systemParamMapper.querySMS();
	}

	@Override
	public List<SystemParam> queryLora() {
		// 查询无线表版本
		return systemParamMapper.queryLora();
	}
	
	
}
