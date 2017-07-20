package com.cblue.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor {

	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("MyInterceptor--init");
	}
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("MyInterceptor--intercept before");
		
		//查看执行的action名字
		System.out.println(invocation.getAction().getClass().getName());
		
		String result = invocation.invoke(); //这个方法执行之后拦截器放行,本质就是执行action中的方法
		
		System.out.println("MyInterceptor--intercept after");
		
		return result;
		
	}

}
