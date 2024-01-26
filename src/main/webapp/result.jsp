<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.*"%>
 <%@ page  import="ma.ac.uiass.eia.springbootapp.employees.Employee"; %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employees List : </title>
</head>
<body>
<%
ArrayList <Employee> al = (ArrayList <Employee>)
	request.getAttribute("tab");
	for(Employee p: al){
		out.print("Hello " + p.getLastName() + " " + p.getFirstName());
	}
%>
</body>
</html>