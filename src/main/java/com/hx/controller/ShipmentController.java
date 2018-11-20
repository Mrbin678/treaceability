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
import com.hx.model.Shipment;
import com.hx.service.ShipmentService;

@Controller
@RequestMapping(value="/shipment")
public class ShipmentController {
	
	@Autowired
	private ShipmentService shipmentService;
	
	@RequestMapping(value="/index")
	public String index(Model model,
			@RequestParam(required=true,defaultValue="1") Integer start,
			@RequestParam(required=false,defaultValue="15") Integer pageSize,
			HttpServletRequest request){
		PageHelper.startPage(start, pageSize);
		String searchName=request.getParameter("code");
		List<Shipment> shipments =new ArrayList<>();
		if(searchName!=null&&!"".equals(searchName)){
			shipments = shipmentService.findByCode(searchName);
			model.addAttribute("search_name",searchName);
		}else{
			shipments = shipmentService.findAll();
		}
		PageInfo<Shipment> page = new PageInfo<>(shipments);
		model.addAttribute("pagehelper", page);
		model.addAttribute("shipments", shipments);
		return "shipment/shipment";
	}
	// 通过id查找
	@ResponseBody
	@RequestMapping(value = "/find")
	public String findById(Model model, HttpServletRequest req, HttpServletResponse res) throws IOException {
		String id = req.getParameter("id");
		Shipment shipment = shipmentService.findById(Integer.valueOf(id));
		JSONObject json = new JSONObject();
		json.put("results", shipment);
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().println(json.toJSONString());
		return null;
	}
	// 更新
	@RequestMapping(value = "/update")
	public String update(Model model,@ModelAttribute Shipment shipment) throws ParseException {
		// 执行更新操作
		shipmentService.update(shipment);
		return "redirect:/shipment/index";
	}
	// 删除
	@RequestMapping(value="/delete")
	public String delete(@RequestParam String id){
		shipmentService.del(Integer.valueOf(id));
		return "redirect:/shipment/index";
	}
	//检查条码是否重复
	@ResponseBody
	@RequestMapping(value = "/checkCode", produces = "application/json;charset=UTF-8")
	public String checkCode(@RequestParam String id, @RequestParam String shipCode){
		boolean result = true;
		String str = shipmentService.findById(Integer.valueOf(id)).getShipCode();
		if(str == null ||"".equals(str)){
			result = true;
		}else if (str.equals(shipCode.trim())) {
			result = true;
		}else {
			List<Shipment> shipments = shipmentService.findByCode(shipCode);
			for(Shipment shipment:shipments){
				if(shipment.getShipCode().equals(shipCode.trim())){
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
