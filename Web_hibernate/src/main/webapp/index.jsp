<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link href="Bootstrap/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<div class="alert alert-danger" role="alert">
  Adicionado bootstrap com sucesso!
</div>
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

<form method="post" action=cadastroUsuario>
  <div class="form-group row">
    <label for="inputNome3" class="col-sm-2 col-form-label">Nome</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputNome3" placeholder="Nome" name="nome">
    </div>
  </div>
    <div class="form-group row">
    <label for="inputCPF3" class="col-sm-2 col-form-label">CPF</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputCPF3" placeholder="CPF" name="cpf">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputSenha3" class="col-sm-2 col-form-label">Senha</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" id="inputSenha3" placeholder="Senha" name="senha">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputNomeRua3" class="col-sm-2 col-form-label">Nome da rua</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputNomeRua3" placeholder="Nome da rua" name="nomeRua">
  </div>
  </div>
  <div class="form-group row">
    <label for="inputNumero3" class="col-sm-2 col-form-label">Número</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputNumero3" placeholder="Número" name="numero">
  	</div>
  </div>
  <div class="form-group row">
    <label for="inputComplemento3" class="col-sm-2 col-form-label">Complemento</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputComplemento3" placeholder="Complemento" name="complemento">
  	</div>
  </div>
  <fieldset class="form-group">
    <div class="row">
      <legend class="col-form-label col-sm-2 pt-0">Filmes</legend>
      <div class="col-sm-10">
        <div class="form-check" data-toggle="tooltip" data-placement="right" title="Adicionar">
          <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios1" value="option1" checked>
          <label class="form-check-label" for="gridRadios1">
            Adicionar
          </label>
        </div>
        <div class="form-check" data-toggle="tooltip" data-placement="right" title="Atualizar">
          <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios2" value="option2">
          <label class="form-check-label" for="gridRadios2">
            Atualizar
          </label>
        </div>
        <div class="form-check" data-toggle="tooltip" data-placement="right" title="Excluir">
          <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios3" value="option3">
          <label class="form-check-label" for="gridRadios3">
            Excluir
          </label>
        </div>
      </div>
    </div>
  </fieldset>
    <div class="form-group row">
    <label for="inputNomeFilme3" class="col-sm-2 col-form-label">Nome do filme</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputNomeFilme3" placeholder="Nome do filme" name="nomeFilme">
  	</div>
  </div>
  <div class="form-group row">
    <label for="inputAno3" class="col-sm-2 col-form-label">Ano do filme</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputAno3" placeholder="Ano do filme" name="ano">
  	</div>
  </div>
  <div class="form-group row">
    <div class="col-sm-10">
      <button type="submit" class="btn btn-primary">Executar ação</button>
    </div>
  </div>
</form>

</body>
</html>