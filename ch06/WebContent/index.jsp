<%@ page import="java.util.*,entity.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 这里是HTML注释(客户端注释) -->

<%-- 这里是Jsp注释(服务器注释) --%>

<h1>HelloWorld</h1>

服务器当前时间：<%=new Date()%>

<%
	new User();
%>


</body>
</html>