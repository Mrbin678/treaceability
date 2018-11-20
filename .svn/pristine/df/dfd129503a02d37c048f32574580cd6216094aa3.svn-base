package com.hx.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
import com.hx.model.Right;
import com.hx.model.Role;
import com.hx.model.RoleRight;
import com.hx.service.RightService;
import com.hx.service.RoleService;
import com.hx.util.common.AuthCode;

@Controller
@Transactional
@RequestMapping(value="/rr")
public class RRController {
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private RightService rightService;
	
	//角色列表页面
	@RequestMapping(value="/role")
	public String role(Model model){
		List<Role> roles = roleService.findAll();
		model.addAttribute("roles",roles);
		return "rr/role";
	}
	//角色对应权限
	@ResponseBody
	@RequestMapping(value="/view_rights",produces={"application/json;","text/html;charset=UTF-8;"})
	public String  roleRights(@RequestParam String id,HttpServletResponse res,HttpServletRequest req) throws IOException{
		Set<String> rights = rightService.selectRightNames(Integer.valueOf(id));
		JSONObject json = new JSONObject();
		if(rights==null||rights.size()==0){
			rights.add("此角色权限为空!");
		}
		json.put("results",rights);
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().print(json.toString());
		return null;
	}
	//用户对应角色
	@ResponseBody
	@RequestMapping(value="/all_role",produces={"application/json;","text/html;charset=UTF-8;"})
	public String  viewRole(HttpServletResponse res,HttpServletRequest req) throws IOException{
		List<Role> roles = roleService.findAll();
		JSONObject json = new JSONObject();
		if(roles==null||roles.size()==0){
			Role role = new Role();
			role.setName("未添加角色");
			json.put("results",role);
		}
		json.put("results",roles);
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().print(json.toString());
		return null;
	}
	//显示所有权限
	@ResponseBody
	@RequestMapping(value="/all_rights",produces={"application/json;","text/html;charset=UTF-8;"})
	public String allRights(HttpServletResponse res) throws IOException{
		List<Right> rights= rightService.findAll();
		JSONObject json = new JSONObject();
		json.put("results",rights);
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().print(json.toString());
		return null;
	}
	//新建角色
	@RequestMapping(value="/create")
	public String create(@ModelAttribute Role role){
		roleService.addRole(role);
		return "redirect:/rr/role";
	}
	//删除角色
	@RequestMapping(value="/delete_role")
	public String delete(@RequestParam String id){
		roleService.deleteByPrimaryKey(Integer.valueOf(id));
		return "redirect:/rr/role";
	}
	//选中角色分配权限
	@AuthValidate(AuthCode.AssignRight)
	@RequestMapping(value="/assign_rights")
	public String assignRights(Model model,HttpServletRequest req){
		//获取角色id
		Integer roleId = Integer.valueOf(req.getParameter("roleId"));
		//先删除该角色的所以权限
		roleService.deleteRights(roleId);
		//获取权限id集合
		String[] rightIds = req.getParameterValues("rightId");
		if(rightIds!=null&&rightIds.length!=0){
			//然后在重新加入选中提交的权限
			List<Integer> ids = new ArrayList<>();
			for(int i=0;i<rightIds.length;i++){
				ids.add(Integer.valueOf(rightIds[i]));
			}
			for(Integer rightId:ids){
				RoleRight rr = new RoleRight();
				rr.setRoleId(roleId);
				rr.setRightId(rightId);
				roleService.addRights(rr);
			}
		}
		return "redirect:/rr/role";
	}
	//权限列表页面
	@RequestMapping(value="/right")
	public String right(Model model){
		List<Right> rights = rightService.findAll();
		model.addAttribute("rights",rights);
		return "rr/right";
	}
	//删除权限
	@AuthValidate(AuthCode.Error)
	@RequestMapping(value="/delete_right")
	public String deleteRight(@RequestParam String id){
		rightService.deleteByPrimaryKey(Integer.valueOf(id));
		return "redirect:/rr/right";
	}
	//新建权限
	@RequestMapping(value="/create_right")
	public String createRight(@ModelAttribute Right right){
		rightService.addRight(right);
		return "redirect:/rr/right";
	}
	//编辑权限
	@ResponseBody
	@RequestMapping(value="/find",produces={"application/json;","text/html;charset=UTF-8;"})
	public String find(@RequestParam String id,HttpServletResponse res){
		Right right = rightService.selectByPrimaryKey(Integer.valueOf(id));
		JSONObject json = new JSONObject();
		json.put("results",right);
		res.setContentType("text/html;charset=UTF-8");
		try {
			res.getWriter().print(json.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	//更新
	@AuthValidate(AuthCode.Error)
	@RequestMapping(value="/update")
	public String update(@ModelAttribute Right right){
		rightService.update(right);
		return "redirect:/rr/right";
	}
}
