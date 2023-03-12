<%@page import="beans.Stockage, java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList<Stockage> stock = (ArrayList<Stockage>) request.getAttribute("stock"); 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container pt-5">
	<h1>Liste des champs</h1>
	<ul class="pt-5">
		<c:forEach items="${stock}" var="stock">
			<li>${stock.champ}</li>
		</c:forEach>
	</ul>
</div>
</body>
</html>