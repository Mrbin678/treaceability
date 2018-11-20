package com.hx.service;

import java.util.List;

import com.hx.model.Barcode;

public interface BarcodeService {

	List<Barcode> findAll();

	int addBarcode(Barcode barcode);

	Barcode selectByPrimaryKey(Integer id);

	int update(Barcode barcode);

	int deleteById(Integer id);
}
