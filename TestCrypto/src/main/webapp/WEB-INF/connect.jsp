<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Login</title>
	<link href="<c:url value='/ressources/bootstrap.min.css'/> " rel="stylesheet">
</head>
<body>
	
		<div class="d-flex justify-content-center align-items-center">
			<div class="shadow p-5 mt-5 bg-white rounded w-50" >
				<h1>Login ... </h1>
				<p>Scénario2: Ici on peut accéder à la page suivante en mettant "admin" comme username ou en changeant l'url en http://localhost:8080/TestCrypto/Auth?username=admin</p>
					<form method="post" class="mt-5">
					
			  		  <div class="form-group my-3">
					    <label for="username"> Username: </label>
						<input type="text" class="form-control" name="username" id="username"/>
					  </div>
					  
					  
					  <button type="submit" class="my-3 btn btn-primary">VALIDER</button>
					  
					</form>
			</div>
		</div>
		

</body>
</html>