<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
	<h2>Spring's form select, option, options example</h2>
	<form:form method="POST" action="/EventDetails/SubmitMonth">
		
		<table>

			<tr>
				<td>Month :</td>
				<td>
					<!--<form:select path="date">
					  <form:option value="NONE" label="--- Select ---" />
					  <form:options items="${allmonths}"/>
				</form:select>
				--> <!-- For now try this --> <select name="month">

						<option value="1">January</option>
						<option value="2">February</option>
						<option value="3">March</option>

				</select>

				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
