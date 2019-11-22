-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 22-Nov-2019 às 01:48
-- Versão do servidor: 10.1.30-MariaDB
-- PHP Version: 7.2.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `jornalismodigi03`
--
CREATE DATABASE IF NOT EXISTS `jornalismodigi03` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `jornalismodigi03`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `area_interesse`
--

DROP TABLE IF EXISTS `area_interesse`;
CREATE TABLE `area_interesse` (
  `id` int(11) NOT NULL,
  `area_interesse` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `area_interesse`
--

INSERT INTO `area_interesse` (`id`, `area_interesse`) VALUES
(1, 'Programação JAVA'),
(2, 'Engenharia de Software'),
(3, 'Educação a Distância');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tema`
--

DROP TABLE IF EXISTS `tema`;
CREATE TABLE `tema` (
  `id` int(11) NOT NULL,
  `tema` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tema`
--

INSERT INTO `tema` (`id`, `tema`) VALUES
(1, 'Educação Maker'),
(2, 'Pensamento Computacional'),
(3, 'Jogos Educacionais');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tema_areainteresse`
--

DROP TABLE IF EXISTS `tema_areainteresse`;
CREATE TABLE `tema_areainteresse` (
  `id_tema` int(11) NOT NULL,
  `id_aereaInteresse` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tema_areainteresse`
--

INSERT INTO `tema_areainteresse` (`id_tema`, `id_aereaInteresse`) VALUES
(1, 2),
(2, 1),
(2, 2),
(2, 3),
(3, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE `usuario` (
  `codigo` int(11) NOT NULL,
  `classe` varchar(10) NOT NULL,
  `nome` varchar(120) NOT NULL,
  `email` varchar(40) NOT NULL,
  `senha` varchar(20) NOT NULL,
  `nivelAcesso` int(11) NOT NULL,
  `identificador` varchar(12) NOT NULL,
  `telefone` varchar(15) NOT NULL,
  `nrOrientacoes` int(11) DEFAULT NULL,
  `nrAvaliacoes` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`codigo`, `classe`, `nome`, `email`, `senha`, `nivelAcesso`, `identificador`, `telefone`, `nrOrientacoes`, `nrAvaliacoes`) VALUES
(2, 'Aluno', 'Paulo', 'pauloserpaantunes@gmail.com', 'senha', 0, '2019006862', '51982137558', NULL, NULL),
(3, 'Aluno', 'Diogo Almeida', 'diogo.almeida@compasso.com.br', '123456', 0, '2019006999', '51 99999-9999', NULL, NULL),
(4, 'Aluno', 'Ana Lúcia', 'seila@gmail.com', 'password', 0, '2019000001', '51 99999-8888', NULL, NULL),
(5, 'Aluno', 'Diogo 25', 'diogo254@gmail.com.br', '123456789', 0, '258963', '51984860027', NULL, NULL),
(6, 'Professor', 'Alex', 'alex@ifrs.com.br', '123456', 0, '1222222547', '', NULL, NULL),
(7, 'Professor', 'Tanise', 'tanise@ifrs.com.br', '123456', 0, '7897456464', '', NULL, NULL),
(8, 'Professor', 'Karen', 'kareen.borges@ifrs.com.br', '123456', 0, '13333333', '', NULL, NULL),
(9, 'Professor', 'Karen', 'kareen.borges@ifrs.com.br', '123456', 0, '2222222', '', NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `area_interesse`
--
ALTER TABLE `area_interesse`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tema`
--
ALTER TABLE `tema`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tema_areainteresse`
--
ALTER TABLE `tema_areainteresse`
  ADD PRIMARY KEY (`id_tema`,`id_aereaInteresse`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`codigo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `area_interesse`
--
ALTER TABLE `area_interesse`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tema`
--
ALTER TABLE `tema`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
