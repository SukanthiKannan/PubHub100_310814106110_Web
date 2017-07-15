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

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		Users users = new Users();

		users.setEmail(email);
		users.setPassword(password);

		UsersDAO dao = new UsersDAO();

		boolean flag = dao.login(users);
		if (flag) {
			response.sendRedirect("success.jsp");
		} else {
			response.sendRedirect("failure.jsp");
		}
		
		doGet(request, response);
	}



}
