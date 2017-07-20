<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'autoconvert.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    <s:head/>
  </head>
  
  <body>
    <%--  <form action="${pageContext.request.contextPath}/dateConvert.action" method="post">
          用户名<input type="text" name="name"/><br/>
         年龄<input type="text" name="age"/><br/>
        出生日期<input type="text" name="birthday"/><br/>
          <input type="submit" value="登录"/>
          
    </form> --%>
    
    <s:form action="dateConvert.action">
      <s:textfield name="name" label="用户名"></s:textfield>
     <s:textfield name="age" label="年龄"></s:textfield>
     <s:textfield name="birthday" label="出生日期"></s:textfield>
      <s:submit value="登录"></s:submit>
    </s:form>
  
  </body>
</html>
