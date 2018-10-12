<?php

require '../vendor/autoload.php';

use Spipu\Html2Pdf\Html2Pdf;
use Spipu\Html2Pdf\Exception\Html2PdfException;
use Spipu\Html2Pdf\Exception\ExceptionFormatter;
try {
    ob_start();
    include_once '../info.php';
    $content = ob_get_clean();
    $html2pdf = new Html2Pdf('P', 'LETTER', 'en', false, 'UTF-8', array(5,8,5,8));
    $html2pdf->writeHTML($content);
    //$html2pdf->createIndex('Sommaire', 25, 12, false, true, 1);
    $html2pdf->output('informacion.pdf');
} catch (Html2PdfException $e) {
    $formatter = new ExceptionFormatter($e);
    echo $formatter->getHtmlMessage();
}

?>