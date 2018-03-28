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
                <li><a href="AdminHome.jsp">Admin home</a></li>
				<li><a href="AvailableFileAdmin.jsp">Available files</a></li>
				<li class="active"><a href="AdminResponse.jsp">Response</a></li>
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
  <br><br><br><br><br>
  
 
   <div class="MyInputContainer" style="width:422px;"> <div class="MyInputContainer1">
  
  
  
  





<%-- <%String ownername11=session.getAttribute("Ownerusername").toString(); %>
<input type="hidden" name="username111" value="<%=session.getAttribute("Ownerusername") %>"/> --%>


<table border="5" bordercolor="green">
		<thead><tr>
		<th class="text-left">FILE NAME</th>
		<th class="text-left">USER REQUEST</th>
		<th class="text-left">OWNER RESPONSE</th>
		<th class="text-left">SEND RESPONSE</th>
		</tr></thead>
  <tbody class="table-hover">
		
<%    
Connection con;
int select=0;
PreparedStatement ps;
ResultSet rs=null;
String empty="";
try{
	con=DBConnectivity.createConnection();
	//ps=con.prepareStatement("SELECT * FROM `cc10`.`requesttable` where Ownername='"+ownername11+"'");//RequestUser, Filename, Ownername, CloudRequest, OwnerRequest, CloudKey, OwnerKey
ps=con.prepareStatement("SELECT * FROM `cc10`.`requesttable` where CloudKey='"+empty+"'");
rs=ps.executeQuery();
	
	
}catch(Exception d)
{
	d.printStackTrace();
}

  
  while(rs.next())
  {
	  String filename=rs.getString(2);
	  String username=rs.getString(1);
	  String rq=rs.getString(5);
    String res="";
  if(rq!=null){
	  res="Request";
  }
  %>
  
   <form action="AdminRequestResponse" method="post"><tr>
		<td class="text-left"><%=filename%><input type="hidden" name="filename" value="<%=filename%>"/></td>
		<td class="text-left"><%=username%><input type="hidden" name="username" value="<%=username%>"/></td>
		
		<td><select name="OwnerRequest"><option value="0">Reject</option><option value="1">Accepted</option></select></td>
		<td class="text-left"><input type="submit" value="RESPONSE"/> </td>
		</tr></form>	
		   <%} %>
	</tbody>

</table>


</div>
  
  
  
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