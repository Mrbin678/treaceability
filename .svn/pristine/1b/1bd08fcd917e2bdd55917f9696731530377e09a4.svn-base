package com.hx.app;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.hx.model.Order;
import com.hx.service.OrderService;

@Controller
@RequestMapping(value="/qsapi")
public class QueryOrder {
	
	@Autowired
	private OrderService orderService;
	
	@ResponseBody
	@RequestMapping(value="/query_order",produces={"application/json;","text/html;charset=UTF-8;"},method=RequestMethod.GET)
	public String queryOrder(@RequestParam String code,HttpServletResponse res) throws IOException{
		
		Order order = orderService.findByCode(code);
		String json = JSONObject.toJSONString(order);
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().print(json.toString());
		return null;
	}
}
