<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
<f:view>
<cities>
	<headings>
	  <heading>City</heading>
	  <heading>Time</heading>
	  <heading>Population</heading>
	</headings>
<c:forEach var="city" items="${cities}">
	<city>
	  <name>${city.name}</name>
	  <time>${city.shortTime}</time>
	  <population>${city.population}</population>
	  </city>
	  </c:forEach>
</cities>
</f:view>
</body>
</html>