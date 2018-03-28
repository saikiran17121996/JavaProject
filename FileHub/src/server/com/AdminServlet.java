package server.com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	String name="admin";
	String pass="admin";
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	
	System.out.println(username);
	System.out.println(password);
	System.out.println(name);
	System.out.println(pass);
	
	int a=5;
	int b=5;
	int c=7;
	int d=7;
	
	if((username.equals(name)) && (password.equals(pass)))
	{	
		response.sendRedirect("AdminHome.jsp");
	
	}
	else{
		response.sendRedirect("error.jsp");
	}
	}

}
