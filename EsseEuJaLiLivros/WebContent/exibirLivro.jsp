

<%@page contentType="text/html" pageEncoding="UTF-8"%>



<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>




<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exibir Livro</title>
    </head>
    <body>
    	<img src="capas/${id}.PNG"/>
       <h1> Livro: ${titulo}<br>
        Categoria: ${categoria}<br>
        Esse livro possui ${quantidadePagina} paginas!<br>
        </h1>
        
        _______________________________________________________________________________________________________<br>
       Já leu este livro?
       
        <form method="POST" action ="MarcarComoLidoServlet">
            <input type="hidden" name="titulo" value=${titulo}/> 
            <input type="hidden" name="categoria" value=${categoria} /><br>
            <input type="hidden" name="quantidadePagina" value=${quantidadePagina}/>
            <input type="submit" value="Marcar como lido"/>
        </form>
        <a href="javascript:window.history.go(-1)">Voltar para home</a>



    </body>
</html>

