-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-08-2022 a las 18:49:28
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `areas`
--

CREATE TABLE `areas` (
  `Codigo_area` int(10) NOT NULL COMMENT 'Código del área',
  `Area` varchar(50) NOT NULL COMMENT 'Área del usuario'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Áreas de los usuarios';

--
-- Volcado de datos para la tabla `areas`
--

INSERT INTO `areas` (`Codigo_area`, `Area`) VALUES
(1, 'Informática'),
(2, 'Inglés'),
(3, 'Lenguaje'),
(4, 'Matemáticas'),
(5, 'Química'),
(6, 'Física'),
(7, 'Administrativa'),
(8, 'No aplica'),
(9, 'Otra...');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cargos`
--

CREATE TABLE `cargos` (
  `Código_cargo` int(10) NOT NULL COMMENT 'Código del cargo',
  `Cargo` varchar(50) NOT NULL COMMENT 'Cargo del empleado'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cargos`
--

INSERT INTO `cargos` (`Código_cargo`, `Cargo`) VALUES
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
  `id_tipo_equipo` int(10) NOT NULL COMMENT 'Tipo de uso del equipo',
  `id_ubicación` int(10) NOT NULL COMMENT 'Ubicación del equipo',
  `id_marca` int(10) NOT NULL COMMENT 'Marca del equipo',
  `modelo` int(10) DEFAULT NULL COMMENT 'Año modelo del equipo',
  `observaciones` varchar(200) DEFAULT NULL COMMENT 'Observaciones de cada equipo',
  `id_estados_equipos` int(10) NOT NULL COMMENT 'Estado de funcionamiento del equipo'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tabla principal sobre equipos';

--
-- Volcado de datos para la tabla `equipo`
--

INSERT INTO `equipo` (`serial`, `id_tipo_equipo`, `id_ubicación`, `id_marca`, `modelo`, `observaciones`, `id_estados_equipos`) VALUES
(105860, 8, 2, 6, 2014, 'interdum in ante vestibulum ante ipsum primis in faucibus orci luctus et', 2),
(115344, 1, 1, 2, 2012, 'aenean sit amet justo morbi ut odio cras mi pede malesuada in', 1),
(115406, 9, 2, 4, 2019, 'nulla justo aliquam quis turpis eget elit sodales scelerisque mauris sit amet eros suspendisse accumsan tortor quis', 2),
(190293, 8, 3, 7, 2010, 'pellentesque quisque porta volutpat erat quisque erat eros viverra eget congue eget semper rutrum', 2),
(212562, 1, 2, 6, 2015, 'arcu sed augue aliquam erat volutpat in congue etiam justo etiam pretium iaculis justo in hac habitasse platea dictumst etiam', 1),
(227452, 9, 4, 7, 2020, 'quam pede lobortis ligula sit amet eleifend pede libero quis orci nullam molestie nibh in lectus pellentesque at nulla', 1),
(245831, 10, 4, 4, 2014, 'eu magna vulputate luctus cum sociis natoque penatibus et magnis dis parturient montes nascetur ridiculus mus', 2),
(261723, 9, 1, 3, 2011, 'sed tincidunt eu felis fusce posuere felis sed lacus morbi sem mauris', 1),
(275897, 1, 4, 2, 2014, 'congue vivamus metus arcu adipiscing molestie hendrerit at vulputate vitae nisl aenean lectus pellentesque eget', 1),
(279955, 10, 2, 4, 2019, 'in tempor turpis nec euismod scelerisque quam turpis adipiscing lorem vitae mattis nibh', 2),
(310344, 6, 1, 1, 2016, 'vivamus tortor duis mattis egestas metus aenean fermentum donec ut mauris eget massa tempor convallis', 1),
(311792, 8, 6, 1, 2011, 'sit amet eros suspendisse accumsan tortor quis turpis sed ante vivamus tortor duis mattis egestas metus', 2),
(341286, 2, 2, 4, 2014, 'suscipit a feugiat et eros vestibulum ac est lacinia nisi venenatis tristique', 1),
(415014, 3, 2, 3, 2014, 'Ninguna', 1),
(417813, 3, 3, 5, 2013, 'vestibulum aliquet ultrices erat tortor sollicitudin mi sit amet lobortis', 1),
(483113, 7, 3, 4, 2013, 'faucibus orci luctus et ultrices posuere cubilia curae mauris viverra', 1),
(502059, 2, 6, 1, 2021, 'mi nulla ac enim in tempor turpis nec euismod scelerisque quam', 2),
(513785, 5, 3, 7, 2014, 'in faucibus orci luctus et ultrices posuere cubilia curae donec pharetra magna vestibulum aliquet ultrices erat tortor sollicitudin mi sit', 2),
(519993, 4, 6, 5, 2019, 'adipiscing elit proin risus praesent lectus vestibulum quam sapien varius ut blandit non interdum in ante vestibulum ante ipsum', 2),
(561946, 3, 1, 3, 2013, 'posuere cubilia curae nulla dapibus dolor vel est donec odio justo sollicitudin ut suscipit a feugiat et eros vestibulum ac', 2),
(689654, 4, 6, 5, 2017, 'condimentum neque sapien placerat ante nulla justo aliquam quis turpis', 1),
(717298, 7, 5, 4, 2012, 'ultrices enim lorem ipsum dolor sit amet consectetuer adipiscing elit proin interdum mauris non', 1),
(720865, 3, 4, 1, 2015, 'porttitor id consequat in consequat ut nulla sed accumsan felis ut at dolor quis odio consequat varius integer ac', 2),
(732868, 4, 1, 2, 2011, 'luctus cum sociis natoque penatibus et magnis dis parturient montes nascetur ridiculus', 2),
(739320, 10, 6, 7, 2014, 'ut massa quis augue luctus tincidunt nulla mollis molestie lorem quisque ut', 1),
(778064, 3, 3, 1, 2020, 'a ipsum integer a nibh in quis justo maecenas rhoncus aliquam', 2),
(787462, 8, 4, 4, 2011, 'quam pharetra magna ac consequat metus sapien ut nunc vestibulum ante ipsum primis in faucibus orci luctus et ultrices', 1),
(815890, 5, 1, 3, 2019, 'dapibus nulla suscipit ligula in lacus curabitur at ipsum ac', 2),
(874157, 3, 4, 6, 2013, 'morbi porttitor lorem id ligula suspendisse ornare consequat lectus in est risus auctor sed tristique in', 1),
(911952, 7, 5, 7, 2017, 'massa quis augue luctus tincidunt nulla mollis molestie lorem quisque ut erat', 2),
(926702, 7, 5, 6, 2010, 'justo nec condimentum neque sapien placerat ante nulla justo aliquam quis turpis eget elit sodales scelerisque mauris sit', 1);

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
  `código_estado` int(50) NOT NULL COMMENT 'Código estados',
  `estado` varchar(50) NOT NULL COMMENT 'Estados'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Estado del usuario: 1) Activo 2) Inactivo';

