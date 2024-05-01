<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Your Booking </title>
    <!---->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    
    <link href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700,800&display=swap" rel="stylesheet">

    <link rel="stylesheet" href="css/open-iconic-bootstrap.min.css">
    <link rel="stylesheet" href="css/animate.css">
    
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/owl.theme.default.min.css">
    <link rel="stylesheet" href="css/magnific-popup.css">

    <link rel="stylesheet" href="css/aos.css">

    <link rel="stylesheet" href="css/ionicons.min.css">

    <link rel="stylesheet" href="css/bootstrap-datepicker.css">
    <link rel="stylesheet" href="css/jquery.timepicker.css">

    
    <link rel="stylesheet" href="css/flaticon.css">
    <link rel="stylesheet" href="css/icomoon.css">
    <link rel="stylesheet" href="css/style.css">
  <style>
  /* Style the table */
table {
  width: 100%;
  border-collapse: collapse;
}

table, th, td {
  border: 1px solid #ccc;
}

th, td {
  padding: 8px;
  text-align: left;
}

/* Style the table header (the first row) */
table tr:first-child {
  background-color: #1089ff;
  color: #fff;
}

/* Style the alternating rows */
table tr:nth-child(even) {
  background-color: #f2f2f2;
}

/* Style the "Edit booking" button */
a {
  text-decoration: none;
}

input[type="button"] {
  background-color: #4CAF50;
  color: #fff;
  padding: 10px 20px;
  border: none;
  cursor: pointer;
  font-weight: bold;
}

input[type="button"]:hover {
  background-color: #45a049;
}
  </style>
  </head>
<body>
 <body>

    <!--navigation-->
	  <nav class="navbar navbar-expand navbar-dark  bg-dark ftco-navbar-light" id="ftco-navbar">
	    <div class="container">
	      <a class="navbar-brand" href="Home.jsp">VEHI<span>BOOK</span></a>
	     

	      <div >
	        <ul class="navbar-nav ml-auto">
	          <li class="nav-item "><a href="Home.jsp" class="nav-link">Home</a></li>
	          <li class="nav-item"><a href="login.jsp" class="nav-link">Search</a></li>
	          <li class="nav-item"><a href="insertorder.jsp" class="nav-link">Booking</a></li>
	          <li class="nav-item"><a href="insertorder.jsp" class="nav-link">Edit</a></li>
	          <li class="nav-item"><a href="cancelorder.jsp" class="nav-link">Cancel</a></li>
	        </ul>
	      </div>
	    </div>
	  </nav>
    <!-- END nav -->
    <div  style="background-image: url('images/bg_2.jpg');">
      <div class="overlay"></div>
      <div class="container">
        <div class="row no-gutters slider-text justify-content-start align-items-center justify-content-center">
          <div>
            <div class="signup-image">
              <div class="middle"><br>
						<table>
						<c:forEach var ="veh" items="${OrderDetails}">
						 
						<c:set var ="id" value="${veh.vid}"/>
						<c:set var ="p_loc" value="${veh.pploc}"/>
						<c:set var ="d_loc" value="${veh.ddloc}"/>
						<c:set var ="p_da" value="${veh.ppdat}"/>
						<c:set var ="d_da" value="${veh.dddate}"/>
						<c:set var ="s_time" value="${veh.ssize}"/>
						
						  
						<tr>
							<td> Vehicle Id  </td>
							<td>${veh.vid}</td>
						</tr>
						
						<tr>
							<td> Pickup Id  </td>
							<td>${veh.pploc}</td>
						</tr>
						
						<tr>
							<td>DropOff location  </td>
							<td>${veh.ddloc}</td>
						</tr>
						
						<tr>
							<td> Pickup date  </td>
							<td> ${veh.ppdat}</td>
						</tr>
						
						<tr>
							<td> DropOff date   </td>
							<td>${veh.dddate}</td>
						</tr>
						
						<tr>
							<td> Time  </td>
							<td>${veh.ssize}</td>
						</tr>
						
						</c:forEach>
						
						</table>
						
						
						<c:url value="updateord.jsp"  var="booUp">
							<c:param name="id" value="${id}"/>
							<c:param name="ppiloc" value="${p_loc}"/>
							<c:param name="ddloc" value="${d_loc}"/>
							<c:param name="ppda" value="${p_da}"/>
							<c:param name="drda" value="${d_da}"/>
							<c:param name="satime" value="${s_time}"/>
							
						
							
						</c:url>
						<a href="${booUp}">
						<input type="button" name="update" value="Edit booking">
						</a>
					 </div>               
              </div>
              </div>
             
            </div>
          </div>
        </div>
     
 
