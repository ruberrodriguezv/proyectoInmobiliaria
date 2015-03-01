-- phpMyAdmin SQL Dump
-- version 4.2.12deb2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 01-03-2015 a las 16:40:34
-- Versión del servidor: 5.5.42-1
-- Versión de PHP: 5.6.5-2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `inmobiliaria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudad`
--

CREATE TABLE IF NOT EXISTS `ciudad` (
`consecutivo_ciudad` int(11) NOT NULL,
  `id_ciudad` int(11) NOT NULL,
  `nombre_ciudad` varchar(45) NOT NULL,
  `departamento_id_departamento` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=1123 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `ciudad`
--

INSERT INTO `ciudad` (`consecutivo_ciudad`, `id_ciudad`, `nombre_ciudad`, `departamento_id_departamento`) VALUES
(1, 1, 'LETICIA', 91),
(2, 263, 'EL ENCANTO', 91),
(3, 405, 'LA CHORRERA', 91),
(4, 407, 'LA PEDRERA', 91),
(5, 430, 'LA VICTORIA', 91),
(6, 460, 'MIRITI - PARANÁ', 91),
(7, 530, 'PUERTO ALEGRÍA', 91),
(8, 536, 'PUERTO ARICA', 91),
(9, 540, 'PUERTO NARIÑO', 91),
(10, 669, 'PUERTO SANTANDER', 91),
(11, 798, 'TARAPACÁ', 91),
(12, 1, 'MEDELLÍN', 5),
(13, 2, 'ABEJORRAL', 5),
(14, 4, 'ABRIAQUÍ', 5),
(15, 21, 'ALEJANDRÍA', 5),
(16, 30, 'AMAGÁ', 5),
(17, 31, 'AMALFI', 5),
(18, 34, 'ANDES', 5),
(19, 36, 'ANGELÓPOLIS', 5),
(20, 38, 'ANGOSTURA', 5),
(21, 40, 'ANORÍ', 5),
(22, 42, 'SANTAFÉ DE ANTIOQUIA', 5),
(23, 44, 'ANZA', 5),
(24, 45, 'APARTADÓ', 5),
(25, 51, 'ARBOLETES', 5),
(26, 55, 'ARGELIA', 5),
(27, 59, 'ARMENIA', 5),
(28, 79, 'BARBOSA', 5),
(29, 86, 'BELMIRA', 5),
(30, 88, 'BELLO', 5),
(31, 91, 'BETANIA', 5),
(32, 93, 'BETULIA', 5),
(33, 101, 'CIUDAD BOLÍVAR', 5),
(34, 107, 'BRICEÑO', 5),
(35, 113, 'BURITICÁ', 5),
(36, 120, 'CÁCERES', 5),
(37, 125, 'CAICEDO', 5),
(38, 129, 'CALDAS', 5),
(39, 134, 'CAMPAMENTO', 5),
(40, 138, 'CAÑASGORDAS', 5),
(41, 142, 'CARACOLÍ', 5),
(42, 145, 'CARAMANTA', 5),
(43, 147, 'CAREPA', 5),
(44, 148, 'EL CARMEN DE VIBORAL', 5),
(45, 150, 'CAROLINA', 5),
(46, 154, 'CAUCASIA', 5),
(47, 172, 'CHIGORODÓ', 5),
(48, 190, 'CISNEROS', 5),
(49, 197, 'COCORNÁ', 5),
(50, 206, 'CONCEPCIÓN', 5),
(51, 209, 'CONCORDIA', 5),
(52, 212, 'COPACABANA', 5),
(53, 234, 'DABEIBA', 5),
(54, 237, 'DONMATÍAS', 5),
(55, 240, 'EBÉJICO', 5),
(56, 250, 'EL BAGRE', 5),
(57, 264, 'ENTRERRIOS', 5),
(58, 266, 'ENVIGADO', 5),
(59, 282, 'FREDONIA', 5),
(60, 284, 'FRONTINO', 5),
(61, 306, 'GIRALDO', 5),
(62, 308, 'GIRARDOTA', 5),
(63, 310, 'GÓMEZ PLATA', 5),
(64, 313, 'GRANADA', 5),
(65, 315, 'GUADALUPE', 5),
(66, 318, 'GUARNE', 5),
(67, 321, 'GUATAPE', 5),
(68, 347, 'HELICONIA', 5),
(69, 353, 'HISPANIA', 5),
(70, 360, 'ITAGUI', 5),
(71, 361, 'ITUANGO', 5),
(72, 364, 'JARDÍN', 5),
(73, 368, 'JERICÓ', 5),
(74, 376, 'LA CEJA', 5),
(75, 380, 'LA ESTRELLA', 5),
(76, 390, 'LA PINTADA', 5),
(77, 400, 'LA UNIÓN', 5),
(78, 411, 'LIBORINA', 5),
(79, 425, 'MACEO', 5),
(80, 440, 'MARINILLA', 5),
(81, 467, 'MONTEBELLO', 5),
(82, 475, 'MURINDÓ', 5),
(83, 480, 'MUTATÁ', 5),
(84, 483, 'NARIÑO', 5),
(85, 490, 'NECOCLÍ', 5),
(86, 495, 'NECHÍ', 5),
(87, 501, 'OLAYA', 5),
(88, 541, 'PEÑOL', 5),
(89, 543, 'PEQUE', 5),
(90, 576, 'PUEBLORRICO', 5),
(91, 579, 'PUERTO BERRÍO', 5),
(92, 585, 'PUERTO NARE', 5),
(93, 591, 'PUERTO TRIUNFO', 5),
(94, 604, 'REMEDIOS', 5),
(95, 607, 'RETIRO', 5),
(96, 615, 'RIONEGRO', 5),
(97, 628, 'SABANALARGA', 5),
(98, 631, 'SABANETA', 5),
(99, 642, 'SALGAR', 5),
(100, 647, 'SAN ANDRÉS DE CUERQUÍA', 5),
(101, 649, 'SAN CARLOS', 5),
(102, 652, 'SAN FRANCISCO', 5),
(103, 656, 'SAN JERÓNIMO', 5),
(104, 658, 'SAN JOSÉ DE LA MONTAÑA', 5),
(105, 659, 'SAN JUAN DE URABÁ', 5),
(106, 660, 'SAN LUIS', 5),
(107, 664, 'SAN PEDRO DE LOS MILAGROS', 5),
(108, 665, 'SAN PEDRO DE URABA', 5),
(109, 667, 'SAN RAFAEL', 5),
(110, 670, 'SAN ROQUE', 5),
(111, 674, 'SAN VICENTE', 5),
(112, 679, 'SANTA BÁRBARA', 5),
(113, 686, 'SANTA ROSA DE OSOS', 5),
(114, 690, 'SANTO DOMINGO', 5),
(115, 697, 'EL SANTUARIO', 5),
(116, 736, 'SEGOVIA', 5),
(117, 756, 'SONSON', 5),
(118, 761, 'SOPETRÁN', 5),
(119, 789, 'TÁMESIS', 5),
(120, 790, 'TARAZÁ', 5),
(121, 792, 'TARSO', 5),
(122, 809, 'TITIRIBÍ', 5),
(123, 819, 'TOLEDO', 5),
(124, 837, 'TURBO', 5),
(125, 842, 'URAMITA', 5),
(126, 847, 'URRAO', 5),
(127, 854, 'VALDIVIA', 5),
(128, 856, 'VALPARAÍSO', 5),
(129, 858, 'VEGACHÍ', 5),
(130, 861, 'VENECIA', 5),
(131, 873, 'VIGÍA DEL FUERTE', 5),
(132, 885, 'YALÍ', 5),
(133, 887, 'YARUMAL', 5),
(134, 890, 'YOLOMBÓ', 5),
(135, 893, 'YONDÓ', 5),
(136, 895, 'ZARAGOZA', 5),
(137, 1, 'ARAUCA', 81),
(138, 65, 'ARAUQUITA', 81),
(139, 220, 'CRAVO NORTE', 81),
(140, 300, 'FORTUL', 81),
(141, 591, 'PUERTO RONDÓN', 81),
(142, 736, 'SARAVENA', 81),
(143, 794, 'TAME', 81),
(144, 1, 'BARRANQUILLA', 8),
(145, 78, 'BARANOA', 8),
(146, 137, 'CAMPO DE LA CRUZ', 8),
(147, 141, 'CANDELARIA', 8),
(148, 296, 'GALAPA', 8),
(149, 372, 'JUAN DE ACOSTA', 8),
(150, 421, 'LURUACO', 8),
(151, 433, 'MALAMBO', 8),
(152, 436, 'MANATÍ', 8),
(153, 520, 'PALMAR DE VARELA', 8),
(154, 549, 'PIOJÓ', 8),
(155, 558, 'POLONUEVO', 8),
(156, 560, 'PONEDERA', 8),
(157, 573, 'PUERTO COLOMBIA', 8),
(158, 606, 'REPELÓN', 8),
(159, 634, 'SABANAGRANDE', 8),
(160, 638, 'SABANALARGA', 8),
(161, 675, 'SANTA LUCÍA', 8),
(162, 685, 'SANTO TOMÁS', 8),
(163, 758, 'SOLEDAD', 8),
(164, 770, 'SUAN', 8),
(165, 832, 'TUBARÁ', 8),
(166, 849, 'USIACURÍ', 8),
(167, 1, 'BOGOTÁ, D.C.', 11),
(168, 1, 'CARTAGENA', 13),
(169, 6, 'ACHÍ', 13),
(170, 30, 'ALTOS DEL ROSARIO', 13),
(171, 42, 'ARENAL', 13),
(172, 52, 'ARJONA', 13),
(173, 62, 'ARROYOHONDO', 13),
(174, 74, 'BARRANCO DE LOBA', 13),
(175, 140, 'CALAMAR', 13),
(176, 160, 'CANTAGALLO', 13),
(177, 188, 'CICUCO', 13),
(178, 212, 'CÓRDOBA', 13),
(179, 222, 'CLEMENCIA', 13),
(180, 244, 'EL CARMEN DE BOLÍVAR', 13),
(181, 248, 'EL GUAMO', 13),
(182, 268, 'EL PEÑÓN', 13),
(183, 300, 'HATILLO DE LOBA', 13),
(184, 430, 'MAGANGUÉ', 13),
(185, 433, 'MAHATES', 13),
(186, 440, 'MARGARITA', 13),
(187, 442, 'MARÍA LA BAJA', 13),
(188, 458, 'MONTECRISTO', 13),
(189, 468, 'MOMPÓS', 13),
(190, 473, 'MORALES', 13),
(191, 490, 'NOROSÍ', 13),
(192, 549, 'PINILLOS', 13),
(193, 580, 'REGIDOR', 13),
(194, 600, 'RÍO VIEJO', 13),
(195, 620, 'SAN CRISTÓBAL', 13),
(196, 647, 'SAN ESTANISLAO', 13),
(197, 650, 'SAN FERNANDO', 13),
(198, 654, 'SAN JACINTO', 13),
(199, 655, 'SAN JACINTO DEL CAUCA', 13),
(200, 657, 'SAN JUAN NEPOMUCENO', 13),
(201, 667, 'SAN MARTÍN DE LOBA', 13),
(202, 670, 'SAN PABLO', 13),
(203, 673, 'SANTA CATALINA', 13),
(204, 683, 'SANTA ROSA', 13),
(205, 688, 'SANTA ROSA DEL SUR', 13),
(206, 744, 'SIMITÍ', 13),
(207, 760, 'SOPLAVIENTO', 13),
(208, 780, 'TALAIGUA NUEVO', 13),
(209, 810, 'TIQUISIO', 13),
(210, 836, 'TURBACO', 13),
(211, 838, 'TURBANÁ', 13),
(212, 873, 'VILLANUEVA', 13),
(213, 894, 'ZAMBRANO', 13),
(214, 1, 'TUNJA', 15),
(215, 22, 'ALMEIDA', 15),
(216, 47, 'AQUITANIA', 15),
(217, 51, 'ARCABUCO', 15),
(218, 87, 'BELÉN', 15),
(219, 90, 'BERBEO', 15),
(220, 92, 'BETÉITIVA', 15),
(221, 97, 'BOAVITA', 15),
(222, 104, 'BOYACÁ', 15),
(223, 106, 'BRICEÑO', 15),
(224, 109, 'BUENAVISTA', 15),
(225, 114, 'BUSBANZÁ', 15),
(226, 131, 'CALDAS', 15),
(227, 135, 'CAMPOHERMOSO', 15),
(228, 162, 'CERINZA', 15),
(229, 172, 'CHINAVITA', 15),
(230, 176, 'CHIQUINQUIRÁ', 15),
(231, 180, 'CHISCAS', 15),
(232, 183, 'CHITA', 15),
(233, 185, 'CHITARAQUE', 15),
(234, 187, 'CHIVATÁ', 15),
(235, 189, 'CIÉNEGA', 15),
(236, 204, 'CÓMBITA', 15),
(237, 212, 'COPER', 15),
(238, 215, 'CORRALES', 15),
(239, 218, 'COVARACHÍA', 15),
(240, 223, 'CUBARÁ', 15),
(241, 224, 'CUCAITA', 15),
(242, 226, 'CUÍTIVA', 15),
(243, 232, 'CHÍQUIZA', 15),
(244, 236, 'CHIVOR', 15),
(245, 238, 'DUITAMA', 15),
(246, 244, 'EL COCUY', 15),
(247, 248, 'EL ESPINO', 15),
(248, 272, 'FIRAVITOBA', 15),
(249, 276, 'FLORESTA', 15),
(250, 293, 'GACHANTIVÁ', 15),
(251, 296, 'GAMEZA', 15),
(252, 299, 'GARAGOA', 15),
(253, 317, 'GUACAMAYAS', 15),
(254, 322, 'GUATEQUE', 15),
(255, 325, 'GUAYATÁ', 15),
(256, 332, 'GÜICÁN', 15),
(257, 362, 'IZA', 15),
(258, 367, 'JENESANO', 15),
(259, 368, 'JERICÓ', 15),
(260, 377, 'LABRANZAGRANDE', 15),
(261, 380, 'LA CAPILLA', 15),
(262, 401, 'LA VICTORIA', 15),
(263, 403, 'LA UVITA', 15),
(264, 407, 'VILLA DE LEYVA', 15),
(265, 425, 'MACANAL', 15),
(266, 442, 'MARIPÍ', 15),
(267, 455, 'MIRAFLORES', 15),
(268, 464, 'MONGUA', 15),
(269, 466, 'MONGUÍ', 15),
(270, 469, 'MONIQUIRÁ', 15),
(271, 476, 'MOTAVITA', 15),
(272, 480, 'MUZO', 15),
(273, 491, 'NOBSA', 15),
(274, 494, 'NUEVO COLÓN', 15),
(275, 500, 'OICATÁ', 15),
(276, 507, 'OTANCHE', 15),
(277, 511, 'PACHAVITA', 15),
(278, 514, 'PÁEZ', 15),
(279, 516, 'PAIPA', 15),
(280, 518, 'PAJARITO', 15),
(281, 522, 'PANQUEBA', 15),
(282, 531, 'PAUNA', 15),
(283, 533, 'PAYA', 15),
(284, 537, 'PAZ DE RÍO', 15),
(285, 542, 'PESCA', 15),
(286, 550, 'PISBA', 15),
(287, 572, 'PUERTO BOYACÁ', 15),
(288, 580, 'QUÍPAMA', 15),
(289, 599, 'RAMIRIQUÍ', 15),
(290, 600, 'RÁQUIRA', 15),
(291, 621, 'RONDÓN', 15),
(292, 632, 'SABOYÁ', 15),
(293, 638, 'SÁCHICA', 15),
(294, 646, 'SAMACÁ', 15),
(295, 660, 'SAN EDUARDO', 15),
(296, 664, 'SAN JOSÉ DE PARE', 15),
(297, 667, 'SAN LUIS DE GACENO', 15),
(298, 673, 'SAN MATEO', 15),
(299, 676, 'SAN MIGUEL DE SEMA', 15),
(300, 681, 'SAN PABLO DE BORBUR', 15),
(301, 686, 'SANTANA', 15),
(302, 690, 'SANTA MARÍA', 15),
(303, 693, 'SANTA ROSA DE VITERBO', 15),
(304, 696, 'SANTA SOFÍA', 15),
(305, 720, 'SATIVANORTE', 15),
(306, 723, 'SATIVASUR', 15),
(307, 740, 'SIACHOQUE', 15),
(308, 753, 'SOATÁ', 15),
(309, 755, 'SOCOTÁ', 15),
(310, 757, 'SOCHA', 15),
(311, 759, 'SOGAMOSO', 15),
(312, 761, 'SOMONDOCO', 15),
(313, 762, 'SORA', 15),
(314, 763, 'SOTAQUIRÁ', 15),
(315, 764, 'SORACÁ', 15),
(316, 774, 'SUSACÓN', 15),
(317, 776, 'SUTAMARCHÁN', 15),
(318, 778, 'SUTATENZA', 15),
(319, 790, 'TASCO', 15),
(320, 798, 'TENZA', 15),
(321, 804, 'TIBANÁ', 15),
(322, 806, 'TIBASOSA', 15),
(323, 808, 'TINJACÁ', 15),
(324, 810, 'TIPACOQUE', 15),
(325, 814, 'TOCA', 15),
(326, 816, 'TOGÜÍ', 15),
(327, 820, 'TÓPAGA', 15),
(328, 822, 'TOTA', 15),
(329, 832, 'TUNUNGUÁ', 15),
(330, 835, 'TURMEQUÉ', 15),
(331, 837, 'TUTA', 15),
(332, 839, 'TUTAZÁ', 15),
(333, 842, 'UMBITA', 15),
(334, 861, 'VENTAQUEMADA', 15),
(335, 879, 'VIRACACHÁ', 15),
(336, 897, 'ZETAQUIRA', 15),
(337, 1, 'MANIZALES', 17),
(338, 13, 'AGUADAS', 17),
(339, 42, 'ANSERMA', 17),
(340, 50, 'ARANZAZU', 17),
(341, 88, 'BELALCÁZAR', 17),
(342, 174, 'CHINCHINÁ', 17),
(343, 272, 'FILADELFIA', 17),
(344, 380, 'LA DORADA', 17),
(345, 388, 'LA MERCED', 17),
(346, 433, 'MANZANARES', 17),
(347, 442, 'MARMATO', 17),
(348, 444, 'MARQUETALIA', 17),
(349, 446, 'MARULANDA', 17),
(350, 486, 'NEIRA', 17),
(351, 495, 'NORCASIA', 17),
(352, 513, 'PÁCORA', 17),
(353, 524, 'PALESTINA', 17),
(354, 541, 'PENSILVANIA', 17),
(355, 614, 'RIOSUCIO', 17),
(356, 616, 'RISARALDA', 17),
(357, 653, 'SALAMINA', 17),
(358, 662, 'SAMANÁ', 17),
(359, 665, 'SAN JOSÉ', 17),
(360, 777, 'SUPÍA', 17),
(361, 867, 'VICTORIA', 17),
(362, 873, 'VILLAMARÍA', 17),
(363, 877, 'VITERBO', 17),
(364, 1, 'FLORENCIA', 18),
(365, 29, 'ALBANIA', 18),
(366, 94, 'BELÉN DE LOS ANDAQUÍES', 18),
(367, 150, 'CARTAGENA DEL CHAIRÁ', 18),
(368, 205, 'CURILLO', 18),
(369, 247, 'EL DONCELLO', 18),
(370, 256, 'EL PAUJIL', 18),
(371, 410, 'LA MONTAÑITA', 18),
(372, 460, 'MILÁN', 18),
(373, 479, 'MORELIA', 18),
(374, 592, 'PUERTO RICO', 18),
(375, 610, 'SAN JOSÉ DEL FRAGUA', 18),
(376, 753, 'SAN VICENTE DEL CAGUÁN', 18),
(377, 756, 'SOLANO', 18),
(378, 785, 'SOLITA', 18),
(379, 860, 'VALPARAÍSO', 18),
(380, 1, 'YOPAL', 85),
(381, 10, 'AGUAZUL', 85),
(382, 15, 'CHAMEZA', 85),
(383, 125, 'HATO COROZAL', 85),
(384, 136, 'LA SALINA', 85),
(385, 139, 'MANÍ', 85),
(386, 162, 'MONTERREY', 85),
(387, 225, 'NUNCHÍA', 85),
(388, 230, 'OROCUÉ', 85),
(389, 250, 'PAZ DE ARIPORO', 85),
(390, 263, 'PORE', 85),
(391, 279, 'RECETOR', 85),
(392, 300, 'SABANALARGA', 85),
(393, 315, 'SÁCAMA', 85),
(394, 325, 'SAN LUIS DE PALENQUE', 85),
(395, 400, 'TÁMARA', 85),
(396, 410, 'TAURAMENA', 85),
(397, 430, 'TRINIDAD', 85),
(398, 440, 'VILLANUEVA', 85),
(399, 1, 'POPAYÁN', 19),
(400, 22, 'ALMAGUER', 19),
(401, 50, 'ARGELIA', 19),
(402, 75, 'BALBOA', 19),
(403, 100, 'BOLÍVAR', 19),
(404, 110, 'BUENOS AIRES', 19),
(405, 130, 'CAJIBÍO', 19),
(406, 137, 'CALDONO', 19),
(407, 142, 'CALOTO', 19),
(408, 212, 'CORINTO', 19),
(409, 256, 'EL TAMBO', 19),
(410, 290, 'FLORENCIA', 19),
(411, 300, 'GUACHENÉ', 19),
(412, 318, 'GUAPI', 19),
(413, 355, 'INZÁ', 19),
(414, 364, 'JAMBALÓ', 19),
(415, 392, 'LA SIERRA', 19),
(416, 397, 'LA VEGA', 19),
(417, 418, 'LÓPEZ', 19),
(418, 450, 'MERCADERES', 19),
(419, 455, 'MIRANDA', 19),
(420, 473, 'MORALES', 19),
(421, 513, 'PADILLA', 19),
(422, 517, 'PAEZ', 19),
(423, 532, 'PATÍA', 19),
(424, 533, 'PIAMONTE', 19),
(425, 548, 'PIENDAMÓ', 19),
(426, 573, 'PUERTO TEJADA', 19),
(427, 585, 'PURACÉ', 19),
(428, 622, 'ROSAS', 19),
(429, 693, 'SAN SEBASTIÁN', 19),
(430, 698, 'SANTANDER DE QUILICHAO', 19),
(431, 701, 'SANTA ROSA', 19),
(432, 743, 'SILVIA', 19),
(433, 760, 'SOTARA', 19),
(434, 780, 'SUÁREZ', 19),
(435, 785, 'SUCRE', 19),
(436, 807, 'TIMBÍO', 19),
(437, 809, 'TIMBIQUÍ', 19),
(438, 821, 'TORIBIO', 19),
(439, 824, 'TOTORÓ', 19),
(440, 845, 'VILLA RICA', 19),
(441, 1, 'VALLEDUPAR', 20),
(442, 11, 'AGUACHICA', 20),
(443, 13, 'AGUSTÍN CODAZZI', 20),
(444, 32, 'ASTREA', 20),
(445, 45, 'BECERRIL', 20),
(446, 60, 'BOSCONIA', 20),
(447, 175, 'CHIMICHAGUA', 20),
(448, 178, 'CHIRIGUANÁ', 20),
(449, 228, 'CURUMANÍ', 20),
(450, 238, 'EL COPEY', 20),
(451, 250, 'EL PASO', 20),
(452, 295, 'GAMARRA', 20),
(453, 310, 'GONZÁLEZ', 20),
(454, 383, 'LA GLORIA', 20),
(455, 400, 'LA JAGUA DE IBIRICO', 20),
(456, 443, 'MANAURE', 20),
(457, 517, 'PAILITAS', 20),
(458, 550, 'PELAYA', 20),
(459, 570, 'PUEBLO BELLO', 20),
(460, 614, 'RÍO DE ORO', 20),
(461, 621, 'LA PAZ', 20),
(462, 710, 'SAN ALBERTO', 20),
(463, 750, 'SAN DIEGO', 20),
(464, 770, 'SAN MARTÍN', 20),
(465, 787, 'TAMALAMEQUE', 20),
(466, 1, 'QUIBDÓ', 27),
(467, 6, 'ACANDÍ', 27),
(468, 25, 'ALTO BAUDÓ', 27),
(469, 50, 'ATRATO', 27),
(470, 73, 'BAGADÓ', 27),
(471, 75, 'BAHÍA SOLANO', 27),
(472, 77, 'BAJO BAUDÓ', 27),
(473, 99, 'BOJAYA', 27),
(474, 135, 'EL CANTÓN DEL SAN PABLO', 27),
(475, 150, 'CARMEN DEL DARIÉN', 27),
(476, 160, 'CÉRTEGUI', 27),
(477, 205, 'CONDOTO', 27),
(478, 245, 'EL CARMEN DE ATRATO', 27),
(479, 250, 'EL LITORAL DEL SAN JUAN', 27),
(480, 361, 'ISTMINA', 27),
(481, 372, 'JURADÓ', 27),
(482, 413, 'LLORÓ', 27),
(483, 425, 'MEDIO ATRATO', 27),
(484, 430, 'MEDIO BAUDÓ', 27),
(485, 450, 'MEDIO SAN JUAN', 27),
(486, 491, 'NÓVITA', 27),
(487, 495, 'NUQUÍ', 27),
(488, 580, 'RÍO IRÓ', 27),
(489, 600, 'RÍO QUITO', 27),
(490, 615, 'RIOSUCIO', 27),
(491, 660, 'SAN JOSÉ DEL PALMAR', 27),
(492, 745, 'SIPÍ', 27),
(493, 787, 'TADÓ', 27),
(494, 800, 'UNGUÍA', 27),
(495, 810, 'UNIÓN PANAMERICANA', 27),
(496, 1, 'MONTERÍA', 23),
(497, 68, 'AYAPEL', 23),
(498, 79, 'BUENAVISTA', 23),
(499, 90, 'CANALETE', 23),
(500, 162, 'CERETÉ', 23),
(501, 168, 'CHIMÁ', 23),
(502, 182, 'CHINÚ', 23),
(503, 189, 'CIÉNAGA DE ORO', 23),
(504, 300, 'COTORRA', 23),
(505, 350, 'LA APARTADA', 23),
(506, 417, 'LORICA', 23),
(507, 419, 'LOS CÓRDOBAS', 23),
(508, 464, 'MOMIL', 23),
(509, 466, 'MONTELÍBANO', 23),
(510, 500, 'MOÑITOS', 23),
(511, 555, 'PLANETA RICA', 23),
(512, 570, 'PUEBLO NUEVO', 23),
(513, 574, 'PUERTO ESCONDIDO', 23),
(514, 580, 'PUERTO LIBERTADOR', 23),
(515, 586, 'PURÍSIMA', 23),
(516, 660, 'SAHAGÚN', 23),
(517, 670, 'SAN ANDRÉS SOTAVENTO', 23),
(518, 672, 'SAN ANTERO', 23),
(519, 675, 'SAN BERNARDO DEL VIENTO', 23),
(520, 678, 'SAN CARLOS', 23),
(521, 682, 'SAN JOSÉ DE URÉ', 23),
(522, 686, 'SAN PELAYO', 23),
(523, 807, 'TIERRALTA', 23),
(524, 815, 'TUCHÍN', 23),
(525, 855, 'VALENCIA', 23),
(526, 1, 'AGUA DE DIOS', 25),
(527, 19, 'ALBÁN', 25),
(528, 35, 'ANAPOIMA', 25),
(529, 40, 'ANOLAIMA', 25),
(530, 53, 'ARBELÁEZ', 25),
(531, 86, 'BELTRÁN', 25),
(532, 95, 'BITUIMA', 25),
(533, 99, 'BOJACÁ', 25),
(534, 120, 'CABRERA', 25),
(535, 123, 'CACHIPAY', 25),
(536, 126, 'CAJICÁ', 25),
(537, 148, 'CAPARRAPÍ', 25),
(538, 151, 'CAQUEZA', 25),
(539, 154, 'CARMEN DE CARUPA', 25),
(540, 168, 'CHAGUANÍ', 25),
(541, 175, 'CHÍA', 25),
(542, 178, 'CHIPAQUE', 25),
(543, 181, 'CHOACHÍ', 25),
(544, 183, 'CHOCONTÁ', 25),
(545, 200, 'COGUA', 25),
(546, 214, 'COTA', 25),
(547, 224, 'CUCUNUBÁ', 25),
(548, 245, 'EL COLEGIO', 25),
(549, 258, 'EL PEÑÓN', 25),
(550, 260, 'EL ROSAL', 25),
(551, 269, 'FACATATIVÁ', 25),
(552, 279, 'FOMEQUE', 25),
(553, 281, 'FOSCA', 25),
(554, 286, 'FUNZA', 25),
(555, 288, 'FÚQUENE', 25),
(556, 290, 'FUSAGASUGÁ', 25),
(557, 293, 'GACHALA', 25),
(558, 295, 'GACHANCIPÁ', 25),
(559, 297, 'GACHETÁ', 25),
(560, 299, 'GAMA', 25),
(561, 307, 'GIRARDOT', 25),
(562, 312, 'GRANADA', 25),
(563, 317, 'GUACHETÁ', 25),
(564, 320, 'GUADUAS', 25),
(565, 322, 'GUASCA', 25),
(566, 324, 'GUATAQUÍ', 25),
(567, 326, 'GUATAVITA', 25),
(568, 328, 'GUAYABAL DE SIQUIMA', 25),
(569, 335, 'GUAYABETAL', 25),
(570, 339, 'GUTIÉRREZ', 25),
(571, 368, 'JERUSALÉN', 25),
(572, 372, 'JUNÍN', 25),
(573, 377, 'LA CALERA', 25),
(574, 386, 'LA MESA', 25),
(575, 394, 'LA PALMA', 25),
(576, 398, 'LA PEÑA', 25),
(577, 402, 'LA VEGA', 25),
(578, 407, 'LENGUAZAQUE', 25),
(579, 426, 'MACHETA', 25),
(580, 430, 'MADRID', 25),
(581, 436, 'MANTA', 25),
(582, 438, 'MEDINA', 25),
(583, 473, 'MOSQUERA', 25),
(584, 483, 'NARIÑO', 25),
(585, 486, 'NEMOCÓN', 25),
(586, 488, 'NILO', 25),
(587, 489, 'NIMAIMA', 25),
(588, 491, 'NOCAIMA', 25),
(589, 506, 'VENECIA', 25),
(590, 513, 'PACHO', 25),
(591, 518, 'PAIME', 25),
(592, 524, 'PANDI', 25),
(593, 530, 'PARATEBUENO', 25),
(594, 535, 'PASCA', 25),
(595, 572, 'PUERTO SALGAR', 25),
(596, 580, 'PULÍ', 25),
(597, 592, 'QUEBRADANEGRA', 25),
(598, 594, 'QUETAME', 25),
(599, 596, 'QUIPILE', 25),
(600, 599, 'APULO', 25),
(601, 612, 'RICAURTE', 25),
(602, 645, 'SAN ANTONIO DEL TEQUENDAMA', 25),
(603, 649, 'SAN BERNARDO', 25),
(604, 653, 'SAN CAYETANO', 25),
(605, 658, 'SAN FRANCISCO', 25),
(606, 662, 'SAN JUAN DE RÍO SECO', 25),
(607, 718, 'SASAIMA', 25),
(608, 736, 'SESQUILÉ', 25),
(609, 740, 'SIBATÉ', 25),
(610, 743, 'SILVANIA', 25),
(611, 745, 'SIMIJACA', 25),
(612, 754, 'SOACHA', 25),
(613, 758, 'SOPÓ', 25),
(614, 769, 'SUBACHOQUE', 25),
(615, 772, 'SUESCA', 25),
(616, 777, 'SUPATÁ', 25),
(617, 779, 'SUSA', 25),
(618, 781, 'SUTATAUSA', 25),
(619, 785, 'TABIO', 25),
(620, 793, 'TAUSA', 25),
(621, 797, 'TENA', 25),
(622, 799, 'TENJO', 25),
(623, 805, 'TIBACUY', 25),
(624, 807, 'TIBIRITA', 25),
(625, 815, 'TOCAIMA', 25),
(626, 817, 'TOCANCIPÁ', 25),
(627, 823, 'TOPAIPÍ', 25),
(628, 839, 'UBALÁ', 25),
(629, 841, 'UBAQUE', 25),
(630, 843, 'VILLA DE SAN DIEGO DE UBATE', 25),
(631, 845, 'UNE', 25),
(632, 851, 'ÚTICA', 25),
(633, 862, 'VERGARA', 25),
(634, 867, 'VIANÍ', 25),
(635, 871, 'VILLAGÓMEZ', 25),
(636, 873, 'VILLAPINZÓN', 25),
(637, 875, 'VILLETA', 25),
(638, 878, 'VIOTÁ', 25),
(639, 885, 'YACOPÍ', 25),
(640, 898, 'ZIPACÓN', 25),
(641, 899, 'ZIPAQUIRÁ', 25),
(642, 1, 'INÍRIDA', 94),
(643, 343, 'BARRANCO MINAS', 94),
(644, 663, 'MAPIRIPANA', 94),
(645, 883, 'SAN FELIPE', 94),
(646, 884, 'PUERTO COLOMBIA', 94),
(647, 885, 'LA GUADALUPE', 94),
(648, 886, 'CACAHUAL', 94),
(649, 887, 'PANA PANA', 94),
(650, 888, 'MORICHAL', 94),
(651, 1, 'SAN JOSÉ DEL GUAVIARE', 95),
(652, 15, 'CALAMAR', 95),
(653, 25, 'EL RETORNO', 95),
(654, 200, 'MIRAFLORES', 95),
(655, 1, 'NEIVA', 41),
(656, 6, 'ACEVEDO', 41),
(657, 13, 'AGRADO', 41),
(658, 16, 'AIPE', 41),
(659, 20, 'ALGECIRAS', 41),
(660, 26, 'ALTAMIRA', 41),
(661, 78, 'BARAYA', 41),
(662, 132, 'CAMPOALEGRE', 41),
(663, 206, 'COLOMBIA', 41),
(664, 244, 'ELÍAS', 41),
(665, 298, 'GARZÓN', 41),
(666, 306, 'GIGANTE', 41),
(667, 319, 'GUADALUPE', 41),
(668, 349, 'HOBO', 41),
(669, 357, 'IQUIRA', 41),
(670, 359, 'ISNOS', 41),
(671, 378, 'LA ARGENTINA', 41),
(672, 396, 'LA PLATA', 41),
(673, 483, 'NÁTAGA', 41),
(674, 503, 'OPORAPA', 41),
(675, 518, 'PAICOL', 41),
(676, 524, 'PALERMO', 41),
(677, 530, 'PALESTINA', 41),
(678, 548, 'PITAL', 41),
(679, 551, 'PITALITO', 41),
(680, 615, 'RIVERA', 41),
(681, 660, 'SALADOBLANCO', 41),
(682, 668, 'SAN AGUSTÍN', 41),
(683, 676, 'SANTA MARÍA', 41),
(684, 770, 'SUAZA', 41),
(685, 791, 'TARQUI', 41),
(686, 797, 'TESALIA', 41),
(687, 799, 'TELLO', 41),
(688, 801, 'TERUEL', 41),
(689, 807, 'TIMANÁ', 41),
(690, 872, 'VILLAVIEJA', 41),
(691, 885, 'YAGUARÁ', 41),
(692, 1, 'RIOHACHA', 44),
(693, 35, 'ALBANIA', 44),
(694, 78, 'BARRANCAS', 44),
(695, 90, 'DIBULLA', 44),
(696, 98, 'DISTRACCIÓN', 44),
(697, 110, 'EL MOLINO', 44),
(698, 279, 'FONSECA', 44),
(699, 378, 'HATONUEVO', 44),
(700, 420, 'LA JAGUA DEL PILAR', 44),
(701, 430, 'MAICAO', 44),
(702, 560, 'MANAURE', 44),
(703, 650, 'SAN JUAN DEL CESAR', 44),
(704, 847, 'URIBIA', 44),
(705, 855, 'URUMITA', 44),
(706, 874, 'VILLANUEVA', 44),
(707, 1, 'SANTA MARTA', 47),
(708, 30, 'ALGARROBO', 47),
(709, 53, 'ARACATACA', 47),
(710, 58, 'ARIGUANÍ', 47),
(711, 161, 'CERRO SAN ANTONIO', 47),
(712, 170, 'CHIVOLO', 47),
(713, 189, 'CIÉNAGA', 47),
(714, 205, 'CONCORDIA', 47),
(715, 245, 'EL BANCO', 47),
(716, 258, 'EL PIÑON', 47),
(717, 268, 'EL RETÉN', 47),
(718, 288, 'FUNDACIÓN', 47),
(719, 318, 'GUAMAL', 47),
(720, 460, 'NUEVA GRANADA', 47),
(721, 541, 'PEDRAZA', 47),
(722, 545, 'PIJIÑO DEL CARMEN', 47),
(723, 551, 'PIVIJAY', 47),
(724, 555, 'PLATO', 47),
(725, 570, 'PUEBLOVIEJO', 47),
(726, 605, 'REMOLINO', 47),
(727, 660, 'SABANAS DE SAN ANGEL', 47),
(728, 675, 'SALAMINA', 47),
(729, 692, 'SAN SEBASTIÁN DE BUENAVISTA', 47),
(730, 703, 'SAN ZENÓN', 47),
(731, 707, 'SANTA ANA', 47),
(732, 720, 'SANTA BÁRBARA DE PINTO', 47),
(733, 745, 'SITIONUEVO', 47),
(734, 798, 'TENERIFE', 47),
(735, 960, 'ZAPAYÁN', 47),
(736, 980, 'ZONA BANANERA', 47),
(737, 1, 'VILLAVICENCIO', 50),
(738, 6, 'ACACÍAS', 50),
(739, 110, 'BARRANCA DE UPÍA', 50),
(740, 124, 'CABUYARO', 50),
(741, 150, 'CASTILLA LA NUEVA', 50),
(742, 223, 'CUBARRAL', 50),
(743, 226, 'CUMARAL', 50),
(744, 245, 'EL CALVARIO', 50),
(745, 251, 'EL CASTILLO', 50),
(746, 270, 'EL DORADO', 50),
(747, 287, 'FUENTE DE ORO', 50),
(748, 313, 'GRANADA', 50),
(749, 318, 'GUAMAL', 50),
(750, 325, 'MAPIRIPÁN', 50),
(751, 330, 'MESETAS', 50),
(752, 350, 'LA MACARENA', 50),
(753, 370, 'URIBE', 50),
(754, 400, 'LEJANÍAS', 50),
(755, 450, 'PUERTO CONCORDIA', 50),
(756, 568, 'PUERTO GAITÁN', 50),
(757, 573, 'PUERTO LÓPEZ', 50),
(758, 577, 'PUERTO LLERAS', 50),
(759, 590, 'PUERTO RICO', 50),
(760, 606, 'RESTREPO', 50),
(761, 680, 'SAN CARLOS DE GUAROA', 50),
(762, 683, 'SAN JUAN DE ARAMA', 50),
(763, 686, 'SAN JUANITO', 50),
(764, 689, 'SAN MARTÍN', 50),
(765, 711, 'VISTAHERMOSA', 50),
(766, 1, 'PASTO', 52),
(767, 19, 'ALBÁN', 52),
(768, 22, 'ALDANA', 52),
(769, 36, 'ANCUYÁ', 52),
(770, 51, 'ARBOLEDA', 52),
(771, 79, 'BARBACOAS', 52),
(772, 83, 'BELÉN', 52),
(773, 110, 'BUESACO', 52),
(774, 203, 'COLÓN', 52),
(775, 207, 'CONSACA', 52),
(776, 210, 'CONTADERO', 52),
(777, 215, 'CÓRDOBA', 52),
(778, 224, 'CUASPUD', 52),
(779, 227, 'CUMBAL', 52),
(780, 233, 'CUMBITARA', 52),
(781, 240, 'CHACHAGÜÍ', 52),
(782, 250, 'EL CHARCO', 52),
(783, 254, 'EL PEÑOL', 52),
(784, 256, 'EL ROSARIO', 52),
(785, 258, 'EL TABLÓN DE GÓMEZ', 52),
(786, 260, 'EL TAMBO', 52),
(787, 287, 'FUNES', 52),
(788, 317, 'GUACHUCAL', 52),
(789, 320, 'GUAITARILLA', 52),
(790, 323, 'GUALMATÁN', 52),
(791, 352, 'ILES', 52),
(792, 354, 'IMUÉS', 52),
(793, 356, 'IPIALES', 52),
(794, 378, 'LA CRUZ', 52),
(795, 381, 'LA FLORIDA', 52),
(796, 385, 'LA LLANADA', 52),
(797, 390, 'LA TOLA', 52),
(798, 399, 'LA UNIÓN', 52),
(799, 405, 'LEIVA', 52),
(800, 411, 'LINARES', 52),
(801, 418, 'LOS ANDES', 52),
(802, 427, 'MAGÜI', 52),
(803, 435, 'MALLAMA', 52),
(804, 473, 'MOSQUERA', 52),
(805, 480, 'NARIÑO', 52),
(806, 490, 'OLAYA HERRERA', 52),
(807, 506, 'OSPINA', 52),
(808, 520, 'FRANCISCO PIZARRO', 52),
(809, 540, 'POLICARPA', 52),
(810, 560, 'POTOSÍ', 52),
(811, 565, 'PROVIDENCIA', 52),
(812, 573, 'PUERRES', 52),
(813, 585, 'PUPIALES', 52),
(814, 612, 'RICAURTE', 52),
(815, 621, 'ROBERTO PAYÁN', 52),
(816, 678, 'SAMANIEGO', 52),
(817, 683, 'SANDONÁ', 52),
(818, 685, 'SAN BERNARDO', 52),
(819, 687, 'SAN LORENZO', 52),
(820, 693, 'SAN PABLO', 52),
(821, 694, 'SAN PEDRO DE CARTAGO', 52),
(822, 696, 'SANTA BÁRBARA', 52),
(823, 699, 'SANTACRUZ', 52),
(824, 720, 'SAPUYES', 52),
(825, 786, 'TAMINANGO', 52),
(826, 788, 'TANGUA', 52),
(827, 835, 'SAN ANDRES DE TUMACO', 52),
(828, 838, 'TÚQUERRES', 52),
(829, 885, 'YACUANQUER', 52),
(830, 1, 'CÚCUTA', 54),
(831, 3, 'ABREGO', 54),
(832, 51, 'ARBOLEDAS', 54),
(833, 99, 'BOCHALEMA', 54),
(834, 109, 'BUCARASICA', 54),
(835, 125, 'CÁCOTA', 54),
(836, 128, 'CACHIRÁ', 54),
(837, 172, 'CHINÁCOTA', 54),
(838, 174, 'CHITAGÁ', 54),
(839, 206, 'CONVENCIÓN', 54),
(840, 223, 'CUCUTILLA', 54),
(841, 239, 'DURANIA', 54),
(842, 245, 'EL CARMEN', 54),
(843, 250, 'EL TARRA', 54),
(844, 261, 'EL ZULIA', 54),
(845, 313, 'GRAMALOTE', 54),
(846, 344, 'HACARÍ', 54),
(847, 347, 'HERRÁN', 54),
(848, 377, 'LABATECA', 54),
(849, 385, 'LA ESPERANZA', 54),
(850, 398, 'LA PLAYA', 54),
(851, 405, 'LOS PATIOS', 54),
(852, 418, 'LOURDES', 54),
(853, 480, 'MUTISCUA', 54),
(854, 498, 'OCAÑA', 54),
(855, 518, 'PAMPLONA', 54),
(856, 520, 'PAMPLONITA', 54),
(857, 553, 'PUERTO SANTANDER', 54),
(858, 599, 'RAGONVALIA', 54),
(859, 660, 'SALAZAR', 54),
(860, 670, 'SAN CALIXTO', 54),
(861, 673, 'SAN CAYETANO', 54),
(862, 680, 'SANTIAGO', 54),
(863, 720, 'SARDINATA', 54),
(864, 743, 'SILOS', 54),
(865, 800, 'TEORAMA', 54),
(866, 810, 'TIBÚ', 54),
(867, 820, 'TOLEDO', 54),
(868, 871, 'VILLA CARO', 54),
(869, 874, 'VILLA DEL ROSARIO', 54),
(870, 1, 'MOCOA', 86),
(871, 219, 'COLÓN', 86),
(872, 320, 'ORITO', 86),
(873, 568, 'PUERTO ASÍS', 86),
(874, 569, 'PUERTO CAICEDO', 86),
(875, 571, 'PUERTO GUZMÁN', 86),
(876, 573, 'PUERTO LEGUÍZAMO', 86),
(877, 749, 'SIBUNDOY', 86),
(878, 755, 'SAN FRANCISCO', 86),
(879, 757, 'SAN MIGUEL', 86),
(880, 760, 'SANTIAGO', 86),
(881, 865, 'VALLE DEL GUAMUEZ', 86),
(882, 885, 'VILLAGARZÓN', 86),
(883, 1, 'ARMENIA', 63),
(884, 111, 'BUENAVISTA', 63),
(885, 130, 'CALARCA', 63),
(886, 190, 'CIRCASIA', 63),
(887, 212, 'CÓRDOBA', 63),
(888, 272, 'FILANDIA', 63),
(889, 302, 'GÉNOVA', 63),
(890, 401, 'LA TEBAIDA', 63),
(891, 470, 'MONTENEGRO', 63),
(892, 548, 'PIJAO', 63),
(893, 594, 'QUIMBAYA', 63),
(894, 690, 'SALENTO', 63),
(895, 1, 'PEREIRA', 66),
(896, 45, 'APÍA', 66),
(897, 75, 'BALBOA', 66),
(898, 88, 'BELÉN DE UMBRÍA', 66),
(899, 170, 'DOSQUEBRADAS', 66),
(900, 318, 'GUÁTICA', 66),
(901, 383, 'LA CELIA', 66),
(902, 400, 'LA VIRGINIA', 66),
(903, 440, 'MARSELLA', 66),
(904, 456, 'MISTRATÓ', 66),
(905, 572, 'PUEBLO RICO', 66),
(906, 594, 'QUINCHÍA', 66),
(907, 682, 'SANTA ROSA DE CABAL', 66),
(908, 687, 'SANTUARIO', 66),
(909, 1, 'SAN ANDRÉS', 88),
(910, 564, 'PROVIDENCIA', 88),
(911, 1, 'BUCARAMANGA', 68),
(912, 13, 'AGUADA', 68),
(913, 20, 'ALBANIA', 68),
(914, 51, 'ARATOCA', 68),
(915, 77, 'BARBOSA', 68),
(916, 79, 'BARICHARA', 68),
(917, 81, 'BARRANCABERMEJA', 68),
(918, 92, 'BETULIA', 68),
(919, 101, 'BOLÍVAR', 68),
(920, 121, 'CABRERA', 68),
(921, 132, 'CALIFORNIA', 68),
(922, 147, 'CAPITANEJO', 68),
(923, 152, 'CARCASÍ', 68),
(924, 160, 'CEPITÁ', 68),
(925, 162, 'CERRITO', 68),
(926, 167, 'CHARALÁ', 68),
(927, 169, 'CHARTA', 68),
(928, 176, 'CHIMA', 68),
(929, 179, 'CHIPATÁ', 68),
(930, 190, 'CIMITARRA', 68),
(931, 207, 'CONCEPCIÓN', 68),
(932, 209, 'CONFINES', 68),
(933, 211, 'CONTRATACIÓN', 68),
(934, 217, 'COROMORO', 68),
(935, 229, 'CURITÍ', 68),
(936, 235, 'EL CARMEN DE CHUCURÍ', 68),
(937, 245, 'EL GUACAMAYO', 68),
(938, 250, 'EL PEÑÓN', 68),
(939, 255, 'EL PLAYÓN', 68),
(940, 264, 'ENCINO', 68),
(941, 266, 'ENCISO', 68),
(942, 271, 'FLORIÁN', 68),
(943, 276, 'FLORIDABLANCA', 68),
(944, 296, 'GALÁN', 68),
(945, 298, 'GAMBITA', 68),
(946, 307, 'GIRÓN', 68),
(947, 318, 'GUACA', 68),
(948, 320, 'GUADALUPE', 68),
(949, 322, 'GUAPOTÁ', 68),
(950, 324, 'GUAVATÁ', 68),
(951, 327, 'GÜEPSA', 68),
(952, 344, 'HATO', 68),
(953, 368, 'JESÚS MARÍA', 68),
(954, 370, 'JORDÁN', 68),
(955, 377, 'LA BELLEZA', 68),
(956, 385, 'LANDÁZURI', 68),
(957, 397, 'LA PAZ', 68),
(958, 406, 'LEBRIJA', 68),
(959, 418, 'LOS SANTOS', 68),
(960, 425, 'MACARAVITA', 68),
(961, 432, 'MÁLAGA', 68),
(962, 444, 'MATANZA', 68),
(963, 464, 'MOGOTES', 68),
(964, 468, 'MOLAGAVITA', 68),
(965, 498, 'OCAMONTE', 68),
(966, 500, 'OIBA', 68),
(967, 502, 'ONZAGA', 68),
(968, 522, 'PALMAR', 68),
(969, 524, 'PALMAS DEL SOCORRO', 68),
(970, 533, 'PÁRAMO', 68),
(971, 547, 'PIEDECUESTA', 68),
(972, 549, 'PINCHOTE', 68),
(973, 572, 'PUENTE NACIONAL', 68),
(974, 573, 'PUERTO PARRA', 68),
(975, 575, 'PUERTO WILCHES', 68),
(976, 615, 'RIONEGRO', 68),
(977, 655, 'SABANA DE TORRES', 68),
(978, 669, 'SAN ANDRÉS', 68),
(979, 673, 'SAN BENITO', 68),
(980, 679, 'SAN GIL', 68),
(981, 682, 'SAN JOAQUÍN', 68),
(982, 684, 'SAN JOSÉ DE MIRANDA', 68),
(983, 686, 'SAN MIGUEL', 68),
(984, 689, 'SAN VICENTE DE CHUCURÍ', 68),
(985, 705, 'SANTA BÁRBARA', 68),
(986, 720, 'SANTA HELENA DEL OPÓN', 68),
(987, 745, 'SIMACOTA', 68),
(988, 755, 'SOCORRO', 68),
(989, 770, 'SUAITA', 68),
(990, 773, 'SUCRE', 68),
(991, 780, 'SURATÁ', 68),
(992, 820, 'TONA', 68),
(993, 855, 'VALLE DE SAN JOSÉ', 68),
(994, 861, 'VÉLEZ', 68),
(995, 867, 'VETAS', 68),
(996, 872, 'VILLANUEVA', 68),
(997, 895, 'ZAPATOCA', 68),
(998, 1, 'SINCELEJO', 70),
(999, 110, 'BUENAVISTA', 70),
(1000, 124, 'CAIMITO', 70),
(1001, 204, 'COLOSO', 70),
(1002, 215, 'COROZAL', 70),
(1003, 221, 'COVEÑAS', 70),
(1004, 230, 'CHALÁN', 70),
(1005, 233, 'EL ROBLE', 70),
(1006, 235, 'GALERAS', 70),
(1007, 265, 'GUARANDA', 70),
(1008, 400, 'LA UNIÓN', 70),
(1009, 418, 'LOS PALMITOS', 70),
(1010, 429, 'MAJAGUAL', 70),
(1011, 473, 'MORROA', 70),
(1012, 508, 'OVEJAS', 70),
(1013, 523, 'PALMITO', 70),
(1014, 670, 'SAMPUÉS', 70),
(1015, 678, 'SAN BENITO ABAD', 70),
(1016, 702, 'SAN JUAN DE BETULIA', 70),
(1017, 708, 'SAN MARCOS', 70),
(1018, 713, 'SAN ONOFRE', 70),
(1019, 717, 'SAN PEDRO', 70),
(1020, 742, 'SAN LUIS DE SINCÉ', 70),
(1021, 771, 'SUCRE', 70),
(1022, 820, 'SANTIAGO DE TOLÚ', 70),
(1023, 823, 'TOLÚ VIEJO', 70),
(1024, 1, 'IBAGUÉ', 73),
(1025, 24, 'ALPUJARRA', 73),
(1026, 26, 'ALVARADO', 73),
(1027, 30, 'AMBALEMA', 73),
(1028, 43, 'ANZOÁTEGUI', 73),
(1029, 55, 'ARMERO', 73),
(1030, 67, 'ATACO', 73),
(1031, 124, 'CAJAMARCA', 73),
(1032, 148, 'CARMEN DE APICALÁ', 73),
(1033, 152, 'CASABIANCA', 73),
(1034, 168, 'CHAPARRAL', 73),
(1035, 200, 'COELLO', 73),
(1036, 217, 'COYAIMA', 73),
(1037, 226, 'CUNDAY', 73),
(1038, 236, 'DOLORES', 73),
(1039, 268, 'ESPINAL', 73),
(1040, 270, 'FALAN', 73),
(1041, 275, 'FLANDES', 73),
(1042, 283, 'FRESNO', 73),
(1043, 319, 'GUAMO', 73),
(1044, 347, 'HERVEO', 73),
(1045, 349, 'HONDA', 73),
(1046, 352, 'ICONONZO', 73),
(1047, 408, 'LÉRIDA', 73),
(1048, 411, 'LÍBANO', 73),
(1049, 443, 'SAN SEBASTIÁN DE MARIQUITA', 73),
(1050, 449, 'MELGAR', 73),
(1051, 461, 'MURILLO', 73),
(1052, 483, 'NATAGAIMA', 73),
(1053, 504, 'ORTEGA', 73),
(1054, 520, 'PALOCABILDO', 73),
(1055, 547, 'PIEDRAS', 73),
(1056, 555, 'PLANADAS', 73),
(1057, 563, 'PRADO', 73),
(1058, 585, 'PURIFICACIÓN', 73),
(1059, 616, 'RIOBLANCO', 73),
(1060, 622, 'RONCESVALLES', 73),
(1061, 624, 'ROVIRA', 73),
(1062, 671, 'SALDAÑA', 73),
(1063, 675, 'SAN ANTONIO', 73),
(1064, 678, 'SAN LUIS', 73),
(1065, 686, 'SANTA ISABEL', 73),
(1066, 770, 'SUÁREZ', 73),
(1067, 854, 'VALLE DE SAN JUAN', 73),
(1068, 861, 'VENADILLO', 73),
(1069, 870, 'VILLAHERMOSA', 73),
(1070, 873, 'VILLARRICA', 73),
(1071, 1, 'CALI', 76),
(1072, 20, 'ALCALÁ', 76),
(1073, 36, 'ANDALUCÍA', 76),
(1074, 41, 'ANSERMANUEVO', 76),
(1075, 54, 'ARGELIA', 76),
(1076, 100, 'BOLÍVAR', 76),
(1077, 109, 'BUENAVENTURA', 76),
(1078, 111, 'GUADALAJARA DE BUGA', 76),
(1079, 113, 'BUGALAGRANDE', 76),
(1080, 122, 'CAICEDONIA', 76),
(1081, 126, 'CALIMA', 76),
(1082, 130, 'CANDELARIA', 76),
(1083, 147, 'CARTAGO', 76),
(1084, 233, 'DAGUA', 76),
(1085, 243, 'EL ÁGUILA', 76),
(1086, 246, 'EL CAIRO', 76),
(1087, 248, 'EL CERRITO', 76),
(1088, 250, 'EL DOVIO', 76),
(1089, 275, 'FLORIDA', 76),
(1090, 306, 'GINEBRA', 76),
(1091, 318, 'GUACARÍ', 76),
(1092, 364, 'JAMUNDÍ', 76),
(1093, 377, 'LA CUMBRE', 76),
(1094, 400, 'LA UNIÓN', 76),
(1095, 403, 'LA VICTORIA', 76),
(1096, 497, 'OBANDO', 76),
(1097, 520, 'PALMIRA', 76),
(1098, 563, 'PRADERA', 76),
(1099, 606, 'RESTREPO', 76),
(1100, 616, 'RIOFRÍO', 76),
(1101, 622, 'ROLDANILLO', 76),
(1102, 670, 'SAN PEDRO', 76),
(1103, 736, 'SEVILLA', 76),
(1104, 823, 'TORO', 76),
(1105, 828, 'TRUJILLO', 76),
(1106, 834, 'TULUÁ', 76),
(1107, 845, 'ULLOA', 76),
(1108, 863, 'VERSALLES', 76),
(1109, 869, 'VIJES', 76),
(1110, 890, 'YOTOCO', 76),
(1111, 892, 'YUMBO', 76),
(1112, 895, 'ZARZAL', 76),
(1113, 1, 'MITÚ', 97),
(1114, 161, 'CARURU', 97),
(1115, 511, 'PACOA', 97),
(1116, 666, 'TARAIRA', 97),
(1117, 777, 'PAPUNAUA', 97),
(1118, 889, 'YAVARATÉ', 97),
(1119, 1, 'PUERTO CARREÑO', 99),
(1120, 524, 'LA PRIMAVERA', 99),
(1121, 624, 'SANTA ROSALÍA', 99),
(1122, 773, 'CUMARIBO', 99);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cocina`
--

CREATE TABLE IF NOT EXISTS `cocina` (
`id_cocina` int(11) NOT NULL,
  `nombre_cocina` varchar(45) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `cocina`
--

INSERT INTO `cocina` (`id_cocina`, `nombre_cocina`) VALUES
(1, 'Americana'),
(2, 'Integral'),
(3, 'Semi_Integral'),
(4, 'Sencilla');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `condicion`
--

CREATE TABLE IF NOT EXISTS `condicion` (
`id_condicion` int(11) NOT NULL,
  `nombre_condicion` varchar(10) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `condicion`
--

INSERT INTO `condicion` (`id_condicion`, `nombre_condicion`) VALUES
(1, 'Nuevo'),
(2, 'Usado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamento`
--

CREATE TABLE IF NOT EXISTS `departamento` (
  `id_departamento` int(11) NOT NULL,
  `nombre_departamento` varchar(45) NOT NULL,
  `pais_siglas_pais` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `departamento`
--

INSERT INTO `departamento` (`id_departamento`, `nombre_departamento`, `pais_siglas_pais`) VALUES
(5, 'ANTIOQUIA', 'COL'),
(8, 'ATLANTICO', 'COL'),
(11, 'BOGOTA', 'COL'),
(13, 'BOLIVAR', 'COL'),
(15, 'BOYACA', 'COL'),
(17, 'CALDAS', 'COL'),
(18, 'CAQUETA', 'COL'),
(19, 'CAUCA', 'COL'),
(20, 'CESAR', 'COL'),
(23, 'CORDOBA', 'COL'),
(25, 'CUNDINAMARCA', 'COL'),
(27, 'CHOCO', 'COL'),
(41, 'HUILA', 'COL'),
(44, 'LA GUAJIRA', 'COL'),
(47, 'MAGDALENA', 'COL'),
(50, 'META', 'COL'),
(52, 'NARIÑO', 'COL'),
(54, 'N. DE SANTANDER', 'COL'),
(63, 'QUINDIO', 'COL'),
(66, 'RISARALDA', 'COL'),
(68, 'SANTANDER', 'COL'),
(70, 'SUCRE', 'COL'),
(73, 'TOLIMA', 'COL'),
(76, 'VALLE DEL CAUCA', 'COL'),
(81, 'ARAUCA', 'COL'),
(85, 'CASANARE', 'COL'),
(86, 'PUTUMAYO', 'COL'),
(88, 'SAN ANDRES', 'COL'),
(91, 'AMAZONAS', 'COL'),
(94, 'GUAINIA', 'COL'),
(95, 'GUAVIARE', 'COL'),
(97, 'VAUPES', 'COL'),
(99, 'VICHADA', 'COL');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `especificaciones_varias`
--

CREATE TABLE IF NOT EXISTS `especificaciones_varias` (
`id_especificaciones_varias` int(11) NOT NULL,
  `nombre_especificiaciones_varias` varchar(45) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `especificaciones_varias`
--

INSERT INTO `especificaciones_varias` (`id_especificaciones_varias`, `nombre_especificiaciones_varias`) VALUES
(1, 'Zona Oficios'),
(2, 'Patio'),
(3, 'Estudio'),
(4, 'Balcón'),
(5, 'Ascensor'),
(6, 'Piscina'),
(7, 'Zonas Verdes'),
(8, 'Incluida Administración'),
(9, 'Negociable');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estado`
--

CREATE TABLE IF NOT EXISTS `estado` (
`id_estado` int(11) NOT NULL,
  `nombre_estado` varchar(20) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `estado`
--

INSERT INTO `estado` (`id_estado`, `nombre_estado`) VALUES
(1, 'Disponible'),
(2, 'No Disponible');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estrato`
--

CREATE TABLE IF NOT EXISTS `estrato` (
`id_estrato` int(11) NOT NULL,
  `estrato_social` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `estrato`
--

INSERT INTO `estrato` (`id_estrato`, `estrato_social`) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `garaje`
--

CREATE TABLE IF NOT EXISTS `garaje` (
`id_garaje` int(11) NOT NULL,
  `cantidad_garaje` varchar(10) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `garaje`
--

INSERT INTO `garaje` (`id_garaje`, `cantidad_garaje`) VALUES
(1, '1'),
(2, '2'),
(3, '3'),
(4, '4'),
(5, '5'),
(6, '6'),
(7, '7'),
(8, '8'),
(9, '9'),
(10, '10'),
(11, 'Más de 10');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `genero`
--

CREATE TABLE IF NOT EXISTS `genero` (
`id_genero` int(11) NOT NULL,
  `nombre_genero` varchar(20) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `genero`
--

INSERT INTO `genero` (`id_genero`, `nombre_genero`) VALUES
(1, 'Masculino'),
(2, 'Femenino');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `identificacion_inmobiliaria`
--

CREATE TABLE IF NOT EXISTS `identificacion_inmobiliaria` (
`id_identificacion_inmobiliaria` int(11) NOT NULL,
  `nombre_inmobiliaria` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `informacion_principal`
--

CREATE TABLE IF NOT EXISTS `informacion_principal` (
`id_informacion_principal` int(11) NOT NULL,
  `tipo_operacion_id_tipo_operacion` int(11) NOT NULL,
  `tipo_inmueble_id_tipo_inmueble` int(11) NOT NULL,
  `condicion_id_condicion` int(11) NOT NULL,
  `rango_precios_ajustado_id_rango_precios_ajustado` int(11) NOT NULL,
  `departamento_id_departamento` int(11) NOT NULL,
  `ciudad_consecutivo_ciudad` int(11) NOT NULL,
  `zona_id_zona` int(11) NOT NULL,
  `estrato_id_estrato` int(11) NOT NULL,
  `tiempo_construido_id_tiempo_construido` int(11) NOT NULL,
  `numero_plantas_id_numero_plantas` int(11) NOT NULL,
  `numero_alcobas_id_numero_alcobas` int(11) NOT NULL,
  `numero_banios_id_numero_banios` int(11) NOT NULL,
  `cocina_id_cocina` int(11) NOT NULL,
  `parqueadero_id_parqueadero` int(11) NOT NULL,
  `garaje_id_garaje` int(11) NOT NULL,
  `tipo_propiedad_id_tipo_propiedad` int(11) NOT NULL,
  `usuario_id_usuario` int(11) NOT NULL,
  `fecha_registro_evento` datetime NOT NULL,
  `estado_id_estado` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `informacion_principal_has_especificaciones_varias`
--

CREATE TABLE IF NOT EXISTS `informacion_principal_has_especificaciones_varias` (
  `informacion_principal_id_informacion_principal` int(11) NOT NULL,
  `especificaciones_varias_id_especificaciones_varias` int(11) NOT NULL,
  `opcion_id_opcion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `numero_alcobas`
--

CREATE TABLE IF NOT EXISTS `numero_alcobas` (
`id_numero_alcobas` int(11) NOT NULL,
  `cantidad_alcobas` varchar(10) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `numero_alcobas`
--

INSERT INTO `numero_alcobas` (`id_numero_alcobas`, `cantidad_alcobas`) VALUES
(1, '1'),
(2, '2'),
(3, '3'),
(4, '4'),
(5, '5'),
(6, '6'),
(7, '7'),
(8, '8'),
(9, '9'),
(10, '10'),
(11, 'Más de 10');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `numero_banios`
--

CREATE TABLE IF NOT EXISTS `numero_banios` (
`id_numero_banios` int(11) NOT NULL,
  `cantidad_banios` varchar(15) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `numero_banios`
--

INSERT INTO `numero_banios` (`id_numero_banios`, `cantidad_banios`) VALUES
(1, '1'),
(2, '2'),
(3, '3'),
(4, '4'),
(5, '5'),
(6, '6'),
(7, '7'),
(8, '8'),
(9, '9'),
(10, '10'),
(11, 'Más de 10');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `numero_plantas`
--

CREATE TABLE IF NOT EXISTS `numero_plantas` (
`id_numero_plantas` int(11) NOT NULL,
  `cantidad_plantas` varchar(10) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `numero_plantas`
--

INSERT INTO `numero_plantas` (`id_numero_plantas`, `cantidad_plantas`) VALUES
(1, '1'),
(2, '2'),
(3, '3'),
(4, '4'),
(5, '5'),
(6, 'Más de 5');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `opcion`
--

CREATE TABLE IF NOT EXISTS `opcion` (
`id_opcion` int(11) NOT NULL,
  `nombre_opcion` varchar(2) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `opcion`
--

INSERT INTO `opcion` (`id_opcion`, `nombre_opcion`) VALUES
(1, 'Si'),
(2, 'No');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pais`
--

CREATE TABLE IF NOT EXISTS `pais` (
  `siglas_pais` varchar(45) NOT NULL,
  `nombre_pais` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `pais`
--

INSERT INTO `pais` (`siglas_pais`, `nombre_pais`) VALUES
('ABW', 'ARUBA'),
('AFG', 'AFGHANISTAN'),
('AGO', 'ANGOLA'),
('AIA', 'ANGUILLA'),
('ALB', 'ALBANIA'),
('AND', 'ANDORRA'),
('ANT', 'NETHERLANDS ANTILLES'),
('ARE', 'UNITED ARAB EMIRATES'),
('ARG', 'ARGENTINA'),
('ARM', 'ARMENIA'),
('ASM', 'AMERICAN SAMOA'),
('ATA', 'ANTARCTICA'),
('ATF', 'FRENCH SOUTHERN TERRITORIES'),
('ATG', 'ANTIGUA AND BARBUDA'),
('AUS', 'AUSTRALIA'),
('AUT', 'AUSTRIA'),
('AZE', 'AZERBAIJAN'),
('BDI', 'BURUNDI'),
('BEL', 'BELGIUM'),
('BEN', 'BENIN'),
('BFA', 'BURKINA FASO'),
('BGD', 'BANGLADESH'),
('BGR', 'BULGARIA'),
('BHR', 'BAHRAIN'),
('BHS', 'BAHAMAS'),
('BIH', 'BOSNIA AND HERZEGOVINA'),
('BLR', 'BELARUS'),
('BLZ', 'BELIZE'),
('BMU', 'BERMUDA'),
('BOL', 'BOLIVIA'),
('BRA', 'BRAZIL'),
('BRB', 'BARBADOS'),
('BRN', 'BRUNEI'),
('BTN', 'BHUTAN'),
('BVT', 'BOUVET ISLAND'),
('BWA', 'BOTSWANA'),
('CAF', 'CENTRAL AFRICAN REPUBLIC'),
('CAN', 'CANADA'),
('CCK', 'COCOS (KEELING) ISLANDS'),
('CHE', 'SWITZERLAND'),
('CHL', 'CHILE'),
('CHN', 'CHINA'),
('CIV', 'CÔTE DIVOIRE'),
('CMR', 'CAMEROON'),
('COD', 'CONGO'),
('COG', 'CONGO'),
('COK', 'COOK ISLANDS'),
('COL', 'COLOMBIA'),
('COM', 'COMOROS'),
('CPV', 'CAPE VERDE'),
('CRI', 'COSTA RICA'),
('CUB', 'CUBA'),
('CXR', 'CHRISTMAS ISLAND'),
('CYM', 'CAYMAN ISLANDS'),
('CYP', 'CYPRUS'),
('CZE', 'CZECH REPUBLIC'),
('DEU', 'GERMANY'),
('DJI', 'DJIBOUTI'),
('DMA', 'DOMINICA'),
('DNK', 'DENMARK'),
('DOM', 'DOMINICAN REPUBLIC'),
('DZA', 'ALGERIA'),
('ECU', 'ECUADOR'),
('EGY', 'EGYPT'),
('ERI', 'ERITREA'),
('ESH', 'WESTERN SAHARA'),
('ESP', 'SPAIN'),
('EST', 'ESTONIA'),
('ETH', 'ETHIOPIA'),
('FIN', 'FINLAND'),
('FJI', 'FIJI ISLANDS'),
('FLK', 'FALKLAND ISLANDS'),
('FRA', 'FRANCE'),
('FRO', 'FAROE ISLANDS'),
('FSM', 'MICRONESIA'),
('GAB', 'GABON'),
('GBR', 'UNITED KINGDOM'),
('GEO', 'GEORGIA'),
('GHA', 'GHANA'),
('GIB', 'GIBRALTAR'),
('GIN', 'GUINEA'),
('GLP', 'GUADELOUPE'),
('GMB', 'GAMBIA'),
('GNB', 'GUINEA-BISSAU'),
('GNQ', 'EQUATORIAL GUINEA'),
('GRC', 'GREECE'),
('GRD', 'GRENADA'),
('GRL', 'GREENLAND'),
('GTM', 'GUATEMALA'),
('GUF', 'FRENCH GUIANA'),
('GUM', 'GUAM'),
('GUY', 'GUYANA'),
('HKG', 'HONG KONG'),
('HMD', 'HEARD ISLAND AND MCDONALD ISLANDS'),
('HND', 'HONDURAS'),
('HRV', 'CROATIA'),
('HTI', 'HAITI'),
('HUN', 'HUNGARY'),
('IDN', 'INDONESIA'),
('IND', 'INDIA'),
('IOT', 'BRITISH INDIAN OCEAN TERRITORY'),
('IRL', 'IRELAND'),
('IRN', 'IRAN'),
('IRQ', 'IRAQ'),
('ISL', 'ICELAND'),
('ISR', 'ISRAEL'),
('ITA', 'ITALY'),
('JAM', 'JAMAICA'),
('JOR', 'JORDAN'),
('JPN', 'JAPAN'),
('KAZ', 'KAZAKSTAN'),
('KEN', 'KENYA'),
('KGZ', 'KYRGYZSTAN'),
('KHM', 'CAMBODIA'),
('KIR', 'KIRIBATI'),
('KNA', 'SAINT KITTS AND NEVIS'),
('KOR', 'SOUTH KOREA'),
('KWT', 'KUWAIT'),
('LAO', 'LAOS'),
('LBN', 'LEBANON'),
('LBR', 'LIBERIA'),
('LBY', 'LIBYAN ARAB JAMAHIRIYA'),
('LCA', 'SAINT LUCIA'),
('LIE', 'LIECHTENSTEIN'),
('LKA', 'SRI LANKA'),
('LSO', 'LESOTHO'),
('LTU', 'LITHUANIA'),
('LUX', 'LUXEMBOURG'),
('LVA', 'LATVIA'),
('MAC', 'MACAO'),
('MAR', 'MOROCCO'),
('MCO', 'MONACO'),
('MDA', 'MOLDOVA'),
('MDG', 'MADAGASCAR'),
('MDV', 'MALDIVES'),
('MEX', 'MEXICO'),
('MHL', 'MARSHALL ISLANDS'),
('MKD', 'MACEDONIA'),
('MLI', 'MALI'),
('MLT', 'MALTA'),
('MMR', 'MYANMAR'),
('MNG', 'MONGOLIA'),
('MNP', 'NORTHERN MARIANA ISLANDS'),
('MOZ', 'MOZAMBIQUE'),
('MRT', 'MAURITANIA'),
('MSR', 'MONTSERRAT'),
('MTQ', 'MARTINIQUE'),
('MUS', 'MAURITIUS'),
('MWI', 'MALAWI'),
('MYS', 'MALAYSIA'),
('MYT', 'MAYOTTE'),
('NAM', 'NAMIBIA'),
('NCL', 'NEW CALEDONIA'),
('NER', 'NIGER'),
('NFK', 'NORFOLK ISLAND'),
('NGA', 'NIGERIA'),
('NIC', 'NICARAGUA'),
('NIU', 'NIUE'),
('NLD', 'NETHERLANDS'),
('NOR', 'NORWAY'),
('NPL', 'NEPAL'),
('NRU', 'NAURU'),
('NZL', 'NEW ZEALAND'),
('OMN', 'OMAN'),
('PAK', 'PAKISTAN'),
('PAN', 'PANAMA'),
('PCN', 'PITCAIRN'),
('PER', 'PERU'),
('PHL', 'PHILIPPINES'),
('PLW', 'PALAU'),
('PNG', 'PAPUA NEW GUINEA'),
('POL', 'POLAND'),
('PRI', 'PUERTO RICO'),
('PRK', 'NORTH KOREA'),
('PRT', 'PORTUGAL'),
('PRY', 'PARAGUAY'),
('PSE', 'PALESTINE'),
('PYF', 'FRENCH POLYNESIA'),
('QAT', 'QATAR'),
('REU', 'RÉUNION'),
('ROM', 'ROMANIA'),
('RUS', 'RUSSIAN FEDERATION'),
('RWA', 'RWANDA'),
('SAU', 'SAUDI ARABIA'),
('SDN', 'SUDAN'),
('SEN', 'SENEGAL'),
('SGP', 'SINGAPORE'),
('SGS', 'SOUTH GEORGIA AND THE SOUTH SANDWICH ISLANDS'),
('SHN', 'SAINT HELENA'),
('SJM', 'SVALBARD AND JAN MAYEN'),
('SLB', 'SOLOMON ISLANDS'),
('SLE', 'SIERRA LEONE'),
('SLV', 'EL SALVADOR'),
('SMR', 'SAN MARINO'),
('SOM', 'SOMALIA'),
('SPM', 'SAINT PIERRE AND MIQUELON'),
('STP', 'SAO TOME AND PRINCIPE'),
('SUR', 'SURINAME'),
('SVK', 'SLOVAKIA'),
('SVN', 'SLOVENIA'),
('SWE', 'SWEDEN'),
('SWZ', 'SWAZILAND'),
('SYC', 'SEYCHELLES'),
('SYR', 'SYRIA'),
('TCA', 'TURKS AND CAICOS ISLANDS'),
('TCD', 'CHAD'),
('TGO', 'TOGO'),
('THA', 'THAILAND'),
('TJK', 'TAJIKISTAN'),
('TKL', 'TOKELAU'),
('TKM', 'TURKMENISTAN'),
('TMP', 'EAST TIMOR'),
('TON', 'TONGA'),
('TTO', 'TRINIDAD AND TOBAGO'),
('TUN', 'TUNISIA'),
('TUR', 'TURKEY'),
('TUV', 'TUVALU'),
('TWN', 'TAIWAN'),
('TZA', 'TANZANIA'),
('UGA', 'UGANDA'),
('UKR', 'UKRAINE'),
('UMI', 'UNITED STATES MINOR OUTLYING ISLANDS'),
('URY', 'URUGUAY'),
('USA', 'UNITED STATES'),
('UZB', 'UZBEKISTAN'),
('VAT', 'HOLY SEE (VATICAN CITY STATE)'),
('VCT', 'SAINT VINCENT AND THE GRENADINES'),
('VEN', 'VENEZUELA'),
('VGB', 'VIRGIN ISLANDS'),
('VIR', 'VIRGIN ISLANDS'),
('VNM', 'VIETNAM'),
('VUT', 'VANUATU'),
('WLF', 'WALLIS AND FUTUNA'),
('WSM', 'SAMOA'),
('YEM', 'YEMEN'),
('YUG', 'YUGOSLAVIA'),
('ZAF', 'SOUTH AFRICA'),
('ZMB', 'ZAMBIA'),
('ZWE', 'ZIMBABWE');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `parqueadero`
--

CREATE TABLE IF NOT EXISTS `parqueadero` (
`id_parqueadero` int(11) NOT NULL,
  `cantidad_parqueaderos` varchar(10) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `parqueadero`
--

INSERT INTO `parqueadero` (`id_parqueadero`, `cantidad_parqueaderos`) VALUES
(1, '1'),
(2, '2'),
(3, '3'),
(4, '4'),
(5, '5'),
(6, '6'),
(7, '7'),
(8, '8'),
(9, '9'),
(10, '10'),
(11, 'Más de 10');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rango_precios`
--

CREATE TABLE IF NOT EXISTS `rango_precios` (
`id_rango_precios` int(11) NOT NULL,
  `cantidad_precio` varchar(45) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `rango_precios`
--

INSERT INTO `rango_precios` (`id_rango_precios`, `cantidad_precio`) VALUES
(1, 'De $0 a $500 mil'),
(2, 'De $500 mil a $1 Millón'),
(3, 'Más de $1 Millón'),
(4, 'De $0 a $50 Millones'),
(5, 'De $50 Millones a $75 Millones'),
(6, 'De $75 Millones a $100 Millones'),
(7, 'De $100 Millones a $150 Millones'),
(8, 'De $150 Millones a $200 Millones'),
(9, 'De $200 Millones a $250 Millones'),
(10, 'De $250 Millones a $300 Millones'),
(11, 'De $300 Millones a $350 Millones'),
(12, 'De $350 Millones a $400 Millones'),
(13, 'Más de $400 Millones');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rango_precios_ajustado`
--

CREATE TABLE IF NOT EXISTS `rango_precios_ajustado` (
`id_rango_precios_ajustado` int(11) NOT NULL,
  `tipo_operacion_id_tipo_operacion` int(11) NOT NULL,
  `rango_precios_id_rango_precios` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `rango_precios_ajustado`
--

INSERT INTO `rango_precios_ajustado` (`id_rango_precios_ajustado`, `tipo_operacion_id_tipo_operacion`, `rango_precios_id_rango_precios`) VALUES
(1, 1, 1),
(2, 1, 2),
(3, 1, 3),
(4, 2, 4),
(5, 2, 5),
(6, 2, 6),
(7, 2, 7),
(8, 2, 8),
(9, 2, 9),
(10, 2, 10),
(11, 2, 11),
(12, 2, 12),
(13, 2, 13);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `roles`
--

CREATE TABLE IF NOT EXISTS `roles` (
`id_roles` int(11) NOT NULL,
  `nombre_rol` varchar(45) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `roles`
--

INSERT INTO `roles` (`id_roles`, `nombre_rol`) VALUES
(1, 'Administrador'),
(2, 'Usuario');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tiempo_construido`
--

CREATE TABLE IF NOT EXISTS `tiempo_construido` (
`id_tiempo_construido` int(11) NOT NULL,
  `cantidad_tiempo_construido` varchar(25) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tiempo_construido`
--

INSERT INTO `tiempo_construido` (`id_tiempo_construido`, `cantidad_tiempo_construido`) VALUES
(1, 'Entre 0 y 5 años'),
(2, 'Entre 5 y 10 años'),
(3, 'Entre 10 y 15 años'),
(4, 'Más de 15 años');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_inmueble`
--

CREATE TABLE IF NOT EXISTS `tipo_inmueble` (
`id_tipo_inmueble` int(11) NOT NULL,
  `nombre_tipo_inmueble` varchar(45) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tipo_inmueble`
--

INSERT INTO `tipo_inmueble` (`id_tipo_inmueble`, `nombre_tipo_inmueble`) VALUES
(1, 'Apartaestudios'),
(2, 'Apartamentos'),
(3, 'Casas'),
(4, 'Edificios'),
(5, 'Fincas y Casas Campestres'),
(6, 'Garajes y Parqueaderos'),
(7, 'Habitaciones'),
(8, 'Locales y Bodegas'),
(9, 'Lotes'),
(10, 'Oficinas y Consultorios');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_operacion`
--

CREATE TABLE IF NOT EXISTS `tipo_operacion` (
  `id_tipo_operacion` int(11) NOT NULL,
  `nombre_tipo_operacion` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tipo_operacion`
--

INSERT INTO `tipo_operacion` (`id_tipo_operacion`, `nombre_tipo_operacion`) VALUES
(1, 'Alquiler'),
(2, 'Venta');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_propiedad`
--

CREATE TABLE IF NOT EXISTS `tipo_propiedad` (
`id_tipo_propiedad` int(11) NOT NULL,
  `nombre_tipo_propiedad` varchar(45) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tipo_propiedad`
--

INSERT INTO `tipo_propiedad` (`id_tipo_propiedad`, `nombre_tipo_propiedad`) VALUES
(1, 'Condominio'),
(2, 'Conjunto Cerrado'),
(3, 'Conjunto Residencial'),
(4, 'Multifamiliar'),
(5, 'Parcelación'),
(6, 'Unidad Cerrada'),
(7, 'Unidad Residencial');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
`id_usuario` int(11) NOT NULL,
  `nombre_usuario` varchar(45) NOT NULL,
  `apellido_usuario` varchar(45) NOT NULL,
  `genero_id_genero` int(11) NOT NULL,
  `fecha_nacimiento_usuario` date NOT NULL,
  `departamento_id_departamento` int(11) NOT NULL,
  `ciudad_consecutivo_ciudad` int(11) NOT NULL,
  `direccion_usuario` varchar(45) NOT NULL,
  `barrio_usuario` varchar(45) NOT NULL,
  `telefono_usuario` varchar(45) NOT NULL,
  `email_usuario` varchar(45) NOT NULL,
  `user_usuario` varchar(45) NOT NULL,
  `contrasenia_usuario` varchar(45) NOT NULL,
  `roles_id_roles` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `zona`
--

CREATE TABLE IF NOT EXISTS `zona` (
`id_zona` int(11) NOT NULL,
  `nombre_zona` varchar(45) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `zona`
--

INSERT INTO `zona` (`id_zona`, `nombre_zona`) VALUES
(1, 'Centro'),
(2, 'Norte'),
(3, 'Oeste'),
(4, 'Oriente'),
(5, 'Sur');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ciudad`
--
ALTER TABLE `ciudad`
 ADD PRIMARY KEY (`consecutivo_ciudad`), ADD KEY `fk_ciudad_departamento1_idx` (`departamento_id_departamento`);

--
-- Indices de la tabla `cocina`
--
ALTER TABLE `cocina`
 ADD PRIMARY KEY (`id_cocina`);

--
-- Indices de la tabla `condicion`
--
ALTER TABLE `condicion`
 ADD PRIMARY KEY (`id_condicion`);

--
-- Indices de la tabla `departamento`
--
ALTER TABLE `departamento`
 ADD PRIMARY KEY (`id_departamento`), ADD KEY `fk_departamento_pais_idx` (`pais_siglas_pais`);

--
-- Indices de la tabla `especificaciones_varias`
--
ALTER TABLE `especificaciones_varias`
 ADD PRIMARY KEY (`id_especificaciones_varias`);

--
-- Indices de la tabla `estado`
--
ALTER TABLE `estado`
 ADD PRIMARY KEY (`id_estado`);

--
-- Indices de la tabla `estrato`
--
ALTER TABLE `estrato`
 ADD PRIMARY KEY (`id_estrato`);

--
-- Indices de la tabla `garaje`
--
ALTER TABLE `garaje`
 ADD PRIMARY KEY (`id_garaje`);

--
-- Indices de la tabla `genero`
--
ALTER TABLE `genero`
 ADD PRIMARY KEY (`id_genero`);

--
-- Indices de la tabla `identificacion_inmobiliaria`
--
ALTER TABLE `identificacion_inmobiliaria`
 ADD PRIMARY KEY (`id_identificacion_inmobiliaria`);

--
-- Indices de la tabla `informacion_principal`
--
ALTER TABLE `informacion_principal`
 ADD PRIMARY KEY (`id_informacion_principal`), ADD KEY `fk_informacion_principal_tipo_operacion1_idx` (`tipo_operacion_id_tipo_operacion`), ADD KEY `fk_informacion_principal_tipo_inmueble1_idx` (`tipo_inmueble_id_tipo_inmueble`), ADD KEY `fk_informacion_principal_condicion1_idx` (`condicion_id_condicion`), ADD KEY `fk_informacion_principal_rango_precios_ajustado1_idx` (`rango_precios_ajustado_id_rango_precios_ajustado`), ADD KEY `fk_informacion_principal_departamento1_idx` (`departamento_id_departamento`), ADD KEY `fk_informacion_principal_ciudad1_idx` (`ciudad_consecutivo_ciudad`), ADD KEY `fk_informacion_principal_zona1_idx` (`zona_id_zona`), ADD KEY `fk_informacion_principal_estrato1_idx` (`estrato_id_estrato`), ADD KEY `fk_informacion_principal_tiempo_construido1_idx` (`tiempo_construido_id_tiempo_construido`), ADD KEY `fk_informacion_principal_numero_plantas1_idx` (`numero_plantas_id_numero_plantas`), ADD KEY `fk_informacion_principal_numero_alcobas1_idx` (`numero_alcobas_id_numero_alcobas`), ADD KEY `fk_informacion_principal_numero_banios1_idx` (`numero_banios_id_numero_banios`), ADD KEY `fk_informacion_principal_cocina1_idx` (`cocina_id_cocina`), ADD KEY `fk_informacion_principal_parqueadero1_idx` (`parqueadero_id_parqueadero`), ADD KEY `fk_informacion_principal_garaje1_idx` (`garaje_id_garaje`), ADD KEY `fk_informacion_principal_tipo_propiedad1_idx` (`tipo_propiedad_id_tipo_propiedad`), ADD KEY `fk_informacion_principal_usuario1_idx` (`usuario_id_usuario`), ADD KEY `fk_informacion_principal_estado1_idx` (`estado_id_estado`);

--
-- Indices de la tabla `informacion_principal_has_especificaciones_varias`
--
ALTER TABLE `informacion_principal_has_especificaciones_varias`
 ADD PRIMARY KEY (`informacion_principal_id_informacion_principal`,`especificaciones_varias_id_especificaciones_varias`), ADD KEY `fk_informacion_principal_has_especificaciones_varias_especi_idx` (`especificaciones_varias_id_especificaciones_varias`), ADD KEY `fk_informacion_principal_has_especificaciones_varias_inform_idx` (`informacion_principal_id_informacion_principal`), ADD KEY `fk_informacion_principal_has_especificaciones_varias_opcion_idx` (`opcion_id_opcion`);

--
-- Indices de la tabla `numero_alcobas`
--
ALTER TABLE `numero_alcobas`
 ADD PRIMARY KEY (`id_numero_alcobas`);

--
-- Indices de la tabla `numero_banios`
--
ALTER TABLE `numero_banios`
 ADD PRIMARY KEY (`id_numero_banios`);

--
-- Indices de la tabla `numero_plantas`
--
ALTER TABLE `numero_plantas`
 ADD PRIMARY KEY (`id_numero_plantas`);

--
-- Indices de la tabla `opcion`
--
ALTER TABLE `opcion`
 ADD PRIMARY KEY (`id_opcion`);

--
-- Indices de la tabla `pais`
--
ALTER TABLE `pais`
 ADD PRIMARY KEY (`siglas_pais`);

--
-- Indices de la tabla `parqueadero`
--
ALTER TABLE `parqueadero`
 ADD PRIMARY KEY (`id_parqueadero`);

--
-- Indices de la tabla `rango_precios`
--
ALTER TABLE `rango_precios`
 ADD PRIMARY KEY (`id_rango_precios`);

--
-- Indices de la tabla `rango_precios_ajustado`
--
ALTER TABLE `rango_precios_ajustado`
 ADD PRIMARY KEY (`id_rango_precios_ajustado`), ADD KEY `fk_rango_precios_ajustado_tipo_operacion1_idx` (`tipo_operacion_id_tipo_operacion`), ADD KEY `fk_rango_precios_ajustado_rango_precios1_idx` (`rango_precios_id_rango_precios`);

--
-- Indices de la tabla `roles`
--
ALTER TABLE `roles`
 ADD PRIMARY KEY (`id_roles`);

--
-- Indices de la tabla `tiempo_construido`
--
ALTER TABLE `tiempo_construido`
 ADD PRIMARY KEY (`id_tiempo_construido`);

--
-- Indices de la tabla `tipo_inmueble`
--
ALTER TABLE `tipo_inmueble`
 ADD PRIMARY KEY (`id_tipo_inmueble`);

--
-- Indices de la tabla `tipo_operacion`
--
ALTER TABLE `tipo_operacion`
 ADD PRIMARY KEY (`id_tipo_operacion`);

--
-- Indices de la tabla `tipo_propiedad`
--
ALTER TABLE `tipo_propiedad`
 ADD PRIMARY KEY (`id_tipo_propiedad`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
 ADD PRIMARY KEY (`id_usuario`), ADD KEY `fk_usuario_roles1_idx` (`roles_id_roles`), ADD KEY `fk_usuario_departamento1_idx` (`departamento_id_departamento`), ADD KEY `fk_usuario_ciudad1_idx` (`ciudad_consecutivo_ciudad`), ADD KEY `fk_usuario_genero1_idx` (`genero_id_genero`);

--
-- Indices de la tabla `zona`
--
ALTER TABLE `zona`
 ADD PRIMARY KEY (`id_zona`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `ciudad`
--
ALTER TABLE `ciudad`
MODIFY `consecutivo_ciudad` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=1123;
--
-- AUTO_INCREMENT de la tabla `cocina`
--
ALTER TABLE `cocina`
MODIFY `id_cocina` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `condicion`
--
ALTER TABLE `condicion`
MODIFY `id_condicion` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `especificaciones_varias`
--
ALTER TABLE `especificaciones_varias`
MODIFY `id_especificaciones_varias` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT de la tabla `estado`
--
ALTER TABLE `estado`
MODIFY `id_estado` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `estrato`
--
ALTER TABLE `estrato`
MODIFY `id_estrato` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT de la tabla `garaje`
--
ALTER TABLE `garaje`
MODIFY `id_garaje` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT de la tabla `genero`
--
ALTER TABLE `genero`
MODIFY `id_genero` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `identificacion_inmobiliaria`
--
ALTER TABLE `identificacion_inmobiliaria`
MODIFY `id_identificacion_inmobiliaria` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `informacion_principal`
--
ALTER TABLE `informacion_principal`
MODIFY `id_informacion_principal` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `numero_alcobas`
--
ALTER TABLE `numero_alcobas`
MODIFY `id_numero_alcobas` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT de la tabla `numero_banios`
--
ALTER TABLE `numero_banios`
MODIFY `id_numero_banios` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT de la tabla `numero_plantas`
--
ALTER TABLE `numero_plantas`
MODIFY `id_numero_plantas` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `opcion`
--
ALTER TABLE `opcion`
MODIFY `id_opcion` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `parqueadero`
--
ALTER TABLE `parqueadero`
MODIFY `id_parqueadero` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT de la tabla `rango_precios`
--
ALTER TABLE `rango_precios`
MODIFY `id_rango_precios` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT de la tabla `rango_precios_ajustado`
--
ALTER TABLE `rango_precios_ajustado`
MODIFY `id_rango_precios_ajustado` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT de la tabla `roles`
--
ALTER TABLE `roles`
MODIFY `id_roles` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `tiempo_construido`
--
ALTER TABLE `tiempo_construido`
MODIFY `id_tiempo_construido` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `tipo_inmueble`
--
ALTER TABLE `tipo_inmueble`
MODIFY `id_tipo_inmueble` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT de la tabla `tipo_propiedad`
--
ALTER TABLE `tipo_propiedad`
MODIFY `id_tipo_propiedad` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `zona`
--
ALTER TABLE `zona`
MODIFY `id_zona` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `ciudad`
--
ALTER TABLE `ciudad`
ADD CONSTRAINT `fk_ciudad_departamento1` FOREIGN KEY (`departamento_id_departamento`) REFERENCES `departamento` (`id_departamento`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `departamento`
--
ALTER TABLE `departamento`
ADD CONSTRAINT `fk_departamento_pais` FOREIGN KEY (`pais_siglas_pais`) REFERENCES `pais` (`siglas_pais`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `informacion_principal`
--
ALTER TABLE `informacion_principal`
ADD CONSTRAINT `fk_informacion_principal_ciudad1` FOREIGN KEY (`ciudad_consecutivo_ciudad`) REFERENCES `ciudad` (`consecutivo_ciudad`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_informacion_principal_cocina1` FOREIGN KEY (`cocina_id_cocina`) REFERENCES `cocina` (`id_cocina`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_informacion_principal_condicion1` FOREIGN KEY (`condicion_id_condicion`) REFERENCES `condicion` (`id_condicion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_informacion_principal_departamento1` FOREIGN KEY (`departamento_id_departamento`) REFERENCES `departamento` (`id_departamento`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_informacion_principal_estado1` FOREIGN KEY (`estado_id_estado`) REFERENCES `estado` (`id_estado`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_informacion_principal_estrato1` FOREIGN KEY (`estrato_id_estrato`) REFERENCES `estrato` (`id_estrato`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_informacion_principal_garaje1` FOREIGN KEY (`garaje_id_garaje`) REFERENCES `garaje` (`id_garaje`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_informacion_principal_numero_alcobas1` FOREIGN KEY (`numero_alcobas_id_numero_alcobas`) REFERENCES `numero_alcobas` (`id_numero_alcobas`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_informacion_principal_numero_banios1` FOREIGN KEY (`numero_banios_id_numero_banios`) REFERENCES `numero_banios` (`id_numero_banios`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_informacion_principal_numero_plantas1` FOREIGN KEY (`numero_plantas_id_numero_plantas`) REFERENCES `numero_plantas` (`id_numero_plantas`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_informacion_principal_parqueadero1` FOREIGN KEY (`parqueadero_id_parqueadero`) REFERENCES `parqueadero` (`id_parqueadero`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_informacion_principal_rango_precios_ajustado1` FOREIGN KEY (`rango_precios_ajustado_id_rango_precios_ajustado`) REFERENCES `rango_precios_ajustado` (`id_rango_precios_ajustado`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_informacion_principal_tiempo_construido1` FOREIGN KEY (`tiempo_construido_id_tiempo_construido`) REFERENCES `tiempo_construido` (`id_tiempo_construido`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_informacion_principal_tipo_inmueble1` FOREIGN KEY (`tipo_inmueble_id_tipo_inmueble`) REFERENCES `tipo_inmueble` (`id_tipo_inmueble`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_informacion_principal_tipo_operacion1` FOREIGN KEY (`tipo_operacion_id_tipo_operacion`) REFERENCES `tipo_operacion` (`id_tipo_operacion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_informacion_principal_tipo_propiedad1` FOREIGN KEY (`tipo_propiedad_id_tipo_propiedad`) REFERENCES `tipo_propiedad` (`id_tipo_propiedad`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_informacion_principal_usuario1` FOREIGN KEY (`usuario_id_usuario`) REFERENCES `usuario` (`id_usuario`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_informacion_principal_zona1` FOREIGN KEY (`zona_id_zona`) REFERENCES `zona` (`id_zona`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `informacion_principal_has_especificaciones_varias`
--
ALTER TABLE `informacion_principal_has_especificaciones_varias`
ADD CONSTRAINT `fk_informacion_principal_has_especificaciones_varias_opcion1` FOREIGN KEY (`opcion_id_opcion`) REFERENCES `opcion` (`id_opcion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_informacion_principal_has_especificaciones_varias_especifi1` FOREIGN KEY (`especificaciones_varias_id_especificaciones_varias`) REFERENCES `especificaciones_varias` (`id_especificaciones_varias`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_informacion_principal_has_especificaciones_varias_informac1` FOREIGN KEY (`informacion_principal_id_informacion_principal`) REFERENCES `informacion_principal` (`id_informacion_principal`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `rango_precios_ajustado`
--
ALTER TABLE `rango_precios_ajustado`
ADD CONSTRAINT `fk_rango_precios_ajustado_tipo_operacion1` FOREIGN KEY (`tipo_operacion_id_tipo_operacion`) REFERENCES `tipo_operacion` (`id_tipo_operacion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_rango_precios_ajustado_rango_precios1` FOREIGN KEY (`rango_precios_id_rango_precios`) REFERENCES `rango_precios` (`id_rango_precios`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
ADD CONSTRAINT `fk_usuario_ciudad1` FOREIGN KEY (`ciudad_consecutivo_ciudad`) REFERENCES `ciudad` (`consecutivo_ciudad`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_usuario_departamento1` FOREIGN KEY (`departamento_id_departamento`) REFERENCES `departamento` (`id_departamento`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_usuario_genero1` FOREIGN KEY (`genero_id_genero`) REFERENCES `genero` (`id_genero`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_usuario_roles1` FOREIGN KEY (`roles_id_roles`) REFERENCES `roles` (`id_roles`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
