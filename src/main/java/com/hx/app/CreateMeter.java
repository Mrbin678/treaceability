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
import com.hx.model.Meter;
import com.hx.service.MeterService;

@Controller
@RequestMapping(value="/qsapi")
public class CreateMeter {
	@Autowired
	private MeterService meterService;
	
	
	@ResponseBody
	@RequestMapping(value="/create_meter",produces={"application/json;","text/html;charset=UTF-8;"},method=RequestMethod.POST)
	public String ctrate(@RequestBody Meter meter,HttpServletResponse res) throws IOException{
		
		String mes;
		meter.setCreatedAt(new Date());
		try{
			meterService.create(meter);
			System.out.println("创建基表信息!");
			mes="1";
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("创建基表信息出错!");
			mes="0";
		}
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().print(mes);
		return null;
	}
}
