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
import com.hx.model.Work;
import com.hx.service.UserService;
import com.hx.service.WorkService;
import com.hx.util.common.AuthCode;

@Controller
@RequestMapping(value = "/work")
public class WorkController {

	@Autowired
	private WorkService workService;
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/index")
	public String index(Model model, 
			@RequestParam(required=true,defaultValue="1") Integer start,
			@RequestParam(required=false,defaultValue="15") Integer pageSize,
			HttpServletRequest request) {
		PageHelper.startPage(start, pageSize);
		String searchName=request.getParameter("code");
		
		List<Work> works = new ArrayList<>();
		if(searchName!=null&&!"".equals(searchName)){
			works=workService.findByOrderCode(searchName);
			model.addAttribute("search_name",searchName);
		}else{
			works=workService.findAll();
		}
		changeToName(works);
		PageInfo<Work> page = new PageInfo<>(works);
		model.addAttribute("pagehelper", page);
		model.addAttribute("work_list", works);
		return "production/work";
	}
	//将序号改成对应用户名
	public List<Work> changeToName(List<Work> list){
		if(list!=null && !list.isEmpty()){
			for(Work work:list){
				if(work.getOperator1()!=null && !"".equals(work.getOperator1())){
					work.setOperator1(userService.findByOperator(work.getOperator1()).getName());
				}
				if(work.getOperator2()!=null && !"".equals(work.getOperator2())){
					work.setOperator2(userService.findByOperator(work.getOperator2()).getName());
				}
				if(work.getOperator3()!=null && !"".equals(work.getOperator3())){
					work.setOperator3(userService.findByOperator(work.getOperator3()).getName());
				}
				if(work.getOperator4()!=null && !"".equals(work.getOperator4())){
					work.setOperator4(userService.findByOperator(work.getOperator4()).getName());
				}
				if(work.getOperator5()!=null && !"".equals(work.getOperator5())){
					work.setOperator5(userService.findByOperator(work.getOperator5()).getName());
				}
				if(work.getOperator6()!=null && !"".equals(work.getOperator6())){
					work.setOperator6(userService.findByOperator(work.getOperator6()).getName());
				}
				if(work.getOperator7()!=null && !"".equals(work.getOperator7())){
					work.setOperator7(userService.findByOperator(work.getOperator7()).getName());
				}
				if(work.getOperator8()!=null && !"".equals(work.getOperator8())){
					work.setOperator8(userService.findByOperator(work.getOperator8()).getName());
				}
				if(work.getOperator9()!=null && !"".equals(work.getOperator9())){
					work.setOperator9(userService.findByOperator(work.getOperator9()).getName());
				}
				if(work.getOperator10()!=null && !"".equals(work.getOperator10())){
					work.setOperator10(userService.findByOperator(work.getOperator10()).getName());
				}
				if(work.getOperator11()!=null && !"".equals(work.getOperator11())){
					work.setOperator11(userService.findByOperator(work.getOperator11()).getName());
				}
				if(work.getOperator12()!=null && !"".equals(work.getOperator12())){
					work.setOperator12(userService.findByOperator(work.getOperator12()).getName());
				}
				if(work.getOperator13()!=null && !"".equals(work.getOperator13())){
					work.setOperator13(userService.findByOperator(work.getOperator13()).getName());
				}
				if(work.getOperator14()!=null && !"".equals(work.getOperator14())){
					work.setOperator14(userService.findByOperator(work.getOperator14()).getName());
				}
				if(work.getOperator15()!=null && !"".equals(work.getOperator15())){
					work.setOperator15(userService.findByOperator(work.getOperator15()).getName());
				}
			}
		}
		return list;
	}
	
	// 通过id查找
	@ResponseBody
	@RequestMapping(value = "/find")
	public String findById(Model model, HttpServletRequest req,
			HttpServletResponse res) throws IOException {
		String id = req.getParameter("id");
		Work work = workService.findById(Integer.valueOf(id));
		JSONObject json = new JSONObject();
		json.put("results", work);
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().println(json.toJSONString());
		return null;
	}

	// 更新
	@AuthValidate(AuthCode.UpdateProduction)
	@RequestMapping(value = "/update")
	public String update(Model model, @RequestParam String id,
			@RequestParam String orderCode, @RequestParam String content,
			@RequestParam String operator1, @RequestParam String operator2,
			@RequestParam String operator3, @RequestParam String operator4,
			@RequestParam String operator5, @RequestParam String operator6,
			@RequestParam String operator7, @RequestParam String operator8,
			@RequestParam String operator9, @RequestParam String operator10,
			@RequestParam String operator11, @RequestParam String operator12,
			@RequestParam String operator13, @RequestParam String operator14,
			@RequestParam String operator15, @RequestParam String selectStatus
			) throws ParseException {
		// 执行更新操作
		Work work = new Work();
		work.setId(Integer.valueOf(id));
		work.setOrderCode(orderCode);
		work.setContent(content);
		work.setOperator1(operator1);
		work.setOperator2(operator2);
		work.setOperator3(operator3);
		work.setOperator4(operator4);
		work.setOperator5(operator5);
		work.setOperator6(operator6);
		work.setOperator7(operator7);
		work.setOperator8(operator8);
		work.setOperator9(operator9);
		work.setOperator10(operator10);
		work.setOperator11(operator11);
		work.setOperator12(operator12);
		work.setOperator13(operator13);
		work.setOperator14(operator14);
		work.setOperator15(operator15);
		work.setStatus(selectStatus);
		workService.updateWork(work);
		return "redirect:/work/index"; // 重新发请求到/index
	}

	// 删除
	@AuthValidate(AuthCode.DeleteProduction)
	@RequestMapping(value = "/delete")
	public String update(Model model, @RequestParam String id) {
		// 执行更新操作
		workService.deleteById(Integer.valueOf(id));
		return "redirect:/work/index";// 重定向请求到控制器刷新表格
	}

	// 验证编辑订单时订单编号是否重复
	@ResponseBody
	@RequestMapping(value = "/checkCode", produces = "application/json;charset=UTF-8")
	public String checkEdit(@RequestParam String id, @RequestParam String orderCode) {
		boolean result = true;
		String str = workService.findById(Integer.valueOf(id)).getOrderCode();
		if (str.equals(orderCode.trim())) {
			result = true;
		} else {
			List<Work> list = workService.findByOrderCode(orderCode.trim());// 通过订单号查询有多少上工信息
			for (Work u : list) {
				if (u.getOrderCode().equals(orderCode.trim())) {
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
