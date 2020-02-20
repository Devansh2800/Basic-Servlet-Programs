/*
	Welcome page for Login Servlet file which will open if the credentials are correct or else will redirect to the login servlet page.
	
*/

import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.sql.*;

public class WelcomeServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
	PrintWriter out = res.getWriter();
	res.setContentType("text/html");
	HttpSession ses=req.getSession(false);
	if(ses==null)
	{
		res.sendRedirect("CheckLogin");
	}
	else
	{
		String uid=(String)ses.getAttribute("user");
		out.println("Welcome "+uid);
	}
	}
}
