package com.cblue.convert;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class DateConvertAction extends ActionSupport {
	
	private String name;
	private int age;
	private Date birthday;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


     @Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DateConvertAction---execute");
		//System.out.println(this.getName()+"---"+this.getAge());
		System.out.println(this.getName()+"---"+this.getAge()+"---"+this.getBirthday());
		return INPUT;
	}
	

}
