package com.bookapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.dao.BooksDAO;
import com.bookapp.model.Books;

@WebServlet("/FindServlet")
public class FindServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FindServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String name = request.getParameter("name");
		
		Books books = new Books();
		books.setBookName(name);
		System.out.println(name);
		
		BooksDAO dao = new BooksDAO();
		List<Books> books1 = dao.findByName(books);
		System.out.println(books1.size());
		
		if (books1.size() > 0) {
			RequestDispatcher rd = request.getRequestDispatcher("search.jsp");
			request.setAttribute("books", books1);
			rd.forward(request, response);
		} else {
			response.sendRedirect("failure.jsp");
		}
	}

}
