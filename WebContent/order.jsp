<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book app</title>
</head>
<body>
<h2>Order books</h2>
<form action="orderservlet">
UserId:<input type="number" name="userid"  autofocus required></br>
Select book:
<select name="bookid" required></br>
<option value="1">c</option>
<option value="2">c++</option>
</select>
<br/>

Quantity:<input type="number" name="quantity" required></br>

<button type="submit"> submit</button>
</form>
</body>
</html>