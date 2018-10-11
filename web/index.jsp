<%-- 
    Document   : index
    Created on : 10/10/2018, 09:42:46 AM
    Author     : it
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Bootstrap/css/bootstrap.min.css"/>
        <script src="js/jquery-3.3.1.min.js"></script>
        <script src="Bootstrap/js/bootstrap.min.js"></script>  
        <title>InterCable</title>
    </head>
    <body>
        <div class="container">
            <form action="" id="frm_cliente" method="post">
            <div class="row">
                <div class="form-group">
                    <h1>Bienvenidos a Inter Cable</h1>
                    <label>Nombre</label>
                    <input class="form-control" type="text" id="nombre" name="nombre">
                </div>
            </div>
            <div class="row">
                <div class="form-group">
                    <label>Direccion</label>
                    <input class="form-control" type="text" id="direccion" name="direccion">
                </div>
            </div>
            <div class="row">
                <button class="btn btn-success" type="button" onclick="enviar()"  >Aceptar</button> 
            </div>
            </form>
        </div>
    </body>
    <script>
        function enviar(){
            var nom = $('#nombre').val();
            var dir = $('#direccion').val();
           /* $.post('cliente.do',{
                    nombre: nom,
                    direccion: dir
                }, function(data){
                    alert(data);
                });
            */
           $.ajax({
              type: 'POST',
              url: 'cliente.do',
              data: { nombre: nom, direccion: dir},
              success: function(data){
                  alert(data);
              }
           });
        }
    </script>
    
</html>
