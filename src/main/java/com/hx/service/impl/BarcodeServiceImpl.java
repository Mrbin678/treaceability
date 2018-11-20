package com.hx.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hx.mapper.BarcodeMapper;
import com.hx.model.Barcode;
import com.hx.service.BarcodeService;

@Service("barcodeService")
public class BarcodeServiceImpl implements BarcodeService{
	@Autowired
	private BarcodeMapper barcodeMapper;
	
	@Override
	public List<Barcode> findAll() {
		return barcodeMapper.findAll();
	}

	@Override
	public int addBarcode(Barcode barcode) {
		return barcodeMapper.insertSelective(barcode);
	}

	@Override
	public Barcode selectByPrimaryKey(Integer id) {
		return barcodeMapper.selectByPrimaryKey(id);
	}

	@Override
	public int update(Barcode barcode) {
		return barcodeMapper.updateByPrimaryKeySelective(barcode);
	}

	@Override
	public int deleteById(Integer id) {
		return barcodeMapper.deleteByPrimaryKey(id);
	}
}
