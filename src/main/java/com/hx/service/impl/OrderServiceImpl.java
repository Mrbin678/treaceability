package com.hx.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hx.mapper.OrderMapper;
import com.hx.model.Echart;
import com.hx.model.Order;
import com.hx.service.OrderService;

@Service("orderService")
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderMapper orderMapper;

	//查询所有订单
	@Override
	public List<Order> findAll() {
		return orderMapper.findAll();
	}

	//通过id查询
	@Override
	public Order findById(Integer id) {
		return orderMapper.selectByPrimaryKey(id);
	}
	//通过名字查询(验证创建订单时是否同名)
	@Override
	public List<Order> findByOrderCode(String orderNum) {
		return orderMapper.findByOrderCode(orderNum);
	}
	//增加订单
	@Override
	public int addOrder(Order order) {
		return orderMapper.insertSelective(order);
	}
	//删除订单
	@Override
	public int deleteById(Integer id) {
		return orderMapper.deleteByPrimaryKey(id);
	}
	//修改订单
	@Override
	public int updateOrder(Order order) {
		return orderMapper.updateByPrimaryKeySelective(order);
	}
	//app
	@Override
	public Order findByCode(String code) {
		return orderMapper.findByCode(code);
	}

	@Override
	public Integer orderCount() {
		return orderMapper.orderCount();
	}

	@Override
	public List<Echart> orderChart() {
		return orderMapper.orderChart();
	}
	@Override
	public List<Echart> userChart() {
		return orderMapper.userChart();
	}
}
