<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<form method="post" action=cadastroUsuario>
Nome&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="nome">
<br>
CPF&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="cpf">
<br>
Senha&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="senha">
<br>
<br>
<br>
Endereço
<br>
Nome da rua&nbsp&nbsp&nbsp&nbsp<input type="text" name="nomeRua">
<br>
Número&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="numero">
<br>
Complemento&nbsp&nbsp&nbsp<input type="text" name="complemento">
<br>
<br>
<br>
Filme
<br>
Nome do filme&nbsp&nbsp<input type="text" name="nomeFilme">
<br>
ano&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="ano">
<br>
<br>
Para inserir apenas filme apenas preencher o cpf.
<br>
<input type="submit">
<br>
<textarea rows="50" cols="40">
<%=request.getAttribute("filmes") %></textarea>
</form>
</body>
</html>