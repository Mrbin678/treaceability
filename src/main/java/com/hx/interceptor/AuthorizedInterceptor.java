package com.hx.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.hx.model.User;

public class AuthorizedInterceptor  implements HandlerInterceptor{

	//定义不需要拦截的请求
	private static final String [] IGNORE_URI={"/welcome/login","/welcome/login_check","/404.html","/qsapi"};
	
	//preHandler 返回true后执行，清理资源
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// System.out.println("=====afterCompletion=======");
	}

	//preHandler返回true后执行，Controller方法执行以后执行
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		//System.out.println("======postHandle=====");
	}

	//Controller方法之前执行，返回false请求结束
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		//System.out.println("====AuthorizedInterceptor.preHandle====");
		// 默认用户没有登录
		boolean flag=false;
		String servletPath=request.getServletPath();
		//判断请求是否需要拦截
		for(String s:IGNORE_URI){
			if(servletPath.contains(s)){
				flag=true;
				break;
			}
		}
		//拦截请求
		if(!flag){
			//获取session中的用户
			User user=(User) request.getSession().getAttribute("user");
			
			if(user==null){
				request.setAttribute("message","请先登录再访问网站！");
				//forward()是request中的参数继续传递，redirect()则是重新生成request了
				request.getRequestDispatcher("/welcome/login/").forward(request, response);
				return flag;
			}else{
				flag=true;
			}
		}
		return flag;
	}

}
