package com.hx.app;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.hx.model.User;
import com.hx.service.UserService;

@Controller
@RequestMapping(value="/qsapi")
public class QueryOperater {
	
	@Autowired
	private UserService userService;
	
	
	@ResponseBody
	@RequestMapping(value="/query_operator",produces={"application/json;","text/html;charset=UTF-8;"},method=RequestMethod.GET)
	public String queryOperator(@RequestParam String code,HttpServletResponse res) throws IOException{
		User u = userService.findByOperator(code);
		String json = JSONObject.toJSONString(u);
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().print(json.toString());
		return null;
	}
}
