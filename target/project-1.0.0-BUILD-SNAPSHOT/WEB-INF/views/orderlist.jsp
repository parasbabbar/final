<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Orderlist of users</title>
</head>
<body>
Welcome ${email} 
	<div class="span-12 last">    <c:if test="${sessionScope.email != null}">
<a href="logout" method="get">logout</a> 
        <br />
    </c:if>    

<c:if test="${!empty orderlist}">
			<table>
			<tr>
<th>User Email</th>

<th>Address</th>
<th>Itemname</th>
<th>Quantity ordered</th>
<th>Total</th>
 </tr>
			
				<c:forEach items="${orderlist}" var="order">
					
				<tr>
						<td>${order.email}</td>
						<td>${order.address}</td>
						<td>  ${order.itemname}</td>
						<td>${order.quantity}</td>
						<td>  ${order.subtotal}</td>
					</tr>
				</c:forEach>
			</table>
		</c:if>

</body>
</html>