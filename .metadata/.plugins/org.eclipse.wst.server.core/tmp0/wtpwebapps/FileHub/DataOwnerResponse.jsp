<%@page import="java.sql.Connection"%>
<%@page import="database.com.DBConnectivity"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
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
				<li><a href="DataOwnerUpload.jsp">Upload files</a></li>
				<li class="active"><a href="DataOwnerResponse.jsp">Response</a></li>
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
  
  
  
  <div class="MyInputContainer" style="width:410px;"><div class="MyInputContainer1" style="width:400px;">
  
  
 <!-- <div style="width: 1000px; float: left; height: auto;"> -->


<table border="5" bordercolor="green">
		<thead><tr>
		<th class="text-left" style="padding:12px 12px;"> FILE NAME </th>
		<th class="text-left" style="padding:12px 12px;"> USER NAME </th>
		<th class="text-left" style="padding:12px 12px;">OWNER RESPONSE</th>
		<th class="text-left" style="padding:12px 12px;">SEND KEY</th>
		</tr></thead>
 <%String ownername11=session.getAttribute("Ownerusername").toString(); %> 
<%    
Connection con;
int select=0;
PreparedStatement ps;
ResultSet rs=null;
String empty="";
try{
	con=DBConnectivity.createConnection();//RequestUser, Filename, Ownername, CloudRequest, OwnerRequest, CloudKey, OwnerKey
ps=con.prepareStatement("SELECT * FROM `cc10`.`requesttable` where Ownername='"+ownername11+"' and OwnerKey='"+empty+"'");
rs=ps.executeQuery();
	
	
}catch(Exception d)
{
	d.printStackTrace();
}

  
  while(rs.next())
  {
	  String filename=rs.getString(2);
	  String username=rs.getString(1);
	  
  %>
  
   <tbody class="table-hover">
		
		<form action="DataOwnerResponseServlet" method="post">

<input type="hidden" name="username111" value="<%=session.getAttribute("Ownerusername") %>"/><tr>
		<td class="text-left"><%=filename%><input type="hidden" name="filename" value="<%=filename%>"/></td>
		<td class="text-left"><%=username%><input type="hidden" name="username" value="<%=username%>"/></td>
		<td><select name="permission"><option value="0">Reject</option><option value="1">Accepted</option></select></td>
		<td class="text-left"><input type="submit" value="RESPONSE"/> </td>
		</tr></form>	
		   <%} %>
	</tbody>
</table>


</div>
  
  <div class="footer">
    <div class="footer_resize">
      <p class="lf">Copyright &copy; <a href="home.jsp">Cloud Computing</a>. All Rights Reserved to Saikiran</p>
      <div style="clear:both;"></div>
    </div>
  </div>
</div>
</body>
</html>