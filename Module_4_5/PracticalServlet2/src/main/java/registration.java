import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class registration extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		
		String name;
		String age;
		String phonenum;
		String address;
		String gender;
		String email;
		String language;
		
		name=req.getParameter("name");
		age=req.getParameter("age");
		phonenum=req.getParameter("phoneno");
		address=req.getParameter("address");
		gender=req.getParameter("gender");
		email=req.getParameter("email");
		language=req.getParameter("language");
//		pw.print(gender);
		
		
		pw.print("The name of student is: "+name+"<br><br>");
		pw.print("The age is: "+age+"<br><br>");
		pw.print("The contact number is: "+phonenum+"<br><br>");
		pw.print("The address is: "+address+"<br><br>");
		pw.print("The gender of student is: "+gender+"<br><br>");
		pw.print("The email is: "+email+"<br><br>");
		pw.print("The selected language is number is: "+language+"<br><br>");
		
		
	}
	
}
