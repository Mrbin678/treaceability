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
import com.hx.model.Code;
import com.hx.model.Meter;
import com.hx.service.MeterService;

@Controller
@RequestMapping(value="/qsapi")
public class QueryByMeterCode {
	
	@Autowired
	private MeterService meterService;
	
	
	@ResponseBody
	@RequestMapping(value="/query_meter_structure",produces={"application/json;","text/html;charset=UTF-8;"},method=RequestMethod.GET)
	public String queryOperator(@RequestParam String code,HttpServletResponse res) throws IOException{
		Meter m = meterService.slelectByMeterCode(code);
		Code c = new Code();
		c.setCode(m.getCode());
		c.setCounterCode(m.getCounterCode());
		c.setHeaderCode(m.getHeaderCode());
		c.setShellCode(m.getShellCode());
		String json = JSONObject.toJSONString(c);
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().print(json.toString());
		return null;
	}
}
