package sg.tcc;
import dao.AlunoDAO;
import gui.AlunoGUI;
import gui.InicioGUI;
import java.util.ArrayList;

public class SGTCC {
    public static void main(String[] args) {
        
        new InicioGUI().setVisible(true);

        AlunoDAO dao = new AlunoDAO();
        System.out.println(dao.loga("pauloserpaantunes@gmail.com", "aaa"));
        // tem que retornar false - porque minha senha é senha
        
        AlunoDAO dao2 = new AlunoDAO();
        System.out.println(dao2.loga("karen.borges@poa.ifrs.edu.br", "123456"));
        // tem que retornar true - porque a senha da Karen está correta.
        // repara que a Karen está se logando pelo Aluno, o que não é tecnicamente correto. talvez tenha que recriar a superclasse usuário só pro login ;)
      

    }  
} 