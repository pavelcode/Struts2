package com.cblue.action;

import com.opensymphony.xwork2.ActionSupport;

public class Hello03Action extends ActionSupport {
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello03Action--execute");
		return "success";
	}
}
