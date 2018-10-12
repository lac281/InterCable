<?php  
include_once '../conexion.php';
include_once 'Guatefacturas.php';


//$query = mysql_query("SELECT * FROM eface.anula where mensaje is null");
$firma = new guatefacturas();
while($rw = mysql_fetch_array($query)){
	$pUsuario = "DORADO_WS";
	$pPassword = "PRUEBASWS";
	$pNitEmisor = "48525189";
	$pSerie = $rw['serie'];
	$pPreimpreso = $rw['num_fac'];
	$pNitComprador = $rw['carnet'];
	$pFechaAnulacion = '20170831';
	$pMotivoAnulacion = 'DETALLE NO CORRESPONDE';


	try{   
    	$rs = $firma->anuladocumento($pUsuario,$pPassword,$pNitEmisor,$pSerie,$pPreimpreso,$pNitComprador,$pFechaAnulacion,$pMotivoAnulacion);
    	echo htmlentities("Documento ".$pPreimpreso." --> ".$rs."<br>");
    	//$upd = mysql_query("UPDATE eface.anula SET mensaje = ".$rs." WHERE num_fac = ".$pPreimpreso);
	}catch (Exception $e) {
      var_dump($e);
	}

}

//30341848  jponce@visanet.com.gt
//Jose Ponce  VISANET
?>