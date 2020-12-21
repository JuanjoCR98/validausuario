<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Valida usuario</h1>
        <form action="validaServlet" method="post">
            <p><label>Usuario: <input type="text" name="usuario"></label></p>
            <p><label>Contraseña: <input type="password" name="password"></label></p>
            <input type="submit" value="Login">
        </form>
        <br>
        <a href="muestra_usuario">Muestra usuario</a>
    </body>
</html>
