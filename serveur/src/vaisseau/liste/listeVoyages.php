<?php

include "../../accesseur/VoyagesDAO.php";
$voyagesDAO = new VoyagesDAO();
//print_r($vaisseauDAO);
if(!empty($_GET['idVaisseau']))
{
    $listeVoyage = $voyagesDAO->voyagesPourUnVaisseau($_GET['idVaisseau']);
}
else{
    $listeVoyage = $voyagesDAO->listerVoyage();

}
//print_r($listeVaisseau);


header("Content-type: text/xml");
echo '<?xml version="1.0" encoding="UTF-8"?>';
?>
<voyages>
<?php
foreach($listeVoyage as $voyage)
{
    //print_r($vaisseau);
    ?>
    <voyage>
        <depart><?=$voyage->depart?></depart>
        <arrivee><?=$voyage->arrivee?></arrivee>
        <prix><?=$voyage->prix?></prix>
        <distance><?=$voyage->distance?></distance>
        <id><?=$voyage->idVoyage?></id>
    </voyage>
    <?php
}
?>
</voyages>