import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class contextconfig extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text.plain");
		PrintWriter pw=res.getWriter();
		ServletConfig config=getServletConfig();
		Enumeration<String> e=config.getInitParameterNames();
		pw.print("<br /> This data is using config method: ");
		pw.print("<br />  ");
		
		String str="";
		while(e.hasMoreElements()) {
			str=e.nextElement();
			pw.print(" <br /> The parameter name is: "+str);
			pw.print(" <br /> The value of that parameter is: "+config.getInitParameter(str));
		}	
		pw.print("<br />  ");
		pw.print("<br />  ");
		pw.print("<br /> ");
		pw.print("<br /> ");
		pw.print("<br />  ");
		
		ServletContext context=getServletContext();
		Enumeration<String> e2=context.getInitParameterNames();
		pw.print(" <br /> This data is using context method: ");
		pw.print("<br />  ");
		String str2="";
		while(e2.hasMoreElements()) {
			str2=e2.nextElement();
			pw.print(" <br /> The parameter name is: "+str2);
			pw.print(" <br /> The value of that parameter is: "+context.getInitParameter(str2));
		}	
		
		
	}
}
