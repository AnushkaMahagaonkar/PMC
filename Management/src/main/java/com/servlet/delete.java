package com.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Student;
import com.helper.factory_provider;

public class delete extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		try {
			int stid=Integer.parseInt(request.getParameter("st_id").trim());
			out.print(stid);
			Session s=factory_provider.getfactory().openSession();
			Transaction t=s.beginTransaction();
			Student st=s.get(Student.class, stid);
			s.delete(st);
			t.commit();
			s.close();
			response.sendRedirect("show_student.jsp");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}


}
