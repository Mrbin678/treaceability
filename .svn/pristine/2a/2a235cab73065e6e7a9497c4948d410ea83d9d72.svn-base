package com.hx.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hx.interceptor.AuthValidate;
import com.hx.model.Order;
import com.hx.service.OrderService;
import com.hx.util.common.AuthCode;

@Controller
@RequestMapping(value = "/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@RequestMapping(value = "/index")
	public String index(Model model, 
			@RequestParam(required=true,defaultValue="1") Integer start,
			@RequestParam(required=false,defaultValue="15") Integer pageSize,
			HttpServletRequest request) {
		PageHelper.startPage(start, pageSize);
		String searchName=request.getParameter("code");
		
		List<Order> orders = new ArrayList<>();
		if(searchName!=null&&!"".equals(searchName)){
			orders=orderService.findByOrderCode(searchName);
			model.addAttribute("search_name",searchName);
		}else{
			orders=orderService.findAll();
		}
		PageInfo<Order> page = new PageInfo<>(orders);
		model.addAttribute("pagehelper", page);
		model.addAttribute("order_list", orders);
		return "orders/index";
	}

	// 通过id查找
	@ResponseBody
	@RequestMapping(value = "/find")
	public String findById(Model model, HttpServletRequest req,
			HttpServletResponse res) throws IOException {
		String id = req.getParameter("id");
		Order order = orderService.findById(Integer.valueOf(id));
		JSONObject json = new JSONObject();
		json.put("results", order);
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().println(json.toJSONString());
		return null;
	}

	// 更新
	@AuthValidate(AuthCode.UpdateOrder)
	@RequestMapping(value = "/update")
	public String update(Model model,@ModelAttribute Order order)
			throws ParseException {
		// 执行更新操作
		orderService.updateOrder(order);
		return "redirect:/orders/index";
	}

	// 删除
	@AuthValidate(AuthCode.DeleteOrder)
	@RequestMapping(value = "/delete")
	public String update(Model model, @RequestParam String id) {
		// 执行更新操作
		orderService.deleteById(Integer.valueOf(id));
		return "redirect:/orders/index";
	}

	// 打印
	@RequestMapping(value = "/print")
	public String print(Model model, @RequestParam String id,
			HttpServletRequest req) {

		Order order = orderService.findById(Integer.valueOf(id));
		req.setAttribute("order", order);
		req.setAttribute("date", new Date());
		return "orders/orderPrint";
	}
	
	//添加订单
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public String addOrder(Model model,@ModelAttribute(value="order") Order order){
		// 执行添加操作
		System.out.println(order.getOrderDate());
		order.setCreatedAt(new Date());
		order.setStatus("新建");
		orderService.addOrder(order);
		return "redirect:/orders/index";
	}
	
	// 验证编辑订单时订单编号是否重复
	@ResponseBody
	@RequestMapping(value = "/checkCode", produces = "application/json;charset=UTF-8")
	public String checkEdit(@RequestParam String id, @RequestParam String code) {
		boolean result = true;
		String str = orderService.findById(Integer.valueOf(id)).getCode();
		if (str.equals(code.trim())) {
			result = true;
		} else {
			List<Order> list = orderService.findByOrderCode(code.trim());// 通过订单号查询有多少订单
			for (Order u : list) {
				if (u.getCode().equals(code.trim())) {
					result = false;
					break;
				}
			}
		}
		Map<String, Boolean> map = new HashMap<>();
		map.put("valid", result);
		ObjectMapper mapper = new ObjectMapper();
		String resultString = "";
		try {
			resultString = mapper.writeValueAsString(map);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return resultString;
	}
	//验证添加订单时code是否重复
	@ResponseBody
	@RequestMapping(value = "/addcheck", produces = "application/json;charset=UTF-8")
	public String checkAdd(@RequestParam String code){
		boolean result = true;
		List<Order> list = orderService.findByOrderCode(code);
		for (Order u : list) {
            if (u.getCode().equals(code.trim())) {
                result = false;
                break;
            }
        }
		Map<String, Boolean> map = new HashMap<>();
        map.put("valid", result);
        ObjectMapper mapper = new ObjectMapper();
        String resultString = "";
        try {
            resultString = mapper.writeValueAsString(map);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return resultString;
	}
}
