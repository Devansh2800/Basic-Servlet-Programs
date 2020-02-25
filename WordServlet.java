import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class WordServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
	PrintWriter out = res.getWriter();
	res.setContentType("application/msword");
	out.write("welcome user i am word servlet");
	
	}
}