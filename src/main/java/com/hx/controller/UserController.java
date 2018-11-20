package com.hx.controller;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hx.interceptor.AuthValidate;
import com.hx.model.User;
import com.hx.service.RoleService;
import com.hx.service.UserService;
import com.hx.util.common.AuthCode;
import com.hx.util.common.MD5Util;

@Controller
@RequestMapping(value="/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;
	
	@RequestMapping(value="/index")
	public String index(Model model){
		List<User> users = userService.getAll();
		for(User u:users){
			if(u.getRoleId()!=null){
				String role = roleService.getRoleName(u.getRoleId());
				if(role!=null&&!"".equals(role)){
					u.setRole(role);
				}else{
					u.setRole("角色错误");
				}
			}else{
				u.setRole("未分配角色");
			}
		}
		model.addAttribute("user_list",users);
		return "users/index";
	}
	//验证添加用户时员工编号是否重复
	@ResponseBody
	@RequestMapping(value = "/check_operator", produces = "application/json;charset=UTF-8")
	public String checkAdd(@RequestParam String operator){
		boolean result = true;
		List<User> list = userService.findByOp(operator);
		for (User u : list) {
            if (u.getOperator().equals(operator)) {
                result = false;
                break;
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
	//验证添加用户时登录名是否重复
	@ResponseBody
	@RequestMapping(value = "/check_login_name", produces = "application/json;charset=UTF-8")
	public String checkAdd2(@RequestParam String loginName){
		boolean result = true;
		List<User> list = userService.findByName(loginName);
		for (User u : list) {
            if (u.getLoginName().equals(loginName)) {
                result = false;
                break;
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
	//验证编辑用户时用户编号是否重复
	@ResponseBody
	@RequestMapping(value = "/edit_operator", produces = "application/json;charset=UTF-8")
	public String checkEdit(@RequestParam String id,@RequestParam String operator){
		boolean result = true;
		String str = userService.findById(Integer.valueOf(id)).getOperator();
		if(str.equals(operator)){
			result = true;
		}else{
			List<User> list = userService.findByOp(operator);
			for (User u : list) {
	            if (u.getOperator().equals(operator)) {
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
	//验证编辑用户时登录名是否重复
	@ResponseBody
	@RequestMapping(value = "/edit_login_name", produces = "application/json;charset=UTF-8")
	public String checkEdit2(@RequestParam String id,@RequestParam String loginName){
		boolean result = true;
		String str = userService.findById(Integer.valueOf(id)).getLoginName();
		if(str.equals(loginName)){
			result = true;
		}else{
			List<User> list = userService.findByName(loginName);
			for (User u : list) {
	            if (u.getLoginName().equals(loginName)) {
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
	//保存
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public String create(Model model,@ModelAttribute(value="user") User user){
		// 执行添加操作
		user.setCreatedAt(new Date());
		user.setStatus("正常");
		user.setRoleId(1);//默认为1
		userService.addUser(user);
		return "redirect:/users/index";
	}

	//通过id查找
	@ResponseBody
	@RequestMapping(value="/find",method=RequestMethod.GET)
	public String findById(@RequestParam String id,HttpServletRequest req,HttpServletResponse res) throws IOException{
		User user = userService.findById(Integer.valueOf(id));
		if(user.getRoleId()!=null){
			String role = roleService.getRoleName(user.getRoleId());
			if(role!=null&&!"".equals(role)){
				user.setRole(role);
			}else{
				user.setRole("未分配角色");
			}
		}else{
			user.setRole("未分配角色");
		}
		JSONObject json = new JSONObject();
		json.put("results", user);
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().println(json.toJSONString());
		return null;
	}
	//更新
	@AuthValidate(AuthCode.UpdateUser)
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(@ModelAttribute(value="user") User user){
		// 执行更新操作
		userService.updateUser(user);
		return "redirect:/users/index";
	}
	//删除
	@AuthValidate(AuthCode.DeleteUser)
	@RequestMapping(value="/delete")
	public String update(Model model,@RequestParam String id){
		// 执行更新操作
		userService.deleteById(Integer.valueOf(id));
		return "redirect:/users/index";
	}
	//验证旧密码是否正确
	@ResponseBody
	@RequestMapping(value = "/check_old_password", produces = "application/json;charset=UTF-8")
	public String checkPassword(@RequestParam String id,@RequestParam String old_password){
		boolean result = true;
		String oldPassword = userService.findById(Integer.valueOf(id)).getPassword();
		if(oldPassword!=null&&oldPassword.equals(MD5Util.getMd5(old_password))){
			result = true;
		}else{
			result = false;
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
	//更改密码
	@RequestMapping(value = "/change_password")
	public String changePassword(@RequestParam String id,@RequestParam String password,HttpSession session){
		User user = userService.findById(Integer.valueOf(id));
		user.setPassword(MD5Util.getMd5(password));
		userService.updateUser(user);
		//删除session,退回到登陆页面
		session.removeAttribute("user");
		
		return "redirect:/users/index";
	}
}
