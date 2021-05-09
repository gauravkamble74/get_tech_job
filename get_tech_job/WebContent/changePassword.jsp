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
if(session.getAttribute("userid")==null)
response.sendRedirect("invalidate.jsp");
%>
<%
try {
String uid=String.valueOf(session.getAttribute("userid"));

String currentPass=request.getParameter("psw");
String newPass=request.getParameter("psw1");


	Session ses;
	Configuration cfg=new Configuration().configure();
	SessionFactory sf=cfg.addAnnotatedClass(Users.class).buildSessionFactory();
	ses=sf.getCurrentSession();
	ses.beginTransaction();
	
	Query q=ses.createQuery("from Users where userid=:id and pswd=:ps");
	q.setParameter("id", uid);
	q.setParameter("ps", currentPass);
	
	List lst=q.getResultList();
	
	if(lst.size()>0)
	{
		Query qa=ses.createQuery("update Users set pswd=:pass where userid=:id");
		qa.setParameter("pass",newPass);
		qa.setParameter("id", uid);
		%>
		
		<h2 style="color:green;">Password Change Successfully </h2>

		<%
	}
	else
	{%>
	<h2 style="color:red;">Current Password worng</h2>	
	<hr>
	<a href="index.jsp">Home</a>

<%
}

}
catch(Exception e)
{
	e.printStackTrace();
}

%>


</body>
</html>