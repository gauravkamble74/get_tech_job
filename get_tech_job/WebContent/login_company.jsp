<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Add a New Job</h3>
<form name="frm" method="post" action="AddJob">
<table>

<tr>
<td>Enter job Id</td>
<td><input type="text" name="jid"></td>
</tr>

<tr>
<td>Job Name</td>
<td><input type="text" name="jnm"></td>
</tr>

<tr>
<td>Age category</td>
<td><input type="text" name="agcat"></td>
</tr>

<tr>
<td>Job location</td>
<td><input type="text" name="jloc"></td>
</tr>

<tr>
<td>Job gender</td>
<td><input type="text" name="jgen"></td>
</tr>

<tr>
<td>Contact details</td>
<td><input type="text" name="jcon"></td>
</tr>

<tr>
<td>Apply date</td>
<td><input type="text" name="appdt"></td>
</tr>

<tr>
<td>Qualification req</td>
<td><input type="text" name="qual"></td>
</tr>

<tr>
<td>Company Id</td>
<td><input type="text" name="cid"></td>
</tr>

<tr>
<td></td>
<td><input type="submit" value="Submit"></td>
</tr>
</table>

</form>

<br><hr>
<h3>Delete Job</h3>
<form name="frm" method="post" action="delete_job.jsp">
Enter Job Id <input type="text" name="jid">
<input type="submit" value="Submit">
</form>

<br><br><hr><hr>

<h3>Modify Job </h3>
<h4 color:"red">Enter details that you want to modify otherwise leave empty</h4>
<form name="frm" method="post" action="ModifyJob">
<table>

<tr>
<td>Enter job Id</td>
<td><input type="text" name="jid"></td>
</tr>

<tr>
<td>Job Name</td>
<td><input type="text" name="jnm"></td>
</tr>

<tr>
<td>Age category</td>
<td><input type="text" name="agcat"></td>
</tr>

<tr>
<td>Job location</td>
<td><input type="text" name="jloc"></td>
</tr>

<tr>
<td>Job gender</td>
<td><input type="text" name="jgen"></td>
</tr>

<tr>
<td>Contact details</td>
<td><input type="text" name="jcon"></td>
</tr>

<tr>
<td>Apply date</td>
<td><input type="text" name="appdt"></td>
</tr>

<tr>
<td>Qualification req</td>
<td><input type="text" name="qual"></td>
</tr>

<tr>
<td>Company Id</td>
<td><input type="text" name="cid"></td>
</tr>

<tr>
<td></td>
<td><input type="submit" value="Submit"></td>
</tr>
</table>

</form>

<br><br><hr>
<h3>Change Password</h3>
<form name="frm" method="post" action="ChangeCompPass">
Enter current Password<input type="text" name="cpass"><br>
Enter new Password <input type="text" name="npass"><br>
<input type="submit" value="Submit"> 
</form>
</body>
</html>