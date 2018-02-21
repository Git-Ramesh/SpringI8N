<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details</title>
</head>
<body>
	<h1 style="color:black;text-align:center;">Student Details</h1>
	<table align="center" border="1">
		<tr>
			<td>StudentName: </td>
			<td>${student.studentName}</td>
		</tr>

		<tr>
			<td>Gender: </td>
			<td>${student.gender}</td>
		</tr>

		<tr>
			<td>Technologies: </td>
			<td>${student.technologies}</td>
		</tr>

		<tr>
			<td>City: </td>
			<td>${student.city}</td>
		</tr>
		
		<tr>
			<td>Phone: </td>
			<td>${student.phone}</td>
		</tr>
		<tr>
			<td>DOB</td>
			<td><fmt:formatDate pattern="MMM dd,yyyy" value="${student.dob}"/> </td>
		</tr>
		
	</table>
	<a href="/StudentRegistrationExample">home</a>
</body>
</html>