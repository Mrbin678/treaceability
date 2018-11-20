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
import com.hx.model.Meter;
import com.hx.service.MeterService;
import com.hx.util.common.AuthCode;

@Controller
@RequestMapping(value = "/meter")
public class MeterController {

	@Autowired
	private MeterService meterService;

	@RequestMapping(value = "/index")
	public String index(Model model, 
			@RequestParam(required=true,defaultValue="1") Integer start,
			@RequestParam(required=false,defaultValue="15") Integer pageSize,
			HttpServletRequest request) {
		PageHelper.startPage(start, pageSize);
		String searchName=request.getParameter("code");
		
		List<Meter> meters = new ArrayList<>();
		if(searchName!=null&&!"".equals(searchName)){
			meters=meterService.findByMeterCode(searchName);
			model.addAttribute("search_name",searchName);
		}else{
			meters=meterService.findAll();
		}
		PageInfo<Meter> page = new PageInfo<>(meters);
		model.addAttribute("pagehelper", page);
		model.addAttribute("meter_list", meters);
		return "production/meter";
	}

	// 通过id查找
	@ResponseBody
	@RequestMapping(value = "/find")
	public String findById(Model model, HttpServletRequest req,
			HttpServletResponse res) throws IOException {
		String id = req.getParameter("id");
		Meter meter = meterService.findById(Integer.valueOf(id));
		JSONObject json = new JSONObject();
		json.put("results", meter);
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().println(json.toJSONString());
		return null;
	}

	// 更新
	@AuthValidate(AuthCode.UpdateProduction)
	@RequestMapping(value = "/update")
	public String update(Model model, @RequestParam String id,
			@RequestParam String factoryCode, @RequestParam String orderCode,
			@RequestParam String types, @RequestParam String meterType,
			@RequestParam String headerCode, @RequestParam String counterCode,
			@RequestParam String installResult, @RequestParam String note)
			throws ParseException {
		// 执行更新操作
		Meter meter = new Meter();
		meter.setId(Integer.valueOf(id));
		meter.setCode(factoryCode);
		meter.setOrderCode(orderCode);
		meter.setTypes(types);
		meter.setMeterType(meterType);
		meter.setHeaderCode(headerCode);
		meter.setCounterCode(counterCode);
		meter.setInstallResult(installResult);
		meter.setNote(note);

		meterService.updateMeter(meter);
		return "redirect:/meter/index"; // 重新发请求到/index
	}

	// 删除
	@AuthValidate(AuthCode.DeleteProduction)
	@RequestMapping(value = "/delete")
	public String update(Model model, @RequestParam String id) {
		// 执行更新操作
		meterService.deleteById(Integer.valueOf(id));
		return "redirect:/meter/index";// 重定向请求到控制器刷新表格
	}

	// 验证基表编辑时,基表出厂编号是否重复
	@ResponseBody
	@RequestMapping(value = "/checkCode", produces = "application/json;charset=UTF-8")
	public String checkEdit(@RequestParam String id,
			@RequestParam String factoryCode) {
		boolean result = true;
		String str = meterService.findById(Integer.valueOf(id))
				.getFactoryCode();
		if (str.equals(factoryCode.trim())) {
			result = true;
		} else {
			List<Meter> list = meterService.findByMeterCode(factoryCode.trim());// 通过基表出厂编号查询有多少基表
			for (Meter u : list) {
				if (u.getFactoryCode().equals(factoryCode.trim())) {
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

	// 验证基表编辑时,表头板编号是否重复
	@ResponseBody
	@RequestMapping(value = "/checkHeaderCode", produces = "application/json;charset=UTF-8")
	public String checkHeaderCode(@RequestParam String id,
			@RequestParam String headerCode) {
		boolean result = true;
		String str = meterService.findById(Integer.valueOf(id)).getHeaderCode();
		if (str.equals(headerCode.trim())) {
			result = true;
		} else {
			List<Meter> list = meterService.findByHeaderCode(headerCode.trim());// 通过表头板编号查询有多少基表
			for (Meter u : list) {
				if (u.getHeaderCode().equals(headerCode.trim())) {
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

	// 验证基表编辑时,计数器编号是否重复
	@ResponseBody
	@RequestMapping(value = "/checkCounterCode", produces = "application/json;charset=UTF-8")
	public String checkCounterCode(@RequestParam String id,
			@RequestParam String counterCode) {
		boolean result = true;
		String str = meterService.findById(Integer.valueOf(id))
				.getCounterCode();
		if (str.equals(counterCode.trim())) {
			result = true;
		} else {
			List<Meter> list = meterService.findByCounterCode(counterCode
					.trim());// 通过计数器编号查询有多少基表
			for (Meter u : list) {
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
	// 验证基表编辑时,计数器编号是否重复
	@ResponseBody
	@RequestMapping(value = "/checkShellCode", produces = "application/json;charset=UTF-8")
	public String checkShellCode(@RequestParam String id, @RequestParam String shellCode) {
		boolean result = true;
		String str = meterService.findById(Integer.valueOf(id)).getShellCode();
		if (str.equals(shellCode.trim())) {
			result = true;
		} else {
			List<Meter> list = meterService.findByShellCode(shellCode.trim());// 通过表壳编号查询有多少基表
			for (Meter u : list) {
				if (u.getShellCode().equals(shellCode.trim())) {
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
