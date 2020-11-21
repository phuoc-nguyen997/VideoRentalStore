<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh Sách Tin Tức</title>
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


		<div class="w3-container">
			<table class="w3-table w3-striped">
				<tr>
					<th>CustomerID</th>
					<th>Name</th>
					<th>Address</th>
					<th>Phone</th>
					<th>Mail</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
				<c:forEach var="ct" items="${listCustomer }">
					<tr>
						<td>${ct.idCustomer}</td>
						<td>${ct.customerName}</td>
						<td>${ct.address}</td>
						<td>${ct.phone}</td>
						<td>${ct.mail}</td>
						<td><a href="${pageContext.request.contextPath}/edit" >Edit</a>
						<td><a href="${pageContext.request.contextPath}/delete" >Delete</a>
					</tr>
				</c:forEach>
			</table>
		</div>

	</section>
	<footer>
		<jsp:include page="_footer.jsp"></jsp:include>
	</footer>
</body>
</html>