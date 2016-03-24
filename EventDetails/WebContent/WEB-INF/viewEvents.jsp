<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${!empty events}">

		<table border="1">
			<tr>
				<th>User Name</th>
				<th>User Role</th>
			</tr>
			<c:forEach items="${events}" var="ed">
				<tr>
					<td><c:out value="${ed.event_id}" /></td>
					<td><c:out value="${ed.event_type}" /></td>
					<td><c:out value="${ed.company_id}" /></td>
					<td><c:out value="${ed.approved}" /></td>
					<td><c:out value="${ed.date}" /></td>
					<td><c:out value="${ed.venue}" /></td>
					<td><c:out value="${ed.times}" /></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	<tr>
		<td><a href="/AddTPC/InsertUser">Assign TPC and Tasks</a></td>
	</tr>
</body>
</html>