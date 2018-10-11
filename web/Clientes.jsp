<%-- 
    Document   : Clientes
    Created on : 10/10/2018, 09:42:25 AM
    Author     : it
--%>
<%@page import="Modelos.cliente"%>
<% 
    cliente cl = (cliente)request.getSession().getAttribute("cliente1");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Bootstrap/css/bootstrap.min.css"/>
        <script src="Bootstrap/js/bootstrap.min.js"></script>  
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h1> Nombre: <strong><%= cl.getNombre() %></strong></h1>
            <h1> Direccion: <strong><%= cl.getDireccion() %></strong></h1>
            <button class="btn btn-primary" type="button" onclick="regresar()">Retornar</button>
        </div>
        
    </body>
    <script>
        function regresar(){
            window.location.href = '/intercable';
        }
    </script>
</html>
