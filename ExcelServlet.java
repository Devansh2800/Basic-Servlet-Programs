import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class ExcelServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
	PrintWriter out = res.getWriter();
	res.setContentType("application/vnd.ms-excel");
	out.write("<table><tr><td>Roll no</td><td>Student name</td><td>Course</td></td></tr>");
	out.write("<tr><td>1</td><td>AMIT BHATIA</td><td>JAVA</td></td></tr>");
	out.write("<tr><td>1</td><td>AMIT BHATIA</td><td>JAVA</td></td></tr>");
	out.write("<tr><td>1</td><td>AMIT BHATIA</td><td>JAVA</td></td></tr>");
	out.write("<tr><td>1</td><td>AMIT BHATIA</td><td>JAVA</td></td></tr>");
	out.write("</table>");
	
	}
}