package com.cblue.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class ServletAction extends ActionSupport implements ServletRequestAware,ServletResponseAware {
	
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ServletAction--execute");
		System.out.println("ʹServletActionContext----");
		System.out.println(ServletActionContext.getRequest());
		System.out.println(ServletActionContext.getResponse());
		System.out.println("ServletRequestAware ServletResponseAware---");
		System.out.println(request);
		System.out.println(response);
		return NONE;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		System.out.println("ServletAction-->setServletRequest");
		this.request = request;
		
	}
	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println("ServletAction-->setServletResponse");
		this.response = response;
		
	}

	
}
