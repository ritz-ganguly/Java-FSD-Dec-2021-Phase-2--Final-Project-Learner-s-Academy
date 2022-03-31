<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ page import="mypack.entity.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	if (session.getAttribute("adminUserid") == null)
		response.sendRedirect("adminlogin.jsp");
	%>


	<table border="1">
		<tr>
			<form action="listOfSubjects" method="post">
				<td><input type="submit" value="View Subjects' Master List"></td>
			</form>

			<form action="listOfTeachers" method="post">
				<td><input type="submit" value="View Teachers' Master List "></td>
			</form>


			<form action="listOfClasses" method="post">
				<td><input type="submit" value="View Classes' Master List "></td>
			</form>


			<form action="listOfStudents" method="post">
				<td><input type="submit" value="View Students' Master List "></td>
			</form>

			<form action="assignClassesForSubjects" method="post">
				<td><input type="submit" value="Assign Classes For Subjects"></td>
			</form>



			<form action="assignTeachersForSubjects" method="post">
				<td><input type="submit" value="Assign Teachers For Subjects"></td>
			</form>
		</tr>
	</table>
	<h2>Assign Teachers to Subjects</h2>

	<form action="assignTeachers" method="post">
		<table border="1">
			<tr>
				<td>Select the Subject from the List</td>
				<td><select name="subject">
						<c:forEach items="${subjects}" var="subjs">
							<option value="${subjs.getSubjectName()}">${subjs.getSubjectName()}</option>
						</c:forEach>
				</select></td>
			</tr>


			<tr>
				<td>Select the Teacher to whom you want to assign the Subject</td>

				<td><select name="teacher">
						<c:forEach items="${teachers}" var="teach">
							<option value="${teach.getFirstName()}">${teach.getFirstName()}</option>
						</c:forEach>
				</select></td>

			</tr>


			<tr>
				<td><input type="submit" value="Assign Teacher"></td>
			</tr>


		</table>

	</form>
</body>
</html>