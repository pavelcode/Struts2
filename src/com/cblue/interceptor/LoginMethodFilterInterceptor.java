package com.cblue.interceptor;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public final class LoginMethodFilterInterceptor extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		String uname = (String) ServletActionContext.getRequest().getSession().getAttribute("uname");
		System.out.println("LoginMethodFilterInterceptor--doIntercept--"+uname);
		String result = null;
		if(uname!=null){
			result = invocation.invoke();
		}else{
			result = Action.INPUT;
		}
		return result;
	}

}
