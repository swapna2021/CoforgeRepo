<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.coforge.models.Employee,java.time.LocalDate"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</head>
<body>
	<%
		Employee emp=(Employee) request.getAttribute("employee");
		/* LocalDate doj=LocalDate.parse("2025-07-13");
		LocalDate dob=LocalDate.parse("2009-06-12");
		emp=new Employee(1,"swapna",5000.0,"swapna@gmail.com","9099090990",doj,dob); */
		boolean editmode=(emp!=null);
	%>

	<div class="container mt-4">
		<div class="card shadow">
			<div class="card-header bg-dark text-white">
				<h3>
					<%= editmode?"Edit Employee":"Add Employee" %>
				</h3>
			</div>
			<div class="card-body">
				<form action="employee" method="post">
					<input type="hidden" name="eid" value="<%=editmode?emp.getEid():""%>"> 
					<div class="mb-3">
						<label class="form-label">Employee Name</label>
						<input type="text" 
							class="form-control" 
							name="ename"  
							value="<%=editmode?emp.getEname():""%>" >
					</div>
					<div class="mb-3">
						<label class="form-label">Employee Salary</label>
						<input type="text" 
							class="form-control" 
							name="salary"  
							value="<%=editmode?emp.getSalary():""%>" >
					</div>
				
				 	<div class="mb-3">
						<label class="form-label">Employee Email</label>
						<input type="email" 
							class="form-control" 
							name="email"  
							value="<%=editmode?emp.getEmail():""%>" >
					</div>
					<div class="mb-3">
						<label class="form-label">Employee Mobile Number</label>
						<input type="tel" 
							class="form-control" 
							name="mobile"  
							value="<%=editmode?emp.getMobile():""%>" >
					</div>
					<div class="mb-3">
						<label class="form-label">Employee DOJ</label>
						<input type="date" 
							class="form-control" 
							name="doj"  
							value="<%=editmode?emp.getDoj():""%>" >
					</div>
					<div class="mb-3">
						<label class="form-label">Employee DOB</label>
						<input type="Date" 
							class="form-control" 
							name="dob"  
							value="<%=editmode?emp.getEname():""%>" >
					</div>
					<button type="submit" class="btn btn-success">
					
						<%=editmode?"Update Employee":"Save Employee" %>
					</button>
					<a href="employee?action=list" class="btn btn-secondary">Back</a>
				</form>
			
			</div>
		</div>
	</div>

</body>
</html>