<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ognl.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
     <!-- 这个标签的作用是把内容输出，类似于c:out，value里面对应的就是ognl表达式 -->
     <s:property value="'abc'"/> 
     <!-- 对于一个字符串来说，放在property标签中，使用【单引号】包含，就把字符串转化成了ognl表达式，否则失败 -->
     <s:property value="abc"/>  <!-- 不输出任何内容 -->
     <!-- 调用String的toUpperCase() -->
     <s:property value="'abc'.toUpperCase()"/>
     <!-- 调用类静态的属性 -->
     <s:property value="@java.lang.Math@PI"/>
     <!-- 调用类静态的方法，需要开启struts2-core下的default.peoerties设定struts.ognl.allowStaticMethodAccess=true -->
     <s:property value="@java.lang.Math@max(3,10)"/>
     
     
     
  </body>
</html>
