<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
<%@include file="navbar.jsp"%>

</head>
<body>
	  <div class="container">
	  
	  <!-- form -->
	  <form action="SaveStudent" method="post">
  <div class="form-group">
    <label for="IDName">Student Name</label>
    <input type="text" name="name" class="form-control" id="IDName" aria-describedby="Name" placeholder="Enter name" required>
  </div>
  <div class="form-group">
    <label for="IDBranch">Student Branch</label>
    <input type="text" name="branch" class="form-control" id="IDBranch" placeholder="Branch" required>
  </div>
  <div class="form-group">
    <label for="IDContact">Student Contact Number</label>
    <input type="text" name="number" class="form-control" id="IDContact" aria-describedby="Contact" placeholder="Enter Contact Number" required>
  </div>
  <div class="form-group">
    <label for="IDDOB">Student Date of Birth</label>
    <input type="date" name="dob" class="form-control" id="IDDOB" placeholder="DOB" required>
  </div>
  <div class="form-group">
    <label for="IDAddress">Student Address</label>
    <textarea name="address" class="form-control" id="IDAddress" placeholder="Address" required>
    
    </textarea>
    
  </div>
  <button type="submit" class="btn btn-primary">Add</button>
</form>
</div>
</body>
</html>