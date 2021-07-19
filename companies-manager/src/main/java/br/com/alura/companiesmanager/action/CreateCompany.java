package br.com.alura.companiesmanager.action;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.companiesmanager.model.Company;
import br.com.alura.companiesmanager.model.Database;


public class CreateCompany  implements Action {

	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("Creating new company...");
		
		String companyName = request.getParameter("name");
		String paramHeadquarter = request.getParameter("headquarter");
		String paramFounded = request.getParameter("founded");
		String paramEmployees = request.getParameter("employees");
		
		Date founded = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			founded = sdf.parse(paramFounded);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Company company = new Company ();
		company.setName(companyName);
		company.setHeadquarter(paramHeadquarter);
		company.setFounded(founded);
		company.setEmployees(paramEmployees);
		
		Database database = new Database();
		database.add(company);
		
		request.setAttribute("company", company.getName());
		
		return "redirect:input?action=CompaniesList";
	
	}
}