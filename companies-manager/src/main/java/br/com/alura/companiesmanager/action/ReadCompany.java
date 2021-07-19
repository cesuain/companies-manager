package br.com.alura.companiesmanager.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.companiesmanager.model.Company;
import br.com.alura.companiesmanager.model.Database;

public class ReadCompany implements Action{

	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Showing companies");
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Database database = new Database();
		Company company = database.getCompanyById(id);
		
		request.setAttribute("company", company);
		
		return "forward:updateCompanyForm.jsp";
	}
}