<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	videos here
	<%
		 response.setHeader("cache-control", "no-cache,no-store,must-revalidaton");
	 response.setHeader("Pragma", "no-cache"); 
	    response.setDateHeader("Expires", 0);
    if(session.getAttribute("username")==null){
		response.sendRedirect("Login.jsp");
	}%>
	Welcome "${Username}"
	<form action="Logout">
		<input type="submit" value="Logout">
	</form>
	

</body>
</html>