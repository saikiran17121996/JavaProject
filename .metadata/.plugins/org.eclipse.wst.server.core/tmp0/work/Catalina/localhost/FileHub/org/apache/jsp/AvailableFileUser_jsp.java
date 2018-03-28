package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import database.com.DBConnectivity;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public final class AvailableFileUser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.List<java.lang.String> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.List<java.lang.String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Divagloss</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/coin-slider.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/InputTypeEditor.css\"  />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-titillium-250.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/coin-slider.min.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".result{\r\n");
      out.write("\r\n");
      out.write("background-color:#BEF781;\r\n");
      out.write("margin: auto;\r\n");
      out.write("    width: 50%;\r\n");
      out.write("    border: 3px solid green;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".test{\r\n");
      out.write("color:white;\r\n");
      out.write("font-size:25px;\r\n");
      out.write("color:#A28915;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("div.table-title {\r\n");
      out.write("   display: block;\r\n");
      out.write("  margin: auto;\r\n");
      out.write("  max-width: 600px;\r\n");
      out.write("  padding:5px;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".table-title h3 {\r\n");
      out.write("   color: #fafafa;\r\n");
      out.write("   font-size: 30px;\r\n");
      out.write("   font-weight: 400;\r\n");
      out.write("   font-style:normal;\r\n");
      out.write("   font-family: \"Roboto\", helvetica, arial, sans-serif;\r\n");
      out.write("   text-shadow: -1px -1px 1px rgba(0, 0, 0, 0.1);\r\n");
      out.write("   text-transform:uppercase;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/*** Table Styles **/\r\n");
      out.write("\r\n");
      out.write(".table-fill {\r\n");
      out.write("  background: white;\r\n");
      out.write("  border-radius:3px;\r\n");
      out.write("  border-collapse: collapse;\r\n");
      out.write("  height: 320px;\r\n");
      out.write("  margin: auto;\r\n");
      out.write("  max-width: 600px;\r\n");
      out.write("  padding:5px;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  box-shadow: 0 5px 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("  animation: float 5s infinite;\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("th {\r\n");
      out.write("  color:#D5DDE5;;\r\n");
      out.write("  background:#1b1e24;\r\n");
      out.write(" border-bottom:4px solid #9ea7af;\r\n");
      out.write("  border-right: 1px solid #343a45;\r\n");
      out.write("  font-size:23px;\r\n");
      out.write("  font-weight: 100;\r\n");
      out.write(" /*  padding:24px; */\r\n");
      out.write("  text-align:left;\r\n");
      out.write("  text-shadow: 0 1px 1px rgba(0, 0, 0, 0.1);\r\n");
      out.write("  vertical-align:middle;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th:first-child {\r\n");
      out.write("  border-top-left-radius:3px;\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("th:last-child {\r\n");
      out.write("  border-top-right-radius:3px;\r\n");
      out.write("  border-right:none;\r\n");
      out.write("}\r\n");
      out.write("  \r\n");
      out.write("tr {\r\n");
      out.write("  border-top: 1px solid #C1C3D1;\r\n");
      out.write("  border-bottom-: 1px solid #C1C3D1;\r\n");
      out.write("  color:#666B85;\r\n");
      out.write("  font-size:16px;\r\n");
      out.write("  font-weight:normal;\r\n");
      out.write("  text-shadow: 0 1px 1px rgba(256, 256, 256, 0.1);\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("tr:hover td {\r\n");
      out.write("  background:#4E5066;\r\n");
      out.write("  color:#FFFFFF;\r\n");
      out.write("  border-top: 1px solid #22262e;\r\n");
      out.write("  border-bottom: 1px solid #22262e;\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("tr:first-child {\r\n");
      out.write("  border-top:none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("tr:last-child {\r\n");
      out.write("  border-bottom:none;\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("tr:nth-child(odd) td {\r\n");
      out.write("  background:#EBEBEB;\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("tr:nth-child(odd):hover td {\r\n");
      out.write("  background:#4E5066;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("tr:last-child td:first-child {\r\n");
      out.write("  border-bottom-left-radius:3px;\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("tr:last-child td:last-child {\r\n");
      out.write("  border-bottom-right-radius:3px;\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("td {\r\n");
      out.write("  background:#FFFFFF;\r\n");
      out.write("  padding:20px;\r\n");
      out.write("  text-align:left;\r\n");
      out.write("  vertical-align:middle;\r\n");
      out.write("  font-weight:300;\r\n");
      out.write("  font-size:18px;\r\n");
      out.write("  text-shadow: -1px -1px 1px rgba(0, 0, 0, 0.1);\r\n");
      out.write("  border-right: 1px solid #C1C3D1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td:last-child {\r\n");
      out.write("  border-right: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th.text-left {\r\n");
      out.write("  text-align: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th.text-center {\r\n");
      out.write("  text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th.text-right {\r\n");
      out.write("  text-align: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td.text-left {\r\n");
      out.write("  text-align: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td.text-center {\r\n");
      out.write("  text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td.text-right {\r\n");
      out.write("  text-align: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("  <div class=\"header\">\r\n");
      out.write("    <div class=\"header_resize\">\r\n");
      out.write("      <div class=\"logo\">\r\n");
      out.write("<h1><span style=\"color:#2D66F1\">Multi Authority Cloud Storage</span></h1>      </div>\r\n");
      out.write("      <div class=\"menu_nav\">\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li><a href=\"UserHome.jsp\">Data user</a></li>\r\n");
      out.write("\t\t\t    <li class=\"active\"><a href=\"AvailableFilesUser.jsp\">Available Files</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"UserFileRequest.jsp\">File Request</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"UserRequestFilesView.jsp\">Requested Files</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"UserFileDownload.jsp\">File download</a></li>\r\n");
      out.write("\t            <li><a href=\"home.jsp\">Logout</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("      <div class=\"slider\">\r\n");
      out.write("        <div id=\"coin-slider\"><a href=\"#\"><img src=\"images/slide1.jpg\" width=\"935\" height=\"307\" alt=\"\" /></a> <a href=\"#\"><img src=\"images/slide2.jpg\" width=\"935\" height=\"307\" alt=\"\" /></a> <a href=\"#\"><img src=\"images/slide3.jpg\" width=\"935\" height=\"307\" alt=\"\" /></a></div>\r\n");
      out.write("        <div class=\"clr\"></div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <div class=\"MyInputContainer\"><div class=\"MyInputContainer1\">\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<form action=\"UserRequestServer\" method=\"post\">\r\n");
      out.write("<table border=\"5\" bordercolor=\"green\">\r\n");
      out.write("\t\t<thead><tr>\r\n");
      out.write("\t\t<th class=\"text-left\">FILE NAME</th>\r\n");
      out.write("\t\t<th class=\"text-left\">OWNER NAME</th>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</tr></thead>\r\n");
      out.write("  \r\n");
    
Connection con;
int select=0;
PreparedStatement ps;
ResultSet rs=null;
try{
	con=DBConnectivity.createConnection();
	
ps=con.prepareStatement("SELECT * FROM `cc10`.`encrypteddatabase`");
rs=ps.executeQuery();
	
	
}catch(Exception d)
{
	d.printStackTrace();
}

  
  while(rs.next())
  {
	  String filename=rs.getString(1);
      String ownername=rs.getString(4);
            
	
  
  
      out.write("\r\n");
      out.write("   <tbody class=\"table-hover\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td class=\"text-left\">");
      out.print(filename);
      out.write("</td>\r\n");
      out.write("\t\t<td class=\"text-left\">");
      out.print(ownername);
      out.write("</td>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t   ");
} 
      out.write("\r\n");
      out.write("\t</tbody>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</form>\t\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  </div></div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"footer\">\r\n");
      out.write("    <div class=\"footer_resize\">\r\n");
      out.write("      <p class=\"lf\">Copyright &copy; <a href=\"home.jsp\">Cloud computing</a>. All Rights Reserved</p>\r\n");
      out.write("      <div style=\"clear:both;\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
