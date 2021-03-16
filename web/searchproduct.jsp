<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Searched Product</title>

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
	<center>

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
		    <form class="form-inline my-2 my-lg-0" action='searchproduct.action' method='post'>
		      <input class="form-control mr-sm-2" type="text" id='searchWord' name='searchWord' size='20' placeholder="Search For Products" aria-label="Search">
		      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
		    </form>
		  </div>
		</nav>
		
		<div class="container-fluid" style="color: #404040; padding: 20px; background-color: green;">
			
			<div class="card" style="width: 300px;">
				<h5 class="card-header">${product.getPlantName()}</h5>	 
					<div class="card-body">
					  	<img class="border border-danger rounded" src="${product.getPlantPhoto()}" height="230px" width="100%"  alt="Card image">
					    <p class="text-justify"><small class="card-text font-weight-light"><br>${product.getPlantDescription()}</small></p>
					    <h5 class="text-justify">Preferred Soil</h5>
					    	<p class="text-justify"><small class="card-text font-weight-light">${product.getSoilAndPot().getPreferredSoil()}</small></p>
					    <h5 class="text-justify">Free Pot Type</h5>
					    	<p class="text-justify"><small class="card-text font-weight-light">${product.getSoilAndPot().getPotDescription()}</small></p>
					</div>
					<div class="card-footer">
					  	<h7 class="card-subtitle mb-2 text-muted">Php ${product.getPlantPrice()}</h7>
					</div>
			</div>
		</div>
		
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<form action='listproducts.action'>
		  		<a href="listproducts.jsp"><button class="btn btn-success" type='submit'>Back to Products List</button></a>
		  	</form>
		</nav>
		
	</center>
</body>
</html>