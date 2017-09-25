<%-- 
    Document   : cadastro
    Created on : 20/09/2016, 19:52:39
    Author     : Alex-vostro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <h1>Conte-nos quem é você:</h1>
        <form method="POST" action="criaUsuarioServlet">
            <h4>Nome:<br>
                <input type="text" name="nome"/><br>
                Login:<br>
                <input type="text" name="login"/><br>
                Email:<br>
                <input type="text" name="email"/><br>
                Senha:<br>
                <input type="text" name="senha"/><br>
                Repetir Senha:<br>
                <input type="text" name="senha2"/>
            </h4><br>
            <input type="submit" value="Criar usuário"    />
        </form>
    </body>
</html>
