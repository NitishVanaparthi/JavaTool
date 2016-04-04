<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Customer Page</title>
</head>
<body>

	<form:form metho="POST" action="update" modelAttribute="update">
		<table>
			<tr>
				<td>Name of the customer to get updated</td>
				<td><form:input path="cname"/></td>
			</tr>
			<tr>
				<td>Id of the customer to be updated</td>
				<td><form:input path="customerId"/></td>
			</tr>
		</table>
		<input type="submit" value="update"/>
	</form:form>

</body>
</html>