DELETE TABLE TEMA;
DELETE TABLE USUARIO;
DELETE TABLE AREA_INTERESSE;
DELETE TABLE PROJETO;
----------------------------------------------------------------------------

INSERT INTO USUARIO (TIPO, IDENTIFICADOR, NOME, EMAIL, SENHA, NIVELACESSO, TELEFONE1) VALUES 
('a', '2019006862', 'Aulo serpa antunos', 'pauloserpaantunes@gmail.com', 'senha', 0, '51982137558'), 
('a', '2019003145', 'Izadora kisiolar', 'izadora.kisiola@gmail.com', '123654789', 0, '5132260051'), 
('a', '2019001478', 'Caroline colonia menezes', 'carolinizi@gmail.com', '1123455derc', 0, '5198742269'), 
('a', '2019003369', 'Ralphe de jesus ', 'ralph@gmail.com', 'mordenkais', 0, '2315890001'), 
('a', '2019002212', 'Jessika pires siva', 'jessica@gmail.com', 'nomedodog', 0, '51982137112'), 
('a', '2019001303', 'Paulo p. mogetti', 'pedro.mogetti@gmail.com', 'flamengobiamerica', 0, '14222589633'),
('a', '2019006081', 'Diogo almeida', 'diogo254@gmail.com', 'dungeons&dragons', 0, '14222589633'),
('p', '1222222547', 'Alex', 'alex@ifrs.com.br', '123456', 0, ''),
('p', '7897456464', 'Tanise', 'tanise@ifrs.com.br', '123456', 0, ''),
('p', '13333333', 'Karen', 'kareen.borges@ifrs.com.br', '123456', 0, ''),
('p', '125896311', 'Evandro', 'evandro@ifrs.com.br', '14785523', 0, '');
----------------------------------------------------------------------------

INSERT INTO AREA_INTERESSE (AREA_INTERESSE) VALUES
('Programação JAVA'),
('Engenharia de Software'),
('Educação a Distância');
----------------------------------------------------------------------------

-- INSERT INTO TEMA (TEMA) VALUES
-- ('Educação Maker'),
-- ('Pensamento Computacional'),
-- ('Jogos Educacionais');
----------------------------------------------------------------------------

INSERT INTO PROJETO (NOME_PROJETO, DESCRICAO) VALUES
('Informática Aplicada', 'Os projetos multidisciplinares têm gerado pesquisas e produtos de software, tecnologias de rede aplicadas ao meio ambiente e sistemas interativos aplicados à educação e ao setor produtivo. Nesse contexto, destacam-se: a) a abertura do Mestrado Profissional em Informática na Educação, b) projeto de sensores ambientais autônomos conectados via Internet das coisas (em cooperação com o setor produtivo e com o parceiro internacional CÉGEP de Sherbrooke, QC / Canadá), c) o CODES, um ambiente livre para experimentação musical coletiva na Web por leigos em música com objetivos de inclusão e educacionais (em parceria com a UFRGS), d) O plugin Analytics Graphs para suporte pedagógico no Moodle e e) a criação do PoaLab, primeiro FabLab da RFETP. A expectativa do grupo é aprofundar-se nestas linhas para tornar o IFRS um centro de referência em informática aplicada à educação, tecnologias assistivas e desenvolvimento de produtos tecnológicos atendendo as demandas internas e da sociedade.'),
('Desenvolvimento de um Módulo de Monitoramento de Temperatura para Uso em Ambiente Educacional', 'O monitoramento de temperatura tem aplicações em diversas áreas do conhecimento, tanto a nível de ensino quanto pesquisa. A aquisição automática de dados é uma técnica que permite o monitoramento e armazenamento dos valores de temperatura ocorridos, sendo extremamente útil para o estudo e observação de diversos fenômenos térmicos. Este projeto teve como objetivo o desenvolvimento de um módulo portátil, de baixo custo, contendo as funções de monitoramento e visualização da temperatura, dos valores mínimo e máximo ocorridos bem como o registro e armazenamento de até 100 valores de temperatura ocorridos em um determinado intervalo de tempo.');
----------------------------------------------------------------------------

INSERT INTO TEMA (TEMA, ID_PROFESSOR, RESERVADO, ID_PROJETO) VALUES
('Desenvolvimento de sistema para controlar um dispositivo eletrônico de temperatura', 9, '0', 2);
----------------------------------------------------------------------------

select tema.id, tema.tema, prof.nome, proj.nome_projeto, proj.descricao from tema
inner join usuario as prof on prof.id = tema.id_professor
inner join projeto as proj on proj.id = tema.id_projeto;
