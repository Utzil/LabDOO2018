<%-- 
    Document   : formulario
    Created on : 27/09/2018, 09:54:45 PM
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
        <div id="formul">
            <section>
                <form action="respuestas.jsp" method="post">
                    <h1>Captura</h1>
                    <br>
                    <label>Nombre:</label><br>
                    <input type="text" class="campos" name="txt-name" required=""/>
                    <br/>
                    <br> 
                    <label>Primer Apellido:</label><br>
                    <input type="text" class="campos" name="first-lastname" required=""/>
                    <br/>

                    <br>
                    <label>Segundo apellido:</label><br>
                    <input type="text" class="campos" name="second-lastname"/>
                    <br/>

                    <br>
                    <label>Fecha de nacimiento: </label><br>
                    <input type="date" class="campos" name="birthday" />
                    <br/>

                    <br>
                    <label>Correo electrónico: </label><br>
                    <input type="email" class="campos" name="correito" required=""/>
                    <br/>

                    <br>
                    <label>Password: </label><br>
                    <input type="password" class="campos" placeholder="Contraseña" name="contra" />
                    <br/>

                    <br>
                    <input type="submit" class="boton" value="Enviar"/>
                    <br/>    
                    <br>
                    <input type="reset" class="boton" value="Borrar Datos"/>
                    <br/> 
                </form>
        </div>
    </section>
</body>
</html>
