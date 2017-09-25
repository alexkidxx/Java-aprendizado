<%-- 
    Document   : rankingUsuarios
    Created on : 28/09/2016, 03:00:48
    Author     : Alex-vostro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ranking de usuarios do Forum</title>
    </head>
    <body>
        <h1>Ranking de Usuarios do Forum</h1>
        <table border="1" width="1000">         

            <c:forEach var="usuario" items="${listaDeUsuarios}" >   

                <tr>
                    <td>${usuario}</td>
                </tr>
            </c:forEach>
        </table>   
        <p><a href="javascript:window.history.go(-1)">Voltar para os tópicos</a></p>

    </body>
</html>
