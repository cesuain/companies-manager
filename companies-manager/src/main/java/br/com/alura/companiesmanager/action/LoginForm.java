package br.com.alura.companiesmanager.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginForm implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		return "forward:formLogin.jsp";
	}

}
