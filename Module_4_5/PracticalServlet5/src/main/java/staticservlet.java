import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class staticservlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		String username = req.getParameter("username");
		String pass = req.getParameter("password");
		// pw.print(username);
		if (username.equals("anu") && pass.equals("anushka")) {
			RequestDispatcher rd = req.getRequestDispatcher("welcome");
			rd.forward(req, res);
		} else {
//			RequestDispatcher rd2=req.getRequestDispatcher("index.html");
//			rd2.include(req, res);
			res.sendRedirect("error.html");
		}
	}
}
