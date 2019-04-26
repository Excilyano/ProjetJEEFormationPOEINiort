<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>101 Recettes Gourmandes - ${menu.nom }</title>
</head>
<body>
	<%@ include file="./frag/header.jspf" %>
	<h1>${menu.nom }</h1>
	<img alt="image ${menu.nom }" src="${menu.uri }" />
	<p>Ingredients : ${menu.ingredients }</p>
	
	<h2>Commentaires</h2>
	<h4>Ce plat a été noté ${average } par ses consommateurs !</h4>
	
	<c:if test="${not empty role }">
		<form action="AjouterCommentaire" method="post">
			<input type="hidden" name="menu_id" value="${menu.id }">
			<div>
				<label for="rating">Note : </label>
				<input type="range" min="0" max="5" id="rating" name="rating">
			</div>
			
			<div>
				<label for="new_comment">Commentaire : </label>
				<textarea id="new_comment" name="new_comment"></textarea>
			</div>
			
			<input type="submit">
		</form>
	</c:if>
	
	<c:forEach var="comment" items="${commentaires }">
		<div>
			<p>${comment.mailUser} : ${comment.note }</p>
			<p>${comment.com }</p>
		</div>
		<c:if test="${role == \"ADMIN\" }">
			<form action="SupprimerCommentaire" method="post">
				<input type="hidden" name="comment_id" value="${comment.id }">
				<input type="hidden" name="menu_id" value="${menu.id }">
				<input type="submit" value="Supprimer ce commentaire">
			</form>
		</c:if>
		<hr>
	</c:forEach>
</body>
</html>