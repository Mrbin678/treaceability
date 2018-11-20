package com.hx.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;
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
import com.hx.model.Department;
import com.hx.model.User;
import com.hx.service.DepartmentService;
import com.hx.service.UserService;
import com.hx.util.common.AuthCode;

@Controller
@RequestMapping(value="/department")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@Autowired
	private UserService userService;
	//列表 无需后台分页
	@RequestMapping(value="/index")
	public String index(Model model){
		List<Department> list = departmentService.findAll();
		model.addAttribute("departments", list);
		return "system/department";
	}
	//新增
	@RequestMapping(value="/create")
	public String create(@ModelAttribute Department department){
		department.setStatus("正常");
		department.setCreatedAt(new Date());
		departmentService.addDepartment(department);
		return "redirect:/department/index";
	}
	//修改
	@AuthValidate(AuthCode.UpdateDepartment)
	@RequestMapping(value="/update")
	public String update(@ModelAttribute Department department){
		departmentService.updateDepartment(department);
		return "redirect:/department/index";
	}
	//编辑
	@ResponseBody
	@RequestMapping(value="/find",produces={"application/json;","text/html;charset=UTF-8;"})
	public String find(@RequestParam String id,HttpServletResponse res){
		Department sp = departmentService.selectByPrimaryKey(Integer.valueOf(id));
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
	//删除
	@Transactional
	@AuthValidate(AuthCode.DeleteDepartment)
	@RequestMapping(value="/delete")
	public String deleteSys(@RequestParam String id,@RequestParam String name){
		//删除部门
		departmentService.deleteById(Integer.valueOf(id));
		//通过部门名字查找用户,并将其部门设为空
		List<User> users = userService.findByDepartment(name);
		for(User u:users){
			u.setDepartment("");
			userService.updateUser(u);
		}
		return "redirect:/department/index";
	}
	//查询所有
	@ResponseBody
	@RequestMapping(value="/findAll",produces={"application/json;","text/html;charset=UTF-8;"})
	public String findAll(HttpServletResponse res){
		List<Department> list = departmentService.findAll();
		JSONObject json = new JSONObject();
		json.put("results",list);
		res.setContentType("text/html;charset=UTF-8");
		try {
			res.getWriter().print(json.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
