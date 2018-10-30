-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 30-10-2018 a las 14:29:37
-- Versión del servidor: 5.7.23
-- Versión de PHP: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `java`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reporte`
--

DROP TABLE IF EXISTS `reporte`;
CREATE TABLE IF NOT EXISTS `reporte` (
  `id` int(6) NOT NULL AUTO_INCREMENT,
  `tiempo` int(4) NOT NULL,
  `restaurante` varchar(24) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `reporte`
--

INSERT INTO `reporte` (`id`, `tiempo`, `restaurante`) VALUES
(4, 2, 'Gitane'),
(3, 4, 'Monchiz'),
(5, 4, 'Gitane'),
(6, 2, 'RED'),
(7, 4, 'RED'),
(8, 8, 'RED'),
(9, 2, 'Gitane'),
(10, 2, 'Snackers'),
(11, 4, 'Gitane'),
(12, 8, 'Gitane'),
(13, 4, 'Gitane'),
(14, 2, 'Gitane'),
(15, 4, 'Gitane'),
(16, 8, 'Gitane');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
