<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Divagloss</title>
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
          <li><a href="OwnerHome.jsp">Data owner</a></li>
				<li><a href="AvailableFileOwner.jsp">Available files</a></li>
				<li class="active"><a href="DataOwnerUpload.jsp">Upload files</a></li>
				<li><a href="DataOwnerResponse.jsp">Response</a></li>
				<li><a href="home.jsp">Logout</a></li>
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
  
  
 <form action="DataownerUpload" method="post" enctype="multipart/form-data">
    <div style="padding:20px 70px;"> <input type="file" name="file" placeholder="Select file"/></div>
     <input class="inputtype1" type="text" name="key" placeholder="Enter key"/>
    <input type="hidden" name="owner123" value="<%=session.getAttribute("Ownerusername")%>">  
    <button class="editedbutton" type="submit" style="margin-left:50px;">Upload</button>
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
