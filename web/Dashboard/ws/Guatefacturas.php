<?php
	
include_once 'lib/nusoap.php';

class guatefacturas{

	function genera($pUsuario,$pPassword,$pNitEmisor,$pEstablecimiento,$pTipoDoc,$pIdMaquina,$pTipoRespuesta,$pXml){
		
		//$wsdl = 'https://dte.guatefacturas.com:444/webservices63/svc01M/Guatefac?wsdl';
	 	$wsdl = 'http://10.11.168.40:8888/webservices63/remota/Guatefac?wsdl';
		$params    = array (
		    'encoding'              => 'UTF-8', 
		    'location'              => $wsdl,
		    'stream_context'        => stream_context_create(array(
		        'ssl' => array(
		                'verify_peer'       => false,
		                'verify_peer_name'  => false,
		                'allow_self_signed' => true,
		                'cache_wsdl' => WSDL_CACHE_NONE,
		                'ciphers' => "SHA1",
		            )
		        )
		    ),
		);
		$client = new SoapClient($wsdl, array('exceptions'=>1));

		$resultado = $client->generaDocumento($pUsuario,$pPassword,$pNitEmisor,$pEstablecimiento,$pTipoDoc,$pIdMaquina,$pTipoRespuesta,$pXml);

		return $resultado;
	}//Fin de funcion genera


	function anula($pUsuario,$pPassword,$pNitEmisor,$pSerie,$pPreimpreso,$pNitComprador,$pFechaAnulacion,$pMotivoAnulacion){
		
		//$wsdl = 'https://dte.guatefacturas.com:444/webservices63/svc01M/Guatefac?wsdl';
	 	$wsdl = 'http://10.11.168.40:8888/webservices63/remota/Guatefac?wsdl';
	 
		$params    = array (
		    'encoding'              => 'UTF-8', 
		    'location'              => $wsdl,
		    'stream_context'        => stream_context_create(array(
		        'ssl' => array(
		                'verify_peer'       => false,
		                'verify_peer_name'  => false,
		                'allow_self_signed' => true,
		                'cache_wsdl' => WSDL_CACHE_NONE,
		                'ciphers' => "SHA1",
		            )
		        )
		    ),
		);
		$client = new SoapClient($wsdl, $params);

		$resultado = $client->anulaDocumento($pUsuario,$pPassword,$pNitEmisor,$pSerie,$pPreimpreso,$pNitComprador,$pFechaAnulacion,$pMotivoAnulacion);

		return $resultado;
	}//Fin funcion anula

    function anuladocumento($pUsuario,$pPassword,$pNitEmisor,$pSerie,$pPreimpreso,$pNitComprador,$pFechaAnulacion,$pMotivoAnulacion){
        
        $params = array(
                    'pUsuario' => $pUsuario,
                    'pPassword' => $pPassword,
                    'pNitEmisor' => $pNitEmisor,
                    'pSerie' => $pSerie,
                    'pPreimpreso' => $pPreimpreso,
                    'pNitComprador' => $pNitComprador,
                    'pFechaAnulacion' => $pFechaAnulacion,
                    'pMotivoAnulacion' => $pMotivoAnulacion
                );
        

        $client = new nusoap_client("http://10.11.168.40:8888/webservices63/remota/Guatefac?WSDL",'tcp://10.11.168.40','8888','','');
        
        $result = $client->CALL('anulaDocumento',$params);

        return $result; 

    }// Fin funcion anulaDocumento

   
}//Fin de clase moroccanodil


?>


           
                     