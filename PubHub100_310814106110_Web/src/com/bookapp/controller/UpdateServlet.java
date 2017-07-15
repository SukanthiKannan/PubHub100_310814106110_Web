package com.bookapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.dao.BooksDAO;
import com.bookapp.model.Books;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		int id = Integer.parseInt(request.getParameter("id"));
		int price = Integer.parseInt(request.getParameter("price"));

		Books books = new Books();
		books.setId(id);
		books.setPrice(price);

		BooksDAO dao = new BooksDAO();
		dao.update(books);
		response.sendRedirect("success.jsp");

	}


}
