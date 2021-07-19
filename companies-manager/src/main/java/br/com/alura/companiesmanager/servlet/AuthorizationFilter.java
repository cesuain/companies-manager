package br.com.alura.companiesmanager.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AuthorizationFilter implements Filter {
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {}
	
	@Override
	public void destroy() {}

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		String paramAction = request.getParameter("action");
		
		HttpSession session = request.getSession();
		boolean signUp = paramAction.equals("SignUp") || paramAction.equals("SignUpForm");
		boolean userIsNotConnected = (session.getAttribute("userConnected") == null);
		boolean actionProtected = !(paramAction.equals("Login") || paramAction.equals("LoginForm"));
		
		if(userIsNotConnected && actionProtected && !signUp) {
			response.sendRedirect("input?action=LoginForm");
			return;
		}
		
		chain.doFilter(request, response);
	}

	
}
