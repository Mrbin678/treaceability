package com.hx.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSONObject;
import com.hx.model.Echart;
import com.hx.model.User;
import com.hx.service.MeterService;
import com.hx.service.OrderService;
import com.hx.service.UserService;

@Controller
@RequestMapping(value = "/welcome")
public class WelcomeController {

	private Log log = LogFactory.getLog(this.getClass()); 

	private String question;
	private String answer;

	@Autowired
	private UserService userService;
//	@Autowired
//	private LogService logService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private MeterService meterService;
	
	//首页
	@RequestMapping(value = "/index")
	public String index(Model model) {
		//总访问量
		Integer meterCount = meterService.meterCount();
		model.addAttribute("meterCount", meterCount);
		//订单总量
		Integer orderCount = orderService.orderCount();
		model.addAttribute("orderCount", orderCount);
		//用户数量
		Integer userCount = userService.userCount();
		model.addAttribute("userCount", userCount);
		return "welcome/index";
	}
	//图表1
	@ResponseBody
	@RequestMapping(value="/order_chart",method=RequestMethod.GET)
	public String chart(HttpServletRequest req,HttpServletResponse res) throws IOException{
		List<Echart>  list=  meterService.chart();
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().println(JSONObject.toJSON(list));
		return null;
	}
	//图表2
	@ResponseBody
	@RequestMapping(value="/user_chart",method=RequestMethod.GET)
	public String chart2(HttpServletRequest req,HttpServletResponse res) throws IOException{
		List<Echart>  list=  orderService.userChart();
		for(Echart e:list){
			if(e.getLabel()==null||"".equals(e)){
				e.setLabel("其他");
			}
		}
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().println(JSONObject.toJSON(list));
		return null;
	}
	//登录
	@RequestMapping(value = "/login")
	public String login(Model model) {
		addition_check();
		model.addAttribute("question", question);
		model.addAttribute("answer", answer);
		return "welcome/login";
	}
	//
	@RequestMapping(value = "/login_check")
	public String login_check(@RequestParam("loginName") String loginName, @RequestParam("password") String password,
			@RequestParam("type_code") String type_code, Model model,HttpSession session) {
		if (!type_code.equals(answer)) {
			addition_check();
			model.addAttribute("question", question);
			model.addAttribute("answer", answer);
			model.addAttribute("loginName", loginName);
			model.addAttribute("message", "验证码错误");
			return "welcome/login";
		}
		User user=userService.login(loginName, password);
		if (user!=null) {
			session.setAttribute("user",user);
			session.setAttribute("user_name",user.getLoginName());
			MDC.put("name",loginName);
			MDC.put("content","登陆成功");
			log.info("登陆成功");
			return  "redirect:/welcome/index";
		} else {
			addition_check();
			model.addAttribute("question", question);
			model.addAttribute("answer", answer);
			model.addAttribute("loginName", loginName);
			model.addAttribute("message", "登录名/密码错误");
			MDC.put("name",loginName);
			MDC.put("content","登陆失败");
			log.info("登陆失败");
			return "welcome/login";
		}
	}
	//退出登录
	@RequestMapping(value = "/logout")
	public String logout(HttpSession session) {
		User u = (User) session.getAttribute("user");
		session.removeAttribute("user");
		MDC.put("name",u.getLoginName());
		MDC.put("content","用户注销登陆");
		log.info("用户注销登陆");
		return "redirect:/welcome/login";
	}
	//权限不足页面
	@RequestMapping(value="/error")
	public String error(Model model){
		return "welcome/error";

	}
	//密码修改
	@RequestMapping(value="/{id}/change_password")
	public String changePassword(Model model,@PathVariable Integer id){
		User user=userService.findById(id);
		model.addAttribute("user",user);
		return "users/change_password";
	}
	//
	private void addition_check() {
		java.util.Random random = new java.util.Random();// 定义随机类
		int a = random.nextInt(10);// 返回[0,10)集合中的整数，注意不包括10
		int b = random.nextInt(10);
		question = Integer.toString(a) + "+" + Integer.toString(b) + "=?";
		answer = Integer.toString(a + b);
	}
}
