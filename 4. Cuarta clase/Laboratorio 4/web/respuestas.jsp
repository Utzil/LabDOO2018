<%-- 
    Document   : respuestas
    Created on : 27/09/2018, 10:45:31 PM
    Author     : uziel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="misEstilos.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>        
    </head>
    <body>
        

        <%
            String name = (String) request.getParameter("txt-name");
            String ape1 = (String) request.getParameter("first-lastname");
            String ape2 = (String) request.getParameter("second-lastname");
            String hday = (String) request.getParameter("birthday");
            String correo = (String) request.getParameter("correito");
            String password = (String) request.getParameter("contra");

            out.print("<h2>Bienvenido " + name + " !</h2>");            
            out.print("<h3>Información Personal: </h3>");            
            out.print("<h4>Nombre Completo: </h4>" + name + " " + ape1 + " " + ape2);            
            out.print("<h4>Fecha de Nacimiento: </h4>" + hday);            
            out.print("<h4>Correo: </h4>" + correo);            
            out.print("<h3>Password: </h4>" + password);
            
        %>
    </body>
</html>
 