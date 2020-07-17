<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Movie Info Application</title>
<!-- CSS only -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">

<!-- JS, Popper.js, and jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
	integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
	crossorigin="anonymous"></script>
</head>
<body>
	<!-- navbaar  start-->
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#">Movie Info Application</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="#">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
			</ul>
			<form action="getMovieInfos"  method="post"  class="form-inline my-2 my-lg-0" >
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search" name="name">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>
	<!-- navbar ends -->
	
	<!-- table starts -->
<div class="container">
	<table class="table">
	
	   <tr>
	      <td>Movie Poster</td>
	      <td><img src="${movieInfo.poster}" height="120 " width="150"/></td>
	    </tr>
	
	    <tr>
	      <td>Movie Title</td>
	      <td><h6>${movieInfo.title}</h6></td>
	    </tr>
	    
	    <tr>
	      <td>Movie Year</td>
	      <td><h6>${movieInfo.year}</h6></td>
	    </tr>
	    
	     <tr>
	      <td>Movie Rated</td>
	      <td><h6>${movieInfo.rated}</h6></td>
	    </tr>
	    
	    <tr>
	      <td>Movie Released</td>
	      <td><h6>${movieInfo.released}</h6></td>
	    </tr>
	    
	    <tr>
	      <td>Movie Runtime</td>
	      <td><h6>${movieInfo.runtime}</h6></td>
	    </tr>
	    
	    <tr>
	      <td>Movie Genre</td>
	      <td><h6>${movieInfo.genre}</h6></td>
	    </tr>
	    
	     <tr>
	      <td>Movie Director</td>
	      <td><h6>${movieInfo.director}</h6></td>
	    </tr>
	    
	    <tr>
	      <td>Movie Writer</td>
	      <td><h6>${movieInfo.writer}</h6></td>
	    </tr>
	    
	    <tr>
	      <td>Movie Actors</td>
	      <td><h6>${movieInfo.actors}</h6></td>
	    </tr>
	    
	    <tr>
	      <td>Movie Plot</td>
	      <td><h6>${movieInfo.plot}</h6></td>
	    </tr>
	    
	    <tr>
	      <td>Movie Language</td>
	      <td><h6>${movieInfo.language}</h6></td>
	    </tr>
	    
	     <tr>
	      <td>Movie Country</td>
	      <td><h6>${movieInfo.country}</h6></td>
	    </tr>
	    
	    <tr>
	      <td>Movie Awards</td>
	      <td><h6>${movieInfo.awards}</h6></td>
	    </tr>
	    
	     <tr>
	      <td>Movie Metascore</td>
	      <td><h6>${movieInfo.metascore}</h6></td>
	    </tr>
	    
	    
	    <tr>
	      <td>Movie IMDB Rating</td>
	      <td><h6>${movieInfo.imdbRating}</h6></td>
	    </tr>
	    
	    <tr>
	      <td>Movie IMDB Votes</td>
	      <td><h6>${movieInfo.imdbVotes}</h6></td>
	    </tr>
	    
	    <tr>
	      <td>Movie IMDB ID</td>
	      <td><h6>${movieInfo.imdbID}</h6></td>
	    </tr>
	</table>
	</div>
</body>
</html>