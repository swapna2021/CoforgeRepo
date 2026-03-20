<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>jstl demo</h2>
	<%-- <c:out value="Hello Swapna"></c:out>
	
	<c:set var="myname" value="swapna"></c:set>
	<h1>
	<c:out value="${myname}"></c:out>
	
	<%out.println("my name is swapna"); %>
	<c:set var="num1" value="125"></c:set>
	<c:set var="num2" value="105"></c:set>
	<c:set var="res" value="${num1+num2}"></c:set>
	Sum:${res}
	
	<c:set var="str" value="${res%2==0? 'Even Number':'Odd Number'}"></c:set>
	<c:out value="${str}"></c:out>
	
	<c:set var="num" value="3"></c:set>
	<c:if test="${num>5 }">Hai</c:if>
	<c:if test="${num<=5 }">Hello</c:if>
	
	</h1> --%>
	<h1>
	<c:set var="num" value="3"></c:set>
	<c:choose>
	<c:when test="${num>5}">Hai</c:when>
	<c:otherwise>Hello</c:otherwise>
	</c:choose>
	</h1>
	<c:out value="Before remove object ${num }"></c:out>
	<c:remove var="num"></c:remove>
	
	<c:out value="After remove ${num }"></c:out>
</body>

</html>