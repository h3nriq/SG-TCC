package sg.tcc;
public class SGTCC {
    public static void main(String[] args) {

        Usuario aluno1 = new Aluno(2, "Diogo", "Diogo.almeida", "diogo", 2, "2019006666", "99999-9999");
        System.out.println(aluno1.getNome());
        
        
       Usuario prof1 = new Professor(1, "Karen Selbach Borges", "karen.borges@poa.ifrs.edu.br", "123456", 0, "1760001");
       System.out.println(prof1.getNome());
       Usuario prof2 = new Professor(3, "Alex Dias Gonsales", "alex.gonsales@poa.ifrs.edu.br", "123456", 1, "1780001");
       System.out.println(prof2.getNome());

       // conexao com o BD
       Conexao.getConexao();

    }
    
    
} 
