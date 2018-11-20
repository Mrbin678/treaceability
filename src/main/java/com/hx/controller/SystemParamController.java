package com.hx.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.hx.interceptor.AuthValidate;
import com.hx.model.SystemParam;
import com.hx.service.SystemParamService;
import com.hx.util.common.AuthCode;

@Controller
@Transactional
@RequestMapping(value="/system_param")
public class SystemParamController {
	
	@Autowired
	private SystemParamService systemParamService;
	
	//列表页面
	@RequestMapping(value="/index")
	public String index(Model model,HttpServletRequest request){
		List<SystemParam> systemParams = systemParamService.findAll();
		model.addAttribute("system_params",systemParams);
		return "system/params";
	}
	//新建
	@RequestMapping(value="/create")
	public String create(@ModelAttribute SystemParam systemParam){
		systemParamService.addSystemParam(systemParam);
		return "redirect:/system_param/index";
	}
	//查找
	@ResponseBody
	@RequestMapping(value="/find",produces={"application/json;","text/html;charset=UTF-8;"})
	public String find(@RequestParam String id,HttpServletResponse res){
		SystemParam sp = systemParamService.selectByPrimaryKey(Integer.valueOf(id));
		JSONObject json = new JSONObject();
		json.put("results",sp);
		res.setContentType("text/html;charset=UTF-8");
		try {
			res.getWriter().print(json.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	//update
	@AuthValidate(AuthCode.UpdateSysParam)
	@RequestMapping(value="/update")
	public String updateSys(@ModelAttribute SystemParam systemParam){
		systemParamService.updateSystemParam(systemParam);
		return "redirect:/system_param/index";
	}
	//delete
	@AuthValidate(AuthCode.DeleteSysParam)
	@RequestMapping(value="/delete")
	public String deleteSys(@RequestParam String id){
		systemParamService.deleteById(Integer.valueOf(id));
		return "redirect:/system_param/index";
	}
	
	@ResponseBody
	@RequestMapping(value="/findAll")
	public String findByAll(Model model,HttpServletRequest req,HttpServletResponse res) throws IOException{
		List<SystemParam> list = systemParamService.findAll();
		JSONObject json = new JSONObject();
		json.put("results", list);
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().println(json.toJSONString());
		return null;
	}
}