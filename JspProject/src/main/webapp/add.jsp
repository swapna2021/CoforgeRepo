<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Adding Numbers</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-md-5">
				<div class="card shadow">
					<div class="card-header text-center bg-primary text-light">
						<h3>Add Two Numbers</h3>
						<div class="card-body">
							<form >
								<div class="mb-3">
									<label class="form-label">First Number:</label>
									<input type="text" class="form-control mt-2" name="num1" required>
									<label class="form-label mt-2">Second Number:</label>
									<input type="text" class="form-control mt-2" name="num2" required>
									<button class="btn btn-success btn-lg mt-5">Addition</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	
	<%! 
	    int addNums(String n1,String n2){
	   if(n1!=null && n2!=null){
	   int res=Integer.parseInt(n1)+Integer.parseInt(n2);
	   return res;
	   }
	   return 0;
	}
	%>
	
	<%
	   String n1=request.getParameter("num1");
	   String n2=request.getParameter("num2");
	   out.println("Addition of "+n1+" and "+n2+" is "+addNums(n1,n2)); 
	%>
	
</body>
</html>