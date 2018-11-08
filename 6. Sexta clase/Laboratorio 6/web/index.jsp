<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="misEstilos.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio de sesión</title>
    </head>
    <body>        
        <div id = "formulario">
            <section>
                <form action="ValidarServlet" method="post" >
                    <h1>Llene el formulario</h1>
                    <br>
                    <label>Nombre:</label><br>
                    <input type="text" class="campos" name="txt-name" required=""/>
                    <br/>
                    
                    <br> 
                    <label>Primer Apellido:</label><br>
                    <input type="text" class="campos" name="first-name" required=""/>
                    <br/>

                    <br>
                    <label>Segundo apellido:</label><br>
                    <input type="text" class="campos" name="second-name"/>
                    <br/>

                    <br>
                    <label>Fecha de nacimiento: </label><br>
                    <input type="date" class="campos" name="bday" />
                    <br/>

                    <br>
                    <label>Correo electrónico: </label><br>
                    <input type="email" class="campos" name="correito" required=""/>
                    <br/>

                    <h2>Inicio de sesión</h2>
                    
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
            </section>
        </div>
    </body>
</html>
