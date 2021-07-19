package br.com.alura.companiesmanager.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.companiesmanager.model.Database;
import br.com.alura.companiesmanager.model.User;

public class Login implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		System.out.println("Loading..." + login);
		
		Database database = new Database();
		User user = database.validateUser(login, password);
		
		if(user != null) {
			System.out.println("This user login already exists ");
			HttpSession session = request.getSession();
			session.setAttribute("userConnected", user);
			return "redirect:input?action=CompaniesList";
		} else {
			return "redirect:input?action=LoginForm";
		}
		
		
	}

}
