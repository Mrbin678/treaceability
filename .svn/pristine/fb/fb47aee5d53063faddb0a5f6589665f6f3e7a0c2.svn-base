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
import com.hx.model.ShellDetection;
import com.hx.service.ShellDetectionService;

@Controller
@RequestMapping(value="/qsapi")
public class CreateCheckShell {
	@Autowired
	private ShellDetectionService shellDetectionService;
	
	@ResponseBody
	@RequestMapping(value="/create_check_shell",produces={"application/json;","text/html;charset=UTF-8;"},method=RequestMethod.POST)
	public String ctrate(@RequestBody ShellDetection shellDetection,HttpServletResponse res) throws IOException{
		
		String mes;
		shellDetection.setCreatedAt(new Date());
		int i=shellDetectionService.create(shellDetection);
		if(i>0){
			System.out.println("表壳检验!");
			mes="1";
		}else{
			System.out.println("创建表壳检验失败!");
			mes="0";
		}
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().print(mes);
		return null;
	}
}
