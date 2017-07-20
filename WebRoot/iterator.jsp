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
    
    <title>My JSP 'iterator.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style>
	  .red{background:red;}
	  .green{background:green;}
	</style>

  </head>
  
  <body>
  
    <s:iterator value="#request.list" var="v">
      ${v} 或 <s:property value="#v"/><br/>
    </s:iterator>
    
   
     <s:iterator value="#request.map" var="m">
       ${m.key}--${m.value}或  <s:property value="#m.key"/>--<s:property value="#m.value"/><br/>
     </s:iterator>
    
     <!-- 单双行变色效果 从valuestack的栈中获得，所以不需要加#-->
    <table border="1">
       <s:iterator value="ps" var="p" status="status">
         <%--  <tr class="${status.odd?'red':'green'}"> --%>
              <tr class="<s:property value='#status.odd?"red":"green"'/>">
              <td>${p.name}</td>
              <td>${p.age}</td>
           </tr>
       </s:iterator>
    </table>
    
     <!-- 投影的使用方式 -->
     <!-- ? --获取集合中所有满足选择逻辑的对象(拿sql来做比例就是"select * from xxx where age>20") -->
    <s:iterator value="ps.{?#this.age>20}">
      <s:property value="name"/>--<s:property value="age"/><br/>
    </s:iterator>
    <!-- ^ --获取集合中第一个满足选择逻辑的对象(拿sql来做比例就是"select top(1) from xxx where age>20") -->
     <s:iterator value="ps.{^#this.age>20}">
      <s:property value="name"/>--<s:property value="age"/><br/>
    </s:iterator>
     <!--  $ --获取集合中最后一个满足选择逻辑的对象 -->
     <s:iterator value="ps.{$#this.age>20}">
      <s:property value="name"/>--<s:property value="age"/><br/>
    </s:iterator>
    <!-- 只输出单个属性 -->
    <s:iterator value="ps.{name}" var="n">
       <s:property value="n"/><br/>
    </s:iterator>
    
    
    
   
    
    <s:debug></s:debug>
   
    
  </body>
</html>
