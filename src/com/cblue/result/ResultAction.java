package com.cblue.result;

import com.opensymphony.xwork2.ActionSupport;

public class ResultAction extends ActionSupport {

	   @Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		   System.out.println("ResultAction  -->execute");
		   String result = null;
    try {
			 //int i= 1/0;
			 //result = "success"; 
    	      result = "chain";
    	     // result ="redirectAction";
    	     //result="txt";
    	 	      
		} catch (Exception e) {
			// TODO: handle exception
			result ="error";
		} 
		  
		return result;
	}
}
