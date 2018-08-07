<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="import.jsp" %>
<%-- import.jsp不能使用include动作元素进行动态包含 --%>
<%--<jsp:include page="import.jsp"></jsp:include>--%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	div{ text-align: center; font-size: 24px; border: 1px solid black; margin:10px;}
</style>
</head>
<body>

<div>
	<%--<%@ include file="head.jsp" %>--%>
	<jsp:include page="head.jsp"></jsp:include>
</div>

<div>主体信息部分</div>

<%
	new Date();
	new User();
%>

</body>
</html>