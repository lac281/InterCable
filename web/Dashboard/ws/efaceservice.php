<?php

include_once 'lib/nusoap.php';
include_once 'conexion.php';
//include 'datos.php';

$listener = new soap_server();

$namespace = "urn:serviciowsdl";

$listener->configureWSDL("Guatefac",$namespace);
$listener->schemaTargetNamespace = $namespace;

/*
$listener->wsdl->addComplexType('detalleDte',
 								'complexType',
                                'struct',
                                'all',
                                '',
								array('cantidad' => array('name' =>'cantidad','type' => 'xsd:double'),
									  'codigoProducto' => array('name' =>'codigoProducto' ,'type' =>  'xsd:string'),
									  'descripcionProducto' => array('name' =>'descripcionProducto' ,'type' =>  'xsd:string'),
									  'detalleImpuestoIva' => array('name' =>'detalleImpuestoIva' ,'type' =>  'xsd:double'),
									  'importeExento' => array('name' =>'importeExento' ,'type' =>  'xsd:double'),
									  'importeNetoGravado' => array('name' =>'importeNetoGravado' ,'type' =>  'xsd:double'),
									  'importeOtrosImpuestos' => array('name' =>'importeOtrosImpuestos' ,'type' =>  'xsd:double'),
									  'importeTotalOperacion' => array('name' =>'importeTotalOperacion' ,'type' =>  'xsd:double'),
									  'montoBruto' => array('name' =>'montoBruto' ,'type' =>  'xsd:double'),
									  'montoDescuento' => array('name' =>'montoDescuento' ,'type' =>  'xsd:double'),
									  'precioUnitario' => array('name' =>'precioUnitario' ,'type' =>  'xsd:double'),
									  'tipoProducto' => array('name' =>'tipoProducto' ,'type' =>  'xsd:string'),
									  'unidadMedida' => array('name' =>'unidadMedida' ,'type' =>  'xsd:string'))
								);

$listener->wsdl->addComplexType('dte',
 								'complexType',
                                'struct',
                                'all',
                                '',
								array('codigoEstablecimiento'=> array('name' => 'codigoEstablecimiento', 'type' => 'xsd:string'),
									  'codigoMoneda' => array('name' =>	'codigoMoneda', 'type' => 'xsd:string'),
									  'correoComprador' => array('name' => 'correoComprador', 'type' => 'xsd:string'),
									  'departamentoComprador' => array('name' =>'departamentoComprador', 'type' => 'xsd:string'),
									  'departamentoVendedor'=> array('name' =>'departamentoVendedor','type' => 'xsd:string'),
									  'descripcionOtroImpuesto' => array('name' =>'descripcionOtroImpuesto','type' => 'xsd:string'),
									  'detalleImpuestoIva'=> array('name' =>'detalleImpuestoIva', 'type' => 'xsd:double'),
									  'direccionComercialComprador'=> array('name' =>'direccionComercialComprador','type' => 'xsd:string'),
									  'direccionComercialVendedor'=> array('name' =>'direccionComercialVendedor','type' => 'xsd:string'),
									  'estadoDocumento'=> array('name' =>'estadoDocumento','type' => 'xsd:string'),
									  'fechaDocumento'=> array('name' =>'fechaDocument','type' => 'xsd:dateTime'),
									  'fechaResolucion'=> array('name' =>'fechaResolucion','type' => 'xsd:dateTime'),
									  'idDispositivo'=> array('name' =>'idDispositivo','type' => 'xsd:string'),
									  'importeBruto'=> array('name' =>'importeBruto','type' => 'xsd:double'),
									  'importeDescuento'=> array('name' =>'importeDescuento','type' => 'xsd:double'),
									  'importeNetoGravado'=> array('name' =>'importeNetoGravado','type' => 'xsd:double'),
									  'importeOtrosImpuestos'=> array('name' =>'importeOtrosImpuestos','type' => 'xsd:double'),
									  'importeTotalExento'=> array('name' =>'importeTotalExento','type' => 'xsd:double'),
									  'montoTotalOperacion'=> array('name' =>'montoTotalOperacion','type' => 'xsd:double'),
									  'municipioComprador'=> array('name' =>'municipioComprador','type' => 'xsd:string'),
									  'municipioVendedor'=> array('name' =>'municipioVendedor','type' => 'xsd:string'),
									  'nitComprador'=> array('name' =>'nitComprador','type' => 'xsd:string'),
									  'nitVendedor'=> array('name' =>'nitVendedor','type' => 'xsd:string'),
									  'nombreComercialComprador'=> array('name' =>'nombreComercialComprador','type' => 'xsd:string'),
									  'nombreComercialRazonSocialVendedor'=>array('name'=>'nombreComercialRazonSocialVendedor','type'=>'xsd:string'),
									  'nombreCompletoVendedor'=> array('name' =>'nombreCompletoVendedor','type' => 'xsd:string'),
									  'numeroDocumento' => array('name' =>'numeroDocumento','type' => 'xsd:string'),
									  'numeroResolucion'=> array('name' =>'numeroResolucion','type' => 'xsd:string'),
									  'regimen2989'=> array('name' =>'regimen2989','type' => 'xsd:string'),
									  'regimenISR'=> array('name' =>'regimenISR','type' => 'xsd:string'),
									  'serieAutorizada'=> array('name' =>'serieAutorizada','type' => 'xsd:string'),
									  'serieDocumento'=> array('name' =>'serieDocumento','type' => 'xsd:string'),
									  'telefonoComprador'=> array('name' =>'telefonoComprador','type' => 'xsd:string'),
									  'tipoCambio'=> array('name' =>'tipoCambio','type' => 'xsd:string'),
									  'tipoDocumento'=> array('name' =>'tipoDocumento','type' => 'xsd:string'),
									  'observaciones'=> array('name' =>'observaciones','type' => 'xsd:string'),
									  'detalleDte' => array('name' =>'detalleDte','type'=>'tns:detalleDte'))


	);

$listener->wsdl->addComplexType('requestDte',
 								'complexType',
                                'struct',
                                'all',
                                '',
								array('usuario'=> array('name' =>'usuario','type' => 'xsd:string'),
									  'clave'=> array('name' =>'clave','type' => 'xsd:string'),
									  'validador'=> array('name' =>'validador','type'=> 'xsd:boolean'),
									  'dte' => array('name' =>'dte','type' => 'tns:dte'))

	);

$listener->wsdl->addComplexType('resultado',
								'complexType',
								'struct',
								'all',
								'',
								array('cae' => array('name' => 'cae' , 'type' => 'xsd:string'),
									  'numeroDte'=> array('name' => 'numeroDte' , 'type' => 'xsd:string'))
	);
/*/
$listener->register("hello", array('name' => 'xsd:string'), array('return' => 'xsd:string'), $namespace);

