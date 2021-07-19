<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/input" var="linkInputServlet"/>


<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Edit a company - Companies Manager</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous"/> 
	<style><%@include file="/WEB-INF/css/style.css"%></style>
</head>
<body>
	<div class="container h-100 d-flex justify-content-center">
		<c:import url="header.jsp" />
		    <div class="app-bg my-auto border rounded">
		    	<h1 class="table-tittle">Edit</h1>
		        <form action="${linkInputServlet}" method="post">
		        	<input type="hidden" name="id" value="${company.id}">
		      		<div class="form-group">
		    		    <label>Company name</label>
		       			<input type="text" class="form-control" name="name" placeholder="Example Company" value="${company.name}" required>
		      		</div>
		      		<div class="form-group">
		    		    <label>Headquarter</label>
		       			<input type="text" class="form-control" name="headquarter" placeholder="Brazil" value="${company.headquarter}" required>
		      		</div>
		      		<div class="form-group">
		    		    <label>Founded</label>
		       			<input type="text" class="form-control" name="founded" placeholder="01/01/1990" value="<fmt:formatDate value="${company.founded}" pattern="dd/MM/yyyy"/>" required>
		      		</div>
		      		<div class="form-group">
		    		    <label>Number of employees</label>
		       			<input type="text" class="form-control" name="employees" placeholder="500" value="${company.employees}" required>
		      		</div>
		      		<input type="hidden" name="action" value="UpdateCompany">
		      		<button type="submit" class="btn btn-primary my-btn">Edit</button>
		    	</form>
		    </div>
	 </div>
</body>
</html>