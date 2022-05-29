-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-05-2019 a las 22:58:40
-- Versión del servidor: 10.1.37-MariaDB
-- Versión de PHP: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `calipsoft`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cargos`
--

CREATE TABLE `cargos` (
  `Código cargo` int(10) NOT NULL COMMENT 'Código del cargo',
  `Cargo` varchar(50) NOT NULL COMMENT 'Cargo del empleado'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cargos`
--

INSERT INTO `cargos` (`Código cargo`, `Cargo`) VALUES
(1, 'Director'),
(2, 'Coordinador'),
(3, 'Psicología'),
(4, 'Secretaria'),
(5, 'Docente'),
(6, 'Auxiliar'),
(7, 'Seguridad');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipo`
--

CREATE TABLE `equipo` (
  `serial` int(20) NOT NULL COMMENT 'Número único del equipo',
  `id_tipo equipo` int(10) NOT NULL COMMENT 'Tipo de uso del equipo',
  `id_ubicación` int(10) NOT NULL COMMENT 'Ubicación del equipo',
  `id_marca` int(10) NOT NULL COMMENT 'Marca del equipo',
  `modelo` int(10) DEFAULT NULL COMMENT 'Año modelo del equipo',
  `observaciones` varchar(200) DEFAULT NULL COMMENT 'Observaciones de cada equipo',
  `id_estados equipos` int(10) NOT NULL COMMENT 'Estado de funcionamiento del equipo'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tabla principal sobre equipos';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estado del equipo`
--

