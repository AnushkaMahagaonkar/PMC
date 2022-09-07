import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class welcomeuser extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String name;
		String password;
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		name=req.getParameter("username");
		password=req.getParameter("password");
		pw.print("<html> <body>");
		pw.print("<h2> Welcome: "+name+"</h2><br>");
		pw.print("The name is "+name+"<br>");
		pw.print("The password is "+password);
	}
}
