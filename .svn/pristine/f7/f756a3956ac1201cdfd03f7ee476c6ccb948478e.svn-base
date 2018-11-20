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
import com.hx.model.MeterDetection;
import com.hx.service.MeterDetectionService;

@Controller
@RequestMapping(value="/qsapi")
public class CreateCheckMeter {
	@Autowired
	private MeterDetectionService meterDetectionService;
	
	@ResponseBody
	@RequestMapping(value="/create_check_meter",produces={"application/json;","text/html;charset=UTF-8;"},method=RequestMethod.POST)
	public String ctrate(@RequestBody MeterDetection meterDetection,HttpServletResponse res) throws IOException{
		String mes;
		meterDetection.setCreatedAt(new Date());
		try{
			meterDetectionService.create(meterDetection);
			System.out.println("基表检验!");
			mes="1";
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("基表检验出错!");
			mes="0";
		}
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().print(mes);
		return null;
	}
}
