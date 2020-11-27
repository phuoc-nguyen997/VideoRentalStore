<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/html">
<head>
<meta charset="UTF-8">
<title>Danh Sách Title</title>
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



		<c:forEach var="tl" items="${listType}">
			<li>Type: ${tl.nameType} <br>Rental Period:
				${tl.rentalPeriod} <br>Price: ${tl.price} <br>Fine:
				${tl.fine}
			</li>

			<div class="w3-container">
				<table class="w3-table w3-striped">
					<tr>
						<th>TitileID</th>
						<th>Tile Name</th>
						<th>Image</th>
						<th>Description</th>
						<th>Edit</th>
						<th>Delete</th>
					</tr>
					<c:forEach var="tt" items="${tl.dsTitle }">
						<tr>
							<td>${tt.idTitle}</td>
							<td>${tt.titleName}</td>
							<td><img src="${tt.image_url}" alt="image_url"
								style="width: 50px; height: 60px"></td>
							<td>${tt.description}</td>
							<td><a href="${pageContext.request.contextPath}/editTitle">Edit</a>
							<td><a href="${pageContext.request.contextPath}/deleteTitle">Delete</a>
						</tr>
					</c:forEach>
				</table>
			</div>
		</c:forEach>



	</section>


	<footer>
	
	</footer>
</body>
</html>