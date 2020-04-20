<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="br.com.fiap.servlet.ConsumoService"%>
<%@page import="br.com.fiap.service.ProdutoServiceStub"%>
<%@page import="br.com.fiap.service.ProdutoServiceStub.Produto"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<style>
.alert {
	padding: 20px;
	background-color: #64FF33;
	font-size: 24px;
	color: white;
}

.closebtn {
	margin-left: 15px;
	color: white;
	font-weight: bold;
	float: right;
	font-size: 24px;
	line-height: 20px;
	cursor: pointer;
	transition: 0.3s;
}

.closebtn:hover {
	color: black;
}
</style>
<meta charset="UTF-8">

<%
	try {
	String msg;
	int i = (Integer) request.getAttribute("resp");
	if (i == 1) {
		msg = "cadastrado com Sucesso";
	} else
		msg = "Algo deu errado";
%>

<div class="alert">
	<span class="closebtn"
		onclick="this.parentElement.style.display='none';">&times; </span>
	<%=msg%>
</div>

<%
	} catch (Exception e) {
}
%>

<title>Cadastro</title>
</head>
<body>
	<p>
	<h1>Cadastro</h1>
	</p>
	<form action="ConsumoService" method="POST">
		<p>
			<label for="name">Digite o nome do produto:</label> <input
				type="text" placeholder="Nome do produto" id="name" name="name">
		</p>
		<p>
			<label for="desc">Digite a descrição do produto:</label> <input
				type="text" placeholder="Descrição do produto" id="desc" name="desc">
		</p>
		<p>
			<label for="fab">Digite o fabricante do produto:</label> <input
				type="text" placeholder="Fabricante do produto" id="fab" name="fab">
		</p>
		<p>
			<label for="val">Digite o valor do produto:</label> <input
				type="text" placeholder="Valor do produto" id="val" name="val">
		</p>
		<p>
			<button type="submit">Cadastrar</button>
		</p>
	</form>
	<p>
	<h1>Cadastrados</h1>
	</p>
	<table>
		<tr>
			<td>Nome</td>
			<td>Descrição</td>
			<td>Fabricante</td>
			<td>Valor</td>
		</tr>
		<%
			try {
			Produto[] list = (Produto[]) request.getAttribute("Lista");
			for (Produto p : list) {
		%>
		<tr>
			<td><%=p.getNome()%></td>
			<td><%=p.getDesc()%></td>
			<td><%=p.getFabricante()%></td>
			<td><%=p.getValor()%></td>
		</tr>
		<%
			}
		} catch (Exception e) {
		}
		%>
	</table>

</body>
</html>
