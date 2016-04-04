<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create	 Customer Page</title>

</head>
<body>

	<form:form metho="POST" action="create" modelAttribute="customer">
		
		<table>
			<tr>
				<td>Name</td>
				<td><form:input path="cname"/></td>
			</tr>
			<tr>
				<td>street</td>
				<td><form:input path="street"/></td>
			</tr>
			<tr>
				<td>city</td>
				<td><form:input path="city"/></td>
			</tr>
			<tr>
				<td>state</td>
				<td><form:input path="state"/></td>
			</tr>
			<tr>
				<td>country</td>
				<td><form:input path="country"/></td>
			</tr>
			<tr>
				<td>zipcode</td>
				<td><form:input path="zipCode"/></td>
			</tr>

		</table>
		<input type="submit" value="create"/>
	
	</form:form>

</body>
</html>