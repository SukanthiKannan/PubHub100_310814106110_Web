package com.bookapp.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.dao.UsersDAO;
import com.bookapp.model.Users;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
	
		Users users=new Users();
		users.setUserName(name);
		users.setEmail(email);
		users.setPassword(password);
		
		UsersDAO dao=new UsersDAO();
		dao.register(users);
	}	
		


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
	
		Users users=new Users();
		users.setUserName(name);
		users.setEmail(email);
		users.setPassword(password);
		
		UsersDAO dao=new UsersDAO();
		dao.register(users);
		response.sendRedirect("success.jsp");
		//response.sendRedirect("login.jsp");
		
		
		}


}
