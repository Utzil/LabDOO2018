<%-- 
    Document   : Registro
    Created on : 13/10/2018, 11:41:48 PM 
    Author     : uziel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="styles.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Formulario</title>
    </head>
    <body>
        <div id=formulario">
            <form action="Controlador" id="dormulario" method="post" > 
                <fieldset>
                    <legend>Informacion Personal:</legend>
                    <label>Nombre:</label><br>
                    <input size="50" type="text" name="name" class="campos">
                    <br>
                    <label>Primer Apellido:</label><br>
                    <input size="50" type="text" name="lastname1" class="campos">
                    <br>
                    <label>Segundo Apellido:</label><br>
                    <input size="50" type="text" name="lastname2" class="campos">
                    <br>
                    <label>Fecha de Nacimiento:</label><br>
                    <input size="50" type="date" name="brtdy" class="campos">
                    <br>
                    <label>Correo:</label><br>
                    <input size="50" type="email" name="mail" class="campos">
                    <br>
                    <label>Contraseña:</label><br>
                    <input size="50" type="password" name="pass" class="campos">
                    <input size="50" type="hidden" name="varcontrol" value="1" class="boton">
                    <br>
                    <br>
                    <input type="submit" value="Registrar" class="boton"> 
                </fieldset>
            </form>
        </div>

    </body>
</html>
