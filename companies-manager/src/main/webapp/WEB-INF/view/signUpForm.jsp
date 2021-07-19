<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/input" var="linkInputServlet"/>


<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Sign up - Companies Manager</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous"/> 
	<style><%@include file="/WEB-INF/css/style.css"%></style> 
</head>
<body>
	<div class="container h-100 d-flex justify-content-center">
	    <div class="signUp-bg my-auto border rounded">
	    	<h1 class="table-tittle">Sign up</h1>
	        <form action="${linkInputServlet}" method="post">
	      		<div class="form-group">
	    		    <label>Name</label>
	       			<input type="text" class="form-control" name="name" placeholder="João da Silva" required>
	      		</div>
	      		<div class="form-group">
	    		    <label>Login</label>
	       			<input type="text" class="form-control" name="login" placeholder="joaosilva" required>
	      		</div>
	      		<div class="form-group">
	    		    <label>Password</label>
	       			<input type="password" class="form-control" name="password" placeholder="********" required>
	      		</div>
	      		<input type="hidden" name="action" value="SignUp">
	      		<button type="submit" class="btn btn-primary my-btn">Sign up</button>
	    		<div class="signUpButton">
	      			<label>Have an account?</label>
	      			<a href="/companies-manager/input?action=LoginForm" class="text">Log in</a>
	      		</div>
	    	</form>
	    </div>
	 </div>
</body>
</html>