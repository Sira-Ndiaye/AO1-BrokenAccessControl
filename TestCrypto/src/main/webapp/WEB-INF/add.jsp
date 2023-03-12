<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
</head>
<body>
	<div class="d-flex justify-content-center align-items-center">
		<div class="mt-5">
			<h1>Écrivez quelque chose</h1>
			<a>Scénario1: Ici on a la possibilité d'écrire tout et n'importe quoi, des scripts inclus</a>
			<form method="get" class="mt-5">
				  <div class="form-group my-3 ">
				  	<label for="champ" class="form-label">Champ : </label>
					<input 
						type="text" 
						name="champ" id="champ"
					/>
				  </div>
				  
				  <div class='mt-5 d-flex justify-content-between'>
				  
				  	<a href="Logout" class="btn btn-primary">LOG OUT</a>
				  
				  	<button type="submit" class="btn btn-primary">VALIDER</button>
				  </div>
				  
			 </form>
		</div>
	</div>
	
</body>
</html>