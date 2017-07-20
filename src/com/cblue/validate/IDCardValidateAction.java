package com.cblue.validate;

import com.opensymphony.xwork2.ActionSupport;

public class IDCardValidateAction extends ActionSupport {

	
	private String idCard;
	
	
	public String getIdCard() {
		return idCard;
	}


	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}


	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("IDCardValiateAction--execute");
		System.out.println("idcard="+this.getIdCard());
		return INPUT;
	}
}
