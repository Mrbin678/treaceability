package com.hx.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hx.model.Csfzk;
import com.hx.service.CsfzxService;

@Controller
@RequestMapping(value = "/flowDetection")
// 流量控制层
public class FlowDetectionController {

	@Autowired
	private CsfzxService csfzkService;

	@RequestMapping(value = "/index")
	public String index(Model model, 
			@RequestParam(required=true,defaultValue="1") Integer start,
			@RequestParam(required=false,defaultValue="15") Integer pageSize,
			HttpServletRequest request) {
		PageHelper.startPage(start, pageSize);
		String searchName=request.getParameter("code");
		
		List<Csfzk> csfzkList = new ArrayList<>();
		if(searchName!=null&&!"".equals(searchName)){
			csfzkList=csfzkService.findByMeterCode(searchName);
			model.addAttribute("search_name",searchName);
		}else{
			csfzkList=csfzkService.findAll();
		}
		PageInfo<Csfzk> page = new PageInfo<>(csfzkList);
		model.addAttribute("pagehelper", page);
		model.addAttribute("csfzk_list", csfzkList);
		return "qualityInspection/flowDetection";
	}

	// 通过id查找单条流量检测详细信息
	@RequestMapping(value = "/find")
	public String findById(Model model, HttpServletRequest req, HttpServletResponse res) throws IOException {
		String id = req.getParameter("id");
		Csfzk csfzk = csfzkService.findById(Long.valueOf(id));
		req.setAttribute("csfzk", csfzk);
		return "qualityInspection/flowDetectionDetail";
	}

	// 通过id查找单条流量点qmax检测详细信息
	@RequestMapping(value = "/findMax")
	public String findMaxById(Model model, HttpServletRequest req, HttpServletResponse res) throws IOException {
		String id = req.getParameter("id");
		Csfzk csfzk = csfzkService.findById(Long.valueOf(id));
		req.setAttribute("csfzk", csfzk);
		return "qualityInspection/qmax";
	}

	// 通过id查找单条流量点0.2qmax检测详细信息
	@RequestMapping(value = "/findMax02")
	public String findMax02ById(Model model, HttpServletRequest req, HttpServletResponse res) throws IOException {
		String id = req.getParameter("id");
		Csfzk csfzk = csfzkService.findById(Long.valueOf(id));
		req.setAttribute("csfzk", csfzk);
		return "qualityInspection/qmax02";
	}

	// 通过id查找单条流量点qmin检测详细信息
	@RequestMapping(value = "/findMin")
	public String findMinById(Model model, HttpServletRequest req, HttpServletResponse res) throws IOException {
		String id = req.getParameter("id");
		Csfzk csfzk = csfzkService.findById(Long.valueOf(id));
		req.setAttribute("csfzk", csfzk);
		return "qualityInspection/qmin";
	}

	// 更新
	@RequestMapping(value = "/update")
	public String update(@ModelAttribute Csfzk csfzk) throws ParseException {
		// 执行更新操作
		csfzkService.updateCsfzk(csfzk);
		return "redirect:/flowDetection/index";
	}

	// 删除
	@RequestMapping(value = "/delete")
	public String update(Model model, @RequestParam String id) {
		// 执行更新操作
		csfzkService.deleteById(Long.valueOf(id));
		return "redirect:/flowDetection/index";
	}
}
