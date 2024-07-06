<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BIKE RENTAL SYSTEM</title>
</head>
<body>
<form>:form action="register" method="POST" modelAttribute="UserData">
User Name : <input type="text" name="name" /><br><br> 

Password : <input type="password" name="password" /><br><br> 

<input type="submit" />
</form>
<a href="/register">login</a>
</body>
</html>