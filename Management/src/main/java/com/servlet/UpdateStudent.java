package com.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Student;
import com.helper.factory_provider;

public class UpdateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public UpdateStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		String name=request.getParameter("name");
		String branch=request.getParameter("branch");
		String number=request.getParameter("number");
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = formatter.parse(request.getParameter("dob"));
		String address=request.getParameter("address");
		int id=Integer.parseInt(request.getParameter("sid").trim());
		
		Session s=factory_provider.getfactory().openSession();
		Transaction tx=s.beginTransaction();
		
		Student student=s.get(Student.class, id);
		student.setSname(name);
		student.setSbranch(branch);
		student.setScontact(number);
		student.setDOB(date);
		student.setAddress(address);
		
		
		tx.commit();
		s.close();
		response.sendRedirect("show_student.jsp");
		
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}

}
