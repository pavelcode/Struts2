package com.cblue.ognl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class IteratorAction extends ActionSupport implements ServletRequestAware {

	private HttpServletRequest request;
	
	List<Person> ps;
	
	public List<Person> getPs() {
		return ps;
	}

	public void setPs(List<Person> ps) {
		this.ps = ps;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("IteratorAction--execute");
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		request.setAttribute("list", list);

		Map map = new HashMap();
		map.put("a", "aaa");
		map.put("b", "bbb");
		map.put("c", "ccc");
		request.setAttribute("map", map);
		
		//投影的使用方式 保存在valuestack的根栈中
	    ps = new ArrayList<Person>();
		ps.add(new Person("張三",10));
		ps.add(new Person("李四",20));
		ps.add(new Person("王五",30));
		ps.add(new Person("趙六",40));
			

		return SUCCESS;
	}

	

}
