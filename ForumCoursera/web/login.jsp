<%-- 
    Document   : falha
    Created on : 19/09/2016, 17:53:35
    Author     : Alex-vostro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <div><h2>Forum Blueddit</h2></div>
        <h1>${erro}</h1>

        <form method="POST" action="loginServlet" >
            <h5>Login: </h5><input type="text"  name="login" /><br>
            <p> </p>
            <h5> Senha: </h5><input type="password" name="senha"/><br>
            <p> </p>
            <input type="submit" value="Login" />
        </form>
        <p>
            Ainda não é usuario? Que tal 
            <a href="cadastro.jsp" >Criar sua conta</a>?
        </p>
    </body>
</html>
