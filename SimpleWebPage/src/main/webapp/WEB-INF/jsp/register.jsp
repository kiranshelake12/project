<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BIKE RENTAL SYSTEM</title>
</head>
<body>
<form:form action="register" method="POST" modelAttribute="UserData">
    <h1> BIKE RENTAL SYSTEM</h1>
<table>
<tr>
<th>User Id</th>
<td><form:input path="user_id"/></td>
</tr>

<tr>
<th>Address</th>
<td><form:textarea  path="address"/></td>
</tr>

<tr>
<th>Department</th>
<td><form:input  path="department"/></td>
</tr>

<tr>
<th>name</th>
<td><form:input  path="name"/></td>
</tr>

<tr>
<th>Phone</th>
<td><form:input  path="phone"/></td>
</tr>

</table>
 <input type="submit" value="Submit"  />



</form:form>


</body>
</html>