package sg.tcc;
import dao.AlunoDAO;
import gui.InicioGUI;
import java.util.ArrayList;
import java.util.List;

public class SGTCC {
    public static void main(String[] args) {
        
        new InicioGUI().setVisible(true);

        AlunoDAO dao = new AlunoDAO();
        
        List<Aluno> listaAlunos = dao.readLista();
        for (Aluno aluno : listaAlunos) {
          System.out.println("Id: " + aluno.getId() + ". Nome: " + aluno.getNome() + ". Nr. Matrícula: " + aluno.getNrMatricula() + ". E-mail: " + aluno.getEmail() + ". Telefone: " +aluno.getTelefone());
        }

        // TESTES DE UPDATE, SELECT DE UM USER E DELETE
        //Aluno teste = new Aluno();
        //teste = dao.read(18);
        //System.out.println(teste);
        //teste.setNome("Diogo Almeira - versão 2");
        //System.out.println(teste);
        //dao.update(teste);      

        //dao.delete(113);     

    }  
} 