<?php
    include_once "basededonnees.php";
    class VoyagesDAO
    {

        function listerVoyage()
        {
            $LISTER_VOYAGE = "SELECT * FROM voyage";
            global $basededonnees;
            $requeteListerVoyages = $basededonnees->prepare($LISTER_VOYAGE);
            $requeteListerVoyages->execute();
            return $requeteListerVoyages->fetchAll(PDO::FETCH_OBJ);
        }

        function voyagesPourUnVaisseau($unVaisseau)
        {
            $LISTER_VOYAGE = "SELECT * FROM voyage WHERE idVaisseau = $unVaisseau;";
            global $basededonnees;
            $requeteListerVoyagesVaisseau = $basededonnees->prepare($LISTER_VOYAGE);
            $requeteListerVoyagesVaisseau->execute();
            return $requeteListerVoyagesVaisseau->fetchAll(PDO::FETCH_OBJ);
        }
		function ajouterVoyagePourUnVaisseau($voyage)
		{
			//echo "ajouterVoyagePourUnVaisseau()";
			//print_r($vaisseau);
			
			$SQL_AJOUTER_VOYAGE = "INSERT into voyage(idVaisseau, depart, arrivee, prix, distance) VALUES('$voyage->idVaisseau','$voyage->depart','$voyage->arrivee','$voyage->prix','$voyage->distance')";
			
			echo $SQL_AJOUTER_VOYAGE;
			global $basededonnees;
			print_r($basededonnees);
			
			$requeteAjouterVoyage = $basededonnees->prepare($SQL_AJOUTER_VOYAGE);
			$reussite = $requeteAjouterVoyage->execute();
			
			echo "Code erreur : " . $basededonnees->errorCode();
			echo "Erreurs : ";
			print_r($basededonnees->errorInfo());
			return $reussite;
			
			
		}
    }
?>