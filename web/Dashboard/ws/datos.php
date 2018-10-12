<?php

ini_set("soap.wsdl_cache_enabled", "0");
ini_set("soap.wsdl_cache", "0");
ini_set('memory_limit','512M');
ini_set('display_errors',true);
ini_set("track_errors","On");
error_reporting(-1);  

class Guatefac {

		var $pUsuario="";
		var $pPassword="";
		var $pNitEmisor="";
		var $pEstablecimiento="";
		var $pTipoDoc="";
		var $pIdMaquina="";
		var $pTipoRespuesta="";
		var $pXml="";

		var $pSerie="";
		var $pPreimpreso="";
		var $pNitComprador="";
		var $pFechaAnulacion="";
		var $pMotivoAnulacion="";


	function genera(){

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
			
			$resultado = $client->generaDocumento($this->pUsuario,$this->pPassword,$this->pNitEmisor,$this->pEstablecimiento,$this->pTipoDoc,$this->pIdMaquina,$this->pTipoRespuesta,$this->pXml);

		}

		return $resultado;

	}


//anulaDocumento($_pUsuario,$_pPassword,$_pNitEmisor,$_pSerie,$_pPreimpreso,$_pNitComprador,$_pFechaAnulacion,$_pMotivoAnulacion)

	function anula(){

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
			
			$resultado = $client->anulaDocumento($this->pUsuario,$this->pPassword,$this->pNitEmisor,$this->pSerie,$this->pPreimpreso,$this->pNitComprador,$this->pFechaAnulacion,$this->pMotivoAnulacion);

		}

		return $resultado;

	}
}


/*public function getPUsuario(){
	        return $this->pUsuario;
	    }

	    public function setPUsuario($pUsuario){
	        $this->pUsuario = $pUsuario;
	    }

	    public function getPPassword(){
	        return $this->pPassword;
	    }

	    public function setPPassword($pPassword){
	        $this->pPassword = $pPassword;
	    }

	    public function getPNitEmisor(){
	        return $this->pNitEmisor;
	    }

	    public function setPNitEmisor($pNitEmisor){
	        $this->pNitEmisor = $pNitEmisor;
	    }

	    public function getPEstablecimiento(){
	        return $this->pEstablecimiento;
	    }

	    public function setPEstablecimiento($pEstablecimiento){
	        $this->pEstablecimiento = $pEstablecimiento;
	    }

	    public function getPTipoDoc(){
	        return $this->pTipoDoc;
	    }

	    public function setPTipoDoc($pTipoDoc){
	        $this->pTipoDoc = $pTipoDoc;
	    }

	    public function getPIdMaquina(){
	        return $this->pIdMaquina;
	    }

	    public function setPIdMaquina($pIdMaquina){
	        $this->pIdMaquina = $pIdMaquina;
	    }

	    public function getPTipoRespuesta(){
	        return $this->pTipoRespuesta;
	    }

	    public function setPTipoRespuesta($pTipoRespuesta){
	        $this->pTipoRespuesta = $pTipoRespuesta;
	    }

	    public function getPXml(){
	        return $this->pXml;
	    }

	    public function setPXml($pXml){
	        $this->pXml = $pXml;
	    }

		public function getPSerie(){
	        return $this->pSerie;
	    }

	    public function setPSerie($pSerie){
	        $this->pSerie = $pSerie;
	    }

	    public function getPPreimpreso(){
	        return $this->pPreimpreso;
	    }

	    public function setPPreimpreso($pPreimpreso){
	        $this->pPreimpreso = $pPreimpreso;
	    }

	    public function getPNitComprador(){
	        return $this->pNitComprador;
	    }

	    public function setPNitComprador($pNitComprador){
	        $this->pNitComprador = $pNitComprador;
	    }

	    public function getPFechaAnulacion(){
	        return $this->pFechaAnulacion;
	    }

	    public function setPFechaAnulacion($pFechaAnulacion){
	        $this->pFechaAnulacion = $pFechaAnulacion;
	    }

	    public function getPMotivoAnulacion(){
	        return $this->pMotivoAnulacion;
	    }

	    public function setPMotivoAnulacion($pMotivoAnulacion){
	        $this->pMotivoAnulacion = $pMotivoAnulacion;
	    }*/


?>