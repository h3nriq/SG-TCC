package sg.tcc;
import dao.AlunoDAO;
import gui.AlunoGUI;
import gui.InicioGUI;
import java.util.ArrayList;
import java.util.List;

public class SGTCC {
    public static void main(String[] args) {
        
        new InicioGUI().setVisible(true);

        AlunoDAO dao = new AlunoDAO();
        List<Aluno> listaAlunos = dao.readLista();
        for (Aluno aluno : listaAlunos) {
          System.out.println("Nome: " + aluno.getNome());
        }
        
        
        //Antigo teste de login e senha. Remover
        //AlunoDAO dao2 = new AlunoDAO();
        //System.out.println(dao2.loga("karen.borges@poa.ifrs.edu.br", "123456"));
        // tem que retornar true - porque a senha da Karen está correta.
        // repara que a Karen está se logando pelo Aluno, o que não é tecnicamente correto. talvez tenha que recriar a superclasse usuário só pro login ;)
      

    }  
} 