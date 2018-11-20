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
import com.hx.model.Shipment;
import com.hx.service.ShipmentService;

@Controller
@RequestMapping(value="/qsapi")
public class CreateShipment {
	
	@Autowired
	private ShipmentService shipmentService;
	
	@ResponseBody
	@RequestMapping(value="/create_shipment",produces={"application/json;","text/html;charset=UTF-8;"},method=RequestMethod.POST)
	public String ctrate(@RequestBody Shipment shipment,HttpServletResponse res) throws IOException{
		
		String mes;
		shipment.setCreatedAt(new Date());
		try{
			shipmentService.create(shipment);
			mes="1";
		}catch(Exception e){
			e.printStackTrace();
			mes="0";
		}
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().print(mes);
		return null;
	}
}
