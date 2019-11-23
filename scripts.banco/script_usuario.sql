--https://www.oficinadanet.com.br/artigo/java/criando-um-cadastro-de-usuario-em-java

--CRIA TABELA USUARIO
CREATE TABLE usuario (
  codigo int  NOT NULL PRIMARY KEY
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
  classe varchar(10) NOT NULL,
  nome varchar(120) NOT NULL,
  email varchar(40) NOT NULL,
  senha varchar(20) NOT NULL,
  nivelAcesso int NOT NULL,
  identificador varchar(12) NOT NULL,
  telefone varchar(15) NOT NULL
);

--
-- Fazendo dump de dados para tabela `usuario`
--

INSERT INTO usuario (classe, nome, email, senha, nivelAcesso, identificador, telefone) VALUES
('Aluno', 'Paulo', 'pauloserpaantunes@gmail.com', 'senha', 0, '2019006862', '51982137558'),
('Aluno', 'Diogo Almeida', 'diogo.almeida@compasso.com.br', '123456', 0, '2019006999', '51 99999-9999'),
('Aluno', 'Ana Lúcia', 'seila@gmail.com', 'password', 0, '2019000001', '51 99999-8888');
