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
import com.hx.model.Header;
import com.hx.service.HeaderService;

@Controller
@RequestMapping(value="/qsapi")
public class CreateHeader {
	
	@Autowired
	private HeaderService headerService;
	
	
	@ResponseBody
	@RequestMapping(value="/create_header",produces={"application/json;","text/html;charset=UTF-8;"},method=RequestMethod.POST)
	public String create(@RequestBody Header header,HttpServletResponse res) throws IOException{
		String mes;
		header.setCreatedAt(new Date());
		try{
			headerService.create(header);
			System.out.println("创建表头板信息!");
			mes="1";
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("创建表头板信息出错!");
			mes="0";
		}
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().print(mes);
		return null;
	}
}
