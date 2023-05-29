// Procedure


// new > dynamic we project >project_name(Dynamic_Project)> (just see Apache tomcat)> next
// tick on generate web.xml deployent> finsih> yes

// Go on Dynamic_Project folder> under that Java Resource> right click on src> new> class
// >class_name(Calculator Servlet)> finish 


1) paste code of Calculator Servlet

import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 
public class CalculatorServlet extends HttpServlet { 
public void doGet(HttpServletRequest req, 
HttpServletResponse res) throws ServletException { 
int result = 0; 
try { 
String number1 = req.getParameter("num1"); 
String number2 = req.getParameter("num2"); 
String operator = req.getParameter("opr"); 
int x = Integer.parseInt(number1); 
int y = Integer.parseInt(number2); 
if(operator.equals("+")) { 
result = x + y; 
} 
else if(operator.equals("-")) { 
result = x - y; 
} 
else if(operator.equals("*")) { 
result = x * y; 
} 
else if(operator.equals("/")) { 
result = x/y; 
} 
PrintWriter p = res.getWriter(); 
p.println("<h1> Result= "+ result); 
} 
catch(Exception e) {} 
} 
}




2) Now right lick on WebContent > new html file> Index.html > paste code of Index.html


<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator Application Using Servlet</title>
</head>
<body>
<form method=get action="./MyURL" >
Enter First Number <input type="text" name="num1"><br>
Enter Second Number <input type="text" name="num2" ><br>
Select an Operation<input type="radio" name="opr"
value="+">
ADDTION <input type="radio" name="opr" value="-">
SUBSTRACTION <input type="radio" name="opr" value="*">
MULTIPLY <input type="radio" name="opr" value="/">
DIVIDE <br><input type="reset">
<input type="submit" value="Calculate" >
</form>
</body>
</html> 


3) Under WEB-INF there is web.xml > paste code of web.xml

<web-app>
 
<servlet>
<servlet-name>calc</servlet-name>
<servlet-class>CalculatorServlet</servlet-class>
</servlet>
 
<servlet-mapping>
<servlet-name>calc</servlet-name>
<url-pattern>/MyURL</url-pattern>
</servlet-mapping>
</web-app>
// Go on index.html and run
