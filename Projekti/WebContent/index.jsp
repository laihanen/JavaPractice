<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link href="styles.css" rel="stylesheet" type="text/css">
<title>Login</title>
</head>
<body>
	<div class="container">
    <div class="row">
    	<div class="col-sm-3">&nbsp</div>
        <div class="col-sm-6">
            <div class="account-wall">
                <img class="profile-img" src="images/login-icon.png"
                    alt="">
                <form action="Login" method="post" class="form-signin">
                <%
				String login_msg=(String)request.getAttribute("error");  
				if(login_msg!=null)
				out.println("<font color=red size=4px>"+login_msg+"</font>");
				%>
                <input type="text" name="username" class="form-control" placeholder="Username" required autofocus>
                <input type="password" name="password" class="form-control" placeholder="Password" required>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Kirjaudu sisään</button>
                </form>
            </div> 
        </div>
       <div class="col-sm-3">&nbsp</div>
    </div>
</div>
</body>
</html>