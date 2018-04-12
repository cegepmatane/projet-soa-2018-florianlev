<?php
	include_once "basededonnees.php";
	class VaisseauDAO
	{
		function listerVaisseau()
		{			
			$LISTER_VAISSEAU = "SELECT * FROM vaisseau";
			global $basededonnees;
			$requeteListerVaisseau = $basededonnees->prepare($LISTER_VAISSEAU);
			$requeteListerVaisseau->execute();
			return $requeteListerVaisseau->fetchAll(PDO::FETCH_OBJ);
		}

		function listerVoyage()
        {
            $LISTER_VOYAGE = "SELECT * FROM voyage";
            global $basededonnees;
            $requeteListerVoyages = $basededonnees->prepare($LISTER_VOYAGE);
            $requeteListerVoyages->execute();
            return $requeteListerVoyages->fetchAll(PDO::FETCH_OBJ);
        }


	}
?>