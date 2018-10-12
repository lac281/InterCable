<?php

# construyo un cliente nusoap_client
$client = new SoapClient("http://10.11.168.62/ingface.php?wsdl",array('exceptions'=>1));

$result = $client->__soapCall('hello',(array('name'=>'Luis Arturo')));
/*
$pEstablecimiento = 1;
$pIdMaquina='1';
$pNitEmisor='599635K';
$pPassword='PRUEBASWS';
$pTipoDoc=1;
$pTipoRespuesta='R';
$pUsuario='LITEGUA_WS';
$pXml='<DocElectronico>
            <Encabezado>
                <Receptor>
                    <NITReceptor>52876578</NITReceptor>
                    <Nombre>GELNDA MORALES ALDANA</Nombre>
                    <Direccion>CIUDAD</Direccion>
                </Receptor>
                <InfoDoc>
                    <TipoVenta>B</TipoVenta>
                    <DestinoVenta>1</DestinoVenta>
                    <Fecha>28/02/2017</Fecha>
                    <Moneda>1</Moneda>
                    <Tasa>1</Tasa>
                    <Referencia>26</Referencia>
                    <Reversion></Reversion>
                </InfoDoc>
                <Totales>
                    <Bruto>23</Bruto>
                    <Descuento>4.6</Descuento>
                    <Exento>0</Exento>
                    <Otros>0</Otros>
                    <Neto>16.43</Neto>
                    <Isr>0</Isr>
                    <Iva>1.97</Iva>
                    <Total>18.40</Total>
                </Totales>
                <DatosAdicionales></DatosAdicionales>
            </Encabezado>
            <Detalles>
                <Productos>
                    <Producto>101103</Producto>
                    <Descripcion>DESAYUNO CHAPIN</Descripcion>
                    <Medida>1</Medida>
                    <Cantidad>1</Cantidad>
                    <Precio>23</Precio>
                    <PorcDesc>20</PorcDesc>
                    <ImpBruto>23</ImpBruto>
                    <ImpDescuento>4.6</ImpDescuento>
                    <ImpExento>0</ImpExento>
                    <ImpOtros>0</ImpOtros>
                    <ImpNeto>16.43</ImpNeto>
                    <ImpIsr>0</ImpIsr>
                    <ImpIva>1.97</ImpIva>
                    <ImpTotal>18.40</ImpTotal>
                    <DatosAdicionalesProd></DatosAdicionalesProd>
                </Productos>
                <DocAsociados>
                    <DASerie></DASerie>
                    <DAPreimpreso></DAPreimpreso>
                </DocAsociados>
            </Detalles>
        </DocElectronico>';
$result = $client->generaDocumento($pUsuario,$pPassword,$pNitEmisor,$pEstablecimiento,$pTipoDoc,$pIdMaquina,$pTipoRespuesta,$pXml);
*/
print_r($result);


   
 
?>