package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Student;
import com.helper.factory_provider;

public class SaveStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SaveStudent() {
        super();
        // TODO Auto-generated constructor stub
    } 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		Date d=new Date();
		String name=request.getParameter("name");
		String branch=request.getParameter("branch");
		String number=request.getParameter("number");
		String address=request.getParameter("address");
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = formatter.parse(request.getParameter("dob"));
		
        
        
		Student student=new Student(name,branch,number,date,address);
		
		
		System.out.println(student.getSid()+":::" + student.getSname());
		
		//save to database
		
		Session s=factory_provider.getfactory().openSession();
		Transaction t=s.beginTransaction();

        s.save(student);
        
    
        s.getTransaction().commit();
        s.close();

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("added");
		
		
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
