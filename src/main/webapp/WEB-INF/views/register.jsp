<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
    


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<META http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>Register User
</title>
<link rel="stylesheet" href="<c:url value="/resources/blueprint/screen.css" />" type="text/css" media="screen, projection">
<link rel="stylesheet" href="<c:url value="/resources/blueprint/print.css" />" type="text/css" media="print">
<!--[if lt IE 8]>
	<link rel="stylesheet" href="<c:url value="/resources/blueprint/ie.css" />" type="text/css" media="screen, projection">
<![endif]-->
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link href="<c:url value="/resources/home.css"/>" rel="stylesheet" type="text/css">
  <script src="http://crypto-js.googlecode.com/svn/tags/3.1.2/build/rollups/sha3.js"></script>
  <script src="<c:url value="/resources/modalValidation.js"/>"></script>

<style>

body {
      font: 400 15px Comic-Sans, sans-serif;
      line-height: 1.8;
      color: #818181;
} 
 
</style> 
</head>
  <body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60">
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60">
<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="${pageContext.request.contextPath}/home" method="GET">Dressup</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
      <li><a href="${pageContext.request.contextPath}/homey">HOME</a></li>
        <li><a href="${pageContext.request.contextPath}/aboutus">ABOUT</a></li>
        <li><a href="${pageContext.request.contextPath}/home">MENU</a></li>
	 <li><a href="${pageContext.request.contextPath}/careers">Careers</a></li>
      
		<c:choose>
    <c:when test="${sessionScope.email != null}">
 <li><a href="${pageContext.request.contextPath}/logout" method="get"><span class="glyphicon glyphicon-user"></span> Logout</li></a> 
   
    </c:when>    
    <c:otherwise>
      <li><a href="${pageContext.request.contextPath}/login" method="GET"><span class="glyphicon glyphicon-log-in"> Login </a>  </li>
	  <li><a href="${pageContext.request.contextPath}/register" method="GET"> <span class="glyphicon glyphicon-user">Signup</a> </li>
   
    </c:otherwise>
</c:choose>
		 <li><a href="${pageContext.request.contextPath}/cart" ><span class="glyphicon glyphicon-shopping-cart" style="font-size:20px"></span></a></li>
		
		</ul>
    </div>
  </div>
</nav> 

<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<div class="container" style= "margin-top: 100px">
<div id="feedback">
<div class="main">
  
  <div class="imgcontainer">
        
      </div>
      ${regerrormessage} 
      ${cheat} 
        <form action="register" name="user" modelAttribute="user" autocomplete="on" method="POST" >
	 <div class="form-group">
    <label for="firstname">User Name<b class="txtred">*</b>:</label>
    <input type="text" class="form-control" id="firstname" name="userName" required>
  </div>
	
  <div class="form-group">
     <form action="register" name="user" modelAttribute="user" autocomplete="on" method="POST">
    <label for="regEmail">Email address<b class="txtred">*</b>:</label>
    <input type="email" class="form-control" id="regEmail" name="email" required> <br>
	<span id="emailSpan" class="txtred"> </span>
  </div>
  <div class="form-group">
    <label for="pass">Password<b class="txtred">*</b>:</label>
    <input type="password" class="form-control" id="pass" name="password" required> <br>
	<span id="passSpan" class="txtred"> </span>
  </div>
	  
       
	 <div class="form-group">
    <label for="Address">Address<b class="txtred">*</b>:</label>
    <input type="text" class="form-control" id="firstName" name="address" required>
  </div>
	<input type="submit" />
	
	
</form> 


    

</div>
</div></div>
<br>

<br>
<br>

Characters like >,<,',= are not allowed
<br>
<br>
<br>
<br>
<br>
<br>
<br><!-- Container (Footer Section) -->
<!-- Container (Footer Section) -->
<div  class="container-fluid" style ="background-color:#3c3c3c; color:black">
  
  <div class="row ">
    <div class="col-xs-6 col-sm-2 text-align:"left">
		<ul class="menu">
		<li><a href="${pageContext.request.contextPath}/homey">HOME</a></li>
        <li><a href="${pageContext.request.contextPath}/aboutus" method="GET">About</a></li>
        <li><a href="${pageContext.request.contextPath}/home" method="GET">Menu</a></li>
     
		</ul>
    </div>
	<div class="col-xs-6  col-sm-2 text-center">
	</div>
	<p style= "margin-left:900px">Contact us and we'll get back to you within 24 hours.</p>
        <p style= "margin-left:900px"><span class="glyphicon glyphicon-map-marker"></span> Boston, USA</p>
      <p style= "margin-left:900px"><span class="glyphicon glyphicon-phone"></span><a href="">+1 8577636481</a></p>
      <p style= "margin-left:900px"><span class="glyphicon glyphicon-envelope"></span><a href=""> contact@dressup.com </a></p>
     <p style= "margin-left:495px">&copy; 2017 Dressup.com. All rights reserved </p>

	
  </div>
 
<div class="socialDiv" >
	<ul class="social">
    <li><a href="https://twitter.com/dress" title="Twitter" >
		<i class="fa fa-twitter-square fa-2x"  ></i>
        </a></li>
	<li><a href="https://www.facebook.com/dress" title="Facebook"  >
		<i class="fa fa-facebook-square fa-2x" ></i>
        </a></li>
    <li><a href="https://www.instagram.com/dress" title="Instagram" >
		<i class="fa fa-instagram fa-2x"  ></i>
        </a></li>
    <li><a href="https://in.pinterest.com/dress" title="Pinterest" >
		<i class="fa fa-pinterest-square fa-2x"></i>
        </a></li>
	<li><a href="https://www.snapchat.com/dress" title="Snapchat">
		<i class="fa fa-snapchat-square fa-2x" ></i>
        </a>
	</li>
  </ul>
</div>


</body>
</html>