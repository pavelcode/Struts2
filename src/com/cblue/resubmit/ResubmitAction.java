package com.cblue.resubmit;

import com.opensymphony.xwork2.ActionSupport;

public class ResubmitAction extends ActionSupport {
	
	private String username;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ResubmitAction--execute--"+username);
		return SUCCESS;
	}

}