<!--form-->
     <section >
    	<div class="container">
    		<div class="row no-gutters">
    			<div class="col-md-12	featured-top">
    				<div class="row no-gutters">
	  					<div class="col-md-4 d-flex align-items-center">
	  					
                
	  					</div>
          
	  					</div>
	  				</div>
				</div>
  		</div>
    </section>


    <section class="ftco-section">
    <div class="col-md-8 d-flex align-items-center">
      <div class="services-wrap rounded-right w-100">
        <h3 class="heading-section mb-4">Better Way to Rent Your Perfect Cars</h3>
        <div class="row d-flex mb-4">
          <div class="col-md-4 d-flex align-self-stretch ftco-animate">
            <div class="services w-100 text-center">
              <div class="icon d-flex align-items-center justify-content-center"><span class="flaticon-route"></span></div>
              <div class="text w-100">
                <h3 class="heading mb-2">Choose Your Pickup Location</h3>
              </div>
            </div>      
          </div>
          <div class="col-md-4 d-flex align-self-stretch ftco-animate">
            <div class="services w-100 text-center">
              <div class="icon d-flex align-items-center justify-content-center"><span class="flaticon-handshake"></span></div>
              <div class="text w-100">
                <h3 class="heading mb-2">Select the Best Deal</h3>
              </div>
            </div>      
          </div>
          <div class="col-md-4 d-flex align-self-stretch ftco-animate">
            <div class="services w-100 text-center">
              <div class="icon d-flex align-items-center justify-content-center"><span class="flaticon-rent"></span></div>
              <div class="text w-100">
                <h3 class="heading mb-2">Reserve Your Rental Car</h3>
              </div>
            </div>      
          </div>
        </div>
      </div>
    </div>
    </section>



    
		<section class="ftco-section">
			<div class="container">
				<div class="row justify-content-center mb-5">
          <div class="col-md-7 text-center heading-section ftco-animate">
          	<span class="subheading">Services</span>
            <h2 class="mb-3">Our Latest Services</h2>
          </div>
        </div>
				<div class="row">
					<div class="col-md-3">
						<div class="services services-2 w-100 text-center">
            	<div class="icon d-flex align-items-center justify-content-center"><span class="flaticon-wedding-car"></span></div>
            	<div class="text w-100">
                <h3 class="heading mb-2">Wedding Ceremony</h3>
              </div>
            </div>
					</div>
					<div class="col-md-3">
						<div class="services services-2 w-100 text-center">
            	<div class="icon d-flex align-items-center justify-content-center"><span class="flaticon-transportation"></span></div>
            	<div class="text w-100">
                <h3 class="heading mb-2">City Transfer</h3>
              </div>
            </div>
					</div>
					<div class="col-md-3">
						<div class="services services-2 w-100 text-center">
            	<div class="icon d-flex align-items-center justify-content-center"><span class="flaticon-car"></span></div>
            	<div class="text w-100">
                <h3 class="heading mb-2">Airport Transfer</h3>
              </div>
            </div>
					</div>
					<div class="col-md-3">
						<div class="services services-2 w-100 text-center">
            	<div class="icon d-flex align-items-center justify-content-center"><span class="flaticon-transportation"></span></div>
            	<div class="text w-100">
                <h3 class="heading mb-2">Whole City Tour</h3>
              </div>
            </div>
					</div>
				</div>
			</div>
		</section>

    <!--become Driver-->

		<section class="ftco-section ftco-intro" style="background-image: url(images/bg_3.jpg);">
			<div class="overlay"></div>
			<div class="container">
				<div class="row justify-content-end">
					<div class="col-md-6 heading-section heading-section-white ftco-animate">
            <h2 class="mb-3">Do You Want To Earn With Us? So Don't Be Late.</h2>
           
            <a href="#" class="btn btn-primary btn-lg">Become A Driver</a>
          </div>
				</div>
			</div>
		</section>
	
    
