package com.cblue.validate;

import com.opensymphony.xwork2.ActionSupport;

public class AgeValidateAction extends ActionSupport {
	
	private Integer age;

	
	
	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("AgeValidateAction--execute--"+this.getAge());
		return INPUT;
	}

}
