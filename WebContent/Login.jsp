<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
	<div class="container">
	 	<div class="container-fluid">
		  	<form action="loginServlet" method="post">
		  		<div class="row">
				    <div class="col">
				    </div>
				    <div class="col">
				     	<div class="input-group input-group-sm mb-3">
					  		<input type="text" class="form-control" placeholder="Username" name="name" aria-label="Small" aria-describedby="inputGroup-sizing-sm">
						</div>
						<div class="input-group input-group-sm mb-3">
						  	<input type="text" class="form-control" placeholder="Password" name="pass" aria-label="Small" aria-describedby="inputGroup-sizing-sm">
						</div>
						<input type="submit" value="Login" class="btn btn-primary">
				    </div>
				    <div class="col">
				    </div>
				</div>
			</form>
			<form action="ProductList" method="post">
				<input type="submit" value="Go To Index" class="btn btn-primary">
			</form>
		</div>
	</div>
	
</body>
</html>

