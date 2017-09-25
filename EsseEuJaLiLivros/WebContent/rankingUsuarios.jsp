
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ranking de usuarios Esse eu já lí</title>
    </head>
    <body>
        <h1>Ranking de Usuarios Esse eu já lí</h1>
        <table border="1">         

            <c:forEach var="usuario" items="${listaDeUsuarios}" >   

                <tr>
                    <td>${usuario}</td>
                </tr>
            </c:forEach>
        </table>   
        <p><a href="javascript:window.history.go(-1)">Voltar para home</a></p>

    </body>
</html>
