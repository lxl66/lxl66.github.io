<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<%
	//java脚本里只能定义变量
	String name = "张三"; 
%>

<%!
	//声明中可以定义变量，也能定义方法
	String name = "李四"; 

	void show(){
		System.out.print("调用了show方法！");	
	}
	
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<% show(); %>

<input type="text" value="<%=name%>">

</body>
</html>