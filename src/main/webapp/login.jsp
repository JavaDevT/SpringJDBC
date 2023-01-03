<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${error}</h1> 

<h1>Hi Test demo</h1>

 
<form action="/userlogin" method="post">
		UserName <input type="text" name="userName" placeholder=""/>
		<br/><br/>
		Password <input type="password" name="password" placeholder=""/>
		<br/><br/>
			<button>Submit</button>

	</form>
 </body>
</html>