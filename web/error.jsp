<%-- 
    Document   : error
    Created on : 10/10/2018, 04:45:35 PM
    Author     : it
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Bootstrap/css/bootstrap.min.css"/>
        <script src="Bootstrap/js/bootstrap.min.js"></script>  
        <title>Inter Cable</title>
    </head>
    <body>
        <div class="container">
            <h1>Error, llene los campos </h1>
            <button class="btn btn-success" type="button" onclick="regresar()">Regresar</button>
        </div>
    </body>
    <script>
        function regresar(){
            window.location.href = '/intercable';
        }
    </script>
    
</html>
