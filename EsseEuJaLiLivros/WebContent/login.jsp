

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
    
        <div><h2>Esse eu já lí!</h2></div>
        <h1>${erro}</h1>

        <form method="POST" action="LoginServlet" >
            <h5>Login: </h5><input type="text"  name="login" /><br>
            <p> </p>
            <h5> Senha: </h5><input type="password" name="senha"/><br>
            <p> </p>
            <input type="submit" value="Login" />
        </form>
        
    </body>
</html>