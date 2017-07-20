package com.cblue.param;

public class Teacher {
	
	private String teaName;
	private String teaPass;
	
	public String getTeaName() {
		return teaName;
	}
	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}
	
	public String getTeaPass() {
		return teaPass;
	}
	public void setTeaPass(String teaPass) {
		this.teaPass = teaPass;
	}
	
	@Override
	public String toString() {
		return "Teacher [teaName=" + teaName + ", teaPass=" + teaPass + "]";
	}
	

}
