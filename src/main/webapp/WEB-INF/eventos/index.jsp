<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Eventos</title>
</head>
<body>

<h1>Bienvenido a Eventos</h1><hr>

<h1>Registrarse</h1>

<form action="/" method="post" modelAttribute="usuarios">
    <p>
        <label path="nombre">Nombre :</label>        
        <input path="nombre"/>
    </p>
    <p>
        <label path="apellido">Apellido :</label>        
        <input path="apellido"/>
    </p>
     <p>
        <label path="ciudad">Ciudad :</label>        
        <input path="ciudad"/>
    </p>
     <p>
        <label path="email">Email :</label>        
        <input type="text">
    </p>  
    
     <p>
        <label path="password">Password :</label>        
        <input type="password">
    </p>
     <p>
        <label path="confPassword">Confirma Password :</label>        
        <input type="password">
    </p>
   
    <input type="submit" value="Registrar"/>
</form><hr><br>

<h1>Login</h1>

<form action="/" method="post" modelAttribute="usuarios">

    <p>
        <label path="email">Email :</label>        
        <input type="text">
    </p>  
 	<p>
        <label path="password">Password :</label>        
        <input type="password">
    </p>  
    
    <input type="submit" value="Login"/> 
    
</form>  

</body>
</html>