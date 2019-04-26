<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>101 Recettes Gourmandes - notre carte</title>
</head>
<body>
	<%@ include file="./frag/header.jspf" %>
	<h1>La carte des 101 Recettes Gourmandes</h1>
	<c:forEach var="menu" items="${menus }">
		<form action="DetailPlat" method="post">
			<input type="hidden" name="id_plat" value="${menu.id }">
			<h3>${menu.nom }</h3>
			<img onclick="submit();" alt="image ${menu.nom }" src="${menu.uri }" />
		</form>
		<hr>
	</c:forEach>
</body>
</html>