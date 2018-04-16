<?php 

	include "../../accesseur/VaisseauDAO.php";
	$vaisseauDAO = new VaisseauDAO();
	//print_r($vaisseauDAO);
	$listeVaisseau = $vaisseauDAO->listerVaisseau();
	//print_r($listeVaisseau);
?><?php 

header("Content-type: text/xml");
echo '<?xml version="1.0" encoding="UTF-8"?>';
?>
<vaisseaux>
<?php
foreach($listeVaisseau as $vaisseau)
{
	//print_r($vaisseau);
	?>
	<vaisseau>
		<nomModele><?=$vaisseau->nomModele?></nomModele>
		<kilometrage><?=$vaisseau->kilometrage?></kilometrage>
		<nombrePlace><?=$vaisseau->nombrePlace?></nombrePlace>
		<vitesse><?=$vaisseau->vitesse?></vitesse>
		<id><?=$vaisseau->idVaisseau?></id>
	</vaisseau>
	<?php	
}
?>
</vaisseaux>