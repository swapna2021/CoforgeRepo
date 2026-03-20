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
	<%-- <c:set var="op" value="*"></c:set>
	<c:set var="num1" value="45"></c:set>
	<c:set var="num2" value="35"></c:set> --%>
	
	<form>
		<label>First Number</label>
		<input type="text" name="num1">
		<label>Second Number</label>
		<input type="text" name="num2">
		<button name="op" value="+">+</button>
		<button name="op"  value="-">-</button>
		<button name="op"  value="*">*</button>
		<button name="op"  value="/">/</button>
	</form>
	<c:choose>
	<c:when test="${param.op=='+'}">
		<c:out value="${param.num1+param.num2 }"></c:out>
	
	</c:when>
	<c:when test="${param.op=='-'}">
		<c:out value="${param.num1-param.num2 }"></c:out>
	
	</c:when>
	<c:when test="${param.op=='*'}">
		<c:out value="${param.num1*param.num2 }"></c:out>
	
	</c:when>
	
	<c:when test="${param.op=='/'}">
		<c:out value="${param.num1/param.num2 }"></c:out>
	
	</c:when>
	
	</c:choose>
</body>
</html>