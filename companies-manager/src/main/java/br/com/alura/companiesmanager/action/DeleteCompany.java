package br.com.alura.companiesmanager.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.companiesmanager.model.Database;

public class DeleteCompany  implements Action {

	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("Deleting company...");
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Database database = new Database();
		database.deleteCompany(id);
		
		return "redirect:input?action=CompaniesList";
	
	}
}