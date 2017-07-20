package com.cblue.param;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class ListStudentAction extends ActionSupport {

	private List<Student> students = new ArrayList<Student>();
	
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ListStudentAction---execute");
		for(Student stu :students){
			System.out.println(stu);
		}
		return NONE;
	}
}
