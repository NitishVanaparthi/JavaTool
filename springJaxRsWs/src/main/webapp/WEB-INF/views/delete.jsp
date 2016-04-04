<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Customer Page</title>
</head>
<body>

	Successfully delete the customer
	<form:form metho="POST" action="delete" modelAttribute="delete">
		<table>
			<tr>
				<td>Customer to delete from the database</td>
				<td><form:input path="customerId"/></td>
			</tr>
			

		</table>
		<input type="submit" value="delete"/>
	</form:form>

</body>
</html>