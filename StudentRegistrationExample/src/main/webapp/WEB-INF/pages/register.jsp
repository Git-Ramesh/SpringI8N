<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags"  prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Student</title>
	<style type="text/css">
		.error{
			color:red;
			background: #FFE4E1;
			align-items: center;
			border:0px;
			margin-left:300px;
			margin-right:300px;
			border-radius: 6px;
			padding: 10px;
			
		}
	</style>
</head>
<body>
	<h1 style="color:black;text-align:center;">Student Registration Form</h1>
	<%-- <div class="error">
		<form:errors path="student.*"/>
	</div> --%>
	<form:form action="/StudentRegistrationExample/registerSuccess" method="POST" commandName="student">
		<table align="center" width="400">
			<tr>
				<td>StudentName: </td>
				<td><form:input path="studentName"/></td>
				<td>
					<form:errors path="studentName" cssStyle="color:red;"/>
				</td>
			</tr>
			<tr>
				<td>Gender: </td>
				<td>
					<form:radiobuttons path="gender" items="${genders}" />
				</td>
				<td>
					<form:errors path="gender" cssStyle="color:red;"></form:errors>
				</td>
			</tr>
			<tr>
				<td>Technologies: </td>
				<td>
					<form:select path="technologies" multiple="true">
						<form:options items="${technologies}"/>
					</form:select> 
				</td>
				<td>
					<form:errors path="technologies" cssStyle="color:red;"/>
				</td>
			</tr>
			<tr>
				<td>City: </td>
				<td>
					<form:select path="city">
						<form:option value="">City</form:option>
						<form:options items="${cities}"/>
					</form:select>
				</td>
				<td>
					<form:errors path="city" cssStyle="color:red;"/>
				</td>
			</tr>
			<tr>
				<td>Phone: </td>
				<td><form:input path="phone"/></td>
				<td>
					<form:errors path="phone" cssStyle="color:red;"/>
				</td>
			</tr>
			<tr>
				<td>DOB</td>
				<td><form:input path="dob"/>(yyyy-MM-dd)</td>
				<td>
					<form:errors path="dob" cssStyle="color:red;"/>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="reset" value="Reset"/><input type="submit" value="Register"> </td>
			</tr>
		</table>
	</form:form>
</body>
</html>