<%@ page language="java" contentType="text/html;
charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title>Index page</title>
</head>
<body>
<h2>To add new Client</h2>
<form action="addClient" method="post">
<label id="nom">Nom :</label> <input type="text" name=lastName>
<label id = "prenom">Prenom :</label> <input type="text" name="firstName">
<button type="submit">Envoyer</button>
</form>
</body>
</html>