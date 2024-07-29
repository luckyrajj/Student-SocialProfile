<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% int studentId= Integer.parseInt(request.getParameter("studentId")); %>
<form action="addNewProfile?studentId=<%=studentId%>" method="post">
	
	<input type="number"placeholder="Enter the SocialProfileId"name="socialProfileId"><br>
	<input type="text"placeholder="Enter the SocialProfileName"name="socialProfileName"><br>
	<input type="text"placeholder="Enter the SocialProfileUrl"name="url"><br>
	<input type="submit"value="ADD">
</form>
</body>
</html>