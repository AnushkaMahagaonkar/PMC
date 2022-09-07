import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/Display")

public class Displaydetails extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		ServletContext context=getServletContext();
		String parameter=context.getInitParameter("Header");
		String name=req.getParameter("names");
		String email=req.getParameter("email");
		String department=req.getParameter("department");
		String phoneno=req.getParameter("contact");
//		pw.print(name);
//		pw.print(email);
//		pw.print(department);
//		pw.print(phoneno);
		
		pw.print("<html>");
		pw.print("<head>");
		pw.print("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx\" crossorigin=\"anonymous\">");
		pw.print("</head>");
		pw.print("<body>");
		pw.print("<section class=\"vh-50\" style=\"background-color: #eee;\">");
		pw.print("<div class=\"container h-100\" >\r\n"
				+ "    <div class=\"row d-flex justify-content-center align-items-center h-50 w-50\">\r\n"
				+ "      <div class=\"col-lg-12 col-xl-11\">\r\n"
				+ "        <div class=\"card text-black\" style=\"border-radius: 25px;\">\r\n"
				+ "          <div class=\"card-body p-md-10 ml-20\">\r\n"
				+ "            <div class=\"row justify-content-center\">\r\n"
				+ "\r\n"
				+ "                <p class=\"text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4\">"+parameter+"</p>\r\n"
				+ "\r\n"
				+ "                <form class=\"mx-1 mx-md-4\" action=\"Update\" method=\"post\">\r\n"
				+ "\r\n"
				+ "                  <div class=\"d-flex flex-row align-items-center mb-4\">\r\n"
				+ "                    <i class=\"fas fa-user fa-lg me-3 fa-fw\"></i>");
		pw.print("<div class=\"form-outline flex-fill mb-0\">\r\n"
				+ "                      <input type=\"text\" id=\"form3Example1c\" class=\"form-control\" name=\"name1\" value="+name+">\r\n"
				+ "                      <label class=\"form-label\" for=\"form3Example1c\" >Name</label>\r\n"
				+ "                    </div>");
		pw.print("</div>");
		pw.print("<div class=\"d-flex flex-row align-items-center mb-4\">\r\n"
				+ "                    <i class=\"fas fa-envelope fa-lg me-3 fa-fw\"></i>\r\n"
				+ "                    <div class=\"form-outline flex-fill mb-0\">\r\n"
				+ "                      <input type=\"email\" id=\"form3Example3c\" class=\"form-control\" name=\"email1\" value="+email+" >\r\n"
				+ "                      <label class=\"form-label\" for=\"form3Example3c\" >Email</label>\r\n"
				+ "                    </div>\r\n"
				+ "                  </div>");
		pw.print("<div class=\"d-flex flex-row align-items-center mb-4\">\r\n"
				+ "                    <i class=\"fas fa-lock fa-lg me-3 fa-fw\"></i>\r\n"
				+ "                    <div class=\"form-outline flex-fill mb-0\">\r\n"
				+ "                      <input type=\"text\" id=\"form3Example4c\" class=\"form-control\"  name=\"department1\" value="+department+">\r\n"
				+ "                      <label class=\"form-label\" for=\"form3Example4c\">Department</label>\r\n"
				+ "                    </div>\r\n"
				+ "                  </div>");
		pw.print("<div class=\"d-flex flex-row align-items-center mb-4\">\r\n"
				+ "                    <i class=\"fas fa-key fa-lg me-3 fa-fw\"></i>\r\n"
				+ "                    <div class=\"form-outline flex-fill mb-0\">\r\n"
				+ "                      <input type=\"text\" id=\"form3Example4cd\" class=\"form-control\"  name=\"contact1\" value="+phoneno+">\r\n"
				+ "                      <label class=\"form-label\" for=\"form3Example4cd\" >Contact Number</label>\r\n"
				+ "                    </div>\r\n"
				+ "                  </div>");
		pw.print("<div class=\"d-flex justify-content-center mx-4 mb-3 mb-lg-4\">\r\n"
				+ "                    <button type=\"submit\" class=\"btn btn-primary btn-lg\" name=\"Submit\">Update</button>\r\n"
				+ "                  </div>");
		pw.print("</form>\r\n"
				+ "            </div>\r\n"
				+ "          </div>\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "    </div>\r\n"
				+ "  </div>");
		pw.print("</section>");
		pw.print("</body>");
		pw.print("</html>");
		
	}
}
