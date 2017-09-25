<%-- 
    Document   : criarPost
    Created on : 25/09/2016, 18:35:52
    Author     : Alex-vostro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Criar Post</title>
    </head>
    <body>
        <form method="POST" action="criarPostServlet">
            Título do Tópico:<br>
            <input type="text" name="titulo" size=133><br>
            Descrição do tópico:<br>
            <textarea name="conteudo" rows="4" cols="100" >
            </textarea><br>
            <input type="submit" value="Postar"/>
            <a href="topicos.jsp">Voltar para tópicos</a>
        </form>
    </body>
</html>
