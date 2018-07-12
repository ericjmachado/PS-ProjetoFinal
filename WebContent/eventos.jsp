<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Eventos UFG</title>
</head>
<body>

	<c:forEach var="evento" items="${eventos}">
	
	${evento}
		
	</c:forEach>
</body>
</html>