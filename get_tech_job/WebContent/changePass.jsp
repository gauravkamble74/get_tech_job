<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script> 
            function checkPassword(form) { 
                psw1 = form.psw1.value; 
                psw2 = form.psw2.value; 
  
                if (psw1 == '') 
                    alert ("Please enter Password"); 
         
                else if (psw2 == '') 
                    alert ("Please enter confirm password"); 
            
                else  (psw1 != psw2) { 
                    alert ("\nPassword did not match: Please try again...") 
                    return false; 
                } 
 
            } 
        </script>

</head>
<body>
<%
if(session.getAttribute("userid")==null)
response.sendRedirect("invalidate.jsp");
%>
<%
String uid=String.valueOf(session.getAttribute("userid"));

%>

<h2>Change Password</h2>
<br>
<%String user=request.getParameter("user"); %>
<h3>Logeed in - <%=user %> </h3>
<hr>
<form name="frm" onSubmit = "return checkPassword(this)" method="post" action="changePassword.jsp">
<table>
<tr>
<td>Current Password
<td><input type="password" name="psw">
</tr>
<tr>
<td>New Password
<td><input type="password" name="psw1">
</tr>
<tr>
<td>Confim Password
<td><input type="password" name="psw2">
</tr>
<tr>
<td>
<td><input type="submit" value="submit">
</tr>

</table>
<input type="reset" value="reset"> 
</form>
<br>
<a href="Customer.jsp">Home</a>


</body>
</html>