package com.hx.util.common;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.MDC;
/**
 * 日志过滤器
 * @author Ivan
 *
 */
public class ResFilter implements Filter {
	
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("Filter------------初始化");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		MDC.put("ip",getIpAddr(req));
		MDC.put("created_at", new Date());
		MDC.put("updated_at", new Date());
		try {
			chain.doFilter(request, response);
		} finally {
			MDC.clear();
		}
		
	}
	//获取用户真实IP
	public String getIpAddr(HttpServletRequest request) {    
	    String ip = request.getHeader("x-forwarded-for");    
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {    
	        ip = request.getHeader("Proxy-Client-IP");    
	    }    
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {    
	        ip = request.getHeader("WL-Proxy-Client-IP");    
	    }    
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {    
	        ip = request.getRemoteAddr();    
	    }    
	    return ip;    
	}
	@Override
	public void destroy() {
		System.out.println("Filter-------------销毁");
	}

}
