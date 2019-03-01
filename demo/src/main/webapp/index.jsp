<%@page import="com.example.demo.pai"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
	function shaungseqiu(){
// 		document.getElementById("show").html="<%=pai.getdoubleball()%>";
alert("<%=pai.setString()%>");
		alert("<%=pai.getdoubleball()%>");
	}
	
	function qixingcai(){
	alert("<%=pai.setString()%>");
	alert("<%=pai.getQiXingCai()%>");
	}
	function daletou(){
	alert("<%=pai.setString()%>");
	alert("<%=pai.gethappyball()%>");
	}
	</script>
  </head>
  
  <body>
    <input type="button" onclick="shaungseqiu()" value="双色球" />
    <input type="button" onclick="qixingcai()" value="七星彩" />
    <input type="button" onclick="daletou()" value="大乐透" />
    <div id="show"></div>
  </body>
</html>
