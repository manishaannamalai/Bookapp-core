package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manisha.user.Users;
import com.manisha.userdao.UserDAO;


@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet{
	  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	PrintWriter out=response.getWriter();
	 //Users user = new Users();
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	String name=request.getParameter("name");
	Users user = new Users();
	user.setEmail(email);
    user.setPassword(password);
    user.setName(name);
	
    UserDAO userDAO=new UserDAO();
	Users user1 = null;
	try {
		try {
			user1 = userDAO.login(email,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (ClassNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} 
	System.out.println(user);
	
	
	out.println(user1);
	if(user1==null)
	{
		response.sendRedirect("login.html");
	}
	else
	{
		response.sendRedirect("listbook.jsp");
	}
}
}
