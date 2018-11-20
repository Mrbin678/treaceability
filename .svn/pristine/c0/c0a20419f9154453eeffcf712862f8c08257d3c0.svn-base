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

import com.alibaba.fastjson.JSONObject;
import com.hx.model.Work;
import com.hx.service.WorkService;

@Controller
@RequestMapping(value="/qsapi")
public class CreateWork {
	
	@Autowired
	private WorkService workService;
	
	@ResponseBody
	@RequestMapping(value="/create_work",produces={"application/json;","text/html;charset=UTF-8;"},method=RequestMethod.POST)
	public String ctrate(@RequestBody Work work,HttpServletResponse res) throws IOException{
		work.setCreatedAt(new Date());
		work.setStatus("新建");
		work.setCreatedAt(new Date());
		int i=0;
		try{
			i = workService.createWork(work);
			System.out.println("创建上工信息!");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("创建上工信息出错!");
		}
		JSONObject json = new JSONObject();
		json.put("result", i);
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().print(json.toJSONString());
		return null;
	}
}
