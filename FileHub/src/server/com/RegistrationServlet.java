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

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
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
	String email=request.getParameter("email");
	String password=request.getParameter("password");
	String phone=request.getParameter("phone");
	
	RegisterBean rb=new RegisterBean();
	rb.setUsername(username);
	rb.setPassword(password);
	rb.setEmail(email);
	rb.setPhone(phone);
	
	CommanInterface cc=new CommanImplementation();
int j=cc.register(rb);
System.out.println("jjjjjjjjjjjjjjjjjjjjjjjjjjjjjj"+j);

if(j!=0){
	response.sendRedirect("DataUserL.jsp");
	}
else{
	response.sendRedirect("DataUserR.jsp");
}
	}

}
