<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>101 Recettes Gourmandes - nos restaurants</title>
</head>
<body>
	<%@ include file="./frag/header.jspf" %>
	<h1>Les restaurants des 101 Recettes Gourmandes</h1>
	<c:forEach var="restau" items="${restaurants }">
		<div>
			<h3>${restau.nom }</h3>
			<img alt="image ${restau.nom }" src="${restau.uri }" />
			<p>Le restaurant se trouve aux coordonnees ${restau.coord.x } ${restau.coord.y }, débrouillez-vous pour le trouver sur Maps...</p>
		</div>
	</c:forEach>
</body>
</html>