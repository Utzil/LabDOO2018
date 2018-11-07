<%-- 
    Document   : Login
    Created on : 6/11/2018, 11:40:28 PM
    Author     : uziel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="styles.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Practica 6: Login</title>
        
    </head>
    <body>
        <form action="Controlador" id="form" method="post" > 
            <fieldset>
                <legend>Login</legend>
                Correo:<br>
                <input size="50" type="text" name="correo">
                <br>
                Contraseña:<br>
                <input size="50" type="password" name="contra">
                <br>
                <br>
                <input type="submit" value="Entrar" > 
            </fieldset>
        </form>
    </body>
</html>
