<%@page import="java.sql.Connection"%>
<%@page import="database.com.DBConnectivity"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>

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
<style type="text/css">
.result{

background-color:#BEF781;
margin: auto;
    width: 50%;
    border: 3px solid green;
    padding: 10px;
}


.test{
color:white;
font-size:25px;
color:#A28915;
}


div.table-title {
   display: block;
  margin: auto;
  max-width: 600px;
  padding:5px;
  width: 100%;
}

.table-title h3 {
   color: #fafafa;
   font-size: 30px;
   font-weight: 400;
   font-style:normal;
   font-family: "Roboto", helvetica, arial, sans-serif;
   text-shadow: -1px -1px 1px rgba(0, 0, 0, 0.1);
   text-transform:uppercase;
}


/*** Table Styles **/

.table-fill {
  background: white;
  border-radius:3px;
  border-collapse: collapse;
  height: 320px;
  margin: auto;
  max-width: 600px;
  padding:5px;
  width: 100%;
  box-shadow: 0 5px 10px rgba(0, 0, 0, 0.1);
  animation: float 5s infinite;
}
 
th {
  color:#D5DDE5;;
  background:#1b1e24;
 border-bottom:4px solid #9ea7af;
  border-right: 1px solid #343a45;
  font-size:23px;
  font-weight: 100;
 /*  padding:24px; */
  text-align:left;
  text-shadow: 0 1px 1px rgba(0, 0, 0, 0.1);
  vertical-align:middle;
}

th:first-child {
  border-top-left-radius:3px;
}
 
th:last-child {
  border-top-right-radius:3px;
  border-right:none;
}
  
tr {
  border-top: 1px solid #C1C3D1;
  border-bottom-: 1px solid #C1C3D1;
  color:#666B85;
  font-size:16px;
  font-weight:normal;
  text-shadow: 0 1px 1px rgba(256, 256, 256, 0.1);
}
 
tr:hover td {
  background:#4E5066;
  color:#FFFFFF;
  border-top: 1px solid #22262e;
  border-bottom: 1px solid #22262e;
}
 
tr:first-child {
  border-top:none;
}

tr:last-child {
  border-bottom:none;
}
 
tr:nth-child(odd) td {
  background:#EBEBEB;
}
 
tr:nth-child(odd):hover td {
  background:#4E5066;
}

tr:last-child td:first-child {
  border-bottom-left-radius:3px;
}
 
tr:last-child td:last-child {
  border-bottom-right-radius:3px;
}
 
td {
  background:#FFFFFF;
  padding:20px;
  text-align:left;
  vertical-align:middle;
  font-weight:300;
  font-size:18px;
  text-shadow: -1px -1px 1px rgba(0, 0, 0, 0.1);
  border-right: 1px solid #C1C3D1;
}

td:last-child {
  border-right: 0px;
}

th.text-left {
  text-align: left;
}

th.text-center {
  text-align: center;
}

th.text-right {
  text-align: right;
}

td.text-left {
  text-align: left;
}

td.text-center {
  text-align: center;
}

td.text-right {
  text-align: right;
}

</style>
</head>
<body>
<div class="main">
  <div class="header">
    <div class="header_resize">
      <div class="logo">
<h1><span style="color:#2D66F1">Multi Authority Cloud Storage</span></h1>      </div>
      <div class="menu_nav">
        <ul>
          <li><a href="UserHome.jsp">Data user</a></li>
			    <li><a href="AvailableFileUser.jsp">Available Files</a></li>
				<li><a href="UserFileRequest.jsp">File Request</a></li>
				<li><a href="UserRequestFilesView.jsp">Requested Files</a></li>
				<li class="active"><a href="UserFileDownload.jsp">File download</a></li>
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
  
  
  
  <div style="padding:40px 20%;margin-top:40px;">
  
 

<form action="UserFinalFileDownload" method="post">
<table border="5" bordercolor="green">
		<thead><tr>
		<th class="text-left">FILE NAME</th>
		<th class="text-left">USER NAME</th>
		<th class="text-left">CLOUD KEY</th>
		<th class="text-left">OWNERKEY</th>
		<th class="text-left">DOWNLOAD</th>
		</tr></thead>
  
  
  
<%
String username=session.getAttribute("username111").toString();
Connection con;
int select=0;
PreparedStatement ps;
ResultSet rs=null;
try{
	con=DBConnectivity.createConnection();
	
ps=con.prepareStatement("SELECT * FROM `cc10`.`requesttable` where CloudKey IS NOT NULL and OwnerKey IS NOT NULL and RequestUser='"+username+"'");
rs=ps.executeQuery();
	
	
}catch(Exception d)
{
	d.printStackTrace();
}

  
  while(rs.next())
  {
	  String filename=rs.getString(2);
      String ownername=rs.getString(4);
      String CLoudKey=rs.getString(6);
      String OwnerKey=rs.getString(7);
	
  
  %>
   <tbody class="table-hover">
		<tr>
		<td class="text-left"><%=filename%><input type="hidden" name="filename" value="<%=filename%>"/></td>
		<td class="text-left"><%=username%><input type="hidden" name="username" value="<%=username%>"/></td>
		
		
		<td><input type="text" name="key1" value="<%=CLoudKey%>"/></td>
		<td><input type="text" name="key2" value="<%=OwnerKey%>"/></td>
		<td class="text-left"><input type="submit" value="Download"/> </td>
		
		</tr>
		   <%} %>
	</tbody>

</table>
</form>	

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
