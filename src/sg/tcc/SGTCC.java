package sg.tcc;
import dao.AlunoDAO;
import dao.AreasDAO;
import dao.Professor_AreasDAO;
import dao.ProfessorDAO;
import dao.ProjetosPesquisaDAO;
import dao.TemasSugeridosDAO;
import gui.InicioGUI;
import java.util.List;

public class SGTCC {
    public static void main(String[] args) {
        
        new InicioGUI().setVisible(true);

        System.out.println("\nLISTA ALUNOS");
        AlunoDAO dao = new AlunoDAO();
        List<Aluno> listaAluno = dao.readLista();
        for (Aluno aluno : listaAluno) {
          System.out.println("Id: " + aluno.getId() + ". Nome: " + aluno.getNome() + ". E-mail: " + aluno.getEmail() + ". Telefone: " + aluno.getTelefone());
        }

        // TESTES DE UPDATE, SELECT DE UM USER E DELETE
        //Aluno teste = (Aluno)dao.read(111);
        //System.out.println(teste);
        //teste.setNome("Francielli Pinheiro Dias");
        //System.out.println(teste);
        //dao.update(teste);      
        //dao.delete(112);     


        
        
        System.out.println("LISTA PROFESSORES");
        ProfessorDAO dao2 = new ProfessorDAO();


        //CRIAR PROFESSOR
        //CProfessor newprofessor = new Professor();
        //Cnewprofessor.setNome("Márcia Häfele Islabão Franco");
        //Cnewprofessor.setEmail("marcia.franco@poa.ifrs.edu.br");
        //CSystem.out.println(newprofessor);
        //Cdao2.create(newprofessor);

        List<Professor> listaProfessores = dao2.readLista();
        for (Professor professor : listaProfessores) {
          System.out.println("Id: " + professor.getId() + ". Nome: " + professor.getNome() + ". E-mail: " + professor.getEmail());
        }

        // TESTES DE UPDATE, SELECT DE UM USER E DELETE
        Professor teste2 = (Professor) dao2.read(1);
        //teste2.setNome("Alex Dias Gonsales");
        //teste2.setEmail("alex.gonsales@poa.ifrs.edu.br");
        //System.out.println(teste2);
        //dao2.update(teste2);
        //dao.delete(19);     
        
        System.out.println("\nLISTA AREAS");
        AreasDAO dao3 = new AreasDAO();
        List<Areas> listaAreas = dao3.readLista();
        for (Areas area : listaAreas) {
            System.out.println("Id: " + area.getCodArea() + ". Nome: " + area.getNomeArea());
        }

        // TESTES DE UPDATE, SELECT DE UM USER, DELETE E CREATE
        Areas teste3 = (Areas)dao3.read(104);
        // System.out.println(teste3);
        // teste3.setNomeArea("Redes de Computadores");
        // System.out.println(teste3);
        // dao3.update(teste3);      
        // dao3.delete(4);     

        //Areas insert = new Areas();
        //insert.setNomeArea("Red de Computadores");
        //System.out.println(insert);       
        //dao3.create(insert);
        
        
        Professor_AreasDAO dao4 = new Professor_AreasDAO();
        //Professor_Areas professor_areas;
        //professor_areas = new Professor_Areas(teste3, teste2);
        //System.out.println(professor_areas);
        //dao4.create(professor_areas);
        System.out.println("\nLISTA AREAS DE INTERESSE E PROFESSORES");
        List<Professor_Areas> listaProfessor_Areas = dao4.readLista('p', 1);
        for (Professor_Areas profarea : listaProfessor_Areas) {
            System.out.println(profarea);
        }
        //dao4.delete(1, 104);

        ProjetosPesquisaDAO dao5 = new ProjetosPesquisaDAO();
        System.out.println("\nLISTA PROJETOS DE PESQUISA");
        List<ProjetosPesquisa> listaProjetosPesquisa = dao5.readLista();
        for (ProjetosPesquisa projeto : listaProjetosPesquisa) {
            System.out.println(projeto);
        }
        //ProjetosPesquisa teste5 = (ProjetosPesquisa) dao5.read(101);
        //System.out.println(teste5);
        //teste5.setDescricao("Objetiva fazer uso da computação tanto como ferramenta para estimular os processos cognitivos, como ferramenta de produção de conhecimento e novos recursos educacionais.");
        //System.out.println(teste5);
        //dao5.update(teste5);      

        TemasSugeridosDAO dao6 = new TemasSugeridosDAO();
        System.out.println("\nLISTA TEMAS");
        List<TemasSugeridos> listaTemas = dao6.readLista();
        for (TemasSugeridos tema : listaTemas) {
            System.out.println(tema);
        }
        //dao6.delete(2);
  
        //Professor teste7 = (Professor) dao2.read(9);
        //System.out.println(teste7);

        //TemasSugeridos teste6 = (TemasSugeridos)dao6.read(1);
        //teste6.setReservado(false);
        // System.out.println(teste3);
        // dao3.delete(4);     
        //System.out.println(teste6);        
        //dao6.update(teste6);      
        
        

        
    }  
} 