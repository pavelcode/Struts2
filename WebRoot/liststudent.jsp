<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'liststudent.jsp' starting page</title>
    
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
     <form action="${pageContext.request.contextPath}/listStudentAction.action" method="post">
          用户名<input type="text" name="students[0].stuName"/><br/>
          密码<input type="password" name="students[0].stuPass"/><br/>
          用户名<input type="text" name="students[1].stuName"/><br/>
          密码<input type="password" name="students[1].stuPass"/><br/>
          <input type="submit" value="登录"/>
          
    </form>
  </body>
</html>
