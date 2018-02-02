<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link href="styles.css" rel="stylesheet" type="text/css">
<title>Insert title here</title>
</head>
<body>

	<div class="container" id="lisaa">
		<div class="row">
		<div class="col-sm-3">&nbsp</div>
			<div class="col-sm-6 lisaa-elokuva">
				<form method="post">			
					<div class="form-group">
					    <label for="idInput">Tunniste</label>
					    <input type="text" name="id" class="form-control" aria-describedby="idInput" placeholder="Enter movie id">
				  	</div>
				  	<div class="form-group">
					    <label for="nameInput">Nimi</label>
					    <input type="text" name="nimi" class="form-control" aria-describedby="nameInput" placeholder="Enter movie name">
				  	</div>
				  	<div class="form-group">
				    <label for="rateInput">Arvio</label>
				    <select class="form-control" type="text" name="star" id="rateInput">
				      <option>1</option>
				      <option>2</option>
				      <option>3</option>
				      <option>4</option>
				      <option>5</option>
				    </select>
				  	</div>
				  	<div class="form-group">
					    <label for="genreInput">Genre</label>
					    <input type="text" name="genre" class="form-control" id="genreform" aria-describedby="genreInput" placeholder="Enter movie genre">
				  	</div>
					<div class="form-group">
					    <label for="directorInput">Ohjaaja</label>
					    <input type="text" name="ohjaaja" class="form-control" id="directorform" aria-describedby="directorInput" placeholder="Enter director name">
				  	</div>
						<input type="submit" name="submit-button" class="submit-button" value="Tallenna" />
						<a href="site" ></button>Peruuta</button></a>
					</td>
				</tr>
				</form>	
				<div class="col-sm-3">&nbsp</div>
		</div>
		</div>
		</div>
			
</body>
</html>