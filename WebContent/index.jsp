<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>saluto in base alla sessione</title>
</head>
<body>
	<form method="Get" action="salutatore">
		<input type="submit" name="bottone" value="SALUTAMI">
	</form>

	<p>${saluto}
</body>
</html>