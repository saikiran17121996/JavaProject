package server.com;

import implementation.com.CommanImplementation;
import interface1.com.CommanInterface;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.com.RegisterBean;
import bean.com.RegisterBeanO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServletO")
public class LoginServletO extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServletO() {
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
	
	String Username=request.getParameter("username");
	String Password=request.getParameter("password");
	

	System.out.println("username==============="+Username);
	
	System.out.println("Password==============="+Password);
	
	HttpSession ses=request.getSession();
	ses.setAttribute("Ownerusername",Username);
	
	
	
	
	
	
	RegisterBeanO lb=new RegisterBeanO();
	
	lb.setUsername(Username);
	lb.setPassword(Password);
	
	CommanInterface cc=new CommanImplementation();
	boolean q=cc.loginO(lb);
	
	
	if(q==true)
	{
		response.sendRedirect("OwnerHome.jsp");
	}
	else{
		response.sendRedirect("DataOwnerR.jsp");
	}
		
		
	}

}
