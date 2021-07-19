package br.com.alura.companiesmanager.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.companiesmanager.action.Action;


public class InfoInput extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String paramAction = request.getParameter("action");
		
		String className = "br.com.alura.companiesmanager.action." + paramAction;
		
		String name;
		
		try {
			Class c = Class.forName(className);
			Action action = (Action) c.newInstance();
			name = action.run(request,response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}
		
		String[] typeAndAddress = name.split(":");
		if(typeAndAddress[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + typeAndAddress[1]);
			rd.forward(request, response);
		} else {
			response.sendRedirect(typeAndAddress[1]);
		}
		
	}

}
