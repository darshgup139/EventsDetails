<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.error {
	color: #ff0000;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
</head>
<body>
<h2>Spring's form select, option, options example</h2> 
 <form:form method="POST" action="/EventDetails/SubmitMonth">
		<form:errors path="*" cssClass="errorblock" element="div" />
		<table>

			<tr>
				<td>Month :</td>
				<td>
				<!--<form:select path="date">
					  <form:option value="NONE" label="--- Select ---" />
					  <form:options items="${allmonths}"/>
				</form:select>
				-->
				
				<!-- For now try this -->
				
				<select name="month">
				
					<option value="1">January</option>
					<option value="2">February</option>
					<option value="3">March</option>
				
				</select>
				
                                </td>
				<td><form:errors path="date" cssClass="error" /></td>
			</tr>
 	</table>
	</form:form>
</body>
</html>
