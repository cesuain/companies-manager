<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/input" var="linkInputServlet"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Log in - Companies Manager</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous"/> 
	<style><%@include file="/WEB-INF/css/style.css"%></style>
</head>
<body>
	<div class="container h-100 d-flex justify-content-center">
	    <div class="login-bg my-auto border rounded">
	    	<h1 class="table-tittle">Log in</h1>
	        <form action="${linkInputServlet}" method="post">
	      		<div class="form-group">
	    		    <label>Login: </label>
	       			<input type="text" class="form-control" name="login" placeholder="Insert your login">
	      		</div>
	      		<div class="form-group">
	    		    <label>Password: </label>
	       			<input type="password" class="form-control" name="password" placeholder="********">
	      		</div>
	      			<input type="hidden" name="action" value="Login">
	      			<button type="submit" class="btn btn-primary my-btn">Log in</button>
	      		<div class="signUpButton">
	      			<label>Don't have an account?</label>
	      			<a href="/companies-manager/input?action=SignUpForm" class="text">Sign Up</a>
	      		</div>   			
	    	</form>
	    </div>
	 </div>
</body>
</html>


