# Sistema de Gerenciamento dos Trabalhos de Conclusão do Curso SSI 

**1. Objetivos:**

Desenvolver um sistema que sirva como ferramenta de apoio ao gerenciamento dos
Trabalhos de Conclusão do curso de Sistemas para Internet do IFRS-POA.

**2. Descrição do Processo:**

O Trabalho de Conclusão do curso de Sistemas para Internet do IFRS-POA é desenvolvido
em dois semestres. No primeiro é feito: definição do tema, levantamento de trabalhos
semelhantes, levantamento de requisitos e tecnologias a serem utilizadas e definição do
método e cronograma do trabalho a ser desenvolvido no semestre seguinte. O segundo
semestre é, então, dedicado a modelagem, implementação, documentação e teste do
sistema.
No primeiro semestre cada trabalho é avaliado pelo professor orientador e outros dois
professores, os quais emitem parecer sobre a relevância e qualidade da proposta
apresentada (na forma de artigo). Já no segundo semestre, a avaliação é feita a partir do
artigo entregue e da apresentação perante uma banca composta pelo professor orientador e
outros dois professores.
A composição das bancas, o controle de documentos e a emissão da nota final é de
responsabilidade dos professores das disciplinas de Metodologia da Pesquisa (5ºsem) e
Trabalho de Conclusão de Curso (6ºsem). Existem os seguintes fluxos de atividade:

**2.1 Disciplina de Metodologia da Pesquisa:**

No início do semestre os docentes efetivos enviam para o professor da cadeira sugestão de
projetos ou lista de temas/áreas de pesquisa que eles tem interesse em orientar trabalhos.
Essas informações são disponibilizadas aos alunos que, no prazo de uma semana devem
entrar em contato com o docente e preencher a ficha “Definição de tema e orientador” (anexo
1), que deve ser assinada pelo aluno e pelo docente que irá orientar o trabalho, e entregue
ao professor da disciplina.
Ao final do semestre o aluno entrega para o professor um artigo de até 10 páginas, o qual
será encaminhado para o orientador e mais dois professores de área a fim àquela do tema
ao qual o trabalho se relaciona. Esses três professores preenchem uma ficha de avaliação
(anexo 2) e devolvem para o professor, que encaminhará ao aluno as avaliações e fará o
fechamento da nota.

**2.2 Trabalho de Conclusão de Curso:**

Existem dois momentos de avaliação na disciplina de TC. O primeiro é o seminário de
andamento, quando o aluno entrega um artigo contendo uma parcial do trabalho. Esse artigo
é encaminhado para o orientador e mais dois professores de área a fim àquela do tema ao
qual o trabalho se relaciona. Esse trabalho é apresentado perante uma banca que irá fazer
considerações sobre o andamento do trabalho e indicar os ajustes necessários para a
finalização do trabalho.
Ao final do semestre é feita uma apresentação perante a mesma banca, a qual, ao final irá
emitir parecer sobre a aprovação (ou não) do trabalho, e a respectiva nota do aluno. 

**3. Requisitos Funcionais:**

Para fins do projeto da disciplina de Linguagem de Programação II, do período de 2019/2, os
requisitos estão relacionados apenas com o primeiro fluxo de trabalho (item 2.1)

• CRUD de alunos (nome, número de matrícula, email e telefone de contato),

• CRUD de professores (nome, email, área de interesse, sugestão de projeto),

• CRUD de propostas de TC (titulo, autor, orientador),

• CRUD de banca avaliadora e avaliações.

• Através do sistema os alunos poderão consultar a relação de professores com as
respectivas áreas de interesse e sugestões de projeto. Nessa lista devem constar
informações de contato do professor. Se a sugestão de projeto estiver relacionada
com algum projeto de pesquisa do campus, no cadastro deverá constar também uma
breve descrição desse projeto.

• Quando uma das propostas dessa relação é escolhida, ela deve ser bloqueada.

• Os dados da ficha de “Definição de tema e orientador” devem ser cadastrados no
sistema

• O sistema deverá auxiliar na composição da banca, indicando os professores de áreas
a fim e a quantidade de trabalhos com os quais cada professor se encontra envolvido
(como orientador e como avaliador).

• O professor da disciplina fará a seleção dos avaliadores a partir do relatório do
sistema. Esse deverá mostrar o email dos avaliadores (para onde o professor irá
enviar o artigo a ser selecionado) e acrescentar +1 na carga de trabalho do avaliador.

• Após a avaliação do artigo com a proposta de trabalho, o professor da disciplina irá
registrar no sistema o conceito (ou nota) atribuído para cada avaliador e o sistema irá
emitir o resultado final.

**4. Outros Requisitos:**

• Código encapsulado.

• Código fonte documentado.

• Persistência de dados em arquivos ou banco de dados que possa ser criado
localmente (nesse caso sugere-se o Derby).

• Interface de entrada e saída de dados (no mínimo usando a classe JOptionPane).

• Tratamento de Erros e Exceções (em hipótese alguma o sistema pode abortar, travar
ou perder os dados).

• PDF contendo, no mínimo, o modelo de objetos.

• Projeto que possa ser importado no Netbeans.

