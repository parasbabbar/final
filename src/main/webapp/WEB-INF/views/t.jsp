<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html">
<title>Terms and conditions</title>
  <meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link href="<c:url value="/resources/home.css" />" rel="stylesheet" type="text/css">
  <link href="<c:url value ="/resources/stuck.css"/>" rel="stylesheet" type="text/css">
 

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

<center>
<h3 style="margin-top:100px"><font size="14"face="Times New Roman"color="brown"> Dressup.com</font></h3>

<article align="left"> <a href="#">Privacy Policy | <a href="#terms & condition">Terms & Conditions</a></article>
<hr>
<h3><p align="lefts"><strong>Privacy Policy</strong></p> <br></h3><br>

<p align="left">
This Privacy Statement ("Statement") applies to the website located at Dressup.com.com, US market, and any other websites owned and<br> 
operated by Dressup.com that direct the viewer or user to this Statement.</br>
</p>

<h4 align="center">Information We Collect</h4>
<p align="left">As you use our services, we collect certain information about you and the services you use.
 The information we collect falls into three different categories: 
 (1) information you give us; <br>
 (2) information we collect from you automatically when you use our services; and <br>
 (3) information we collect from other sources. <br>
<h2 align="left">Information You Give Us</h2><br>
<p align="left">We collect information you give us when you use our services.<br>
 Some examples of using our "services" are when you visit one of our stores, visit one of our websites,  buy a gift card online, or participate in a survey or promotion.
<br> The information you give us may include your first or last name, username, password, email address, postal address, phone number, financial account information such as a credit card number, birthday, city of birth, demographics information,<br>
 and any other information you choose to give us. 
 </p>
 
 
<h4 align = "left"> Information We Collect When You Use Our Services </h4>
<p align= "left">When you use our services, we may collect information about the services you use and how you use them.<br></p>
<p align="left"> This information includes:<br> 
1. Purchasing Information: We may collect information about the products you buy, including where you buy products, how frequently you buy products, and the rewards earned due to a purchase. <br>
2. Device and Website Use Information: When you install one of our mobile applications or use a computer, tablet, smart phone or other device to access our websites or purchase products or services via our online properties,<br>
 we may collect information about the device and how you use it. 
This information may include the type of device, your operating system, your browser (for example, whether you used Internet Explorer, Firefox, Safari, Chrome or another browser),<br>
 your internet service provider, your domain name, your internet protocol (IP) address, your device identifier (or UDID), the date and time that you accessed our service, the website that referred you to our website,<br>
 the web pages you requested, the date and time of those requests, and the subject of the ads you click or scroll over.<br>
 To collect this information, we use cookies, web beacons and similar technologies. Read more about cookies, web beacons and similar technologies. <br></p>

 

<span id ="terms & condition">  
<h3 align="left">Terms & Conditions</h3>

<article align="left" font size="15"><strong> TERMS & CONDITIONS </font></strong> </article>
<h4>PLEASE READ THESE TERMS OF USE CAREFULLY.</h4>
<p align="left"> BY ACCESSING OR USING THIS WEBSITE, YOU AGREE TO BE BOUND BY THE TERMS DESCRIBED HEREIN AND ALL TERMS INCORPORATED BY REFERENCE.<br>
<p align ="left">IF YOU DO NOT AGREE TO ALL OF THESE TERMS, DO NOT USE THIS WEBSITE.<br>
These Terms of Use apply to your access to, and use of, all or part of any website or mobile application of Dressup.com Corporation or its subsidiaries and
<br> affiliated companies (collectively, “Dressup.com”), including Dressup.com.com, mydress.comidea.com, digital.dressup.com.com, dressup.comcoffeegear.com, store.dressup.com.com and any other site, mobile application or online service where these Terms of Use are posted (collectively, the “Sites”).
<br> These Terms of Use do not alter in any way the terms or conditions of any other agreement you may have with Dressup.com for products, services or otherwise. 
<br> This agreement contains disclaimers and other provisions that limit our liability to you.
<br>In the event there is any conflict or inconsistency between these Terms of Use and any other terms of use that appear on the Sites, these Terms of Use will govern.
<br> However, if you navigate away from the Sites to a third party site, you may be subject to alternative terms and conditions of use, as may be specified on such site, which will govern your use of that site.
<br>While we make reasonable efforts to provide accurate and timely information about Dressup.com Corporation on the Sites, you should not assume that the information is always up to date or that the Sites contain all the relevant information available about Dressup.com. 
<br>In particular, if you are making an investment decision regarding Dressup.com, please consult a number of different sources, including Dressup.com filings with the Securities and Exchange Commission.<br> 
Dressup.com reserves the right to change or modify these Terms of Use or any policy or guideline of the Sites, at any time and in its sole discretion.
<br> If we make material changes to these Terms of Use, we will inform you by posting a notice on the Site(s). 
<br>Any changes or modifications will be effective immediately upon posting the revisions to the Sites, and you waive any right you may have to receive specific notice of such changes or modifications. 
<br>Your continued use of the Sites will confirm your acceptance of such changes or modifications; therefore, you should frequently review these Terms of Use and applicable policies to understand the terms and conditions that apply to your use of our Sites. 
<br>If you do not agree to the amended terms, you must stop using the Sites. 

