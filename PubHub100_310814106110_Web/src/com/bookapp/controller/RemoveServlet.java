package com.bookapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.dao.BooksDAO;
import com.bookapp.model.Books;

@WebServlet("/RemoveServlet")
public class RemoveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RemoveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		String name = request.getParameter("name");
		int id = Integer.parseInt(request.getParameter("id"));

		Books books = new Books();
		books.setBookName(name);
		books.setId(id);

		BooksDAO dao = new BooksDAO();
		dao.delete(books);
		response.sendRedirect("success.jsp");


		doGet(request, response);
	}

}
