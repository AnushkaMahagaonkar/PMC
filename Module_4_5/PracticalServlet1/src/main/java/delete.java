import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class delete extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.print("You have redirected to <b> delete </b> page using servlet");
		pw.print("<br /> Welcome");		
	}
}
