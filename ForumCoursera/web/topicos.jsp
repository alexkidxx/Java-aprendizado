<%-- 
    Document   : sucesso
    Created on : 19/09/2016, 17:51:30
    Author     : Alex-vostro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Login efetuado com sucesso!</title>
    </head>
    <body>
        <h1>Bem vindo ${nomeBoasVindas}</h1>
        <p>Participe das discurssões, queremos saber o que vc tem a dizer. <br>
            Ou crie uma<a href="criarPost.jsp"> nova postagem</a> ou veja o <a href="exibirRankingServlet">ranking</a> da pontuação dos usuários do forum</p>

        <table border="1" width="1000">         

            <c:forEach var="topico" items="${listaDeTopicos}" >   

                <tr>
                    <td><a href="exibirTopicoServlet?id_topico=${topico}">${topico}</a></td>
                </tr>
            </c:forEach>
        </table>

    </body>
</html>
