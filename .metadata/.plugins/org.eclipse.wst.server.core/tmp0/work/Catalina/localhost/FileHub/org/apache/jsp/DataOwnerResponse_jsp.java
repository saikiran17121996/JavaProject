package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import database.com.DBConnectivity;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public final class DataOwnerResponse_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("  <div class=\"header\">\r\n");
      out.write("    <div class=\"header_resize\">\r\n");
      out.write("      <div class=\"logo\">\r\n");
      out.write("<h1><span style=\"color:#2D66F1\">Multi Authority Cloud Storage</span></h1>      </div>\r\n");
      out.write("      <div class=\"menu_nav\">\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li><a href=\"OwnerHome.jsp\">Data owner</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"AvailableFileOwner.jsp\">Available files</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"DataOwnerUpload.jsp\">Upload files</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"active\"><a href=\"DataOwnerResponse.jsp\">Response</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"home.jsp\">Logout</a></li>\r\n");
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
      out.write("  <div class=\"MyInputContainer\" style=\"width:410px;\"><div class=\"MyInputContainer1\" style=\"width:400px;\">\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write(" <!-- <div style=\"width: 1000px; float: left; height: auto;\"> -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table border=\"5\" bordercolor=\"green\">\r\n");
      out.write("\t\t<thead><tr>\r\n");
      out.write("\t\t<th class=\"text-left\" style=\"padding:12px 12px;\"> FILE NAME </th>\r\n");
      out.write("\t\t<th class=\"text-left\" style=\"padding:12px 12px;\"> USER NAME </th>\r\n");
      out.write("\t\t<th class=\"text-left\" style=\"padding:12px 12px;\">OWNER RESPONSE</th>\r\n");
      out.write("\t\t<th class=\"text-left\" style=\"padding:12px 12px;\">SEND KEY</th>\r\n");
      out.write("\t\t</tr></thead>\r\n");
      out.write(" ");
String ownername11=session.getAttribute("Ownerusername").toString(); 
      out.write(' ');
      out.write('\r');
      out.write('\n');
    
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
	  
  
      out.write("\r\n");
      out.write("  \r\n");
      out.write("   <tbody class=\"table-hover\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<form action=\"DataOwnerResponseServlet\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("<input type=\"hidden\" name=\"username111\" value=\"");
      out.print(session.getAttribute("Ownerusername") );
      out.write("\"/><tr>\r\n");
      out.write("\t\t<td class=\"text-left\">");
      out.print(filename);
      out.write("<input type=\"hidden\" name=\"filename\" value=\"");
      out.print(filename);
      out.write("\"/></td>\r\n");
      out.write("\t\t<td class=\"text-left\">");
      out.print(username);
      out.write("<input type=\"hidden\" name=\"username\" value=\"");
      out.print(username);
      out.write("\"/></td>\r\n");
      out.write("\t\t<td><select name=\"permission\"><option value=\"0\">Reject</option><option value=\"1\">Accepted</option></select></td>\r\n");
      out.write("\t\t<td class=\"text-left\"><input type=\"submit\" value=\"RESPONSE\"/> </td>\r\n");
      out.write("\t\t</tr></form>\t\r\n");
      out.write("\t\t   ");
} 
      out.write("\r\n");
      out.write("\t</tbody>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"footer\">\r\n");
      out.write("    <div class=\"footer_resize\">\r\n");
      out.write("      <p class=\"lf\">Copyright &copy; <a href=\"home.jsp\">Cloud Computing</a>. All Rights Reserved to Saikiran</p>\r\n");
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
