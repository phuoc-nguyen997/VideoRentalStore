<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/html">
<head>
<meta charset="UTF-8">
<title>List DVD</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style type="text/css">
body {
	width: 80%;
	border: 1px solid black;
}

header {
	width: 100%;
	height: auto;
	border-bottom: 1px solid black;
	text-align: center;
}

nav {
	width: 100%;
	height: auto;
	border-bottom: 1px solid black;
	text-align: center;
}

section {
	width: 100%;
	height: 500px;
	border-bottom: 1px solid black;
	text-align: left;
}

footer {
	width: 100%;
	height: auto;
	border-bottom: 1px solid black;
	text-align: center;
}

a {
	color: black;
}
</style>
</head>
<body>
	<header>
		<jsp:include page="_header.jsp"></jsp:include>
	</header>
	<nav>
		<jsp:include page="_menu.jsp"></jsp:include>
	</nav>


	<section>



		<c:forEach var="tt" items="${listTitle}">
			<li>Title: ${tt.titleName}</li>

			<div class="w3-container">
				<table class="w3-table w3-striped">
					<tr>
						<th>DVD_ID</th>
						<th>Create Date</th>
						<th>Status</th>
						<th>Edit</th>
						<th>Delete</th>
					</tr>
					<c:forEach var="dvd" items="${tt.listDVD}">
						<tr>
							<td>${dvd.idDVD}</td>
							<td>${dvd.createDate}</td>
							<td>${dvd.status}</td>
							<td><a href="${pageContext.request.contextPath}/editDVD">Edit</a>
							<td><a href="${pageContext.request.contextPath}/deleteDVD">Delete</a>
						</tr>
					</c:forEach>
				</table>
			</div>
		</c:forEach>



	</section>


	<footer> </footer>
</body>
</html>