<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="navbar.jsp"%>
<%@page import="org.hibernate.Query"%>
    <%@page import="com.helper.factory_provider"%>
    <%@page import="org.hibernate.Session"%>
    <%@page import="org.hibernate.Query"%>
     <%@page import="org.hibernate.Transaction"%>
    <%@page import="java.util.List"%>
    <%@page import="java.io.*"%>
    <%@page import="java.lang.*"%>
    <%@page import="com.entities.Student"%>


</head>
<body>
<div class="container">
	<%
	
		int s_id=Integer.parseInt(request.getParameter("st_id").trim());
		Session s=factory_provider.getfactory().openSession();
		Transaction t=s.beginTransaction();
		Student st=(Student)s.get(Student.class, s_id);
		
	%>
	  <form action="UpdateStudent" method="post">
	  
	  <input type="hidden" value="<%=st.getSid() %>" name="sid"/>
  <div class="form-group">
    <label for="IDName">Student Name</label>
    <input type="text" name="name" class="form-control" id="IDName" aria-describedby="Name" value="<%=st.getSname() %>">
  </div>
  <div class="form-group">
    <label for="IDBranch">Student Branch</label>
    <input type="text" name="branch" class="form-control" id="IDBranch" value="<%=st.getSbranch()%>" required>
  </div>
  <div class="form-group">
    <label for="IDContact">Student Contact Number</label>
    <input type="text" name="number" class="form-control" id="IDContact" aria-describedby="Contact" value="<%=st.getScontact() %>">
  </div>
<div class="form-group">
    <label for="IDDOB">Student Date of Birth</label>
    <input type="text" name="dob" class="form-control" id="IDDOB" value="<%=st.getDOB() %>" >
  </div> 
  <div class="form-group">
    <label for="IDAddress">Student Address</label>
    <textarea name="address" class="form-control" id="IDAddress"> <%=st.getAddress()%>
    
    </textarea>
    
  </div>
  <button type="submit" class="btn btn-success">Update</button>
</form>
	</div>
</body>
</html>