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
import com.hx.model.Shell;
import com.hx.service.ShellService;

@Controller
@RequestMapping(value = "/shell")
public class ShellController {
	
	@Autowired
	private ShellService shellService;
	
	
	//首页显示所有记录
	@RequestMapping(value = "/index")
	public String index(Model model, 
			@RequestParam(required=true,defaultValue="1") Integer start,
			@RequestParam(required=false,defaultValue="15") Integer pageSize,
			HttpServletRequest request) {
		PageHelper.startPage(start, pageSize);
		String searchName=request.getParameter("code");
		List<Shell> shells =new ArrayList<>();
		if(searchName!=null&&!"".equals(searchName)){
			shells = shellService.findByCode(searchName);
			model.addAttribute("search_name",searchName);
		}else{
			shells= shellService.findAll();
		}
		PageInfo<Shell> page = new PageInfo<>(shells);
		model.addAttribute("pagehelper", page);
		model.addAttribute("shells", shells);
		return "production/shell";
	}
	
	// 通过id查找
	@ResponseBody
	@RequestMapping(value = "/find")
	public String findById(Model model, HttpServletRequest req, HttpServletResponse res) throws IOException {
		String id = req.getParameter("id");
		Shell shell = shellService.findById(Integer.valueOf(id));
		JSONObject json = new JSONObject();
		json.put("results", shell);
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().println(json.toJSONString());
		return null;
	}
	
	// 更新
	@RequestMapping(value = "/update")
	public String update(Model model, @RequestParam String id,
			@RequestParam String code,@RequestParam String factory,
			@RequestParam String valveFactory,@RequestParam String valveType,
			@RequestParam String types,@RequestParam String note) throws ParseException {
		// 执行更新操作
		Shell shell = new Shell();
		shell.setId(Integer.valueOf(id));
		shell.setCode(code);
		shell.setFactory(factory);
		shell.setValveFactory(valveFactory);
		shell.setValveType(valveType);
		shell.setTypes(types);
		shell.setNote(note);
		shellService.updateShell(shell);
		return "redirect:/shell/index";
	}
	
	// 删除
	@RequestMapping(value="/delete")
	public String delete(@RequestParam String id){
		shellService.delShell(Integer.valueOf(id));
		return "redirect:/shell/index";
	}
	
	//检查条码是否重复
	@ResponseBody
	@RequestMapping(value = "/checkCode", produces = "application/json;charset=UTF-8")
	public String checkCode(@RequestParam String id, @RequestParam String code){
		boolean result = true;
		String str = shellService.findById(Integer.valueOf(id)).getCode();
		if (str.equals(code.trim())) {
			result = true;
		}else {
			List<Shell> shells = shellService.findByCode(code);
			for(Shell shell:shells){
				if(shell.getCode().equals(code.trim())){
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
