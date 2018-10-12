<?php
ini_set('display_errors',1);
ini_set('display_startup_errors',1);
error_reporting(E_ALL);

    $DB_SERVER= '127.0.0.1';
    $PORT_DB= '5432';
    $DB_NAME='valledoradodb';
    $DB_USER='postgres';
    $DB_PASS='valle';

    $cadena = 'host='.$DB_SERVER.' port='.$PORT_DB.' user='.$DB_USER.' password='.$DB_PASS.' dbname='.$DB_NAME;

    $con = pg_connect($cadena) or die("Error en la Conexion");

    
?>
