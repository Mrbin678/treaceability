package com.hx.controller;

import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.hx.model.Counter;
import com.hx.model.CounterDetection;
import com.hx.model.Csfzk;
import com.hx.model.Header;
import com.hx.model.HeaderDetection;
import com.hx.model.Meter;
import com.hx.model.MeterDetection;
import com.hx.model.Order;
import com.hx.model.Shell;
import com.hx.model.ShellDetection;
import com.hx.service.CounterDetectionService;
import com.hx.service.CounterService;
import com.hx.service.CsfzxService;
import com.hx.service.HeaderDetectionService;
import com.hx.service.HeaderService;
import com.hx.service.MeterDetectionService;
import com.hx.service.MeterService;
import com.hx.service.OrderService;
import com.hx.service.ShellDetectionService;
import com.hx.service.ShellService;

@Controller
@RequestMapping(value = "/search")
public class SearchController {
	@Autowired
	private CounterService counterService;
	
	@Autowired
	private HeaderService headerService;
	
	@Autowired
	private MeterService meterService;
	
	@Autowired
	private ShellService shellService;
	
	@Autowired
	private CounterDetectionService counterDetectionService;
	
	@Autowired
	private HeaderDetectionService headerDetectionService;
	
	@Autowired
	private MeterDetectionService meterDetectionService;
	
	@Autowired
	private ShellDetectionService shellDetectionService;
	
	@Autowired
	private OrderService orderService;
	@Autowired
	private CsfzxService csfzxService;
	
	//整表条码
	@RequestMapping(value = "/meter_code")
	public String hmeter(Model model,@RequestParam String keyword, HttpServletResponse res) {
		String page;
		Meter meter = meterService.slelectByMeterCode(keyword);
		if(meter!= null){
			Order order = orderService.findByCode(meter.getOrderCode());
			//
			MeterDetection md = meterDetectionService.findByCode(meter.getFactoryCode());
			//
			String counter_code = meter.getCounterCode();
			Counter c = counterService.findByCode(counter_code);
			CounterDetection cd = counterDetectionService.findByCode(counter_code);
			//
			String header_code = meter.getHeaderCode();
			Header h = headerService.findByCode(header_code);
			HeaderDetection hd = headerDetectionService.findByCode(header_code);
			//
			String shell_code = meter.getShellCode();
			Shell s = shellService.selectByCode(shell_code);
			ShellDetection sd = shellDetectionService.findByCode(shell_code);
			Csfzk csfzk = csfzxService.findByCode(meter.getCode());
			model.addAttribute("order",order);
			model.addAttribute("meter", meter);
			model.addAttribute("meterDetection", md);
			model.addAttribute("counter", c);
			model.addAttribute("counterDetection", cd);
			model.addAttribute("h", h);
			model.addAttribute("headerDetection", hd);
			model.addAttribute("shell", s);
			model.addAttribute("shellDetection", sd);
			model.addAttribute("csfzk",csfzk);
			page="search/index";
		}else {
			page="search/nodata";
		}
		return page;
	}
	
	//计数器条码
	@RequestMapping(value = "/counter_code")
	public String counterCode(Model model, @RequestParam String keyword, HttpServletResponse res) {
		String page;
		Meter meter = meterService.selectByCounterCode(keyword);
		System.out.println(keyword);
		if(meter!= null){
			Order order = orderService.findByCode(meter.getOrderCode());
			//
			MeterDetection md = meterDetectionService.findByCode(meter.getFactoryCode());
			//
			String counter_code = meter.getCounterCode();
			Counter c = counterService.findByCode(counter_code);
			CounterDetection cd = counterDetectionService.findByCode(counter_code);
			//
			String header_code = meter.getHeaderCode();
			Header h = headerService.findByCode(header_code);
			HeaderDetection hd = headerDetectionService.findByCode(header_code);
			//
			String shell_code = meter.getShellCode();
			Shell s = shellService.selectByCode(shell_code);
			ShellDetection sd = shellDetectionService.findByCode(shell_code);
			Csfzk csfzk = csfzxService.findByCode(meter.getCode());
			model.addAttribute("order", order);
			model.addAttribute("meter", meter);
			model.addAttribute("meterDetection", md);
			model.addAttribute("counter", c);
			model.addAttribute("counterDetection", cd);
			model.addAttribute("h", h);
			model.addAttribute("headerDetection", hd);
			model.addAttribute("shell", s);
			model.addAttribute("shellDetection", sd);
			model.addAttribute("csfzk", csfzk);
			page="search/index";
		}else {
			page="search/nodata";
		}
		return page;
	}
	