$listener->register("guate" , array (
									'pUsuario'=> 'xsd:string',
									'pPassword'=> 'xsd:string',
									'pNitEmisor'=> 'xsd:string',
									'pEstablecimiento'=> 'xsd:string',
									'pTipoDoc'=> 'xsd:string',
									'pIdMaquina'=> 'xsd:string',
									'pTipoRespuesta' => 'xsd:string',
									'pXml' => 'xsd:string'), 
								array('resultado' => 'xsd:string'), $namespace);

//anulaDocumento($_pUsuario,$_pPassword,$_pNitEmisor,$_pSerie,$_pPreimpreso,$_pNitComprador,$_pFechaAnulacion,$_pMotivoAnulacion)
//generaDocumento($_pUsuario,$_pPassword,$_pNitEmisor,$_pEstablecimiento,$_pTipoDoc,$_pIdMaquina,$_pTipoRespuesta,$_pXml)

function hello($name){

	$result = "Bienvenido, ".$name."!";

	return $result;
}

function guate($pUsuario,$pPassword,$pNitEmisor,$pEstablecimiento,$pTipoDoc,$pIdMaquina,$pTipoRespuesta,$pXml){
/*
	$service = new Guatefac;

	$ret = $service->genera($pUsuario,$pPassword,$pNitEmisor,$pEstablecimiento,$pTipoDoc,$pIdMaquina,$pTipoRespuesta,$pXml); 

	return $ret; 
*/

	$wsdl = 'https://dte.guatefacturas.com:444/webservices63/svc01M/Guatefac?wsdl';
 
		try{

			$param    = array (
    						'encoding' => 'UTF-8', 
    						'location' => $wsdl,
    						'stream_context' => stream_context_create(array(
        					'ssl' => array(
                						'verify_peer' => false,
                						'verify_peer_name' => false,
                						'allow_self_signed' => true,
                						'cache_wsdl' => WSDL_CACHE_NONE,
                						'ciphers' => "SHA1",
            							)
        							)
    							),
							);

			$client = new SoapClient($wsdl, $param);
			
			$resultado = $client->generaDocumento($pUsuario,$pPassword,$pNitEmisor,$pEstablecimiento,$pTipoDoc,$pIdMaquina,$pTipoRespuesta,$pXml);

		}

		return $resultado;

}

$HTTP_RAW_POST_DATA = isset($HTTP_RAW_POST_DATA) ? $HTTP_RAW_POST_DATA : '';

$listener->service($HTTP_RAW_POST_DATA);

?>
