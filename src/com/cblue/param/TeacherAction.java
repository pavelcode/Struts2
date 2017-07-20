package com.cblue.param;

import com.opensymphony.xwork2.ModelDriven;

public class TeacherAction implements ModelDriven<Teacher> {
	
     private Teacher teacher = new Teacher();
	
     /*
     public Teacher getTeacher() {
 		return teacher;
 	}
 	public void setTeacher(Teacher teacher) {
 		this.teacher = teacher;
 	}
	*/
	//必须创建一个teacher的实例，这里返回实例
	@Override
	public Teacher getModel() {
		// TODO Auto-generated method stub
		return teacher;
	}
	
	public String save(){
		System.out.println("TeacherAction---save");
		System.out.println(teacher);
		return "none";
	}



	

}
