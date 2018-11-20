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
import com.hx.service.PackageDetailService;
import com.hx.service.PackageService;
import com.hx.model.Package;

@Controller
@RequestMapping(value = "/package")
public class PackageController {
	
	@Autowired
	private PackageService packageService;
	
	@Autowired
	private PackageDetailService packageDetailService;
	
	//首页显示所有记录
	@RequestMapping(value = "/index")
	public String index(Model model, 
			@RequestParam(required=true,defaultValue="1") Integer start,
			@RequestParam(required=false,defaultValue="15") Integer pageSize,
			HttpServletRequest request) {
		PageHelper.startPage(start, pageSize);
		String searchName=request.getParameter("code");
		//package
		List<Package> list =new ArrayList<>();   
		if(searchName!=null&&!"".equals(searchName)){
			list = packageService.findByCode(searchName);
			model.addAttribute("search_name",searchName);
		}else{
			list= packageService.findAll();
		}
		//packageDetail
		for(Package p:list){
			List<String> factoryCode = packageDetailService.findByPackageCode(p.getCode());
			p.setNote(String.join(",", factoryCode));
		}
		PageInfo<Package> page = new PageInfo<>(list);
		model.addAttribute("pagehelper", page);
		model.addAttribute("list", list);
		return "shipment/index";
	}
	// 通过id查找
	@ResponseBody
	@RequestMapping(value = "/find")
	public String findById(Model model, HttpServletRequest req,
			HttpServletResponse res) throws IOException {
		String id = req.getParameter("id");
		Package p = packageService.findById(Integer.valueOf(id));
		JSONObject json = new JSONObject();
		json.put("results", p);
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().println(json.toJSONString());
		return null;
	}
	// 更新
	@RequestMapping(value = "/update")
	public String update(Model model,@ModelAttribute Package p) throws ParseException {
		// 执行更新操作
		packageService.update(p);
		return "redirect:/package/index";
	}
	// 删除
	@RequestMapping(value = "/delete")
	public String update(Model model, @RequestParam String id) {
		// 执行更新操作
		packageService.deleteById(Integer.valueOf(id));
		return "redirect:/package/index";
	}
	// 验证编辑编号是否重复
	@ResponseBody
	@RequestMapping(value = "/checkCode", produces = "application/json;charset=UTF-8")
	public String checkEdit(@RequestParam String id, @RequestParam String code) {
		boolean result = true;
		String str = packageService.findById(Integer.valueOf(id)).getCode();
		if (str.equals(code.trim())) {
			result = true;
		} else {
			List<Package> list = packageService.findByCode(code);
			for (Package u : list) {
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
