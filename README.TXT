README.TXT
-----------

1. Nome do projeto: SG-TCC - Sistema de Gerenciamento de Trabalho de Conclusão de Curso

2. Autores:
Antonio Paulo Serpa Antunes
Diogo Diarone Alves de Almeida
(o aluno Henrique Rohamann de Souza desistiu de participar do grupo e abandonou a disciplina após a segunda prova)

3. Diagrama de Classe:

O diagrama que serviu de referência para a definição das classes do trabalho está disponível no arquivo "Diagrama de Classes Java.jpg" e foi desenvolvido no Visual Paradigm. Ele foi alterado 3 vezes ao longo do semestre.

4. Classes

Usuario - superclasse de Alunos e Professor
Áreas - área de conhecimento
ProjetosdePesquisa - projetos dos professores do IFRS
TemasSugeridos - temas propostos pelos professores
Professor_Areas - lista que guarda as áreas de interesse dos professores
DefineTemaOrientados - propostas de TCC escolhidas e ampliadas pelos alunos
Avaliadores - lista que armazena os nomes dos outros componentes das bancas

5. Guarda dos Dados:

Os dados estão armazenado numa base de dados construída no Derby e embarcada no código fonte. Foi a nossa terceira opção. Originalmente tínhamos tentado armazenas num BD MySQL remoto e em arquivos texto. O Derby se mostrou mais fácil para operar.

6. Interface Gráfica

Decidiu-se adotar o Java Swing. No entanto tivemos muitas dificuldades para fazer a implementação. Foram construídas quase todas as telas. Mas só deixamos uma delas navegável na interface gráfica.

A interface projetada pode ser conferidas na Área - Ela permite o cadastro de uma área de conhecimento, lista as áreas já cadastras e permite deletar a área cadastrada.

Não houve tempo hábil para implementar a função de update da área.

7. Aplicação

- O sistema foi organizado em quatro pacotes sg.tcc (classes), dao, gui e bd.
- Foi implementada um superclasse (usuario.java) e uma interface (interfaceDAO.java).
- Todas as classes possuem seu DAO correspondente que faz as operações básicas de CRUD.
- Ao rodar o sistema, o arquivo main (sgtcc.java) lista o conteúdo que popula o banco.
- Ao definir uma proposta de TCC, o tema é bloqueado (DefineTemaOrientadorDAO linhas 49 a 52).
- Criou-se ainda uma lista para montar a sugestão de banca mas não houve tempo hábil para criar o algoritmo que ajudasse no processo de seleção. O sistema apenas exclui da lista de avaliadores o orientador.
- Não houve tempo para criar o DAO para gravar a banca e também o sistema de atribuição de notas ao aluno.

8. Observações Finais

Queríamos muito ter vencido o projeto mas não foi possível. Gastamos, os dois, pelo menos 60 horas neste projeto. Apesar de incompleto, gostaríamos muito de ter o nosso esforço considerado e avaliado.