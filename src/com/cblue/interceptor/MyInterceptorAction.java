package com.cblue.interceptor;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class MyInterceptorAction extends ActionSupport{
	
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("MyInterceptorAction--execute");
		return NONE;
	}


}
