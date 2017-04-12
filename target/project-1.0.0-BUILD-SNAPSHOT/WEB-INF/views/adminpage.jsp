<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>adminpage</title>
</head>
<body>
Welcome ${email} 
	<div class="span-12 last">    <c:if test="${sessionScope.email != null}">
<a href="logout" method="get">logout</a> 
        <br />
    </c:if>    
</div>
<br><a href="${pageContext.request.contextPath}/manage" method="GET">additems</a>
<br><a href ="${pageContext.request.contextPath}/orderlist" method="GET">See Orderlists</a>
<br><a href="${pageContext.request.contextPath}/userlist" method="GET" >See List of users </a>
</body>
</html>