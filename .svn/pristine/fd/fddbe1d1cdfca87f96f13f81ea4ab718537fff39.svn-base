package com.hx.controller;

import java.io.IOException;
import java.text.ParseException;
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
import com.hx.interceptor.AuthValidate;
import com.hx.model.Repair;
import com.hx.service.RepairService;
import com.hx.util.common.AuthCode;

@Controller
@RequestMapping(value = "/repair")
public class RepairController {

	@Autowired
	private RepairService repairService;

	@RequestMapping(value = "/index")
	public String index(Model model) {
		List<Repair> repair = repairService.findAll();
		model.addAttribute("repair_list", repair);
		return "repair/repair";
	}

	// 通过id查找
	@ResponseBody
	@RequestMapping(value = "/find")
	public String findById(Model model, HttpServletRequest req,
			HttpServletResponse res) throws IOException {
		String id = req.getParameter("id");
		Repair repair = repairService.findById(Integer.valueOf(id));
		JSONObject json = new JSONObject();
		json.put("results", repair);
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().println(json.toJSONString());
		return null;
	}

	// 更新
	@AuthValidate(AuthCode.UpdateRepair)
	@RequestMapping(value = "/update")
	public String update(Model model, @RequestParam String id,
			@RequestParam String deviceCode, @RequestParam String operatorId,
			@RequestParam String operator, @RequestParam String types,
			@RequestParam String source, @RequestParam String content)
			throws ParseException {
		// 执行更新操作
		Repair repair = new Repair();
		repair.setId(Integer.valueOf(id));
		repair.setDeviceCode(deviceCode);
		repair.setOperatorId(Integer.valueOf(operatorId.trim()));
		repair.setOperator(operator);
		repair.setTypes(types);
		repair.setSource(source);
		repair.setContent(content);

		repairService.updateRepair(repair);
		return "redirect:/repair/index";
	}

	// 删除
	@AuthValidate(AuthCode.DeleteRepair)
	@RequestMapping(value = "/delete")
	public String update(Model model, @RequestParam String id) {
		// 执行更新操作
		repairService.deleteById(Integer.valueOf(id));
		return "redirect:/repair/index";
	}

	// 验证编辑维修信息时维修编号是否重复
	@ResponseBody
	@RequestMapping(value = "/checkCode", produces = "application/json;charset=UTF-8")
	public String checkEdit(@RequestParam String id,
			@RequestParam String deviceCode) {
		boolean result = true;
		String str = repairService.findById(Integer.valueOf(id))
				.getDeviceCode();
		if (str.equals(deviceCode.trim())) {
			result = true;
		} else {
			List<Repair> list = repairService.findByDeviceCode(deviceCode.trim());// 通过维修编号查询有多少维修信息
			for (Repair u : list) {
				if (u.getDeviceCode().equals(deviceCode.trim())) {
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
