<%-- 
    Document   : index
    Created on : 12/10/2018, 03:03:49 AM
    Author     : uziel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="styles.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio sesión</title>
    </head>
    <body>
    <form action="controlador.do" method="get">

    <label id="User" for="user">User</label>
    <input type="text" name ="user"><br>
    <label id="Password" for = "password">Password</label>
    <input type="password" name="password"><br>

    <input type="submit" value="Enviar">


    </body>
</html>
