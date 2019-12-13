package sg.tcc;
import dao.AlunoDAO;
import dao.AreasDAO;
import dao.DefineTemaOrientadorDAO;
import dao.Professor_AreasDAO;
import dao.ProfessorDAO;
import dao.ProjetosPesquisaDAO;
import dao.TemasSugeridosDAO;
import gui.InicioGUI;
import java.util.List;

public class SGTCC {
    public static void main(String[] args) {
        
        new InicioGUI().setVisible(true);

        System.out.println("\nLISTA ALUNOS - CLASSE ALUNO / ALUNODAO");
        AlunoDAO dao = new AlunoDAO();
        List<Aluno> listaAluno = dao.readLista();
        for (Aluno aluno : listaAluno) {
          System.out.println(aluno);
        }

        System.out.println("\nLISTA PROFESSORES - CLASSE PROFESSOR / PROFESSORDAO");
        ProfessorDAO dao2 = new ProfessorDAO();
        List<Professor> listaProfessores = dao2.readLista();
        for (Professor professor : listaProfessores) {
          System.out.println(professor);
        }

        
        System.out.println("\nLISTA AREAS DE CONHECIMENTO - CLASSE AREAS / AREAS DAO");
        AreasDAO dao3 = new AreasDAO();
        List<Areas> listaAreas = dao3.readLista();
        for (Areas area : listaAreas) {
            System.out.println("Id: " + area.getCodArea() + ". Nome: " + area.getNomeArea());
        }

        // TESTES DE UPDATE, SELECT DE UM USER, DELETE E CREATE
    //    Areas area = new Areas();
  //      area.setNomeArea("Redes de Computadores");
//        dao3.create(area);     

        
        Professor_AreasDAO dao4 = new Professor_AreasDAO();
        //Professor_Areas professor_areas;
        //professor_areas = new Professor_Areas(teste2, teste3);
        //dao4.create(professor_areas);
        System.out.println("\nLISTA AREAS DE INTERESSE DO PROFESSOR DE ID 1 (KAREN) - CLASSES PROFESSOR_AREAS E PROFESSOR_AREASDAO");
        List<Professor_Areas> listaProfessor_Areas = dao4.readLista('p', 1);
        for (Professor_Areas profarea : listaProfessor_Areas) {
            System.out.println(profarea);
        }

        System.out.println("\nLISTA PROFESSORES QUE TENHAM ÁREA DE INTERESSE DE ID 105 (IHC) - CLASSES PROFESSOR_AREAS E PROFESSOR_AREASDAO");
        List<Professor_Areas> listaProfessor_Areas2 = dao4.readLista('a', 105);
        for (Professor_Areas profarea : listaProfessor_Areas2) {
            System.out.println(profarea);
        }

        
        ProjetosPesquisaDAO dao5 = new ProjetosPesquisaDAO();
        System.out.println("\nLISTA PROJETOS DE PESQUISA - CLASSES PROJETOSPESQUISA E PROJETOSPESQUISADAO");
        List<ProjetosPesquisa> listaProjetosPesquisa = dao5.readLista();
        for (ProjetosPesquisa projeto : listaProjetosPesquisa) {
            System.out.println(projeto);
        }
        //ProjetosPesquisa teste5 = (ProjetosPesquisa) dao5.read(101);
        //System.out.println(teste5);
        //teste5.setNomeProjeto("LECC - Laboratório de Estudos Cognitivos Apoiados por Computação");
        //teste5.setDescricao("Objetiva fazer uso da computação tanto como ferramenta para estimular os processos cognitivos, como ferramenta de produção de conhecimento e novos recursos educacionais.");
        //System.out.println(teste5);
        //dao5.update(teste5);      
        //dao5.delete(102);

        TemasSugeridosDAO dao6 = new TemasSugeridosDAO();
        System.out.println("\nLISTA TEMAS OFERECIDOS AOS ALUNOS - CLASSE TEMASSUGERIDOS / CLASSE TEMASSUGERIDOSDAO");
        List<TemasSugeridos> listaTemas = dao6.readLista();
        for (TemasSugeridos tema : listaTemas) {
            System.out.println(tema);
        }
  
        

        TemasSugeridos teste6 = (TemasSugeridos)dao6.read(101);
        //teste6.setProjetospesquisa(teste5);
        // System.out.println(teste3);
        // dao3.delete(4);     
        //System.out.println(teste6);        
        //dao6.update(teste6);      

        DefineTemaOrientadorDAO dao7 = new DefineTemaOrientadorDAO();
        //dao7.create(novo);
        //dao7.delete(301);
        System.out.println("\nLISTA PROPOSTAS - CLASSE DEFINETEMAORIENTADOR / DEFINETEMAORIENTADORDAO");
        List<DefineTemaOrientador> listaPropostas = dao7.readLista();
        for (DefineTemaOrientador proposta : listaPropostas) {
            System.out.println(proposta);
        }
        
        System.out.println("\nPROPOSTA DE BANCA");
        DefineTemaOrientador teste7 = (DefineTemaOrientador) dao7.read(201);
        System.out.println("Nome do trabalho: " + teste7.getDescricao());
        
        Professor pegaprof = teste7.getOrientador();
        System.out.println("Orientador: " + pegaprof.getNome() + "\n");
        int i = pegaprof.getId();
        
        ProfessorDAO daofinal = new ProfessorDAO();
        System.out.println("Disponíveis para a banca");
        List<Professor> listaBanca = daofinal.readBanca(i);
        for (Professor professor : listaBanca) {
          System.out.println(professor.getNome());
        }
        
        
    }  

 

}


    