<h4>Eligibility, Registration and Account</h4>
<p align="left">The Sites are not targeted towards, nor intended for use by, anyone under the age of 13.YOU MUST BE AT LEAST AGE 13 TO ACCESS AND USE THE SITES. 
<br>If you are between the ages of 13 and 18, you may only use the Sites under the supervision of a parent or legal guardian who agrees to be bound by these Terms of Use. <br>
In order to participate in certain areas of our Sites, you will need to register for an account.
<br> You agree to (a) create only one account;<br> (b) provide accurate, current and complete information when creating your account;<br> 
(c) maintain and promptly update your account information;<br> 
(d) maintain the security of your account by not sharing your password with others and restricting access to your account and your computer; <br>
(e) promptly notify Dressup.com if you discover or otherwise suspect any security breaches relating to the Sites; and <br>
 (f) take responsibility for all activities that occur under your account and accept all risks of unauthorized access.</p>
</p>

<h3 align= "left">PRIVACY</h3>
<p align="left">Please read the Privacy Policy carefully to understand how Dressup.com collects, uses and discloses personally identifiable information from its users. <br>
By accessing or using the Sites, you consent to all actions that we take with respect to your data consistent with our Privacy Policy.</p>

<h3 align="left">Terms of Sale</h3>
<p align="left">All sales from the Sites are governed by Masaala.com Terms of Sale. 
Please refer to our Terms of Sale for the terms, conditions and policies applicable to your purchase of products from Dressup.com.<br>
 By ordering products through our Sites, you agree to be bound by and accept the Terms of Sale.<br>
  The Terms of Sale are subject to change without prior notice at any time, in Dressup.com' sole discretion, so you should review the Terms of Sale each time you make a purchase.</p>


<h3 align="left">Site Disclaimer</h3>
<p align ="left">The materials and information on the Sites may include technical inaccuracies or typographical errors.<br>
<br> The materials, information and services on the Sites are provided “as is” without any conditions, warranties or other terms of any kind.
<br> Accordingly, to the maximum extent permitted by applicable law, Masaala.com disclaims all other warranties, express or implied, including, without limitation, implied warranties of merchantability, fitness for a particular purpose, title, availability, that the Sites and Site Materials are free from viruses,
<br> and non-infringement as to the Sites and the information, content and materials contained therein.</p>
<h3 align="left">Copyright and Limited License</h3>
<p align="left">Unless otherwise indicated, the Sites and all content and other materials therein, including, without limitation, the dressup.com logo and all designs, text, graphics, pictures, information, data, software, sound files,
<br> other files and the selection and arrangement thereof (collectively, "Site Materials") are the proprietary property of dressup.com or its licensors or users and are protected by U.S. and international copyright laws.<br> 
You are granted a limited, non-sublicensable license to access and use the Sites and Site Materials for personal, informational and shopping purposes only.<br> 
Such license is subject to the Terms of Use and does not include:<br> (a) any resale or commercial use of the Sites or Site Materials; <br>(
b) the collection and use of any product listings, pictures or descriptions;<br> (c) the distribution, public performance or public display of any Site Materials; 
<br>(d) modifying or otherwise making any derivative uses of the Sites and the Site Materials, or any portion thereof;
<br> (e) use of any data mining, robots or similar data gathering or extraction methods;
<br> (f) downloading (other than the page caching) of any portion of the Sites, the Site Materials or any information contained therein, except as expressly permitted on the Sites; or 

<h3 align="left">Digital Millennium Copyright Act (<q>DMCA</q>) Notice</h3>
<p align="left">If you believe any material available via the Sites infringes a copyright you own or control,
 you may file a notification of such infringement with our Designated Agent as set forth below.</p>
</p><br>

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