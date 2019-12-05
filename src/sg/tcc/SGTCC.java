package sg.tcc;
import dao.AlunoDAO;
import dao.ProfessorDAO;
import gui.InicioGUI;
import java.util.List;

public class SGTCC {
    public static void main(String[] args) {
        
        new InicioGUI().setVisible(true);

        System.out.println("LISTA PROFESSORES");

        ProfessorDAO dao = new ProfessorDAO();
        List<Professor> listaProfessores = dao.readLista();
        for (Professor professor : listaProfessores) {
          System.out.println("Id: " + professor.getId() + ". Nome: " + professor.getNome() + ". E-mail: " + professor.getEmail());
        }

        // TESTES DE UPDATE, SELECT DE UM USER E DELETE
        //Professor teste = new Professor();
        //teste = dao.read(11);
        //System.out.println(teste);
        //teste.setNome("Evandro");
        //teste.setEmail("evandro@ifrs.poa.edu.br");
        //System.out.println(teste);
        //dao.update(teste);      

        //  dao.delete(21);     
        
        System.out.println("\nLISTA ALUNOS");
        
        AlunoDAO dao2 = new AlunoDAO();
        List<Aluno> listaAluno = dao2.readLista();
        for (Aluno Aluno : listaAluno) {
          System.out.println("Id: " + Aluno.getId() + ". Nome: " + Aluno.getNome() + ". E-mail: " + Aluno.getEmail() + ". Telefone: " + Aluno.getTelefone());
        }

        

    }  
} 