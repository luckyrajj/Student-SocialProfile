<%@page import="com.jsp.spring_mvc.entity.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% Student student=(Student)request.getAttribute("s"); %>
	<form action="saveUpdateStudent"method="post">
	<input type="number"value="<%=student.getStudentId()%>"readonly="readonly"name="studentId"><br>
	<input type="text"value="<%=student.getStudentName()%>"name="studentName"><br>
	<input type="text"value="<%=student.getStudentEmail() %>"name="studentEmail"><br>
	<input type="number"value="<%= student.getStudentMarks()%>"name="studentMarks"><br>
	<input type="number"value="<%=student.getStudentNumber()%>"name="studentNumber"><br>
	<input type="submit"value="Update">
	
	</form>
</body>
</html>