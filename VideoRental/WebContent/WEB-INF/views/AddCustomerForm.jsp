<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
  </head>
  <body>
    <h2>Customer Information</h2>
    <form class="" action="insertCustomer" method="post">
      <table border="0">
        <tr>
          <td>Customer name: </td>
          <td><input type="text" name="customerName" value=""></td>
        </tr>
        <tr>
          <td>Phone number: </td>
          <td><input type="tel" name="phone" value=""></td>
        </tr>
        <tr>
          <td>E-mail: </td>
          <td><input type="email" name="email" value=""></td>
        </tr>
        <tr>
          <td>Address: </td>
          <td><input type="text" name="cusName" value=""></td>
        </tr>
      </table>
      <input type="submit" name="" value="Add">
    </form>
  </body>
</html>
