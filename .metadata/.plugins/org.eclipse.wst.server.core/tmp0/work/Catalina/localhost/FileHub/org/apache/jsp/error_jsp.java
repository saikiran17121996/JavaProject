package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class error_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Error</title>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("   .btn12 {\r\n");
      out.write("  background:#0F7C08;\r\n");
      out.write("  padding:30px 80px;\r\n");
      out.write("  -webkit-border-radius: 28;\r\n");
      out.write("  -moz-border-radius: 28;\r\n");
      out.write("  border-radius: 30px;\r\n");
      out.write(" font-size:25px;\r\n");
      out.write("  \r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write(".btn12:hover {\r\n");
      out.write("  background:#CB54D7;\r\n");
      out.write("  \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\t.error{\r\n");
      out.write("\r\n");
      out.write("\tcolor:red;\r\n");
      out.write("\tfont-size:40px;\r\n");
      out.write("\tfont-style: inherit;\r\n");
      out.write("\tmargin-top:100px;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write(".b{\r\n");
      out.write("bac\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".warn{\r\n");
      out.write("padding: 20px 30px;\r\n");
      out.write("background-color:red;\r\n");
      out.write("color:black;\r\n");
      out.write("font-size:20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"b\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"warn\" style=\"margin-top: 20px;\"><marquee direction=\"right\"><span>WARNING</span></marquee></div>\r\n");
      out.write("\r\n");
      out.write("<div style=\"margin-top:100px;margin-left:1200px \"><a href=\"DataOwnerUpload.jsp\" class=\"btn12\">Go back</a></div>\r\n");
      out.write("<center><div class=\"error\">Duplicate file detected or Unsupported file file format please try again any other file</div></center></br></br></br></br></br></br></br></br></br></br></br></br>\r\n");
      out.write("<div class=\"warn\" style=\"margin-bottom:0px;\"><marquee direction=\"left\">WARNING</marquee></div>\r\n");
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
