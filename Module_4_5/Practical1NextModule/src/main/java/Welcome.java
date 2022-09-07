import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/servlet2")
public class Welcome extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.print("The data from http session");
		HttpSession session=req.getSession(false);
		String name=(String)session.getAttribute("uname");
		String passw=(String)session.getAttribute("password");
		String con=(String)session.getAttribute("contact");
		int contactdetails=Integer.parseInt(con);
		
		pw.print("<br/>Welcome "+name);
		pw.print("<br/>Your password is "+passw);
		pw.print("<br/>Your contact number is "+contactdetails);

		pw.print("<br/><br/>The data from cookies are: ");
		Cookie cookie=null;
		Cookie[] cookies = null; 
		cookies=req.getCookies();
		for(int i = 0; i< cookies.length;i++) {
			cookie = cookies[i];
			pw.print(" <br>Key: "+cookie.getName()+"&nbsp &nbspValue: "+cookie.getValue());
			pw.print("<br>");
		}
		pw.close();
	}
}
