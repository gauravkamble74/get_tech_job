<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
HttpSession s=request.getSession(true);

String ms=String.valueOf(session.getAttribute("msg"));

%>

<h3 style="color:blue"><%=ms %></h3>





</body>
</html>