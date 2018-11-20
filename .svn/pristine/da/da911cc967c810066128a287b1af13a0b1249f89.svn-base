package com.hx.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hx.model.Logging;
import com.hx.service.LogService;

@Controller
@RequestMapping(value="/login_logs")
public class LogController {
	
	@Autowired
	private LogService logService;
	
	@RequestMapping(value="/index")
	public String index(Model model, 
			@RequestParam(required=true,defaultValue="1") Integer start,
            @RequestParam(required=false,defaultValue="15") Integer pageSize){
		PageHelper.startPage(start, pageSize);
		List<Logging> logs=new ArrayList<Logging>();
		logs=logService.findAll();
		PageInfo<Logging> page = new PageInfo<Logging>(logs);
        model.addAttribute("pagehelper", page);
		model.addAttribute("logs",logs);
		return "logs/index";
	}
	
}