	//表头条码
	@RequestMapping(value = "/header_code")
	public String headerCode(Model model, @RequestParam String keyword, HttpServletResponse res) {
		String page;
		Meter meter = meterService.selectByHeaderCode(keyword);
		System.out.println(keyword);
		if(meter!= null){
			Order order = orderService.findByCode(meter.getOrderCode());
			//
			MeterDetection md = meterDetectionService.findByCode(meter.getFactoryCode());
			//
			String counter_code = meter.getCounterCode();
			Counter c = counterService.findByCode(counter_code);
			CounterDetection cd = counterDetectionService.findByCode(counter_code);
			//
			String header_code = meter.getHeaderCode();
			Header h = headerService.findByCode(header_code);
			HeaderDetection hd = headerDetectionService.findByCode(header_code);
			//
			String shell_code = meter.getShellCode();
			Shell s = shellService.selectByCode(shell_code);
			ShellDetection sd = shellDetectionService.findByCode(shell_code);
			Csfzk csfzk = csfzxService.findByCode(meter.getCode());
			model.addAttribute("order", order);
			model.addAttribute("meter", meter);
			model.addAttribute("meterDetection", md);
			model.addAttribute("counter", c);
			model.addAttribute("counterDetection", cd);
			model.addAttribute("h", h);
			model.addAttribute("headerDetection", hd);
			model.addAttribute("shell", s);
			model.addAttribute("shellDetection", sd);
			model.addAttribute("csfzk", csfzk);
			page="search/index";
		}else {
			page="search/nodata";
		}
		return page;
	}
	
	//表壳条码
	@RequestMapping(value = "/shell_code")
	public String meterCode(Model model, @RequestParam String keyword, HttpServletResponse res) {
		String page;
		Meter meter = meterService.selectByShellCode(keyword);
		System.out.println(keyword);
		if(meter!= null){
			Order order = orderService.findByCode(meter.getOrderCode());
			//
			MeterDetection md = meterDetectionService.findByCode(meter.getFactoryCode());
			//
			String counter_code = meter.getCounterCode();
			Counter c = counterService.findByCode(counter_code);
			CounterDetection cd = counterDetectionService.findByCode(counter_code);
			//
			String header_code = meter.getHeaderCode();
			Header h = headerService.findByCode(header_code);
			HeaderDetection hd = headerDetectionService.findByCode(header_code);
			//
			String shell_code = meter.getShellCode();
			Shell s = shellService.selectByCode(shell_code);
			ShellDetection sd = shellDetectionService.findByCode(shell_code);
			Csfzk csfzk = csfzxService.findByCode(meter.getCode());
			model.addAttribute("order", order);
			model.addAttribute("meter", meter);
			model.addAttribute("meterDetection", md);
			model.addAttribute("counter", c);
			model.addAttribute("counterDetection", cd);
			model.addAttribute("h", h);
			model.addAttribute("headerDetection", hd);
			model.addAttribute("shell", s);
			model.addAttribute("shellDetection", sd);
			model.addAttribute("csfzk", csfzk);
			page="search/index";
		}else {
			page="search/nodata";
		}
		return page;
	}
	//订单信息
	@RequestMapping(value = "/order")
	public String order(Model model, @RequestParam String keyword, HttpServletResponse res){
		String page;
		Order order = orderService.findByCode(keyword);
		if (order!=null){
			model.addAttribute("order", order);
			page="search/index";
		}else{
			page="search/nodata";
		}
		return page;
	}
}
