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
<%
			String jid = request.getParameter("jid");
			
			Session ses;
			Configuration cfg = new Configuration().configure();
			SessionFactory sf = cfg.addAnnotatedClass(Job.class).buildSessionFactory();
			ses = sf.getCurrentSession();
			ses.beginTransaction();

			Query q=ses.createQuery("delete Job where job_id=:jid");
			q.setParameter("jid", jid);
			int cnt=q.executeUpdate();
			ses.getTransaction().commit();

			if(cnt>0)
				out.println("<h3>Job deleted successfully</h3>");
			else
				out.println("<h3>Job does not Exist</h3>");
			
 %>
</table>
<br>
<a href="index.jsp">Home</a>

</body>
</html>