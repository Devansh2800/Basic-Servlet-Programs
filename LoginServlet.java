/*
	This program can be used for the login credentials which takes user id and passwords and checks whether the credentials exist
	in the database or not and dispatches the servlet to the welcome user page.
	
	(The program for welcome user is also committed on this repository.)

*/

import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.sql.*;

public class LoginServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
	PrintWriter out = res.getWriter();
	res.setContentType("text/html");
	
	
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/login?user=root&password=");
		PreparedStatement ps=con.prepareStatement("select * from mylogin where uid=? and password=?");
		String a= req.getParameter("t1");
		String b= req.getParameter("n1");
		ps.setString(1,a);
		ps.setString(2,b);
		ResultSet rs=ps.executeQuery();
		RequestDispatcher rd=null;
		
		if(rs.next()){
			HttpSession ses=req.getSession();
			
			rd=req.getRequestDispatcher("welcome");
			ses.setAttribute("user",a);
			rd.forward(req,res);
			
			
		}
		else{
			out.println("Error:Either username or password incorrect"+"\n");
			out.println("Enter Again!!");
			rd=req.getRequestDispatcher("Login.html");
			rd.include(req,res);
		}
		}
	catch(Exception e){
		out.println(e);
	}
	}
}
