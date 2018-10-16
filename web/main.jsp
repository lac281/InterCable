<%--
   Document   : main.jsp
   Created on : 12/10/2018, 12:45:58 PM
   Author     : Innosoft Solutions
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>InterCable</title>

        <!-- Bootstrap Core CSS -->
        <link href="Dashboard/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href="Dashboard/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="Dashboard/dist/css/sb-admin-2.css" rel="stylesheet">

        <!-- Morris Charts CSS -->
        <link href="Dashboard/vendor/morrisjs/morris.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="Dashboard/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>

    <body>

        <div id="wrapper">

            <!-- Navigation -->
            <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="main.jsp">InterCable</a>
                </div>
                <!-- /.navbar-header -->

                <ul class="nav navbar-top-links navbar-right">
                    <li>Usuario Intercable </li>
                    <!-- /.dropdown -->
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
                        </a>
                        <ul class="dropdown-menu dropdown-user">
                            <!--li><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>
                            </li>
                            <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
                            </li-->
                            <li class="divider"></li>
                            <li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i> Cerrar Sesi&oacute;n</a>
                            </li>
                        </ul>
                        <!-- /.dropdown-user -->
                    </li>
                    <!-- /.dropdown -->
                </ul>
                <!-- /.navbar-top-links -->

                <div class="navbar-default sidebar" role="navigation">
                    <div class="sidebar-nav navbar-collapse">
                        <ul class="nav" id="side-menu">
                            <li class="sidebar-search">
                                <!--div class="input-group custom-search-form">
                                    <input type="text" class="form-control" placeholder="Search...">
                                    <span class="input-group-btn">
                                    <button class="btn btn-default" type="button">
                                        <i class="fa fa-search"></i>
                                    </button>
                                </span>
                                </div>
                                <!-- /input-group -->
                            </li>
                            <li>
                                <a href="main.jsp"><i class="fa fa-dashboard fa-fw"></i> Inicio</a>
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-money fa-fw"></i> Pagos</a>
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-user fa-fw"></i> Clientes<span class="fa arrow"></span></a>
                                <ul class="nav nav-second-level">
                                    <li>
                                        <a href="#">Ingreso Cliente</a>
                                    </li>
                                    <li>
                                        <a href="#">Modificaci&oacute;n Cliente</a>
                                    </li>

                                    <li>
                                        <a href="#">Tipo Documentos <span class="fa arrow"></span></a>
                                    </li>

                                </ul>
                                <!-- /.nav-second-level -->
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> Cuentas por Cobrar</a>
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-edit fa-fw"></i> Nomima<span class="fa arrow"></span></a>
                                <ul class="nav nav-second-level">
                                    <li>
                                        <a href="#" onclick="ingresoEmpleado()">Ingreso Empleado</a>
                                    </li>
                                    <li>
                                        <a href="#" onclick="listadoEmpleado()">Modificaci&oacute;n Empleado</a>
                                    </li>
                                    <li>
                                        <a href="#" >Categoria Empleado<span class="fa arrow"></span> </a>
                                        <ul class="nav nav-third-level">
                                            <li>
                                                <a href="#" onclick="categoriaModal()">Ingreso Tipo Empleado </a>
                                            </li>
                                            <li>
                                                <a href="#" onclick="modificarCategorias()" >Modificacion Tipo Empleado</a>
                                            </li>

                                        </ul>
                                        <!-- /.nav-third-level-->
                                    </li>

                                </ul>
                                <!-- /.nav-second-level -->
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-user fa-fw"></i> Usuarios<span class="fa arrow"></span></a>
                                <ul class="nav nav-second-level">
                                    <li>
                                        <a href="#" onclick="ingresoUsuario()" > Ingreso Usuario</a>
                                    </li>
                                    <li>
                                        <a href="#">Modificaci&oacute;n Usuario</a>

                                    </li>
                                </ul>
                            </li>

                            <!--li>
                                <a href="#"><i class="fa fa-sitemap fa-fw"></i> Multi-Level Dropdown<span class="fa arrow"></span></a>
                                <ul class="nav nav-second-level">
                                    <li>
                                        <a href="#">Second Level Item</a>
                                    </li>
                                    <li>
                                        <a href="#">Second Level Item</a>
                                    </li>
                                    <li>
                                        <a href="#">Third Level <span class="fa arrow"></span></a>
                                        <ul class="nav nav-third-level">
                                            <li>
                                                <a href="#">Third Level Item</a>
                                            </li>
                                            <li>
                                                <a href="#">Third Level Item</a>
                                            </li>
                                            <li>
                                                <a href="#">Third Level Item</a>
                                            </li>
                                            <li>
                                                <a href="#">Third Level Item</a>
                                            </li>
                                        </ul>
                            <!-- /.nav-third-level>
                        </li>
                    </ul>
                            <!-- /.nav-second-level >
                        </li-->
                            <li>
                                <a href="#"><i class="fa fa-files-o fa-fw"></i> Corte de Caja<span class="fa arrow"></span></a>
                                <!--ul class="nav nav-second-level">
                                    <li>
                                        <a href="blank.html">Blank Page</a>
                                    </li>
                                    <li>
                                        <a href="login.html">Login Page</a>
                                    </li>
                                </ul-->
                                <!-- /.nav-second-level -->
                            </li>
                        </ul>
                    </div>
                    <!-- /.sidebar-collapse -->
                </div>
                <!-- /.navbar-static-side -->
            </nav>

            <div id="page-wrapper">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">Inter Cable</h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
                <div class="row">
                    <div class="container-fluid">
                        <div id="contenido">
                            <div id="tipoEmpleado" style="display:none;">
                                <h2>Listado Tipos de Empleado</h2>
                                <table id="tbl_tipoEmp" class="table">
                                    <thead>
                                        <tr>
                                            <th>Codigo</th>
                                            <th>Tipo de Empleado</th>
                                            <th>Tipo de Rol</th>
                                            <th>Observaciones</th>
                                            <th>Opciones</th>
                                        </tr>
                                    </thead>
                                    <tbody>

                                    </tbody>

                                </table>
                            </div>
                            <div id="ListEmpleado" style="display:none;">
                                <h2>Listado de Empleados</h2>
                            </div>

                        </div>
                        <!--fin de contenido-->
                    </div>
                    <!--fin de container-fluid-->

                </div>
                <!-- /.row -->
            </div>
            <!-- /#page-wrapper -->

        </div>
        <!-- /#wrapper -->

        <!-- Modal -->
        <div class="modal fade" id="mdUsuario" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Ingreso Usuario</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <label for="">Nombre</label>
                        <input type="text" class="form-control" id="nombre">
                        <label for="">Contraseña</label>
                        <input type="password" class="form-control" id="password">
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-danger" onclick="cargar()">Close</button>
                        <button type="button" class="btn btn-success">Aceptar</button>
                    </div>
                </div>
            </div>
        </div>
        <!-- fin modal-->

        <!-- Modal Tipo de Documentos -->
        <div class="modal fade" id="mdTipoId" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h2 class="modal-title" id="exampleModalLabel">Ingreso Tipos de Documentos</h2>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <label for="">Tipo Documento</label>
                        <input type="text" class="form-control" id="tipo_doc" maxlength="4">
                        <label for="">Observaciones</label>
                        <input type="text" class="form-control" id="obser">
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-danger" onclick="cargar()">Close</button>
                        <button type="button" class="btn btn-success" onclick="tipoId()">Aceptar</button>
                    </div>
                </div>
            </div>
        </div>
        <!-- fin modal-->

        <!-- Modal Categoria Empelados -->
        <div class="modal fade" id="mdCategoria" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h2 class="modal-title" id="exampleModalLabel">Ingreso Tipo de Empleados</h2>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-lg-6">
                                <label for="">Tipo Empleado</label>
                                <input type="text" class="form-control" id="tipoEmp" maxlength="50">
                            </div>
                            <div class="col-lg-6">
                                <label for="">Tipo de Rol</label>
                                <input type="text" class="form-control" id="TipoRol" maxlength="50" >
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-lg-12">
                                <label for="">Observaciones</label>
                                <input type="text" class="form-control" id="ObserEmp" maxlength="100">
                            </div>
                        </div>

                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-success" onclick="tipoEmp()">Aceptar</button>
                        <button type="button" class="btn btn-danger" onclick="cargar()">Close</button>
                    </div>
                </div>
            </div>
        </div>
        <!-- fin modal-->


        <!-- jQuery -->
        <script src="Dashboard/vendor/jquery/jquery.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="Dashboard/vendor/bootstrap/js/bootstrap.min.js"></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src="Dashboard/vendor/metisMenu/metisMenu.min.js"></script>

        <!--     Morris Charts JavaScript -->
        <script src="Dashboard/vendor/raphael/raphael.min.js"></script>
        <script src="Dashboard/vendor/morrisjs/morris.min.js"></script>
        <script src="Dashboard/data/morris-data.js"></script>>

        <!-- Custom Theme JavaScript -->
        <script src="Dashboard/dist/js/sb-admin-2.js"></script>
        <script>
                            function ingresoUsuario() {
                                $('#mdUsuario').modal('show');
                            }

                            function cargar() {
                                $('#mdUsuario').modal('toggle');
                                window.location.href = "main.jsp";
                            }
                            function tipoIdModal() {
                                $('#mdTipoId').modal('show');
                            }
                            function tipoId() {
                                var tipo = $('#tipo_doc').val();
                                var obs = $('#obser').val();
                                $.post('documento.do', {
                                    tipoDoc: tipo,
                                    Obser: obs
                                }, function(data) {
                                    alert(data);
                                    window.location.href = "main.jsp";
                                });
                            }

                            function categoriaModal() {
                                $('#mdCategoria').modal('show');
                            }

                            function tipoEmp() {
                                var tipE = $('#tipoEmp').val();
                                var tipR = $('#TipoRol').val();
                                var obEm = $('#ObserEmp').val();
                                $.post('roll.do', {
                                    tipoEmp: tipE,
                                    tipoRol: tipR,
                                    Obser: obEm,
                                    Operacion: 'Ingreso'
                                }, function(data) {
                                    alert(data);
                                    window.location.href = "main.jsp";
                                }
                                );
                            }

                            function modificarCategorias() {
                                var tabla;
                                $.post('roll.do', {
                                    tipoEmp: '',
                                    tipoRol: '',
                                    Obser: '',
                                    Operacion: 'Listar'
                                }, function(data) {
                                    var result = JSON.parse(data);
                                    var x = Object.keys(result.TipoEmpleado).length;
                                    for (var i = 0; i < x; i++) {
                                        var tablaHtml = '<tr><td>' + result.TipoEmpleado[i].idtipo + '</td>' +
                                                '<td>' + result.TipoEmpleado[i].tipo_empleado + '</td>' +
                                                '<td>' + result.TipoEmpleado[i].tipo_rol + '</td>' +
                                                '<td>' + result.TipoEmpleado[i].observaciones + '</td>' +
                                                '<td><button class="btn btn-warning" type="button" onclick="editarTipo(' +
                                                result.TipoEmpleado[i].idtipo + ')">Editar</button></td></tr>';

                                        tabla = tabla + tablaHtml;

                                    }
                                    $('#tbl_tipoEmp tbody').html(tabla);

                                });
                                $('#ListEmpleado').hide();
                                $('#tipoEmpleado').show();
                            }

                            function editarTipo(tipo) {
                                alert(tipo);
                            }

                            function listadoEmpleado() {
                                $('#tipoEmpleado').hide();
                                $('#ListEmpleado').show();
                            }

        </script>
    </body>

</html>
