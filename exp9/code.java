// Procedure
// new > dynamic we project > give name to the project
// 1) Java resources > right click > new > jsp file > jsp_name(Hello) > paste code of hello
// > run


// 2) Java resources > right click > new > jsp file > jsp_name(Date) > paste code of Date
// > run


SOURCE CODE for Hello:

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello</title>
</head>
<body>
<h1>Hello T.E. Students,Welcome to DIT</h1>
<%
out.println("<p>This web page is produced by JSP");
%>
</body>
</html>


SOURCE CODE for Date:


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Todays Date</title>
</head>
<body>
<h1>Todays Date is</h1>
The date now is: <%= new java.util.Date() %>
</body>
</html>
