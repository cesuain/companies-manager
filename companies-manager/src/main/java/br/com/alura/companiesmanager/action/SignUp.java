package br.com.alura.companiesmanager.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.companiesmanager.model.User;
import br.com.alura.companiesmanager.model.Database;


public class SignUp implements Action{

	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("Creating new user...");
		
		String paramName = request.getParameter("name");
		String paramLogin = request.getParameter("login");
		String paramPassword = request.getParameter("password");
		
		User user = new User ();
		user.setName(paramName);
		user.setLogin(paramLogin);
		user.setPassword(paramPassword);
		
		Database database = new Database();
		database.add(user);
		
		request.setAttribute("user", user.getName());
		
		return "redirect:input?action=LoginForm";
	
	}
}