<%@page import="model.plants.*"%>
<%@page import="model.soilandpot.*"%>
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
	
	<style>
		* {
		  box-sizing: border-box;
		}
		
		/* Float four columns side by side */
		.column {
		  float: left;
		  width: 20%;
		  padding: 0 10px;
		}
		
		/* Remove extra left and right margins, due to padding */
		.row {margin: 0 -5px;}
		
		/* Clear floats after the columns */
		.row:after {
		  content: "";
		  display: table;
		  clear: both;
		}
		
		/* Responsive columns */
		@media screen and (max-width: 600px) {
		  .column {
		    width: 100%;
		    display: block;
		    margin-bottom: 20px;
		  }
		}
		
		/* Style the counter cards */
		.card {
		  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
		  text-align: center;
		  background-color: #f1f1f1;
		}
	</style>
	
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
	    <form class="form-inline my-2 my-lg-0" action='searchproduct.action' method='post'>
	      <input class="form-control mr-sm-2" type="text" name='searchWord' size='20' placeholder="Search For Products" aria-label="Search">
	      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
	    </form>
	  </div>
	</nav>
	
	<div class="container-fluid" style="color: #404040; padding: 40px; background-color: green;">
			<div class="card-deck">
				<% ChiliPeppers product[] = (ChiliPeppers[]) request.getAttribute("products"); %>
				<% for(int i = 0; i<product.length; i++){ %>
					<div class="card">
					  <h5 class="card-header"><%=product[i].getPlantName()%></h5>	
					  
					  <div class="card-body">
					  	<img class="border border-danger rounded" src="<%=product[i].getPlantPhoto() %>" height="200px" width="100%"  alt="Card image">
					    <p class="text-justify"><small class="card-text font-weight-light"><br><%=product[i].getPlantDescription()%></small></p>
					  </div>
					  <div class="card-footer">
					  	<h7 class="card-subtitle mb-2 text-muted">Php <%=product[i].getPlantPrice()%></h7>
					  </div>
					</div>
				<% } %>
			</div>
	</div>
	
</body>
</html>