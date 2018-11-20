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
import com.hx.model.Barcode;
import com.hx.service.BarcodeService;
import com.hx.util.common.AuthCode;

@Controller
@Transactional
@RequestMapping(value="/barcode")
public class BarcodeController {
	
	@Autowired
	private BarcodeService barcodeService;
	
	//列表页面
	@RequestMapping(value="/index")
	public String index(Model model){
		
		List<Barcode> barcodes = barcodeService.findAll();
		model.addAttribute("barcodes",barcodes);
		return "system/barcode";
	}
	//添加
	@RequestMapping(value="/create")
	public String create(@ModelAttribute Barcode barcode){
		barcode.setCreatedAt(new Date());
		barcodeService.addBarcode(barcode);
		return "redirect:/barcode/index";
	}
	//编辑
	@ResponseBody
	@RequestMapping(value="/find",produces={"application/json;","text/html;charset=UTF-8;"})
	public String find(@RequestParam String id,HttpServletResponse res){
		Barcode sp = barcodeService.selectByPrimaryKey(Integer.valueOf(id));
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
	@AuthValidate(AuthCode.UpdateBarcode)
	@RequestMapping(value="/update")
	public String updateSys(@ModelAttribute Barcode barcode){
		barcodeService.update(barcode);
		return "redirect:/barcode/index";
	}
	//delete
	@AuthValidate(AuthCode.DeleteBarcode)
	@RequestMapping(value="/delete")
	public String deleteSys(@RequestParam String id){
		barcodeService.deleteById(Integer.valueOf(id));
		return "redirect:/barcode/index";
	}
}