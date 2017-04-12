<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<META http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>Add items
<link rel="stylesheet" href="<c:url value="/resources/blueprint/screen.css" />" type="text/css" media="screen, projection">
<link rel="stylesheet" href="<c:url value="/resources/blueprint/print.css" />" type="text/css" media="print">
<!--[if lt IE 8]>
	<link rel="stylesheet" href="<c:url value="/resources/blueprint/ie.css" />" type="text/css" media="screen, projection">
<![endif]--></title>
<body>
<div class="container">
	<h1>
		Add new items ${errormessage} 
	</h1>
	Welcome ${email} 
	<div class="span-12 last">    <c:if test="${sessionScope.email != null}">
<a href="logout" method="get">logout</a> 
        <br />
    </c:if>    
<form name="item" modelAttribute="item" action="additem" method="post">
		  	<fieldset>		
				<legend>Additem fields</legend>
				<p>
					itemname:<input type="text" name="itemname">
								
				</p>
				<p>	
					itemloc:<input type="text" name="itemloc">
					
				</p>
				<p>	
					quantity:<input type="number" name="quantity"><br/>
									</p>
				
				<p>	
					itemcost:<input type="number" name="itemcost"><br/>
									</p>
				
				<p>	
				itemdescription:<input type="text" name="itemdescription"><br/>
					<input type="submit" />
				</p>
			
		</form>
</div>
</div>


</body>
</html>