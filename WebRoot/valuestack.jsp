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
    
    <title>My JSP 'valuestack01.jsp' starting page</title>
    
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
     
     <s:debug></s:debug>
     
     <!-- valueStack常用方法 -->
     <!-- 获得set（）设置的值 -->
     <s:property value="aaa"/>
     <!-- 获得setValue（）设置的值 -->
     <s:property value="bbb"/>
     
     <!-- 获得ActionContext中的属性 -->
     <s:property value="ccc"/>
     
     <!-- 获取添加的Person对象的属性 -->
     <s:property value="[0].name"/>
     <s:property value="[0].age"/>
     <br/>
     
     <!-- 从四种属性对象中获得值 -->
     <s:property value="#request.requ"/>或<s:property value="#request['requ']"/>
             或<s:property value="%{#request.requ}"/>
     <br/>
     <s:property value="#session.sess"/>或<s:property value="#session['sess']"/>
      或<s:property value="%{#session.sess}"/>
     <br/>
     <s:property value="#application.appl"/>或<s:property value="#application['appl']"/>
         或<s:property value="%{#application.appl}"/>
     <br/>
   <!--#加attr前缀能按request > session > application顺序获取attribute，
            这样当在request中取不到时，会自动向session里取，如果session里也取不到，
           会再向application里取。如果取到则返回，不再向上游历 -->
    <s:property value="#attr.sess"/>或<s:property value="#attr['sess']"/>
    或<s:property value="%{#attr.sess}"/><br/>
           
     <br/>
     <!--  使用EL表达式获得值  -->
     <!-- 取值顺序 page->request->action的根栈中获得->从actionContext中获得->session->application -->
      ${requ}
      ${sess}
      ${appl}
      ${name}
      
      
     
     
     
     
     
  </body>
</html>
