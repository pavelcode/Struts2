package com.cblue.validate;

import org.apache.struts2.interceptor.validation.SkipValidation;

import com.opensymphony.xwork2.ActionSupport;

public class DecValidateAction extends ActionSupport {
	
	private String name;
	private String pass;
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
	
	
	public String save(){
		System.out.println("DecValidateAction--save");
		return INPUT;
	}
	
	public String update(){
		System.out.println("DecValidateAction--update");
		return INPUT;
	}

}
