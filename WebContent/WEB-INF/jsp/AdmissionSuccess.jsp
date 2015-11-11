<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet" >
<title>Admission Success</title>
</head>
<body>

	<h1>${headerMessage}</h1>
	<h3>Congratulations!!! You submitted the student successfully!!!</h3>
	<h2>Details submitted for you: </h2>
	<form action="admissionForm" method="get">
	<table>
		<tr>
			<td>Student's name: </td>
			<td style="font-weight: bold; color: blue;">${student.studentName}</td>
		</tr>
		<tr>
			<td>Student's hobby: </td>
			<td style="font-weight: bold; color: blue;">${student.studentHobby}</td>
		</tr>
		<tr>
			<td>Student's mobile: </td>
			<td style="font-weight: bold; color: blue;">${student.studentMobile}</td>
		</tr>
		<tr>
			<td>Student's date of birth: </td>
			<td style="font-weight: bold; color: blue;">${student.studentDOB}</td>
		</tr>
		<tr>
			<td>Student's skills: </td>
			<td style="font-weight: bold; color: blue;">${student.studentSkills}</td>
		</tr>
		<tr>
			<td>Student's address: </td>
		 <td>Country: ${student.studentAddress.country} <br/>
			    City: ${student.studentAddress.city} <br/>
			  Street: ${student.studentAddress.street} <br/>
			 Pincode: ${student.studentAddress.pincode}</td>
		</tr>
		<tr>
			<td><input value="Back" type="submit" /></td>
		</tr>
	</table>
	</form>
	
</body>
</html>