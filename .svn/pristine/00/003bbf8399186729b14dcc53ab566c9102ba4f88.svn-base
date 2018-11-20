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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hx.interceptor.AuthValidate;
import com.hx.model.MeterDetection;
import com.hx.service.MeterDetectionService;
import com.hx.util.common.AuthCode;

@Controller
@RequestMapping(value = "/meterDetection")
public class MeterDetectionController {

	@Autowired
	private MeterDetectionService meterDetectionService;

	@RequestMapping(value = "/index")
	public String index(Model model, 
			@RequestParam(required=true,defaultValue="1") Integer start,
			@RequestParam(required=false,defaultValue="15") Integer pageSize,
			HttpServletRequest request) {
		PageHelper.startPage(start, pageSize);
		String searchName=request.getParameter("code");
		
		List<MeterDetection> meterDetection = new ArrayList<>();
		if(searchName!=null&&!"".equals(searchName)){
			meterDetection=meterDetectionService.findByMeterCode(searchName);
			model.addAttribute("search_name",searchName);
		}else{
			meterDetection=meterDetectionService.findAll();
		}
		PageInfo<MeterDetection> page = new PageInfo<>(meterDetection);
		model.addAttribute("pagehelper", page);
		model.addAttribute("meterDetection_list", meterDetection);
		return "qualityInspection/meterDetection";
	}

	// 通过id查找
	@ResponseBody
	@RequestMapping(value = "/find")
	public String findById(Model model, HttpServletRequest req, HttpServletResponse res) throws IOException {
		String id = req.getParameter("id");
		MeterDetection meterDetection = meterDetectionService.findById(Integer.valueOf(id));
		JSONObject json = new JSONObject();
		json.put("results", meterDetection);
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().println(json.toJSONString());
		return null;
	}

	// 更新
	@AuthValidate(AuthCode.UpdateDetection)
	@RequestMapping(value = "/update")
	public String update(@ModelAttribute MeterDetection meterDetection) throws ParseException {
		// 执行更新操作
		meterDetectionService.updateMeterDetection(meterDetection);
		return "redirect:/meterDetection/index";
	}

	// 删除
	@AuthValidate(AuthCode.DeleteDetection)
	@RequestMapping(value = "/delete")
	public String update(Model model, @RequestParam String id) {
		// 执行更新操作
		meterDetectionService.deleteById(Integer.valueOf(id));
		return "redirect:/meterDetection/index";
	}

	// 验证基表编辑时,基表出厂编号是否重复
	@ResponseBody
	@RequestMapping(value = "/checkCode", produces = "application/json;charset=UTF-8")
	public String checkEdit(@RequestParam String id, @RequestParam String factoryCode) {
		boolean result = true;
		String str = meterDetectionService.findById(Integer.valueOf(id)).getFactoryCode();
		if (str.equals(factoryCode.trim())) {
			result = true;
		} else {
			List<MeterDetection> list = meterDetectionService.findByMeterCode(factoryCode.trim());// 通过基表出厂编号查询有多少基表
			for (MeterDetection u : list) {
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

}
