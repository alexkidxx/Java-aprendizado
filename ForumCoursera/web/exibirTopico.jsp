<%-- 
    Document   : exibirTopico
    Created on : 25/09/2016, 15:52:24
    Author     : Alex-vostro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exibir Tópico</title>
    </head>
    <body>
        Tópico criado por: ${dono}<br>
        Título: ${titulo}<br>
        Conteúdo:<br>
        <p>${conteudo}</p>
        Comentários:<br>

        <c:forEach var="coment" items="${comentarios}" >   
            ${coment}<br>-------------------------------------------------------------------------------------<br>
        </c:forEach>


        _______________________________________________________________________________________________________<br>
        Deixe sua opinião, comente!
        <form method="POST" action ="criarComentarioServlet">
            <input type="hidden" name="id_topico" value=${id_topico} /> 
            <input type="hidden" name="titulo" value=${titulo} /> 
            <textarea name="comentario" rows="10" cols="100">
            </textarea>
            <br>
            <input type="submit" value="Comentar"/>
        </form>
        <a href="javascript:window.history.go(-1)">Voltar para os tópicos</a>



    </body>
</html>

