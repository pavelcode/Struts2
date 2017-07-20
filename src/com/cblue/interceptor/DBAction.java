package com.cblue.interceptor;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class DBAction extends ActionSupport {
	
	public String save(){
		System.out.println("DBAction--save");
		return SUCCESS;
	}
	
	public String login(){
		System.out.println("DBAction--login");
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.setAttribute("uname", "zhangsan");
		return SUCCESS;
	}

}
