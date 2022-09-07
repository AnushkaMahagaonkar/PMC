import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
public class servletlifecycledemo extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	int Password;
	public void init(ServletConfig config) {
		name="Anushka";
		Password=12345;
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<html>");
		out.println("<head>Data comes from variables declared in init() method</head>");
		out.print("<body>");
		out.print("<br>Name:  <input type=\"text\" value="+ name+" readonly><br>" );
		out.print("Password:  <input type=\"text \" value="+Password+" readonly> ");
		out.close();
	}
	public void destroy() {
		
	}
	
}
