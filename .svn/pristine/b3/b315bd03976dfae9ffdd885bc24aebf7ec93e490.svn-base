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
import com.hx.model.HeaderDetection;
import com.hx.service.HeaderDetectionService;

@Controller
@RequestMapping(value = "/headerDetection")
public class HeaderDetectionController {

	@Autowired
	private HeaderDetectionService headerDetectionService;

	@RequestMapping(value = "/index")
	public String index(Model model, 
			@RequestParam(required=true,defaultValue="1") Integer start,
			@RequestParam(required=false,defaultValue="15") Integer pageSize,
			HttpServletRequest request) {
		PageHelper.startPage(start, pageSize);
		String searchName=request.getParameter("code");
		
		List<HeaderDetection> headerDetection=new ArrayList<>();
		if(searchName!=null&&!"".equals(searchName)){
			headerDetection = headerDetectionService.findByHeaderCode(searchName);
			model.addAttribute("search_name",searchName);
		}else {
			headerDetection = headerDetectionService.findAll();
		}
		PageInfo<HeaderDetection> page = new PageInfo<>(headerDetection);
		model.addAttribute("pagehelper", page);
		model.addAttribute("headerDetection_list", headerDetection);
		return "qualityInspection/headerDetection";
	}
	// 通过id查找
	@ResponseBody
	@RequestMapping(value = "/find")
	public String findById(Model model, HttpServletRequest req, HttpServletResponse res) throws IOException {
		String id = req.getParameter("id");
		HeaderDetection headerDetection = headerDetectionService.findById(Integer.valueOf(id));
		JSONObject json = new JSONObject();
		json.put("results", headerDetection);
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().println(json.toJSONString());
		return null;
	}
	// 更新
	@RequestMapping(value = "/update")
	public String update(Model model, @ModelAttribute HeaderDetection headerDetection) throws ParseException {
		// 执行更新操作
		headerDetectionService.updateHeaderDetection(headerDetection);
		return "redirect:/headerDetection/index";
	}
	// 删除
	@RequestMapping(value = "/delete")
	public String update(Model model, @RequestParam String id) {
		// 执行更新操作
		headerDetectionService.deleteById(Integer.valueOf(id));
		return "redirect:/headerDetection/index";
	}

	// 验证编辑表头板检验信息时,表头板编号是否重复
	@ResponseBody
	@RequestMapping(value = "/checkCode", produces = "application/json;charset=UTF-8")
	public String checkEdit(@RequestParam String id, @RequestParam String headerCode) {
		boolean result = true;
		String str = headerDetectionService.findById(Integer.valueOf(id)).getHeaderCode();
		if (str.equals(headerCode.trim())) {
			result = true;
		} else {
			List<HeaderDetection> list = headerDetectionService.findByHeaderCode(headerCode.trim());// 通过表头板编号查询有多少表头板检验信息
			for (HeaderDetection u : list) {
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
}
