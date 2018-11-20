package com.hx.app;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.hx.model.CounterDetection;
import com.hx.service.CounterDetectionService;

@Controller
@RequestMapping(value="/qsapi")
public class CreateCheckCounter {
	@Autowired
	private CounterDetectionService counterDetectionService;
	
	@ResponseBody
	@RequestMapping(value="/create_check_counter",produces={"application/json;","text/html;charset=UTF-8;"},method=RequestMethod.POST)
	public String ctrate(@RequestBody CounterDetection counterDetection,HttpServletResponse res) throws IOException{
		
		String mes;
		counterDetection.setCreatedAt(new Date());
		int i=counterDetectionService.create(counterDetection);
		if(i>0){
			System.out.println("计数器检验!");
			mes="1";
		}else{
			System.out.println("创建计数器检验失败!");
			mes="0";
		}
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().print(mes);
		return null;
	}
}
