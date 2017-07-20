package com.cblue.param;

import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport {
	
	private Student student;
	

	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(student.getStuName()+"---"+student.getStuPass());
		return NONE;
	}

}
