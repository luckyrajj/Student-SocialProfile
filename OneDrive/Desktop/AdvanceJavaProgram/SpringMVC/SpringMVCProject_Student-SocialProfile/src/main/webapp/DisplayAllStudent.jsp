	<%@page import="com.jsp.spring_mvc.entity.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Details Of All The Students!!</h1>
	<%List<Student>students=(List<Student>)request.getAttribute("studentlist"); %>
	<table border="2px">
		<tr>
		<td>StudentId</td>
		<td>StudentName</td>
		<td>StudentEmail</td>
		<td>StudentMarks</td>
		<td>StudentNumber</td>
		<td>SocialProfiles</td>
		<td>UPDATE</td>
		<td>DELETE</td>
		</tr>
		
	<% for(Student s:students){ %>	
		<tr>
		<td><%=s.getStudentId() %></td>
		<td><%=s.getStudentName() %></td>
		<td><%=s.getStudentEmail() %></td>
		<td><%=s.getStudentMarks() %></td>
		<td><%=s.getStudentNumber() %></td>
		<td><a href="viewSocialProfiles?studentId=<%=s.getStudentId()%>">VIEW</a></td>
		<td><a href="updateStudent?studentId=<%=s.getStudentId()%>">UPDATE</a></td>
		<td><a href="deleteStudent?studentId=<%=s.getStudentId()%>">DELETE</a></td>	
		<%} %>
		</tr>
	</table>
	<h2><a href="index.jsp"> <- Go Back To Dash</a></h2>
</body>
</html>