<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ page import="mypack.entity.Classes"%>
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
			
			<form action="adminLogout" method="post">
				<td><input type="submit" value="Logout"></td>
			</form>
		</tr>
	</table>

	<h2>Master List of Classes</h2>

	<%
	List<Classes> classesList = (ArrayList<Classes>) request.getAttribute("classes");
	if (classesList.size() == 0)
		out.println("No Classes found");
	else {
	%>


	<table border="1">

		<tr>

			<td>Class ID:</td>
			<td>Class Name</td>
		</tr>
		<c:forEach items="${classes}" var="clas">
			<tr>
				<td>${ clas.getClassId()}</td>
				<td>${ clas.getClassName()}</td>

			</tr>
		</c:forEach>
	</table>
	<%
	}
	%>
</body>
</html>