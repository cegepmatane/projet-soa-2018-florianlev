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

		
		

        


	}
?>