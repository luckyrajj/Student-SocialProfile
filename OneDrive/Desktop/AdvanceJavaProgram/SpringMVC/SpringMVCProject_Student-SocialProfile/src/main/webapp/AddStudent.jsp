<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Add the details of New Student!!</h1>
	<form action="addStudent"method="post">
		<input type="number"placeholder="Enter the StudentId"name="studentId"><br>
		<input type="text"placeholder="Enter the StudentName"name="studentName"><br>
		<input type="text"placeholder="Enter the StudentEmail"name="studentEmail"><br>
		<input type="number"placeholder="Enter the StudentMarks"name="studentMarks"><br>
		<input type="number"placeholder="Enter the StudentNumber"name="studentNumber"><br>
		<input type="submit"value="Add">
	</form>
</body>
</html>