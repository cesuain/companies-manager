<%@ page import="java.util.List,br.com.alura.companiesmanager.model.Company"%>
<%@ page import="java.util.List,br.com.alura.companiesmanager.model.User"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<html>
<head>
	<meta charset="UTF-8">
	<title>Company list - Companies Manager</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous"/> 
	<style><%@include file="/WEB-INF/css/style.css"%></style>
</head>
<body>
	<div class="container h-100 d-flex justify-content-center">
	<c:import url="header.jsp" />
	    <div class="app-bg my-auto border rounded">
	    	<div class="row table-tittle">
			    <div class="col">
			    	<h1>Company list</h1>
			    </div>
			    <div class="col add-company">
			    	<a href="/companies-manager/input?action=NewCompanyForm" class="text-primary">+ Add company</a>
			    </div>
		    </div>
	    	<table class="table">
				<thead>
			    	<tr>
					    <th scope="col">ID</th>
					    <th scope="col">Comapany Name</th>
					    <th scope="col">Headquarter</th>
					    <th scope="col">Founded</th>
					    <th scope="col">Employees</th>
					    <th scope="col"></th>
					    <th scope="col"></th>
			   	 	</tr>
			  	</thead>
				<tbody>
			    	<c:forEach items="${companies}" var="company">	
				    	<tr>	
						    <td>${company.id}</td>
						    <td>${company.name}</td>
						    <td>${company.headquarter}</td>
						    <td><fmt:formatDate value="${company.founded}" pattern="dd/MM/yyyy"/></td>
						    <td>${company.employees}</td>
						    <td><a href="/companies-manager/input?action=ReadCompany&id=${company.id}" class="text-primary">Edit</a></td>
						    <td><a href="/companies-manager/input?action=DeleteCompany&id=${company.id}" class="text-danger">Delete</a></td>
						</tr>
			    	</c:forEach>
				</tbody>   
			</table>
	    </div>
	 </div>
</body>
</html>