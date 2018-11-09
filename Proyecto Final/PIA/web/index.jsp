<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="Estilos/misEstilos.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio de sesión</title>
    </head>
    <body>        
        <div id = "formulario">
            <section>
                <form action="ValidarServlet" method="post" >
                    <h2>Inicio de sesión de TiendaFake!</h2>

                    <br>
                    <label>Nombre de usuario</label><br>
                    <input type="text" name="txtNombre" class="campos"/>            
                    <br/> 

                    <br>
                    <label>Contraseña</label><br>
                    <input type="password" name="txtPass" class="campos"/>            
                    <br/> 

                    <br>
                    <input type="submit" value="Iniciar Sesión" class="boton">
                    <br/>


                </form>
                <form action ="formulario.jsp">
                    <br>
                    <input type="submit" value="Crear cuenta" class="boton">
                    <br/>
                </form>
                <form action ="porfile.jsp">
                    <br>
                    <input type="submit" value="Ir a la Tienda" class="boton">
                    <br/>
                </form>
            </section>
        </div>
    </body>
</html>
