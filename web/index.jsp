<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

	<title>Cantores Company</title>

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" 
		integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
		
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" 
	integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" 
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" 
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
		
</head>
<body>
	
	
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	  <img src="images/logo/Prots.PNG" height="55px" width="55px" alt="logo">
	  <a class="navbar-brand" href="#"></a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	
	  <div class="collapse navbar-collapse" id="navbarSupportedContent">
	    <ul class="navbar-nav mr-auto">
	      <li class="nav-item active">
	        <a class="nav-link" href="#"><h3>Prots Greenery</h3><span class="sr-only">(current)</span></a>
	      </li>
	    </ul>
	  </div>
	</nav>
	<br>
	
	<div class="jumbotron">
		  <h1 class="display-3" style="color:green">Welcome!</h1>
		  <p class="lead">In Prots Greenery, we believe that a healthy lifestyle begins with healthier diet choices. 
		  	<br>Begin your journey towards a healthier lifestyle by buying your own houseplant now!</p>
		  <hr class="my-2">
		  <p>&copy <span class="font-weight-light">programmed by</span> Jefferson R. Cantores</p>
		  <p class="lead">
		  	<form action='listproducts.action'>
				<input class="btn btn-outline-success btn-lg" type='submit' name='findProduct' role="button" value="See ALL Products"/>
			</form>
		</p>
	</div>
	
	

</body>
</html>