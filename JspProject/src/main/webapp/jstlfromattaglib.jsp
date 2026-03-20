<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Formating Taglibrary</h1>
	<% Date today=new Date(); 
	request.setAttribute("today",today);
	
	%>
	<h1>
	<c:out value="Today's date is : ${today}"></c:out><br>
	<c:out value="Formatted Dates:"></c:out><br>
	<fmt:formatDate value="${today}" pattern="yyyy-MM-dd"></fmt:formatDate><br>
	<fmt:formatDate value="${today}" pattern="dd-MM-yy"></fmt:formatDate><br>
	<fmt:formatDate value="${today}" pattern="yyyy-MM-dd HH:mm:ss a" ></fmt:formatDate><br>
	<fmt:formatDate value="${today}" pattern="yyyy-MM-dd HH:mm:ss a" timeZone="Asia/Kolkata"></fmt:formatDate><br>
	<fmt:formatDate value="${today}" pattern="yyyy-MM-dd HH:mm:ss a" timeZone="UTC+5"></fmt:formatDate>
	</h1>
	
	<br>
	<h1>Currency:
	<c:set var="amount" value="1234.5"></c:set>
	<fmt:formatNumber value="${amount }" type="currency"></fmt:formatNumber><br>
	<fmt:setLocale value="en_IN"/>
	<fmt:formatNumber value="${amount }" type="currency"></fmt:formatNumber><br>
	<fmt:setLocale value="en_GB"/>
	<fmt:formatNumber value="${amount }" type="currency"></fmt:formatNumber>
	</h1>
</body>
</html>