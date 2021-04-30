<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="org.hibernate.*"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="myentities.*"%>

<%@page import="org.hibernate.query.Query"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2 style="background-color: azure; color: purple">Jobs for you
		near your Area...</h2>
	<hr>
	<table border="1" bordercolor="silver" cellspacing="0" width="80%">
		<tr style="background-color: black">
			<th>Job Name
			<th>Age category
			<th>Job location
			<th>Job gender
			<th>Contact details
			<th>Apply date
			<th>Qualification req
			<th>Company Id</th>

			<%
			String loc = request.getParameter("loc");
			String skill = request.getParameter("skill");

			Session ses;
			Configuration cfg = new Configuration().configure();
			SessionFactory sf = cfg.addAnnotatedClass(Job.class).buildSessionFactory();
			ses = sf.getCurrentSession();
			ses.beginTransaction();

			Query q = ses.createQuery("from Job where job_location=:loc");
			q.setParameter("loc", loc);
			List lst = q.getResultList();

			for (int i = 0; i < lst.size(); i++) {
				Job obj = (Job) lst.get(i);
			%>
		
		<tr>
			<td><%=obj.getJobnm()%>
			<td><%=obj.getAgecat()%>
			<td><%=obj.getJobloc()%>
			<td><%=obj.getJobgen()%>
			<td><%=obj.getContact()%>
			<td><%=obj.getApplydate()%>
			<td><%=obj.getQualification()%>
			<td><%=obj.getJobcmp()%> <%
 }
 %>
	</table>
	<br>
	<a href="index.jsp">Home</a>

</body>
</html>