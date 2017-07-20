package com.cblue.param;

public class Student {

	private String stuName;
	
	private String stuPass;
	
	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuPass() {
		return stuPass;
	}

	public void setStuPass(String stuPass) {
		this.stuPass = stuPass;
	}
	
	@Override
	public String toString() {
		return "Student [stuName=" + stuName + ", stuPass=" + stuPass + "]";
	}
}
