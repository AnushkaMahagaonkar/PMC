import java.io.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/View")
public class View_Page extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String username=req.getParameter("uname");
		String pass=req.getParameter("pass");
		String contact = req.getParameter("phno");
		String department=req.getParameter("depart");
		String email=req.getParameter("email");
		
		 	
		pw.print("<br />Username is:- "+username);
		pw.print("<br />Password is:- "+pass);
		pw.print("<br />contact number is:- "+contact);
		pw.print("<br /> Department is:- "+department);
		pw.print("<br />email is:- "+email);
		pw.print("<form action='servlet2' method='POST'> ");
		pw.print("<br /> <input type='submit' value='Submit'>");
		pw.print("</form>");
		
		HttpSession session=req.getSession();
		session.setAttribute("uname", username);
	//	pw.print(session.getAttribute("uname"));
		session.setAttribute("password", pass);
		session.setAttribute("contact", contact);
		
		Cookie ck=new Cookie("department", department);		
		Cookie ck2=new Cookie("email", email);
		ck.setMaxAge(60*60*24);
		ck2.setMaxAge(60*60*24);
		res.addCookie(ck);
		res.addCookie(ck2);
	}
}