--
-- Volcado de datos para la tabla `estados`
--

INSERT INTO `estados` (`código_estado`, `estado`) VALUES
(1, 'Activo'),
(2, 'Inactivo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estado_del_equipo`
--

CREATE TABLE `estado_del_equipo` (
  `código` int(10) NOT NULL COMMENT 'Código del estado',
  `estado` varchar(50) NOT NULL COMMENT 'Nombre del estado'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tabla secundaria sobre el estado de funcionamiento de equipo';

--
-- Volcado de datos para la tabla `estado_del_equipo`
--

INSERT INTO `estado_del_equipo` (`código`, `estado`) VALUES
(1, 'Operativo'),
(2, 'No operativo');

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
  `código_sexo` int(10) NOT NULL COMMENT 'Código sexo',
  `sexo` varchar(50) NOT NULL COMMENT 'Masculino o Femenino'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `sexos`
--

INSERT INTO `sexos` (`código_sexo`, `sexo`) VALUES
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
-- Estructura de tabla para la tabla `tipo_equipo`
--

CREATE TABLE `tipo_equipo` (
  `código` int(10) NOT NULL,
  `tipo de equipo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tabla secundaria sobre cada tipo de equipo';

--
-- Volcado de datos para la tabla `tipo_equipo`
--

INSERT INTO `tipo_equipo` (`código`, `tipo de equipo`) VALUES
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
-- Estructura de tabla para la tabla `tipo_perfiles`
--

CREATE TABLE `tipo_perfiles` (
  `Códigoperfil` int(10) NOT NULL COMMENT 'Código de perfil',
  `perfil` varchar(50) NOT NULL COMMENT 'Perfil del usuario'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tipo de perfil: 1) Administrador 2) Técnico 3) Usuario';

--
-- Volcado de datos para la tabla `tipo_perfiles`
--

INSERT INTO `tipo_perfiles` (`Códigoperfil`, `perfil`) VALUES
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
  `Correo` varchar(50) DEFAULT NULL COMMENT 'Correo usuario',
  `Teléfono` int(10) NOT NULL COMMENT 'Teléfono usuario',
  `Id_Tipo_Perfil` int(10) NOT NULL COMMENT 'Tipo de perfil',
  `Id_Área` int(10) NOT NULL COMMENT 'Código área',
  `Contraseña` blob NOT NULL COMMENT 'Contraseña',
  `Id_Cargo` int(10) NOT NULL COMMENT 'Código Cargo',
  `Id_Estado` int(10) NOT NULL COMMENT 'Código Estado'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`Codigo`, `Primer_Nombre`, `Segundo_Nombre`, `Primer_Apellido`, `Segundo_Apellido`, `Id_Sexo`, `Correo`, `Teléfono`, `Id_Tipo_Perfil`, `Id_Área`, `Contraseña`, `Id_Cargo`, `Id_Estado`) VALUES
(103477, 'Zed', 'Chelsie', 'Penas', 'Peskett', 1, 'cpeskett0@plala.or.jp', 794, 1, 3, 0x69784f4c6a38775232553048, 3, 2),
(201752, 'Valentine', 'Hersh', 'Coveny', 'Cronk', 2, 'hcronk5@cornell.edu', 833, 1, 7, 0x4845793879536f593477, 2, 2),
(267534, 'Jeralee', 'Westleigh', 'Fitchen', 'Folbig', 1, 'wfolbig4@google.cn', 274, 2, 9, 0x6c6f583659577851, 5, 1),
(307343, 'Leonora', 'Lucias', 'Berens', 'Maeer', 1, 'lmaeer8@geocities.com', 204, 2, 2, 0x6c7963376a45654758506d73, 5, 2),
(441719, 'Zachariah', 'Brett', 'Gleave', 'Neeson', 2, 'bneeson3@si.edu', 575, 3, 8, 0x4532396a6e77, 7, 2),
(475817, 'Fanchon', 'Valencia', 'Rossborough', 'Croisdall', 1, 'vcroisdallc@people.com.cn', 952, 3, 8, 0x7950414d4e6f546b467a56, 1, 2),
(632426, 'Arline', 'Jocko', 'Haily', 'Janu', 1, 'jjanug@cbslocal.com', 296, 1, 7, 0x7765716b4e5954697a, 4, 1),
(633776, 'Fidelia', 'Shelden', 'Moyers', 'Longmaid', 2, 'slongmaid2@usnews.com', 514, 2, 8, 0x647339473347, 5, 1),
(634429, 'Sebastien', 'Carmella', 'Pleavin', 'Veld', 1, 'cveldf@people.com.cn', 971, 1, 9, 0x36633341574533, 7, 1),
(641345, 'Oriana', 'Teddy', 'Higounet', 'Bauman', 1, 'tbaumanb@soup.io', 383, 3, 9, 0x445862586676506c334662, 6, 2),
(676609, 'Berte', 'Ashly', 'Janous', 'Ashbe', 1, 'aashbe6@odnoklassniki.ru', 668, 3, 6, 0x414a69366f6b454c4c, 1, 1),
(697912, 'Diego', 'Fernando', 'Victoria', 'Lopez', 1, 'diego@gmail.com', 2132313, 1, 3, 0x31323334, 2, 1),
(712037, 'Miller', 'Sigrid', 'Machin', 'Mayho', 1, 'smayhoe@newsvine.com', 530, 3, 8, 0x41344b4f6e70444746654c, 7, 1),
(718606, 'Terence', 'Dennison', 'Ondrousek', 'Ollington', 2, 'dollingtond@oracle.com', 990, 3, 3, 0x57534a7543624e, 5, 1),
(796177, 'Averyl', 'Kinnie', 'Breewood', 'Dickenson', 1, 'kdickenson7@aol.com', 106, 1, 5, 0x66727861456e71634a, 2, 1),
(797287, 'Efrem', 'Crichton', 'Redrup', 'Sprosson', 1, 'csprosson9@imageshack.us', 868, 1, 8, 0x5146793078336a4e4b6d4f, 5, 2),
(873997, 'Gabey', 'Glynn', 'Astridge', 'Gopsill', 2, 'ggopsill1@bandcamp.com', 884, 3, 6, 0x3539414e686561, 5, 1),
(901189, 'Scottie', 'Drusie', 'Paladini', 'Cutler', 1, 'dcutlera@dropbox.com', 714, 3, 1, 0x524c4367577635634e, 6, 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `areas`
--
ALTER TABLE `areas`
  ADD PRIMARY KEY (`Codigo_area`);

--
-- Indices de la tabla `cargos`
--
ALTER TABLE `cargos`
  ADD PRIMARY KEY (`Código_cargo`);

--
-- Indices de la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD PRIMARY KEY (`serial`),
  ADD KEY `id_tipo equipo` (`id_tipo_equipo`),
  ADD KEY `id_ubicación` (`id_ubicación`),
  ADD KEY `id_marca` (`id_marca`),
  ADD KEY `id_estados equipos` (`id_estados_equipos`);

--
-- Indices de la tabla `estado en mantenimiento`
--
ALTER TABLE `estado en mantenimiento`
  ADD PRIMARY KEY (`código`);

--
-- Indices de la tabla `estados`
--
ALTER TABLE `estados`
  ADD PRIMARY KEY (`código_estado`);

--
-- Indices de la tabla `estado_del_equipo`
--
ALTER TABLE `estado_del_equipo`
  ADD PRIMARY KEY (`código`);

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
  ADD PRIMARY KEY (`código_sexo`);

--
-- Indices de la tabla `tipo de falla`
--
ALTER TABLE `tipo de falla`
  ADD PRIMARY KEY (`código`);

--
-- Indices de la tabla `tipo_equipo`
--
ALTER TABLE `tipo_equipo`
  ADD PRIMARY KEY (`código`);

--
-- Indices de la tabla `tipo_perfiles`
--
ALTER TABLE `tipo_perfiles`
  ADD PRIMARY KEY (`Códigoperfil`);

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
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `areas`
--
ALTER TABLE `areas`
  MODIFY `Codigo_area` int(10) NOT NULL AUTO_INCREMENT COMMENT 'Código del área', AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `cargos`
--
ALTER TABLE `cargos`
  MODIFY `Código_cargo` int(10) NOT NULL AUTO_INCREMENT COMMENT 'Código del cargo', AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `equipo`
--
ALTER TABLE `equipo`
  MODIFY `serial` int(20) NOT NULL AUTO_INCREMENT COMMENT 'Número único del equipo', AUTO_INCREMENT=926703;

--
-- AUTO_INCREMENT de la tabla `estado en mantenimiento`
--
ALTER TABLE `estado en mantenimiento`
  MODIFY `código` int(10) NOT NULL AUTO_INCREMENT COMMENT 'Código del estado', AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `estados`
--
ALTER TABLE `estados`
  MODIFY `código_estado` int(50) NOT NULL AUTO_INCREMENT COMMENT 'Código estados', AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `estado_del_equipo`
--
ALTER TABLE `estado_del_equipo`
  MODIFY `código` int(10) NOT NULL AUTO_INCREMENT COMMENT 'Código del estado', AUTO_INCREMENT=3;

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
  MODIFY `código_sexo` int(10) NOT NULL AUTO_INCREMENT COMMENT 'Código sexo', AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `tipo de falla`
--
ALTER TABLE `tipo de falla`
  MODIFY `código` int(10) NOT NULL AUTO_INCREMENT COMMENT 'Código de la falla', AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `tipo_equipo`
--
ALTER TABLE `tipo_equipo`
  MODIFY `código` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `tipo_perfiles`
--
ALTER TABLE `tipo_perfiles`
  MODIFY `Códigoperfil` int(10) NOT NULL AUTO_INCREMENT COMMENT 'Código de perfil', AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `ubicación`
--
ALTER TABLE `ubicación`
  MODIFY `código` int(10) NOT NULL AUTO_INCREMENT COMMENT 'Código de la ubicación', AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `Codigo` int(10) NOT NULL AUTO_INCREMENT COMMENT '(PK) Código Usuarios', AUTO_INCREMENT=901190;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD CONSTRAINT `equipo_ibfk_1` FOREIGN KEY (`id_tipo_equipo`) REFERENCES `tipo_equipo` (`código`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `equipo_ibfk_2` FOREIGN KEY (`id_ubicación`) REFERENCES `ubicación` (`código`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `equipo_ibfk_3` FOREIGN KEY (`id_marca`) REFERENCES `marca` (`código`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `equipo_ibfk_4` FOREIGN KEY (`id_estados_equipos`) REFERENCES `estado_del_equipo` (`código`) ON DELETE CASCADE ON UPDATE CASCADE;

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
  ADD CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`Id_Sexo`) REFERENCES `sexos` (`código_sexo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `usuarios_ibfk_2` FOREIGN KEY (`Id_Tipo_Perfil`) REFERENCES `tipo_perfiles` (`Códigoperfil`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `usuarios_ibfk_3` FOREIGN KEY (`Id_Área`) REFERENCES `areas` (`Codigo_area`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `usuarios_ibfk_4` FOREIGN KEY (`Id_Cargo`) REFERENCES `cargos` (`Código_cargo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `usuarios_ibfk_5` FOREIGN KEY (`Id_Estado`) REFERENCES `estados` (`código_estado`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
