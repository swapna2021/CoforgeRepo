<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		/* out.println("Exception occured : "+exception+"<br>");
		out.println("Message : "+exception.getMessage()+"<br>");
		out.println("Exception Class : "+exception.getClass()+"<br>"); */
		
		if(exception instanceof ArithmeticException)
			out.println("division by zero , exception occured");
		else if(exception instanceof NullPointerException)
			out.println("Null pointere exception occred");
		else if(exception instanceof ArrayIndexOutOfBoundsException)
			out.println("index pointing out of array index");
		else if(exception instanceof StringIndexOutOfBoundsException)
			out.println("string index pointing out of length");
		else
			out.println("number format exception");
	%>
</body>
</html>