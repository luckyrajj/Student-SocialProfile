<%@page import="com.jsp.spring_mvc.entity.SocialProfile"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% SocialProfile sProfile=(SocialProfile)request.getAttribute("socialProfile");
	int studentId=(int)request.getAttribute("studentId");
%>
	<form action="saveUpdateSocialProfile?studentId=<%=studentId%>"method="post">
	<input type="number"value="<%=sProfile.getSocialProfileId()%>"readonly="readonly"name="socialProfileId"><br>
	<input type="text"value="<%=sProfile.getSocialProfileName()%>"name="socialProfileName"><br>
	<input type="text"value="<%=sProfile.getUrl() %>"name="url"><br>
	
	<input type="submit"value="Update">
	
	</form>
</body>
</html>