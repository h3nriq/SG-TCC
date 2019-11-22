--https://www.oficinadanet.com.br/artigo/java/criando-um-cadastro-de-usuario-em-java

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";
--
-- Banco de dados: `jornalismodigi03`
--
CREATE DATABASE IF NOT EXISTS `jornalismodigi03` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `jornalismodigi03`;

----------------------------------------------------------

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

ALTER TABLE `usuario`
  ADD PRIMARY KEY (`codigo`);

ALTER TABLE `usuario`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;


--
-- Fazendo dump de dados para tabela `usuario`
--
INSERT INTO `usuario` (`codigo`, `classe`, `nome`, `email`, `senha`, `nivelAcesso`, `identificador`, `telefone`) VALUES
(2, 'Aluno', 'Paulo', 'pauloserpaantunes@gmail.com', 'senha', 0, '2019006862', '51982137558'),
(3, 'Aluno', 'Diogo Almeida', 'diogo.almeida@compasso.com.br', '123456', 0, '2019006999', '51 99999-9999'),
(4, 'Aluno', 'Ana Lúcia', 'seila@gmail.com', 'password', 0, '2019000001', '51 99999-8888')
(5, 'Professor', 'Karen', 'kareen.borges@ifrs.com.br', '123456', 0, '2222222', ''),
(6, 'Professor', 'Alex', 'alex@ifrs.com.br', '123456', 0, '1222222547', ''),
(8, 'Professor', 'Karen', 'kareen.borges@ifrs.com.br', '123456', 0, '13333333', ''),
(7, 'Professor', 'Tanise', 'tanise@ifrs.com.br', '123456', 0, '7897456464', '');

INSERT INTO `tema_areainteresse` (`id_aereaInteresse`, `id_tema`) VALUES
(1, 2),
(1, 3),
(2, 1),
(3, 2),
(2, 2);

