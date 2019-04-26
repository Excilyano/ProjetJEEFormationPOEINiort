<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>101 Recettes Gourmandes - inscription</title>
</head>
<body>
	<%@ include file="./frag/header.jspf" %>
	<form action="Inscription" method="post">
		<div>
			<label for="nom">Nom : </label>
			<input type="text" id="nom" name="nom">
		</div>
		
		<div>
			<label for="prenom">Prenom : </label>
			<input type="text" id="prenom" name="prenom">
		</div>
		<div>
			<label for="mail">Mail : </label>
			<input type="email" id="mail" name="mail">
		</div>
		<div>
			<label for="pass">Mot de passe : </label>
			<input type="password" id="pass" name="pass">
		</div>
		<div>
			<label for="com">Comment avez vous conne notre site : </label>
			<textarea id="com" name="com">Je suis obligé de répondre ?..</textarea>
		</div>
		
		<input type="submit">
	</form>
</body>
</html>