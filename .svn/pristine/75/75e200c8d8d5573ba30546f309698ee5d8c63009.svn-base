package com.hx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hx.mapper.MeterDetectionMapper;
import com.hx.model.MeterDetection;
import com.hx.service.MeterDetectionService;

@Service("meterDetectionService")
public class MeterDetectionServiceImpl implements MeterDetectionService{
	
	@Autowired
	private MeterDetectionMapper meterDetectionMapper;
	

	@Override
	public int create(MeterDetection m) {
		meterDetectionMapper.insertSelective(m);
		return m.getId();
	}


	@Override
	public List<MeterDetection> findAll() {
		return meterDetectionMapper.findAll();
	}


	@Override
	public MeterDetection findById(Integer id) {
		return meterDetectionMapper.selectByPrimaryKey(id);
	}


	@Override
	public int addMeterDetection(MeterDetection meterDetection) {
		return meterDetectionMapper.insertSelective(meterDetection);
	}


	@Override
	public int deleteById(Integer id) {
		return meterDetectionMapper.deleteByPrimaryKey(id);
	}


	@Override
	public int updateMeterDetection(MeterDetection meterDetection) {
		return meterDetectionMapper.updateByPrimaryKeySelective(meterDetection);
	}


	@Override
	public List<MeterDetection> findByMeterCode(String meterCodeNum) {
		return meterDetectionMapper.findByMeterCode(meterCodeNum);
	}


	@Override
	public MeterDetection findByCode(String factoryCode) {
		return meterDetectionMapper.findByCode(factoryCode);
	}
}
