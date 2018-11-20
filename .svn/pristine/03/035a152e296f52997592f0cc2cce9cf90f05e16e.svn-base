package com.hx.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hx.interceptor.AuthValidate;
import com.hx.model.Counter;
import com.hx.service.CounterService;
import com.hx.util.common.AuthCode;

@Controller
@RequestMapping(value = "/counter")
public class CounterController {

	@Autowired
	private CounterService counterService;

	@RequestMapping(value = "/index")
	public String index(Model model, 
			@RequestParam(required=true,defaultValue="1") Integer start,
			@RequestParam(required=false,defaultValue="15") Integer pageSize,
			HttpServletRequest request) {
		PageHelper.startPage(start, pageSize);
		String searchName=request.getParameter("code");
		
		List<Counter> counter = new ArrayList<>();
		if(searchName!=null&&!"".equals(searchName)){
			counter=counterService.findByCounterCode(searchName);
			model.addAttribute("search_name",searchName);
		}else{
			counter=counterService.findAll();
		}
		PageInfo<Counter> page = new PageInfo<>(counter);
		model.addAttribute("pagehelper", page);
		model.addAttribute("counter_list", counter);
		return "production/counter";
	}
	
	// 通过id查找
	@ResponseBody
	@RequestMapping(value = "/find")
	public String findById(Model model, HttpServletRequest req,
			HttpServletResponse res) throws IOException {
		String id = req.getParameter("id");
		Counter counter = counterService.findById(Integer.valueOf(id));
		JSONObject json = new JSONObject();
		json.put("results", counter);
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().println(json.toJSONString());
		return null;
	}

	// 更新
	@AuthValidate(AuthCode.UpdateProduction)
	@RequestMapping(value = "/update")
	public String update(Model model, @RequestParam String id,
			@RequestParam String code, @RequestParam String orderCode,
			@RequestParam String types, @RequestParam String meterType,
			@RequestParam String note) throws ParseException {
		// 执行更新操作
		Counter counter = new Counter();
		counter.setId(Integer.valueOf(id));
		counter.setCode(code);
		counter.setOrderCode(orderCode);
		counter.setTypes(types);
		counter.setMeterType(meterType);
		counter.setNote(note);
		counterService.updateCounter(counter);
		return "redirect:/counter/index";
	}

	// 删除
	@AuthValidate(AuthCode.DeleteProduction)
	@RequestMapping(value = "/delete")
	public String update(Model model, @RequestParam String id) {
		// 执行更新操作
		counterService.deleteById(Integer.valueOf(id));
		return "redirect:/counter/index";
	}

	// 验证编辑计数器时,计数器编号是否重复
	@ResponseBody
	@RequestMapping(value = "/checkCode", produces = "application/json;charset=UTF-8")
	public String checkEdit(@RequestParam String id, @RequestParam String code) {
		boolean result = true;
		String str = counterService.findById(Integer.valueOf(id)).getCode();
		if (str.equals(code.trim())) {
			result = true;
		} else {
			List<Counter> list = counterService.findByCounterCode(code.trim());// 通过计数器编号查询有多少订单
			for (Counter u : list) {
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
}
