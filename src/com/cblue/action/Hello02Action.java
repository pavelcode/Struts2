package com.cblue.action;

import com.opensymphony.xwork2.Action;

public class Hello02Action implements Action {

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello02Action--execute");
		return SUCCESS;
	}

}
