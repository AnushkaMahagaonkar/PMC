import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/Update")

public class Updateddetails extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String name=req.getParameter("name1");
		String email=req.getParameter("email1");
		String department=req.getParameter("department1");
		String phoneno=req.getParameter("contact1");
		
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
				+ "                <p class=\"text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4\">Updated Details</p>\r\n"
				+ "\r\n"
				+ "                <form class=\"mx-1 mx-md-4\" action=\"Display\" method=\"post\">\r\n"
				+ "\r\n"
				+ "                  <div class=\"d-flex flex-row align-items-center mb-4\">\r\n"
				+ "                    <i class=\"fas fa-user fa-lg me-3 fa-fw\"></i>");
		pw.print("<div class=\"form-outline flex-fill mb-0\">\r\n"
				+ "                      <input type=\"text\" id=\"form3Example1c\" class=\"form-control\" name=\"name\" value="+name+" disabled>\r\n"
				+ "                      <label class=\"form-label\" for=\"form3Example1c\" >Name</label>\r\n"
				+ "                    </div>");
		pw.print("</div>");
		pw.print("<div class=\"d-flex flex-row align-items-center mb-4\">\r\n"
				+ "                    <i class=\"fas fa-envelope fa-lg me-3 fa-fw\"></i>\r\n"
				+ "                    <div class=\"form-outline flex-fill mb-0\">\r\n"
				+ "                      <input type=\"email\" id=\"form3Example3c\" class=\"form-control\" name=\"email\" value="+email+" disabled>\r\n"
				+ "                      <label class=\"form-label\" for=\"form3Example3c\" >Email</label>\r\n"
				+ "                    </div>\r\n"
				+ "                  </div>");
		pw.print("<div class=\"d-flex flex-row align-items-center mb-4\">\r\n"
				+ "                    <i class=\"fas fa-lock fa-lg me-3 fa-fw\"></i>\r\n"
				+ "                    <div class=\"form-outline flex-fill mb-0\">\r\n"
				+ "                      <input type=\"text\" id=\"form3Example4c\" class=\"form-control\"  name=\"department\" value="+department+" disabled>\r\n"
				+ "                      <label class=\"form-label\" for=\"form3Example4c\">Department</label>\r\n"
				+ "                    </div>\r\n"
				+ "                  </div>");
		pw.print("<div class=\"d-flex flex-row align-items-center mb-4\">\r\n"
				+ "                    <i class=\"fas fa-key fa-lg me-3 fa-fw\"></i>\r\n"
				+ "                    <div class=\"form-outline flex-fill mb-0\">\r\n"
				+ "                      <input type=\"text\" id=\"form3Example4cd\" class=\"form-control\"  name=\"contact\" value="+phoneno+" disabled>\r\n"
				+ "                      <label class=\"form-label\" for=\"form3Example4cd\" >Contact Number</label>\r\n"
				+ "                    </div>\r\n"
				+ "                  </div>");
		pw.print("<div class=\"d-flex justify-content-center mx-4 mb-3 mb-lg-4\">\r\n"
				+ "                    <a href=\"index.html\">Go to Registration Page</a>\r\n"
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
