package com.cblue.ognl;

import java.util.Date;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class ValueStackAction extends ActionSupport {
	
	private String BBB;
	
	public String getBBB() {
		return BBB;
	}

	public void setBBB(String bBB) {
		BBB = bBB;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ValueStackAction---execute");
//		获得ValueStack的三种方式
		ValueStack vs1 = ActionContext.getContext().getValueStack();
		System.out.println(vs1);
		ValueStack vs2 = (ValueStack) ActionContext.getContext().get(ValueStack.VALUE_STACK);
		System.out.println(vs2);
		ValueStack  vs3 = (ValueStack) ServletActionContext.getRequest().getAttribute("struts.valueStack");
		System.out.println(vs3);
		
		//ValueStack的操作方法
		//set()与setValue()的区别
		//使用set（）设置值
		//vs1.set("aaa","AAA");
		
		//使用setValue设置值，
		//vs1.setValue("bbb","BBB");//错误,必须有key属性的setter和getter方法
		
		//操作Action属性与ActionContext的属性区别
		//如果给Action中设置属性，属性前不需要加任何。如果在前面加上#，在ActionContext中设置属性
		vs1.setValue("#ccc", "CCC");
		
		//使用push在栈中添加对象
		vs1.push(new Person("赵六",20));
		vs1.push(new Person("田七",30));
		
		//修改栈中第一个Person对象的age值
		vs1.setValue("[0].age",11);
		
		
		//四种属性对象中放入属性
		//pageContext没有意义
		ServletActionContext.getRequest().setAttribute("requ","REQUET");
		ServletActionContext.getRequest().getSession().setAttribute("sess", "SESSION");
		ServletActionContext.getServletContext().setAttribute("appl", "APPLICATION");
		
		
		return SUCCESS;
	}
	

}
