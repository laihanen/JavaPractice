<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="projekti.model.Elokuva"%>
<jsp:useBean id="elokuvat" type="java.util.ArrayList<Elokuva>"
	scope="request" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link href="styles.css" rel="stylesheet" type="text/css">

<title>Elokuvat</title>


</head>
	<body>
	<div class="container">
		<div class="row">
		<div class="col-sm-2">&nbsp</div>
		<div class="col-sm-8 movie-table">
		<table class="table table-striped">
			<tr>
				<td>Id</td>
					<td>Nimi</td>
					<td>Arvio</td>
					<td>Genre</td>
					<td>Ohjaaja</td>
			</tr>
				<%for(int i = 0; i < elokuvat.size(); i++) {%>
				<tr>
					<td><%=elokuvat.get(i).getId()%></td>
					<td><%=elokuvat.get(i).getNimi()%></td>
					<td><%=elokuvat.get(i).getStar()%></td>
					<td><%=elokuvat.get(i).getGenre()%></td>
					<td><%=elokuvat.get(i).getOhjaaja()%></td>
				</tr>
				<% } %>
		</table>
		<div></div>
		</div>
		<div class="col-sm-2">&nbsp</div>
		</div class="row">
		<div class="col-sm-12 nappi">
		<p class="text-center"><a href="site" type="button" class="btn btn-primary btn-lg">Takaisin</a></p>
		</div>
		</div>
		</div>
	</body>
</html>