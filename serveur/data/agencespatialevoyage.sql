-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost:3306
-- Généré le :  mar. 03 avr. 2018 à 07:21
-- Version du serveur :  5.7.20
-- Version de PHP :  7.1.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `agencespatialevoyage`
--

-- --------------------------------------------------------

--
-- Structure de la table `vaisseau`
--

CREATE TABLE `vaisseau` (
  `idVaisseau` int(11) NOT NULL,
  `nomModele` text NOT NULL,
  `kilometrage` int(11) NOT NULL,
  `nombrePlace` int(11) NOT NULL,
  `vitesse` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `vaisseau`
--

INSERT INTO `vaisseau` (`idVaisseau`, `nomModele`, `kilometrage`, `nombrePlace`, `vitesse`) VALUES
(1, 'xwing', 1000000, 2, 1050),
(2, 'vigil', 1500000, 30, 950),
(3, 'accuser', 5000000, 400, 8000),
(4, 'etoile noir', 1000000, 600, 9000),
(5, 'bienvaillance', 15000, 100, 2000);

-- --------------------------------------------------------

--
-- Structure de la table `voyage`
--

CREATE TABLE `voyage` (
  `idVoyage` int(11) NOT NULL,
  `depart` text NOT NULL,
  `arrivee` text NOT NULL,
  `prix` int(11) NOT NULL,
  `distance` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `voyage`
--

INSERT INTO `voyage` (`idVoyage`, `depart`, `arrivee`, `prix`, `distance`) VALUES
(1, 'tatouine', 'corusante', 1000, 3000),
(2, 'terre', 'mars', 500, 1000),
(3, 'lune', 'jupiter', 500, 5000),
(4, 'berlin', 'pluton', 6000, 4000),
(5, 'venus', 'terre', 1000, 500),
(6, 'saturne', 'porigon', 400, 30000),
(7, 'yavin 4', 'mustafar', 6000, 900000),
(8, 'neptune', 'terre', 4000, 600),
(9, 'mars', 'tatouine', 4000, 8000),
(10, 'uranus', 'mercure', 90000, 40000);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `vaisseau`
--
ALTER TABLE `vaisseau`
  ADD PRIMARY KEY (`idVaisseau`);

--
-- Index pour la table `voyage`
--
ALTER TABLE `voyage`
  ADD PRIMARY KEY (`idVoyage`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `vaisseau`
--
ALTER TABLE `vaisseau`
  MODIFY `idVaisseau` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT pour la table `voyage`
--
ALTER TABLE `voyage`
  MODIFY `idVoyage` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
