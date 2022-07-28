<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<h1>Weather search</h1>
<form class="form" action="/weather-display" method="post">
	Latitude <input type="text" name="latitude"><br><br>
	Longitude <input type="text" name="longitude"><br><br>
	<input type="submit">
</form>
</body>
</html>