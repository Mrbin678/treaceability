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
import com.hx.model.Shell;
import com.hx.service.ShellService;

@Controller
@RequestMapping(value="/qsapi")
public class CreateShell {
	@Autowired
	private ShellService shellService;
	
	
	@ResponseBody
	@RequestMapping(value="/create_shell",produces={"application/json;","text/html;charset=UTF-8;"},method=RequestMethod.POST)
	public String ctrate(@RequestBody Shell shell,HttpServletResponse res) throws IOException{
		
		String mes;
		shell.setCreatedAt(new Date());
		try{
			shellService.creat(shell);
			System.out.println("创建表壳信息!");
			mes="1";
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("创建表壳信息出错!");
			mes="0";
		}
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().print(mes);
		return null;
	}
}
