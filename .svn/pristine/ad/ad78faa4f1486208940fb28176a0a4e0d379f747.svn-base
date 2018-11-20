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
import com.hx.model.CounterDetection;
import com.hx.service.CounterDetectionService;
import com.hx.util.common.AuthCode;

@Controller
@RequestMapping(value = "/counterDetection")
public class CounterDetectionController {

	@Autowired
	private CounterDetectionService counterDetectionService;

	@RequestMapping(value = "/index")
	public String index(Model model, 
			@RequestParam(required=true,defaultValue="1") Integer start,
			@RequestParam(required=false,defaultValue="15") Integer pageSize,
			HttpServletRequest request) {
		PageHelper.startPage(start, pageSize);
		String searchName=request.getParameter("code");
		List<CounterDetection> counterDetection=new ArrayList<>();
		if(searchName!=null&&!"".equals(searchName)){
			counterDetection = counterDetectionService.findByCounterCode(searchName);
			model.addAttribute("search_name",searchName);
		}else {
			counterDetection = counterDetectionService.findAll();
		}
		PageInfo<CounterDetection> page = new PageInfo<>(counterDetection);
		model.addAttribute("pagehelper", page);
		model.addAttribute("counterDetection_list", counterDetection);
		return "qualityInspection/counterDetection";
	}

	// 通过id查找
	@ResponseBody
	@RequestMapping(value = "/find")
	public String findById(Model model, HttpServletRequest req,
			HttpServletResponse res) throws IOException {
		String id = req.getParameter("id");
		CounterDetection counterDetection = counterDetectionService
				.findById(Integer.valueOf(id));
		JSONObject json = new JSONObject();
		json.put("results", counterDetection);
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().println(json.toJSONString());
		return null;
	}

	// 更新
	@AuthValidate(AuthCode.UpdateDetection)
	@RequestMapping(value = "/update")
	public String update(Model model, @RequestParam String id,
			@RequestParam String orderCode, @RequestParam String operator,
			@RequestParam String counterCode, @RequestParam String detection,
			@RequestParam String note) throws ParseException {
		// 执行更新操作
		CounterDetection counterDetection = new CounterDetection();
		counterDetection.setId(Integer.valueOf(id));
		counterDetection.setOrderCode(orderCode);
		counterDetection.setOperator(operator);
		counterDetection.setCounterCode(counterCode);
		counterDetection.setDetection(detection);
		counterDetection.setNote(note);

		counterDetectionService.updateCounterDetection(counterDetection);
		return "redirect:/counterDetection/index";
	}

	// 删除
	@AuthValidate(AuthCode.DeleteDetection)
	@RequestMapping(value = "/delete")
	public String update(Model model, @RequestParam String id) {
		// 执行更新操作
		counterDetectionService.deleteById(Integer.valueOf(id));
		return "redirect:/counterDetection/index";
	}

	// 验证编辑计数器检验信息时,计数器编号是否重复
	@ResponseBody
	@RequestMapping(value = "/checkCode", produces = "application/json;charset=UTF-8")
	public String checkEdit(@RequestParam String id,
			@RequestParam String counterCode) {
		boolean result = true;
		String str = counterDetectionService.findById(Integer.valueOf(id))
				.getCounterCode();
		if (str.equals(counterCode.trim())) {
			result = true;
		} else {
			List<CounterDetection> list = counterDetectionService
					.findByCounterCode(counterCode.trim());// 通过计数器编号查询有多少计数器检验信息
			for (CounterDetection u : list) {
				if (u.getCounterCode().equals(counterCode.trim())) {
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
