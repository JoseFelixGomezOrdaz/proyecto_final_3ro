-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1:3307
-- Tiempo de generación: 22-08-2018 a las 02:47:34
-- Versión del servidor: 10.1.10-MariaDB
-- Versión de PHP: 5.5.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyecto`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_productos`
--

CREATE TABLE `detalle_productos` (
  `codigo` char(8) NOT NULL,
  `modelo` varchar(30) NOT NULL,
  `marca` varchar(30) NOT NULL,
  `precio_compra` decimal(8,2) UNSIGNED NOT NULL,
  `precio_venta` decimal(8,2) UNSIGNED NOT NULL,
  `cantidad_prod` tinyint(3) UNSIGNED NOT NULL,
  `talla` char(8) NOT NULL,
  `color` varchar(30) NOT NULL,
  `fecha_ingreso` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detalle_productos`
--

INSERT INTO `detalle_productos` (`codigo`, `modelo`, `marca`, `precio_compra`, `precio_venta`, `cantidad_prod`, `talla`, `color`, `fecha_ingreso`) VALUES
('3243542', 'blanco', 'nike', '350.00', '400.00', 4, '25', 'blanco', '2018-08-21 13:41:24'),
('87253667', 'rojo', 'nike', '350.00', '400.00', 126, '25-28', 'negro', '2018-08-21 13:21:51');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prod_existencia`
--

CREATE TABLE `prod_existencia` (
  `codigo` char(8) NOT NULL,
  `modelo` varchar(30) NOT NULL,
  `marca` varchar(30) NOT NULL,
  `precio_de_compra` decimal(8,2) UNSIGNED NOT NULL,
  `precio_de_venta` decimal(8,2) UNSIGNED NOT NULL,
  `cantidad_prod` tinyint(3) UNSIGNED NOT NULL,
  `talla` char(8) NOT NULL,
  `color` varchar(30) NOT NULL,
  `fecha_ingreso` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `prod_existencia`
--

INSERT INTO `prod_existencia` (`codigo`, `modelo`, `marca`, `precio_de_compra`, `precio_de_venta`, `cantidad_prod`, `talla`, `color`, `fecha_ingreso`) VALUES
('3243542', 'blanco', 'nike', '350.00', '400.00', 4, '25', 'blanco', '2018-08-21 13:41:24'),
('87253667', 'rojo', 'nike', '350.00', '400.00', 100, '25-28', 'negro', '2018-08-21 13:19:53');

--
-- Disparadores `prod_existencia`
--
DELIMITER $$
CREATE TRIGGER `sumar` AFTER UPDATE ON `prod_existencia` FOR EACH ROW update detalle_productos set cantidad_prod=cantidad_prod + new.cantidad_prod
Where codigo=codigo
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedores`
--

CREATE TABLE `proveedores` (
  `id` int(11) NOT NULL,
  `rfc` varchar(20) NOT NULL,
  `calle` varchar(20) NOT NULL,
  `numero` smallint(5) UNSIGNED NOT NULL,
  `colonia` varchar(30) NOT NULL,
  `ciudad` varchar(30) NOT NULL,
  `telefono` char(15) NOT NULL,
  `nombres` varchar(20) NOT NULL,
  `ap_p` varchar(20) NOT NULL,
  `ap_m` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `proveedores`
--

INSERT INTO `proveedores` (`id`, `rfc`, `calle`, `numero`, `colonia`, `ciudad`, `telefono`, `nombres`, `ap_p`, `ap_m`) VALUES
(7, 'MELM7905651YT', 'lazaro', 23, 'las presas', 'tulancingo', '7715234323', 'ricardo', 'escamilla', 'granados');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `usuario` varchar(15) NOT NULL,
  `contra` varchar(15) NOT NULL,
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `usuario`, `contra`, `fecha`) VALUES
(1, 'jose', '4321', '2018-08-16 05:24:32'),
(3, 'leydy', '1234', '2018-08-16 05:54:30'),
(4, 'israel', '1234', '2018-08-16 05:55:50'),
(6, 'mario', '12345', '2018-08-17 13:43:51');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios_web`
--

CREATE TABLE `usuarios_web` (
  `email` varchar(50) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(20) NOT NULL,
  `telefono` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios_web`
--

INSERT INTO `usuarios_web` (`email`, `nombre`, `apellido`, `telefono`) VALUES
('1717110617@utectulancingo.edu.mx', 'jose', 'gomez', '7713527879'),
('1717110632@utectulancingo.edu.mx', 'lupita', 'villa', '771352764'),
('1717110654@utectulancingo.edu.mx', 'mario', 'perez', '7713527855'),
('felixgordaz@gmail.com', 'felix', 'gomez', '7713527879');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `id_venta` int(11) NOT NULL,
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`id_venta`, `fecha`) VALUES
(1, '2018-08-16 22:47:58');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `detalle_productos`
--
ALTER TABLE `detalle_productos`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `prod_existencia`
--
ALTER TABLE `prod_existencia`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `proveedores`
--
ALTER TABLE `proveedores`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `rfc` (`rfc`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `usuario` (`usuario`);

--
-- Indices de la tabla `usuarios_web`
--
ALTER TABLE `usuarios_web`
  ADD PRIMARY KEY (`email`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`id_venta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `proveedores`
--
ALTER TABLE `proveedores`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `ventas`
--
ALTER TABLE `ventas`
  MODIFY `id_venta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
