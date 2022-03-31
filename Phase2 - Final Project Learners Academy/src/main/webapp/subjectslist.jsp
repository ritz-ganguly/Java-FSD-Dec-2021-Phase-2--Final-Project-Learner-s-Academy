<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ page import="mypack.entity.Subjects"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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

	<h2>Master List of Subjects</h2>
	<%
	List<Subjects> subjectsList = (ArrayList<Subjects>) request.getAttribute("subjects");
	if (subjectsList.size() == 0)
		out.println("No Subjects found");
	else {
	%>

	<table border="1">

		<tr>

			<td>Subject ID:</td>
			<td>Subject Name</td>
			<td>Class ID</td>
			<td>Class Name</td>
		</tr>
		<c:forEach items="${subjects}" var="subjs">
			<tr>
				<td>${ subjs.getSubjectId()}</td>
				<td>${ subjs.getSubjectName()}</td>
				<td>${ subjs.getClassId()}</td>
				<td>${ subjs.getClassName()}</td>
			</tr>
		</c:forEach>
	</table>
	<%
	}
	%>
</body>
</html>