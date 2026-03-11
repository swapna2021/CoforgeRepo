<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="jakarta.servlet.RequestDispatcher"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error Page</title>
</head>
<body>
	<h1 style="color:red">Invalid login credentials <br> please do login again</h1>
	<%RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
	rd.forward(request,response);
	%>
	
</body>
</html>