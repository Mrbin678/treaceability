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
import com.hx.model.Counter;
import com.hx.service.CounterService;

@Controller
@RequestMapping(value="/qsapi")
public class CreateCounter {
	@Autowired
	private CounterService counterService;
	
	
	@ResponseBody
	@RequestMapping(value="/create_counter",produces={"application/json;","text/html;charset=UTF-8;"},method=RequestMethod.POST)
	public String ctrate(@RequestBody Counter counter,HttpServletResponse res) throws IOException{
		String mes;
		counter.setCreatedAt(new Date());//默认时间
		try{
			counterService.create(counter);
			System.out.println("创建计数器信息!");
			mes="1";
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("创建计数器信息失败!");
			mes="0";
		}
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().print(mes);
		return null;
	}
}
