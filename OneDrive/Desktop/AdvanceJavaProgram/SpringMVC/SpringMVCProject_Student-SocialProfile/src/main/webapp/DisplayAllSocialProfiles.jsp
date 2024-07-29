<%@page import="java.util.List"%>
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
	<%
	List<SocialProfile> profiles = (List<SocialProfile>) request.getAttribute("profilelist");
	int studentId = (int) request.getAttribute("studentId");
	%>
	<table border="2px">
		<tr>
			<td>SocialProfileId</td>
			<td>SocialprofileName</td>
			<td>Url</td>
			<td>UPDATE</td>
			<td>DELETE</td>
		</tr>

		<%
		for (SocialProfile ss : profiles) {
		%>
		<tr>
			<td><%=ss.getSocialProfileId()%></td>
			<td><%=ss.getSocialProfileName()%></td>
			<td><%=ss.getUrl()%></td>
			<td><a href="updateProfile?socialProfileId=<%=ss.getSocialProfileId() %>&studentId=<%=studentId%>">UPDATE</a></td>
			<td><a href="deleteProfile?socialProfileId=<%=ss.getSocialProfileId() %>&studentId=<%=studentId%>">DELETE</a></td>
			
		</tr>
		<%
		}
		%>
	</table>
	<h2>
		<a href="addNewProfile.jsp?studentId=<%=studentId%>">ADD New Profile</a>
	</h2>

</body>
</html>