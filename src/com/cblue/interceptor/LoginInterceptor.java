package com.cblue.interceptor;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

//实现
public class LoginInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		
		String uname = (String) ServletActionContext.getRequest().getSession().getAttribute("uname");
		System.out.println("LoginInterceptor--intercept--"+uname);
		String result = null;
		if(uname!=null){
			result = invocation.invoke();
		}else{
			result = Action.INPUT;
		}
		return result;
	}

}
