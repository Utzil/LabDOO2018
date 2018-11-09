<%-- 
    Document   : porfile
    Created on : 3/11/2018, 01:39:27 AM
    Author     : uziel
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<head>
    <link rel="stylesheet" href="Estilos/Style.css" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>TiendaFake!</title> 
    
    
</head>
<body>
    <div id="menu">
        <ul id="hmenu"/> 
        <li><h4 class="tituloTienda">TiendaFake!</h4></li>
        <li><a href="#">Apple</a>
            <ul class="submenu">
                <li><a>IPhone</a></li>
                <li><a>IPad</a></li>
                <li><a>IPod</a></li>
            </ul>
        </li>
        <li><a href="#">Motorola</a>
            <ul class="submenu">
                <li><a>Moto Z</a></li>
                <li><a>Moto G</a></li>
                <li><a>Moto X</a></li>
            </ul>
        </li>
        <li><a href="#">Samsung</a>
            <ul class="submenu">
                <li><a>Galaxy S</a></li>
                <li><a>Galaxy J</a></li>
                <li><a>Galaxy Ace</a></li>
                <li><a>Galaxy A</a></li>
            </ul>
        </li>

        <li><a href="index.jsp">Iniciar Sesión</a></li>
        <li><a>Usuario: </a></li>
    </ul>
</ul>
</ul>
</div> 
<div class="sep">
</div>
<div class="DIV_main">
    <h1 class="H1_titulo">
        Productos nuevos
    </h1>
    <div class="DIV_contenedorArticulos" align="center">
        <div class="DIV_tiraArticulos">
            <div>
                <div class="DIV_articulo" align="center">
                    <img src="imagenes/iphone6.jpg"/>
                    <span>Iphone 6</span>
                </div>
                <div class="DIV_articulo">
                    <img src="imagenes/iphonex.jpg"/>
                    <span>Iphone X</span>
                </div>
                <div class="DIV_articulo">
                    <img src="imagenes/ipod.jpg"/>
                    <span>Ipod</span>
                </div>
                <div class="DIV_articulo" align="center">
                    <img src="imagenes/GalaxyA7.jpeg"/>
                    <span>Galaxy A7</span>
                </div>
                <div class="DIV_articulo">
                    <img src="imagenes/GalaxyA9.jpg"/>
                    <span>Galaxy A9</span>
                </div>
                <div class="DIV_articulo">
                    <img src="imagenes/ipadmini.jpg"/>
                    <span>Ipad Mini</span>
                </div>
                <div class="DIV_articulo">
                    <img src="imagenes/GalaxyS8.png"/>
                    <span>Galaxy S8</span>
                </div>
                <div class="DIV_articulo">
                    <img src="imagenes/Moto-g5.jpg"/>
                    <span>Motorola G5</span>
                </div>
                <div class="DIV_articulo">
                    <img src="imagenes/moto-z-2.png"/>
                    <span>Motorola Z2</span>
                </div>

            </div>
        </div>
    </div>
</div>
</body>
<div class="contacto">
    <footer>
        <div class="DIV_footer" align="center">
            <br /><label>| Contactanos | Facebook: TiendaFake! | Twitter: @TiendaFake! | <a href='CerrarSesionServlet'><label>Cerrar Sesion</label></a>| </label>
        </div>
    </footer>
</div>
</html>
