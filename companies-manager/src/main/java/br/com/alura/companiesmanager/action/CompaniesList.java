package br.com.alura.companiesmanager.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.companiesmanager.model.Company;
import br.com.alura.companiesmanager.model.Database;
import br.com.alura.companiesmanager.model.User;


public class CompaniesList implements Action {
	
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Loading companies...");
		
		Database database = new Database();
		List<Company> companyList = database.getCompanies();
		List<User> userList = database.getUsers();
		
		request.setAttribute("companies", companyList);
		request.setAttribute("users", userList);
		
		return "forward:companiesList.jsp";

	}
	
}