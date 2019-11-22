--https://www.oficinadanet.com.br/artigo/java/criando-um-cadastro-de-usuario-em-java

-- phpMyAdmin SQL Dump
-- version 4.3.7
-- http://www.phpmyadmin.net
--
-- Host: mysql10-farm76.kinghost.net
-- Tempo de geração: 21/11/2019 às 20:20
-- Versão do servidor: 5.6.36-log
-- Versão do PHP: 5.3.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de dados: `jornalismodigi03`
--
CREATE DATABASE IF NOT EXISTS `jornalismodigi03` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `jornalismodigi03`;

-- --------------------------------------------------------

--
-- Estrutura para tabela `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `codigo` int(11) NOT NULL,
  `classe` varchar(10) NOT NULL,
  `nome` varchar(120) NOT NULL,
  `email` varchar(40) NOT NULL,
  `senha` varchar(20) NOT NULL,
  `nivelAcesso` int(11) NOT NULL,
  `identificador` varchar(12) NOT NULL,
  `telefone` varchar(15) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Fazendo dump de dados para tabela `usuario`
--

INSERT INTO `usuario` (`codigo`, `classe`, `nome`, `email`, `senha`, `nivelAcesso`, `identificador`, `telefone`, `nrOrientacoes`, `nrAvaliacoes`) VALUES
(2, 'Aluno', 'Paulo', 'pauloserpaantunes@gmail.com', 'senha', 0, '2019006862', '51982137558', NULL, NULL),
(3, 'Aluno', 'Diogo Almeida', 'diogo.almeida@compasso.com.br', '123456', 0, '2019006999', '51 99999-9999', NULL, NULL),
(4, 'Aluno', 'Ana Lúcia', 'seila@gmail.com', 'password', 0, '2019000001', '51 99999-8888', NULL, NULL);

--
-- Índices de tabelas apagadas
--

--
-- Índices de tabela `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`codigo`);

--
-- AUTO_INCREMENT de tabelas apagadas
--

--
-- AUTO_INCREMENT de tabela `usuario`
--
ALTER TABLE `usuario`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
