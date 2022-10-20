<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="org.hibernate.Query"%>
    <%@page import="com.helper.factory_provider"%>
    <%@page import="org.hibernate.Session"%>
    <%@page import="org.hibernate.Query"%>
    <%@page import="java.util.List"%>
    <%@page import="java.lang.*"%>
    <%@page import="com.entities.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Students</title>
<%@include file="all_js_css.jsp" %>
</head>
<body>
	<%@include file="navbar.jsp"%>
	<h3><center> Student Details </center></h3>
	<div class="container">
	<br>
	<% 
		Session s=factory_provider.getfactory().openSession();
		Query q=s.createQuery("from Student");
	
		List<Student> list=q.list();
		out.print("<table class=\"table table-striped\"");
		out.print("<tr><th class=\"thead-dark\">Student Id</th><th> Student Name</th> <th> Student Branch</th> <th>Student Contact Number</th> <th>Student Date of Birth</th> <th>Student Address</th> <th>Update</th> <th>Delete</th> </tr>");
		
		for(Student st:list) {
			out.println("<tr>");
			out.print("<td>");
			out.print(st.getSid());
			out.print("</td>");
			out.print("<td>");
			out.print(st.getSname());
			out.print("</td>");
			out.print("<td>");
			out.print(st.getSbranch());
			out.print("</td>");
			out.print("<td>");
			out.print(st.getScontact());
			out.print("</td>");
			out.print("<td>");
			out.print(st.getDOB());
			out.print("</td>");
			out.print("<td>");
			out.print(st.getAddress());
			out.print("</td>");
			out.print("<td>");
			out.print("<a class=\"btn btn-success\" href=update.jsp?st_id="+st.getSid()+"> Update </a>");
			out.print("</td>");
			out.print("<td>");
			out.print("<a class=\"btn btn-danger\" href=delete?st_id="+st.getSid()+"> Delete </a>");
			out.print("</td>");
			out.print("</tr>");
		}
		out.print("</table>");
		s.close();
	%>
	
	</div>
</body>
</html>