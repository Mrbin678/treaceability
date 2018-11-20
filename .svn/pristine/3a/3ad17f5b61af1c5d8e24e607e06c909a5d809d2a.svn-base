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
import com.hx.model.Header;
import com.hx.service.HeaderService;
import com.hx.util.common.AuthCode;

@Controller
@RequestMapping(value = "/header")
public class HeaderController {

	@Autowired
	private HeaderService headerService;

	@RequestMapping(value = "/index")
	public String index(Model model, 
			@RequestParam(required=true,defaultValue="1") Integer start,
			@RequestParam(required=false,defaultValue="15") Integer pageSize,
			HttpServletRequest request) {
		PageHelper.startPage(start, pageSize);
		String searchName=request.getParameter("code");
		
		List<Header> headers = new ArrayList<>();
		if(searchName!=null&&!"".equals(searchName)){
			headers = headerService.findByHeaderCode(searchName);
			model.addAttribute("search_name",searchName);
		}else{
			headers = headerService.findAll();
		}
		PageInfo<Header> page = new PageInfo<>(headers);
		model.addAttribute("pagehelper", page);
		model.addAttribute("header_list", headers);
		return "production/header";
	}

	// 通过id查找
	@ResponseBody
	@RequestMapping(value = "/find")
	public String findById(Model model, HttpServletRequest req,
			HttpServletResponse res) throws IOException {
		String id = req.getParameter("id");
		Header header = headerService.findById(Integer.valueOf(id));
		JSONObject json = new JSONObject();
		json.put("results", header);
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
			@RequestParam String version, @RequestParam String note)
			throws ParseException {
		// 执行更新操作
		Header header = new Header();
		header.setId(Integer.valueOf(id));
		header.setCode(code);
		header.setOrderCode(orderCode);
		header.setTypes(types);
		header.setMeterType(meterType);
		header.setVersion(version);
		header.setNote(note);

		headerService.updateHeader(header);
		return "redirect:/header/index"; // 重新发请求到header/index
	}

	// 删除
	@AuthValidate(AuthCode.DeleteProduction)
	@RequestMapping(value = "/delete")
	public String update(Model model, @RequestParam String id) {
		// 执行更新操作
		headerService.deleteById(Integer.valueOf(id));
		return "redirect:/header/index";// 重定向请求到控制器刷新表格
	}

	// 验证编辑表头板时,表头板编号是否重复
	@ResponseBody
	@RequestMapping(value = "/checkCode", produces = "application/json;charset=UTF-8")
	public String checkEdit(@RequestParam String id, @RequestParam String code) {
		boolean result = true;
		String str = headerService.findById(Integer.valueOf(id)).getCode();
		if (str.equals(code.trim())) {
			result = true;
		} else {
			List<Header> list = headerService.findByHeaderCode(code.trim());// 通过计数器编号查询有多少订单
			for (Header u : list) {
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
