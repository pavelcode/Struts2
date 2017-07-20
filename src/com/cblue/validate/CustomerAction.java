package com.cblue.validate;

import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport {

	  private String email;
	  private String password;
	  private String repassword;
	  private String phone;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("CustomerAction--execute");
		System.out.println(this.getEmail()+"---"+this.getPassword()+"---"+this.getRepassword()+"---"+this.getPhone());
		return NONE;
	}
}