<!--footer-->
    <footer class="ftco-footer ftco-bg-dark ftco-section">
      <div class="container">
        <div class="row mb-5">
          <div class="col-md">
            <div class="ftco-footer-widget mb-4">
              <h2 class="ftco-heading-2"><a href="#" class="logo">VEHI<span>BOOK</span></a></h2>
              <ul class="ftco-footer-social list-unstyled float-md-left float-lft mt-5">
                <li class="ftco-animate"><a href="#"><span class="icon-twitter"></span></a></li>
                <li class="ftco-animate"><a href="#"><span class="icon-facebook"></span></a></li>
                <li class="ftco-animate"><a href="#"><span class="icon-instagram"></span></a></li>
              </ul>
            </div>
          </div>
          <div class="col-md">
            <div class="ftco-footer-widget mb-4 ml-md-5">
              <h2 class="ftco-heading-2">Information</h2>
              <ul class="list-unstyled">
                <li><a href="#" class="py-2 d-block">About</a></li>
                <li><a href="#" class="py-2 d-block">Services</a></li>
                <li><a href="#" class="py-2 d-block">Term and Conditions</a></li>
                <li><a href="#" class="py-2 d-block">Best Price Guarantee</a></li>
                <li><a href="#" class="py-2 d-block">Privacy &amp; Cookies Policy</a></li>
              </ul>
            </div>
          </div>
          <div class="col-md">
             <div class="ftco-footer-widget mb-4">
              <h2 class="ftco-heading-2">Customer Support</h2>
              <ul class="list-unstyled">
                <li><a href="#" class="py-2 d-block">FAQ</a></li>
                <li><a href="#" class="py-2 d-block">Payment Option</a></li>
                <li><a href="#" class="py-2 d-block">Booking Tips</a></li>
                <li><a href="#" class="py-2 d-block">How it works</a></li>
                <li><a href="#" class="py-2 d-block">Contact Us</a></li>
              </ul>
            </div>
          </div>
          <div class="col-md">
            <div class="ftco-footer-widget mb-4">
            	<h2 class="ftco-heading-2">Have a Questions?</h2>
            	<div class="block-23 mb-3">
	              <ul>
	                <li><span class="icon icon-map-marker"></span><span class="text">28 Richard St. Mountain View,Colombo, SriLanka</span></li>
	                <li><a href="#"><span class="icon icon-phone"></span><span class="text">+7 392 3929 210</span></a></li>
	                <li><a href="#"><span class="icon icon-envelope"></span><span class="text">info@yourdomain.com</span></a></li>
	              </ul>
	            </div>
            </div>
          </div>
        </div>
      </div>
    </footer>
    
  

  <!-- loader -->


  <script src="js/jquery.min.js"></script>
  <script src="js/jquery-migrate-3.0.1.min.js"></script>
  <script src="js/popper.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/jquery.easing.1.3.js"></script>
  <script src="js/jquery.waypoints.min.js"></script>
  <script src="js/jquery.stellar.min.js"></script>
  <script src="js/owl.carousel.min.js"></script>
  <script src="js/jquery.magnific-popup.min.js"></script>
  <script src="js/aos.js"></script>
  <script src="js/jquery.animateNumber.min.js"></script>
  <script src="js/bootstrap-datepicker.js"></script>
  <script src="js/jquery.timepicker.min.js"></script>
  <script src="js/scrollax.min.js"></script>
  <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false"></script>
  <script src="js/google-map.js"></script>
  <script src="js/main.js"></script>
    







</body>
</html>

