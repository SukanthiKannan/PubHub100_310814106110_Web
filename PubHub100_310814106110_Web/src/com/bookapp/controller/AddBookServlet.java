package com.bookapp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.dao.BooksDAO;
import com.bookapp.model.Books;

@WebServlet("/AddBookServlet")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("name");
		String author = request.getParameter("author");
		int price = Integer.parseInt(request.getParameter("price"));

		Books books = new Books();
		books.setBookName(name);
		books.setAuthor(author);
		books.setPrice(price);

		BooksDAO dao = new BooksDAO();
		dao.addBook(books);
		System.out.println("Book Successfully Added");
		response.sendRedirect("success.jsp");

}
}