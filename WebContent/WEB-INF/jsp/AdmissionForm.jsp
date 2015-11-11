<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet" >
<title>Admission Form</title>
</head>
<body>
	<h1>${headerMessage}</h1>
	<h2>STUDENT ADMISSION FORM FOR COURSES</h2>
	
	<form:errors class="error-mess" path="student.*" />
	
	<form action="/FirstSpringMVCProject/submitAdmissionForm.html" method="post">
	<table>
		<tr>
			<td>Student's name: </td>
			<td><input type="text" name="studentName"></input></td>
		</tr>
		<tr>
			<td>Student's hobby: </td>
			<td><input type="text" name="studentHobby"></input></td>
		</tr>
		<tr>
			<td>Student's mobile: </td>
			<td><input type="text" name="studentMobile"></input></td>
		</tr>
		<tr>
			<td>Student's date of birth: </td>
			<td><input type="text" name="studentDOB" placeholder="dd.MM.yyyy"></input></td>
		</tr>
		<tr>
			<td>Student's skills: </td>
			<td>
				<select name="studentSkills" multiple>
					<option value="Java Core">Java Core</option>	
					<option value="Spring Core">Spring Core</option>
					<option value="Spring MVC">Spring MVC</option>
				</select>
			</td>
		</tr>
		
	</table>
	
	<table>
		<tr><td><h3>Student's Address:</h3></td></tr>
		<tr>
			<td>Country: </td>
			<td><input type="text" name="studentAddress.country"></input></td>
		</tr>
		<tr>
			<td>City: </td>
			<td><input type="text" name="studentAddress.city"></input></td>
		</tr>
		<tr>
			<td>Street: </td>
			<td><input type="text" name="studentAddress.street"></input></td>
		</tr>
		<tr>
			<td>Pin code: </td>
			<td><input type="text" name="studentAddress.pincode"></input></td>
		</tr>
		<tr>
			<td><input type="submit" value="Submit student" /></td>
		</tr>
	</table>
	</form>
	
</body>
</html>