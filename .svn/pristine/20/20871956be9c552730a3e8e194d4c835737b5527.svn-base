package com.hx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hx.mapper.MeterMapper;
import com.hx.model.Echart;
import com.hx.model.Meter;
import com.hx.service.MeterService;

@Service("meterService")
public class MeterServiceImpl implements MeterService{
	
	@Autowired
	private MeterMapper meterMapper;

	@Override
	public int create(Meter m) {
		return meterMapper.insertSelective(m);
	}

	@Override
	public List<Meter> findAll() {
		return meterMapper.findAll();
	}

	@Override
	public Meter findById(Integer id) {
		return meterMapper.selectByPrimaryKey(id);
	}

	@Override
	public int addMeter(Meter meter) {
		return meterMapper.insertSelective(meter);
	}

	@Override
	public int deleteById(Integer id) {
		return meterMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateMeter(Meter meter) {
		return meterMapper.updateByPrimaryKeySelective(meter);
	}

	@Override
	public List<Meter> findByMeterCode(String meterNum) {
		return meterMapper.findByMeterCode(meterNum);
	}

	@Override
	public List<Meter> findByHeaderCode(String headerNum) {
		return  meterMapper.findByHeaderCode(headerNum);
	}

	@Override
	public List<Meter> findByCounterCode(String counterNum) {
		return  meterMapper.findByCounterCode(counterNum);
	}

	@Override
	public Meter slelectByMeterCode(String code) {
		return meterMapper.slelectByMeterCode(code);
	}

	@Override
	public Meter selectByCounterCode(String code) {
		return meterMapper.slelectByCounterCode(code);
	}

	@Override
	public Meter selectByHeaderCode(String code) {
		return meterMapper.slelectByHeaderCode(code);
	}

	@Override
	public Meter selectByShellCode(String code) {
		return meterMapper.slelectByShellCode(code);
	}

	@Override
	public List<Meter> findByShellCode(String shellCodeNum) {
		return meterMapper.findByShellCode(shellCodeNum);
	}

	@Override
	public Meter slelectByOrderCode(String code) {
		
		return meterMapper.slelectByOrderCode(code);
	}

	@Override
	public List<Echart> chart() {
		return meterMapper.chat();
	}

	@Override
	public Integer meterCount() {
		return meterMapper.meterCount();
	}

	
}
