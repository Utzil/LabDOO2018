<%-- 
    Document   : correcto
    Created on : 12/10/2018, 03:02:36 AM
    Author     : uziel
--%>
<%@page import="Modelo.User"%>
<%
    if (session.getAttribute("username") != null) {
        response.sendRedirect("correcto.jsp");
    }
    User user = new User("username", "password");
%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenido</title>
    </head>
    <body>

        <h1>Hola! Bienvenido! <% out.print(user.getFullName());%></h1>
        <form action="profileController.do" method="post"> 
            
        </form>
        <br>        
        <br>

        <a href="logoutController.do">Cerrar sesión</a>

    </body>
</html>
