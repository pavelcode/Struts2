package com.cblue.actionmethod;

import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport {

	public String addCustomer(){
		System.out.println("CustomerAction---addCustomerִ");
		return "success";
	}
	
	public String updateCustomer(){
		System.out.println("CustomerAction---updateCustomerִ");
		return "success";
	}
}
