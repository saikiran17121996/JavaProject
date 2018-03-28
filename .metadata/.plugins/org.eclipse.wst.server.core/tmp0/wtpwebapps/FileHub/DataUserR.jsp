<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Multi Authority Cloud Storage</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="css/coin-slider.css" />
<link rel="stylesheet" type="text/css" href="css/InputTypeEditor.css"  />
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/cufon-titillium-250.js"></script>
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script type="text/javascript" src="js/coin-slider.min.js"></script>
</head>
<body>
<div class="main">
  <div class="header">
    <div class="header_resize">
      <div class="logo">
<h1><span style="color:#2D66F1">Multi Authority Cloud Storage</span></h1>      </div>
      <div class="menu_nav">
        <ul>
          <li><a href="home.jsp">Homepage</a></li>
				<li class="active"><a href="DataUserL.jsp">Data user</a></li>
				<li><a href="DataOwnerL.jsp">Data owner</a></li>
				<li><a href="Admin.jsp">Admin</a></li>
				<li><a href="Contact.jsp">Contact Us</a></li>
        </ul>
      </div>
      <div class="clr"></div>
      <div class="slider">
        <div id="coin-slider"><a href="#"><img src="images/slide1.jpg" width="935" height="307" alt="" /></a> <a href="#"><img src="images/slide2.jpg" width="935" height="307" alt="" /></a> <a href="#"><img src="images/slide3.jpg" width="935" height="307" alt="" /></a></div>
        <div class="clr"></div>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  
  
  
  <div class="MyInputContainer"><div class="MyInputContainer1">
  
  <form action="RegistrationServlet" method="post">
 <input class="inputtype1" type="text" name="username" placeholder="Enter Username" required=""/>
  <input class="inputtype1" type="password" name="password" placeholder="Enter Password" required=""/>
  <input class="inputtype1" type="text" name="email" placeholder="Enter Email" required=""/>
  <input class="inputtype1" type="text" name="phone" placeholder="Enter Phone" required=""/>
  
  
  <button class="editedbutton" type="submit" style="margin-left:50px; ">Register</button>
  </form>
  </div></div>
  
  <div class="footer">
    <div class="footer_resize">
      <p class="lf">Copyright &copy; <a href="home.jsp">Cloud computing</a>. All Rights Reserved</p>
      <div style="clear:both;"></div>
    </div>
  </div>
</div>
</body>
</html>