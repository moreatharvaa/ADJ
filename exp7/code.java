// Procedure


// new > dynamic we project >project_name(Dynamic_Project)> (just see Apache tomcat)> next
// tick on generate web.xml deployent> finsih> yes

// Go on Dynamic_Project folder> under that Java Resource> right click on src> new> class
// >class_name(Validation)> finish 

// Copy code of validation > paste on validation file

// Now Web content> new > html file > html_filename(Login.html)>Finish

// Copy html code and paste on that file

// run on login.html > select tomcat v8.5


Validation.java:

import java.io.*;
import java.util.*;
import javax.servlet.*;
public class Validation extends GenericServlet
{
public void service(ServletRequest req,ServletResponse res)throws
ServletException,IOException
{
PrintWriter pw=res.getWriter();
String x=req.getParameter("user");
String y=req.getParameter("pwd");
if(x.equals("admin")&&y.equals("admin"))
pw.println("<font color='green' size='5'>Welcome to this webpage</font>");
else
pw.println("<font color='red' size='5'>Invalid username or password</font>");
pw.close();
}
}

Login.html:


<html>
<head><title>login</title></head>
<body>
<form name="login form" method="post"
action="http://localhost:8080/examples/servlet/Validation">
<br/><br/><br/><br/><br/>
<table align="center" border="3" border color="blue" cellspacing="0"height="120">
<tr><td align="center"><font color="blue" size="4">LOGIN FORM</font></td></tr>
<tr><td><table><tr><td>UserName</td><td><input type="text" name="user"/></td></tr>
<tr><td>Password</td><td><input type="password" name="pwd"/></td></tr>
<tr><td align="center"><input type="submit" value="LOGIN"/></td><td
align="center"><input type="Reset" value="RESET"/></td></tr>
</table></td></tr></table></form></body>
</html>
