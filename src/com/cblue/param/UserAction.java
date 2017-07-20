package com.cblue.param;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	private String name;
	private String pass;
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this.name+"---"+this.pass+"---"+this.type);
		return NONE;
	}
}
