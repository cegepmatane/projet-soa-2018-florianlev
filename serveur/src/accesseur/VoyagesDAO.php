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

    }
?>