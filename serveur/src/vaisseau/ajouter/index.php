<?php 
	print_r($_POST);
	
	include "../../accesseur/VoyagesDAO.php";
	$voyagesDAO = new VoyagesDAO();
	//print_r($voyageDAO);
	
	$voyageTableau = $_POST;
	$voyage = new stdClass();
	$voyage->idVaisseau = $voyageTableau ['idVaisseau'];
	$voyage->depart = $voyageTableau ['depart'];
	$voyage->arrivee = $voyageTableau ['arrivee'];
	$voyage->prix = $voyageTableau ['prix'];
	$voyage->distance = $voyageTableau ['distance'];
	
	$succes = $voyagesDAO->ajouterVoyagePourUnVaisseau($voyage);
?><?php 

//header("Content-type: text/xml");
//echo '<?xml version="1.0" encoding="UTF-8"?>';
?>
<action>
	<type>ajouter</type>
	<moment><?=time()?></moment>
	<succes><?=$succes?></succes>
	<message></message>
</action>