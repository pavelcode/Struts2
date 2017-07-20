package com.cblue.validate;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.validation.SkipValidation;

import com.opensymphony.xwork2.ActionSupport;

public class ProValidateAction extends ActionSupport {
	
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
	
	
	
	/*@Override
	public void validate() {
		// TODO Auto-generated method stub
		System.out.println("ProValidateAction--validate");
		if(StringUtils.isEmpty(name)){
			//添加错误提示
			addFieldError("name","姓名不能为空");
		}
	}*/
	
	/*只针对save方法校验*/
	public void validateSave() {
		// TODO Auto-generated method stub
		System.out.println("ProValidateAction--validatesave");
		if(StringUtils.isEmpty(name)){
			//添加错误提示
			addFieldError("name","姓名不能为空");
		}
	}
	
	@SkipValidation
	public String save() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ProValidateAction--save");
		return INPUT;
	}
	
	
	public String update() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ProValidateAction--update");
		return INPUT;
	}
	

}
