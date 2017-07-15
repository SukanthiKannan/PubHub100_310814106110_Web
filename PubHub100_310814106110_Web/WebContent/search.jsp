<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Books</title>
</head>
<body>
<table>
<table border="2">
		<thead>
			<tr>
				<th>id</th>
				<th>book_name</th>
				<th>author</th>
				<th>price</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach var="books" items="${books}">
				<tr>
					<td>${books.id}</td>
					<td>${books.bookName}</td>
					<td>${books.author}</td>
					<td>${books.price}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>