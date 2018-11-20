package com.hx.interceptor;


import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.hx.model.User;
import com.hx.service.RightService;


public class RightInterceptor implements HandlerInterceptor{

	@Autowired
	private RightService rightService;
	/**
	 * 业务处理器处理之前被调用，被拦截返回false，反之能正常到Controller层
	 */
	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handler) throws Exception {
		System.out.println("====Right====");

		AuthValidate validate = ((HandlerMethod) handler).getMethodAnnotation(AuthValidate.class);

		if(validate == null){
			return true;
		}
		//通过用户的角色id查询出拥有的权限名字
		User user = (User) request.getSession().getAttribute("user");
		if(user.getRoleId()==null){
			user.setRoleId(1);
		}
		Set<String> rightNames = rightService.selectRightNames(user.getRoleId());
		//获取注解的值
		String funcName = validate.value().getAuthName();
		System.out.println(funcName);
		System.out.println(rightNames);
		if(rightNames.contains(funcName)||"允许访问".equals(funcName)){
			System.out.println("权限通过:"+funcName);
			return true;
		}else{
			System.out.println("权限不足:"+funcName);
			response.sendRedirect(request.getContextPath()+"/welcome/error"); 
			return false;
		}
	}

	/**
	 * 在业务处理完成请求后，在DispatcherServlet向客户端返回响应前被调用
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		//System.out.println("======postHandle=====");
	}

	/**
	 * 在DispatcherServlet完全处理完请求后被调用(可以在该方法进行一些资源的清理操作)
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		//System.out.println("=====afterCompletion=======");
	}

}