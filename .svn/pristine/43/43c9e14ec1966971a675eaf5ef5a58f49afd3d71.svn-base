package com.hx.app;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hx.service.PackageDetailService;
import com.hx.service.PackageService;
import com.hx.model.Package;
import com.hx.model.PackageDetail;

@Controller
@RequestMapping(value="/qsapi")
public class CreatePackage {
	
	@Autowired
	private PackageService packageService;
	@Autowired
	private PackageDetailService packageDetailService;
	
	@ResponseBody
	@RequestMapping(value="/create_package",produces={"application/json;","text/html;charset=UTF-8;"},method=RequestMethod.POST)
	public String ctrate(@RequestBody Package p,HttpServletResponse res) throws IOException{
		
		String mes;
		//保存Package
		p.setCreatedAt(new Date());
		try{
			packageService.create(p);
			System.out.println("创建打包信息!");
			mes="1";
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("创建打包信息出错!");
			mes="0";
		}
		//保存PackageDetail
		List<PackageDetail> details = p.getDetails();
		for(PackageDetail pd : details){
			pd.setCreatedAt(new Date());
			try{
				packageDetailService.create(pd);
				System.out.println("创建打包详细信息!");
				mes="1";
			}catch(Exception e){
				e.printStackTrace();
				System.out.println("创建打包详细信息出错!");
				mes="0";
			}
		}
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().print(mes);
		return null;
	}
}
