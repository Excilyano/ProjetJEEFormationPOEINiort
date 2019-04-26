<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>101 Recettes Gourmandes - connexion</title>
</head>
<body>
	<%@ include file="./frag/header.jspf" %>
	<c:if test="${not empty erreur }">
		<div style="background-color: red">Nope</div>
	</c:if>
	<form action="Connexion" method="post">
		<div>
			<label for="mail">Adresse mail</label>
			<input id="mail" type="text" name="mail">
		</div>
		<div>
			<label for="password">Le mot de passe ?</label>
			<input id="password" type="password" name="password">
		</div>
		<div>
			<input type="submit" value="Me connecter">
		</div>
	</form>
</body>
</html>