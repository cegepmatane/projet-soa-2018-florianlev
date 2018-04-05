<?php 

	$base = "agencespatialevoyage";
	$hote = "localhost";
	$usager = "servicevoyage";
	$motdepasse = "servicevoyage";
	$dsn = "mysql:dbname=".$base.";host=" . $hote;
	$basededonnees = new PDO($dsn, $usager, $motdepasse);

?>