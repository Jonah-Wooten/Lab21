<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link
    href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
    rel="stylesheet"
    integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
    crossorigin="anonymous">
</head>

<body>
<h1> Welcome To The CoffeeShop App</h1>
<a href="/Reg">User Registration</a>

<table>
<thead>
<th> Item</th>
<th>Description </th>
<th>Price </th>
</thead>
<tbody>
<c:forEach var ="tElement" items = "${Items}">
<tr>
<td> ${tElement.itemname}</td>
<td> ${tElement.description}</td>
<td> $${tElement.price}</td>

</tr>

</c:forEach>
</tbody>
</table>

</body>
</html>