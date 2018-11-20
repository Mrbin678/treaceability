package com.hx.service;

import java.util.List;

import com.hx.model.Shipment;

public interface ShipmentService {
	//app
	int create(Shipment shipment);

	List<Shipment> findAll();

	List<Shipment> findByCode(String searchName);

	Shipment findById(Integer id);

	Integer update(Shipment shipment);

	Integer del(Integer id);

}
