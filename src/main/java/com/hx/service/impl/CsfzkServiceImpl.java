package com.hx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hx.mapper.CsfzkMapper;
import com.hx.model.Csfzk;
import com.hx.service.CsfzxService;

@Service("csfzkService")
//流量检测实现类
public class CsfzkServiceImpl implements CsfzxService {

	@Autowired
	private CsfzkMapper csfzkMapper;
	
	@Override
	public int create(Csfzk m) {
		// TODO Auto-generated method stub
		return csfzkMapper.insertSelective(m);
	}

	@Override
	public List<Csfzk> findAll() {
		// TODO Auto-generated method stub
		return csfzkMapper.findAll();
	}

	@Override
	public Csfzk findById(Long id) {
		// TODO Auto-generated method stub
		return csfzkMapper.selectByPrimaryKey(id);
	}

	@Override
	public int addCsfzk(Csfzk csfzk) {
		// TODO Auto-generated method stub
		return csfzkMapper.insertSelective(csfzk);
	}

	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		return csfzkMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateCsfzk(Csfzk csfzk) {
		// TODO Auto-generated method stub
		return csfzkMapper.updateByPrimaryKeySelective(csfzk);
	}

	@Override
	public List<Csfzk> findByMeterCode(String meterCodeNum) {
		// TODO Auto-generated method stub
		return csfzkMapper.findByMeterCode(meterCodeNum);
	}

	@Override
	public Csfzk findByCode(String code) {
		// TODO Auto-generated method stub
		return csfzkMapper.findByCode(code);
	}

}
