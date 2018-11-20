package com.hx.service;

import java.util.List;

import com.hx.model.Echart;
import com.hx.model.Order;

public interface OrderService {

	//查询所有订单
	List<Order> findAll();
	//通过ID查询订单	
	Order findById(Integer id);
	//添加订单	
	int addOrder(Order order);
	//删除订单	
	int deleteById(Integer id);
	//修改订单	
	int updateOrder(Order order);
	//根据订单编号查询，验证创建新订单时是否重复	
	List<Order> findByOrderCode(String orderNum);
	Integer orderCount();
	//app
	Order findByCode(String code);
	List<Echart> orderChart();
	List<Echart> userChart();
}
