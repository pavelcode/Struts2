<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'othertag.jsp' starting page</title>
    
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
    <!-- radio标签  -->
    <s:radio list="#{'man':'男','woman':'女'}" value="'woman'" name="sex"></s:radio> <br/>
    <!-- checkboxlist标签 -->
    <s:checkboxlist list="#{'eat':'吃','sleep':'睡'}" value="'eat'" name="hobby"></s:checkboxlist><br/>
    <!-- select标签 -->
    <s:select name="course" list="#{'JAVA':'java','H5':'h5','Android':'android'}" value="'android'"></s:select><br/>
    <!--  -->
    <%
      request.setAttribute("username", "用户名");
      
     %>
     <!-- label中的一个字符串，需要使用%{}转化为ognl表达式 -->
    <s:textfield name="username" label="%{#request.username}"></s:textfield><br/>
    
    <!-- if else  elseif标签 -->
     <s:if test="true">
      我是真的
     </s:if>
     <s:else>
      我是假的
     </s:else>
    
    <br/>
  
    
    
  </body>
</html>
