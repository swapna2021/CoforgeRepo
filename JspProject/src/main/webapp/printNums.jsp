<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>
	<% for(int i=1;i<=15;i++)
		if(i%2==0)
		out.println(i+"<br>");
	%>
	</h3>
	<hr>
	<h3>
	<%! String fruits[]={"banana","apple","mango"};  %>
	<% for(String fruit:fruits)
		out.println(fruit);%>
	</h3>	
	<hr>	
		<h3>
	<%@ page import="java.util.Date" %>	
	<%Date date=new Date(); %>
	<%=date %>
	</h3>
	<hr>
	<h3>
	<%!double d1=5,d2=3; %>
	<%-- <%@ page import="java.lang.Math" %> --%>
	<% out.println(Math.pow(d1,d2)); %>
	</h3>
	
	<%@ include file="header.jsp" %>
	
</body>
</html>