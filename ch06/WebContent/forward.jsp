<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1 align="center">forward跳转前的页面</h1>

<%
	//下面页面跳转时的参数如果有中文，需要编码处理
	request.setCharacterEncoding("UTF-8");
%>

	<jsp:forward page="second.jsp">
		<jsp:param name="userName" value="张三" />
	</jsp:forward>

</body>
</html>