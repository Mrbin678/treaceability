package com.hx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hx.mapper.ShipmentMapper;
import com.hx.model.Shipment;
import com.hx.service.ShipmentService;
@Service("shipmentService")
public class ShipmentServiceImpl implements ShipmentService {
	
	@Autowired
	private ShipmentMapper shipmentMapper;
	
	@Override
	public int create(Shipment shipment) {
		return shipmentMapper.insertSelective(shipment);
	}

	@Override
	public List<Shipment> findAll() {
		return shipmentMapper.findAll();
	}

	@Override
	public List<Shipment> findByCode(String searchName) {
		return shipmentMapper.findByCode(searchName);
	}

	@Override
	public Shipment findById(Integer id) {
		return shipmentMapper.selectByPrimaryKey(id);
	}

	@Override
	public Integer update(Shipment shipment) {
		return shipmentMapper.updateByPrimaryKeySelective(shipment);
	}

	@Override
	public Integer del(Integer id) {
		return shipmentMapper.deleteByPrimaryKey(id);
	}

}
