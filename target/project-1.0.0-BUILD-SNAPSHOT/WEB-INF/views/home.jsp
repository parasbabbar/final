<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dressup.com Menu</title>
    
    <!-- Google Fonts -->
    <link href='https://fonts.googleapis.com/css?family=Tangerine' rel='stylesheet' type='text/css'>        
    <link href='https://fonts.googleapis.com/css?family=Prata' rel='stylesheet' type='text/css'>
    


  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link href="<c:url value="/resources/home.css"/>" rel="stylesheet" type="text/css">
  


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
            <div class="slide8"><img src="<c:url value="/resources/slide2.jpg"/>"></div>
        </div>
        
          </div><!-- .carousel-inner --> 
    
</div>
<div class="container">
      <div class="row">
        <div class="col-md-12">
              <ul class="nav nav-tabs mu-restaurant-menu">
                <li class="active"><a href="#breakfast" data-toggle="tab">Our Catalogue</a></li>
                
              </ul>

              <!-- Tab panes -->
                <div class="tab-pane fade in active" id="breakfast">
                    <div class="row">
        
		<!--left side--> 

				<div class="col-md-6">
					  

                        <div class="mu-tab-content-left">
                          <ul class="mu-menu-item-nav" "read-more-wrap">
                         
                         
                         
                      <c:if test="${!empty itemlist}">
                            	<c:forEach items="${itemlist}" var="item">
                            
                            <li>
                              <div class="media">
                                <div class="media-left">
                                  <a href="${pageContext.request.contextPath}/items/${item.itemname}" method="GET">
                                    <img class="media-object" src="<c:url value="${item.itemloc}"/>" alt="img" width="110px" height="110px">
                                  </a>
                                </div>
                                <div class="media-body">
                                  <h4 class="media-heading"><a href="${pageContext.request.contextPath}/items/${item.itemname}" method="GET">${item.itemname}</a></h4>
                                  <span class="mu-menu-price">$ ${item.itemcost}</span>
                                  </div>
                                  <a href="${pageContext.request.contextPath}/items/${item.itemname}" method="GET"><button type="button" >Buy Now</button></a>
                              </div>
                            </li>
    						</c:forEach>
    						</c:if>
                          
                          
                          </ul> 
 						  
                        </div>
                      </div>
                                </div>
                                </div>
                              </div>
                            </li>
                          </ul>
 									  
                       </div>
                     </div>
                     
            </div>
				   
        </div>
     </div>
   </div> 
				</div>
              
            
  <!-- End Menu -->
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