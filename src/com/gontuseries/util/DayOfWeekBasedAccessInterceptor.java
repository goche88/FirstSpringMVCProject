package com.gontuseries.util;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws IOException {
		Calendar cal = Calendar.getInstance();
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

		if(dayOfWeek == 1) {
			response.getWriter().write("The website is closed on Sunday. "
					+ "Please try accessing it on any other week day.");
			return false;
		}
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler, ModelAndView modelAndView)
						throws Exception {
		System.out.println("Handler Interceptor: Spring MVC called postHandle() method for: "
				+ request.getRequestURI().toString());
		
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
						throws Exception {
		System.out.println("Handler Interceptor: Spring MVC called afterCompletion() method for: "
				+ request.getRequestURI().toString());
		
	}

}
