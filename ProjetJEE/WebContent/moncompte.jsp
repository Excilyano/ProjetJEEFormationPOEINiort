<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>101 Recettes Gourmandes - mon compte</title>
</head>
<body>
	<%@ include file="./frag/header.jspf" %>
	<form action="MonCompte" method="post">
	<p>NOT IMPLEMENTED YET</p>
		<div>
			<label for="mail">Mail : </label>
			<input type="email" id="mail" name="mail">
		</div>
		<div>
			<label for="pass">Mot de passe : </label>
			<input type="password" id="pass" name="pass">
		</div>
		
		<input type="submit">
	</form>
	
</body>
</html>