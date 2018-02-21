//Gobal exception handler class
package com.rs.advice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class MyControllerAdvice {
	public MyControllerAdvice() {
		System.out.println("MyControllerAdvice: 0-param constr");
	}
	@ExceptionHandler(RuntimeException.class)
	  public ModelAndView handleError(HttpServletRequest req, Exception ex) {

	    ModelAndView mav = new ModelAndView();
	    mav.addObject("exception", ex);
	    mav.addObject("url", req.getRequestURL());
	    mav.setViewName("runtime_error");
	    return mav;
	  }
}
