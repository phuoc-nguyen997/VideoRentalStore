
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
  </head>
  <body>
    <h2>Title Information</h2>
      <form class="" action="insertTitle" method="post">
        <table border="0">
          <tr>
            <td>Title name: </td>
            <td><input type="text" name="titleName" value=""></td>
          </tr>
          <tr>
            <td>Image URL: </td>
            <td><input type="text" name="imgUrl" value=""></td>
          </tr>
          <tr>
            <td>Description: </td>
            <td><input type="text" name="description" value=""></td>
          </tr>
          <tr>
          	
					<td>DVD Type</td>
					<td>
					<select name="DVDType">
						<c:forEach var="_type" items="${listType}">
							<option value="${_type.idType}">
							
							<c:out
									value="${_type.nameType}"></c:out></option>
						</c:forEach>
					</select>
					</td>
					<td>
          </tr>
        </table>
        <input type="submit" name="" value="Add">
      </form>
  </body>
</html>
