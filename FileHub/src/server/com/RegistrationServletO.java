package server.com;

import implementation.com.CommanImplementation;
import interface1.com.CommanInterface;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.com.RegisterBean;
import bean.com.RegisterBeanO;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServletO")
public class RegistrationServletO extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServletO() {
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
	
	String username=request.getParameter("username");
	System.out.println("username"+username);
	String email=request.getParameter("email");System.out.println("email"+email);
	String password=request.getParameter("password");System.out.println("password"+password);
	String phone=request.getParameter("phone");System.out.println("phone"+phone);
	
	RegisterBeanO refbeanO=new RegisterBeanO();
	refbeanO.setUsername(username);
	refbeanO.setPassword(password);
	refbeanO.setEmail(email);
	refbeanO.setPhone(phone);
	
	CommanInterface cc=new CommanImplementation();
int j=cc.registerO(refbeanO);
System.out.println("jjjjjjjjjjjjjjjjjjjjjjjjjjjjjj"+j);

if(j!=0){
	response.sendRedirect("DataOwnerL.jsp");
	}
else{
	response.sendRedirect("DataOwnerR.jsp");
}
	}

}