CREATE TABLE `estado del equipo` (
  `código` int(10) NOT NULL COMMENT 'Código del estado',
  `estado` varchar(50) NOT NULL COMMENT 'Nombre del estado'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tabla secundaria sobre el estado de funcionamiento de equipo';

--
-- Volcado de datos para la tabla `estado del equipo`
--

INSERT INTO `estado del equipo` (`código`, `estado`) VALUES
(1, 'Operativo'),
(2, 'No operativo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estado en mantenimiento`
--

CREATE TABLE `estado en mantenimiento` (
  `código` int(10) NOT NULL COMMENT 'Código del estado',
  `Nombre del estado` varchar(50) NOT NULL COMMENT 'Nombre del estado'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tabla secundaria sobre el estado en mantenimiento del equipo';

--
-- Volcado de datos para la tabla `estado en mantenimiento`
--

INSERT INTO `estado en mantenimiento` (`código`, `Nombre del estado`) VALUES
(1, 'Reportado'),
(2, 'Solucionado'),
(3, 'Suspendido'),
(4, 'Cancelado'),
(5, 'De baja');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estados`
--

CREATE TABLE `estados` (
  `código estado` int(50) NOT NULL COMMENT 'Código estados',
  `estado` varchar(50) NOT NULL COMMENT 'Estados'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Estado del usuario: 1) Activo 2) Inactivo';

--
-- Volcado de datos para la tabla `estados`
--

INSERT INTO `estados` (`código estado`, `estado`) VALUES
(1, 'Activo'),
(2, 'Inactivo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mantenimiento`
--

CREATE TABLE `mantenimiento` (
  `código` int(10) NOT NULL COMMENT 'Código de mantenimiento',
  `Id_código equipo` int(10) NOT NULL COMMENT 'Código del equipo en mantenimiento',
  `Id_código usuario` int(10) NOT NULL COMMENT 'Código del usuario que lo mandó a mantenimiento',
  `Id_tipo de falla` int(10) NOT NULL COMMENT 'Código de la falla',
  `fecha de reporte` date NOT NULL COMMENT 'Fecha del reporte',
  `descripción` int(200) DEFAULT NULL COMMENT 'Descripción del equipo',
  `estado del equipo` int(10) NOT NULL COMMENT 'Estado del equipo'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tabla principal sobre los mantenimientos';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `marca`
--

CREATE TABLE `marca` (
  `código` int(10) NOT NULL COMMENT 'Código marca',
  `marca` varchar(50) NOT NULL COMMENT 'Nombre de la marca'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tabla secundaria sobre la marca de cada equipo';

--
-- Volcado de datos para la tabla `marca`
--

INSERT INTO `marca` (`código`, `marca`) VALUES
(1, 'HP'),
(2, 'Dell'),
(3, 'Lenovo'),
(4, 'Lg'),
(5, 'Sony'),
(6, 'Samsung'),
(7, 'Otra marca');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `codigo` int(10) NOT NULL,
  `fecha_Actual` varchar(20) NOT NULL,
  `fecha_Reserva` varchar(20) NOT NULL,
  `fecha_Devolución` varchar(20) DEFAULT NULL,
  `hora_Prestamo` varchar(10) NOT NULL,
  `hora_Devolución` varchar(10) NOT NULL,
  `código_Usuario` int(10) NOT NULL,
  `código_Equipo` int(10) NOT NULL,
  `estado_reserva` int(10) NOT NULL,
  `descripción` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tabla principal Reservas';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sexos`
--

CREATE TABLE `sexos` (
  `código sexo` int(10) NOT NULL COMMENT 'Código sexo',
  `sexo` varchar(50) NOT NULL COMMENT 'Masculino o Femenino'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `sexos`
--

INSERT INTO `sexos` (`código sexo`, `sexo`) VALUES
(1, 'Masculino'),
(2, 'Femenino');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo de falla`
--

CREATE TABLE `tipo de falla` (
  `código` int(10) NOT NULL COMMENT 'Código de la falla',
  `Nombre de la falla` varchar(50) NOT NULL COMMENT 'Nombre de la falla'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tabla secundaria sobre las fallas en equipos';

--
-- Volcado de datos para la tabla `tipo de falla`
--

INSERT INTO `tipo de falla` (`código`, `Nombre de la falla`) VALUES
(1, 'Falla de Software'),
(2, 'Falla de Hardware');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo equipo`
--

CREATE TABLE `tipo equipo` (
  `código` int(10) NOT NULL,
  `tipo de equipo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tabla secundaria sobre cada tipo de equipo';

--
-- Volcado de datos para la tabla `tipo equipo`
--

INSERT INTO `tipo equipo` (`código`, `tipo de equipo`) VALUES
(1, 'Pc de escritorio'),
(2, 'Pc portátil'),
(3, 'Video Beam'),
(4, 'Parlante'),
(5, 'Tv normal'),
(6, 'Tv Smart'),
(7, 'Tableta'),
(8, 'Monitor'),
(9, 'Teclado'),
(10, 'Mouse');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo perfiles`
--

CREATE TABLE `tipo perfiles` (
  `Código perfil` int(10) NOT NULL COMMENT 'Código de perfil',
  `perfil` varchar(50) NOT NULL COMMENT 'Perfil del usuario'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tipo de perfil: 1) Administrador 2) Técnico 3) Usuario';

--
-- Volcado de datos para la tabla `tipo perfiles`
--

INSERT INTO `tipo perfiles` (`Código perfil`, `perfil`) VALUES
(1, 'Administrador'),
(2, 'Técnico'),
(3, 'Usuario');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ubicación`
--

CREATE TABLE `ubicación` (
  `código` int(10) NOT NULL COMMENT 'Código de la ubicación',
  `ubicación del equipo` varchar(50) NOT NULL COMMENT 'Nombre de la ubicación'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tabla secundaria sobre la ubicación de cada equipo';

--
-- Volcado de datos para la tabla `ubicación`
--

INSERT INTO `ubicación` (`código`, `ubicación del equipo`) VALUES
(1, 'Sala de informática 1'),
(2, 'Sala de informática 2'),
(3, 'Salón de inglés'),
(4, 'Almacén'),
(5, 'Laboratorio'),
(6, 'Otra área');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `Codigo` int(10) NOT NULL COMMENT '(PK) Código Usuarios',
  `Primer_Nombre` varchar(50) NOT NULL COMMENT 'Primer Nombre',
  `Segundo_Nombre` varchar(50) DEFAULT NULL COMMENT 'Segundo Nombre',
  `Primer_Apellido` varchar(50) NOT NULL COMMENT 'Primer Apellido',
  `Segundo_Apellido` varchar(50) DEFAULT NULL COMMENT 'Segundo Apellido',
  `Id_Sexo` int(10) NOT NULL COMMENT 'Código sexo',
  `Correo` int(50) DEFAULT NULL COMMENT 'Correo usuario',
  `Teléfono` int(10) NOT NULL COMMENT 'Teléfono usuario',
  `Id_Tipo_Perfil` int(10) NOT NULL COMMENT 'Tipo de perfil',
  `Id_Área` int(10) NOT NULL COMMENT 'Código área',
  `Contraseña` blob NOT NULL COMMENT 'Contraseña',
  `Id_Cargo` int(10) NOT NULL COMMENT 'Código Cargo',
  `Id_Estado` int(10) NOT NULL COMMENT 'Código Estado'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `áreas`
--

CREATE TABLE `áreas` (
  `Código área` int(10) NOT NULL COMMENT 'Código del área',
  `Área` varchar(50) NOT NULL COMMENT 'Área del usuario'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Áreas de los usuarios';

--
-- Volcado de datos para la tabla `áreas`
--

INSERT INTO `áreas` (`Código área`, `Área`) VALUES
(1, 'Informática'),
(2, 'Inglés'),
(3, 'Lenguaje'),
(4, 'Matemáticas'),
(5, 'Química'),
(6, 'Física'),
(7, 'Administrativa'),
(8, 'No aplica'),
(9, 'Otra...');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cargos`
--
ALTER TABLE `cargos`
  ADD PRIMARY KEY (`Código cargo`);

--
-- Indices de la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD PRIMARY KEY (`serial`),
  ADD KEY `id_tipo equipo` (`id_tipo equipo`),
  ADD KEY `id_ubicación` (`id_ubicación`),
  ADD KEY `id_marca` (`id_marca`),
  ADD KEY `id_estados equipos` (`id_estados equipos`);

--
-- Indices de la tabla `estado del equipo`
--
ALTER TABLE `estado del equipo`
  ADD PRIMARY KEY (`código`);

--
-- Indices de la tabla `estado en mantenimiento`
--
ALTER TABLE `estado en mantenimiento`
  ADD PRIMARY KEY (`código`);

--
-- Indices de la tabla `estados`
--
ALTER TABLE `estados`
  ADD PRIMARY KEY (`código estado`);

--
-- Indices de la tabla `mantenimiento`
--
ALTER TABLE `mantenimiento`
  ADD PRIMARY KEY (`código`),
  ADD KEY `Id_código equipo` (`Id_código equipo`),
  ADD KEY `Id_código usuario` (`Id_código usuario`),
  ADD KEY `Id_tipo de falla` (`Id_tipo de falla`),
  ADD KEY `estado del equipo` (`estado del equipo`);

--
-- Indices de la tabla `marca`
--
ALTER TABLE `marca`
  ADD PRIMARY KEY (`código`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `sexos`
--
ALTER TABLE `sexos`
  ADD PRIMARY KEY (`código sexo`);

--
-- Indices de la tabla `tipo de falla`
--
ALTER TABLE `tipo de falla`
  ADD PRIMARY KEY (`código`);

--
-- Indices de la tabla `tipo equipo`
--
ALTER TABLE `tipo equipo`
  ADD PRIMARY KEY (`código`);

--
-- Indices de la tabla `tipo perfiles`
--
ALTER TABLE `tipo perfiles`
  ADD PRIMARY KEY (`Código perfil`);

--
-- Indices de la tabla `ubicación`
--
ALTER TABLE `ubicación`
  ADD PRIMARY KEY (`código`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`Codigo`),
  ADD KEY `Id_Sexo` (`Id_Sexo`),
  ADD KEY `Id_Tipo_Perfil` (`Id_Tipo_Perfil`),
  ADD KEY `Id_Área` (`Id_Área`),
  ADD KEY `Id_Cargo` (`Id_Cargo`),
  ADD KEY `Id_Estado` (`Id_Estado`);

--
-- Indices de la tabla `áreas`
--
ALTER TABLE `áreas`
  ADD PRIMARY KEY (`Código área`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cargos`
--
ALTER TABLE `cargos`
  MODIFY `Código cargo` int(10) NOT NULL AUTO_INCREMENT COMMENT 'Código del cargo', AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `equipo`
--
ALTER TABLE `equipo`
  MODIFY `serial` int(20) NOT NULL AUTO_INCREMENT COMMENT 'Número único del equipo';

--
-- AUTO_INCREMENT de la tabla `estado del equipo`
--
ALTER TABLE `estado del equipo`
  MODIFY `código` int(10) NOT NULL AUTO_INCREMENT COMMENT 'Código del estado', AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `estado en mantenimiento`
--
ALTER TABLE `estado en mantenimiento`
  MODIFY `código` int(10) NOT NULL AUTO_INCREMENT COMMENT 'Código del estado', AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `estados`
--
ALTER TABLE `estados`
  MODIFY `código estado` int(50) NOT NULL AUTO_INCREMENT COMMENT 'Código estados', AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `mantenimiento`
--
ALTER TABLE `mantenimiento`
  MODIFY `código` int(10) NOT NULL AUTO_INCREMENT COMMENT 'Código de mantenimiento';

--
-- AUTO_INCREMENT de la tabla `marca`
--
ALTER TABLE `marca`
  MODIFY `código` int(10) NOT NULL AUTO_INCREMENT COMMENT 'Código marca', AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `sexos`
--
ALTER TABLE `sexos`
  MODIFY `código sexo` int(10) NOT NULL AUTO_INCREMENT COMMENT 'Código sexo', AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `tipo de falla`
--
ALTER TABLE `tipo de falla`
  MODIFY `código` int(10) NOT NULL AUTO_INCREMENT COMMENT 'Código de la falla', AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `tipo equipo`
--
ALTER TABLE `tipo equipo`
  MODIFY `código` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `tipo perfiles`
--
ALTER TABLE `tipo perfiles`
  MODIFY `Código perfil` int(10) NOT NULL AUTO_INCREMENT COMMENT 'Código de perfil', AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `ubicación`
--
ALTER TABLE `ubicación`
  MODIFY `código` int(10) NOT NULL AUTO_INCREMENT COMMENT 'Código de la ubicación', AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `Codigo` int(10) NOT NULL AUTO_INCREMENT COMMENT '(PK) Código Usuarios';

--
-- AUTO_INCREMENT de la tabla `áreas`
--
ALTER TABLE `áreas`
  MODIFY `Código área` int(10) NOT NULL AUTO_INCREMENT COMMENT 'Código del área', AUTO_INCREMENT=10;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD CONSTRAINT `equipo_ibfk_1` FOREIGN KEY (`id_tipo equipo`) REFERENCES `tipo equipo` (`código`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `equipo_ibfk_2` FOREIGN KEY (`id_ubicación`) REFERENCES `ubicación` (`código`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `equipo_ibfk_3` FOREIGN KEY (`id_marca`) REFERENCES `marca` (`código`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `equipo_ibfk_4` FOREIGN KEY (`id_estados equipos`) REFERENCES `estado del equipo` (`código`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `mantenimiento`
--
ALTER TABLE `mantenimiento`
  ADD CONSTRAINT `mantenimiento_ibfk_1` FOREIGN KEY (`Id_código equipo`) REFERENCES `equipo` (`serial`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `mantenimiento_ibfk_2` FOREIGN KEY (`Id_código usuario`) REFERENCES `usuarios` (`Codigo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `mantenimiento_ibfk_3` FOREIGN KEY (`Id_tipo de falla`) REFERENCES `tipo de falla` (`código`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `mantenimiento_ibfk_4` FOREIGN KEY (`estado del equipo`) REFERENCES `estado en mantenimiento` (`código`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`Id_Sexo`) REFERENCES `sexos` (`código sexo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `usuarios_ibfk_2` FOREIGN KEY (`Id_Tipo_Perfil`) REFERENCES `tipo perfiles` (`Código perfil`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `usuarios_ibfk_3` FOREIGN KEY (`Id_Área`) REFERENCES `áreas` (`Código área`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `usuarios_ibfk_4` FOREIGN KEY (`Id_Cargo`) REFERENCES `cargos` (`Código cargo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `usuarios_ibfk_5` FOREIGN KEY (`Id_Estado`) REFERENCES `estados` (`código estado`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
