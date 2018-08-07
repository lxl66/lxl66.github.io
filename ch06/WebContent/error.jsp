<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1 align="center">页面出错啦！</h1>

<%-- 
	当前页面如果需要获取exception异常对象的信息，
	则 page指令的isErrorPage属性要设置为true，默认的是false
--%>
<%=exception%><br>
<%=exception.getMessage()%>

</body>
</html>