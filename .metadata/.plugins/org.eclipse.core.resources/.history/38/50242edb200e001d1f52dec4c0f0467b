<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Weather</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
</head>
<body>
<h1>The current weather:</h1>
Location: ${weather.getLocation().areaDescription}<br>
Observation id: ${weather.getCurrentOb().id}<br>
Observation name: ${weather.getCurrentOb().name}<br>
Temperature: ${weather.getCurrentOb().Temp}<br>

<h1>This week's forecast:</h1>
<table>
<tr>
<c:forEach items="${weather.getTimeOb().startPeriodName}" var="times">
<td>${times} </td>
</c:forEach></tr>

<tr>
<c:forEach items="${weather.getDataOb().text}" var="data">
<td>${data} </td>
</c:forEach></tr>
</table>
</body>
</html>