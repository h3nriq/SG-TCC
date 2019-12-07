package sg.tcc;
import dao.AlunoDAO;
import dao.AreasDAO;
import dao.Professor_AreasDAO;
import dao.ProfessorDAO;
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
        //System.out.println(teste2);
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
        Professor_Areas professor_areas;
        professor_areas = new Professor_Areas(teste3, teste2);
        System.out.println(professor_areas);
        dao4.create(professor_areas);
        //dao4.delete(11, 105);

        System.out.println("\nLISTA AREAS DE INTERESSE E PROFESSORES");
        List<Professor_Areas> listaProfessor_Areas = dao4.readLista('p', 1);
        for (Professor_Areas profarea : listaProfessor_Areas) {
            System.out.println(profarea);
        }
        
    }  
} 