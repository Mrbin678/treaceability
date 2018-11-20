package com.hx.app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.hx.model.Factory;
import com.hx.model.SystemParam;
import com.hx.service.SystemParamService;

import net.sf.json.JSONArray;

@Controller
@RequestMapping(value="/qsapi")
public class QuerySystemParams {
	@Autowired
	private SystemParamService systemParamService;
	
	@ResponseBody
	@RequestMapping(value="/query_factories",produces={"application/json;","text/html;charset=UTF-8;"},method=RequestMethod.GET)
	public String queryFactories(HttpServletResponse res) throws IOException{
		List<SystemParam> systemParams = systemParamService.queryFactories();
		List<Factory> factories = new ArrayList<>();
		for(SystemParam s:systemParams){
			Factory f = new Factory();
			f.setCode(s.getParamValue());
			f.setName(s.getName());
			factories.add(f);
		}
		JSONArray json = JSONArray.fromObject(factories);
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().print(json.toString());
		return null;
	}
}
