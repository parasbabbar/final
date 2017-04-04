<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Dressup</title>
  <meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link href="<c:url value="/resources/home.css" />" rel="stylesheet" type="text/css">
  
  
<style>

body {
      font: 400 15px Comic-Sans, sans-serif;
      line-height: 1.8;
      color: #818181;
      
  }    
jumbotron {
	 
      
    height:50 %;
width:auto;      
 
} 
 
</style>
</head>


<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60">
<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="index" method="GET">Dressup</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
      <li><a href="${pageContext.request.contextPath}/homey">HOME</a></li>
        <li><a href="${pageContext.request.contextPath}/aboutus">ABOUT</a></li>
        <li><a href="${pageContext.request.contextPath}/home">MENU</a></li>
	
		<c:choose>
    <c:when test="${sessionScope.email != null}">
 <li><a href="${pageContext.request.contextPath}/logout" method="get"><span class="glyphicon glyphicon-user"></span> Logout</li></a> 
        <br />
    </c:when>    
    <c:otherwise>
      <li><a href="${pageContext.request.contextPath}/login" method="GET"><span class="glyphicon glyphicon-log-in"> Login </a>  </li>
	  <li><a href="${pageContext.request.contextPath}/register" method="GET"> <span class="glyphicon glyphicon-user">Signup</a> </li>
        <br />
    </c:otherwise>
</c:choose>
		 <li><a href="${pageContext.request.contextPath}/cart" ><span class="glyphicon glyphicon-shopping-cart" style="font-size:20px"></span></a></li>
		
		</ul>
    </div>
  </div>
</nav> 




<div id="bg-fade-carousel" class="carousel slide carousel-fade" data-ride="carousel">
<!-- Wrapper for slides -->
    <div class="carousel-inner">
        <div class="item active">
            <div class="slide1"><img style="margin-left:162px" src="<c:url value="/resources/slide5.jpg"/>"></div>
        </div>
        <div class="item">
            <div class="slide2"><img style="margin-left:162px" src="<c:url value="/resources/slide2.jpg"/>"></div>
        </div>
        <div class="item">
            <div class="slide3"><img style="margin-left:162px" src="<c:url value="/resources/slide3.jpg"/>"></div>
        </div>
    </div><!-- .carousel-inner --> 
    </div>
<div  class="container-fluid text-center">
 <h1>Bring Style to your life </h1>
        <p class="lead"> Welcome to Dressup.com! The best place for latest fashion trends</p>
 <h2>HOW IT WORKS</h2>
  
  <div class="row slide">
    <div class="col-sm-4">; ;
       <img src="<c:url value="/resources/menu.jpg"/>" class="img-responsive" alt="menu" width="100" height="200" style="margin:auto;" >
      <h4 style ="text-align:center">Select your cloth</h4> 
    </div>
    <div class="col-sm-4">
       <img src="<c:url value="/resources/customize.jpg"/>" class="img-responsive" alt="customize order" width="100" height="100" style="margin:auto;">
      <h4 style ="text-align:center">Select your size</h4>
    </div>
	<div class="col-sm-4">
       <img src="<c:url value="/resources/cart.png"/>" class="img-responsive" alt="cart" width="100" height="100" style="margin:auto;">
      <h4 style ="text-align:center">Save and place order</h4>
    </div>
    </div>
    
  </div>
 
 
 
<!-- Container (Portfolio Section) -->
  
  <h2 style ="text-align:center"> What our customers say</h2>
  <div id="myCarousel" class="carousel slide text-center" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div id="reviews" class="carousel-inner" role="listbox">
      <div class="item active">
        <h4>"The quality of shoes was just amazing. 100% genuine leather WOW."<br><span style="font-style:normal;">Jane Shindings,Boston</span></h4>
      </div>
      <div class="item">
        <h4>"The Dress fits me perfectly.Such great description of size"<br><span style="font-style:normal;">Ashley John,NY</span></h4>
      </div>
      <div class="item">
        <h4>"It's amazing the website showed five days of delivery but delivered in just 2."<br><span style="font-style:normal;">Shonda Pearson,California</span></h4>
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
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
		<ul class="menu" >
        <li><a href="${pageContext.request.contextPath}/Terms" method="GET">Terms and Conditions</a></li>
        <li><a href="${pageContext.request.contextPath}/Login" method="GET">My Account</a></li>
		</ul>
    </div>
	<p style= "margin-left:900px">Contact us and we'll get back to you within 24 hours.</p>
      <p style= "margin-left:900px"><span class="glyphicon glyphicon-map-marker"></span> Delhi, India</p>
      <p style= "margin-left:900px"><span class="glyphicon glyphicon-phone"></span><a href="tel:+00 1515151515">+91 9013524517</a></p>
      <p style= "margin-left:900px"><span class="glyphicon glyphicon-envelope"></span><a href="mailto:contact@dressup.com"> contact@dressup.com </a></p>
    <p style= "margin-left:495px">&copy; 2016 Dressup.com. All rights reserved </p>

	
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