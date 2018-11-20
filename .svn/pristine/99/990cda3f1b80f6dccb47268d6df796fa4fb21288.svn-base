package com.hx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hx.mapper.GoodsMapper;
import com.hx.model.Goods;
import com.hx.service.GoodsService;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
	
	@Autowired
	private GoodsMapper goodsMapper;
	
	@Override
	public int create(Goods goods) {
		return goodsMapper.insertSelective(goods);
	}

}
