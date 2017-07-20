package com.cblue.param;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class MapStudentAction extends ActionSupport {
	
	private Map<String,Student> mapStudent = new HashMap<String,Student>();
	
	public Map<String, Student> getMapStudent() {
		return mapStudent;
	}

	public void setMapStudent(Map<String, Student> mapStudent) {
		this.mapStudent = mapStudent;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("MapStudentAction---execute");
		for(Map.Entry<String,Student> stu:mapStudent.entrySet()){
			System.out.println(stu.getKey()+"---"+stu.getValue());
		}
		return NONE;
	}

}
