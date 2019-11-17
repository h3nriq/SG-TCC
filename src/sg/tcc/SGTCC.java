package sg.tcc;
import java.util.ArrayList;

public class SGTCC {
    public static void main(String[] args) {

//      Adicionado anteriormente      
//        GerenciadorArquivos.criarArquivo();

        GerenciadorArquivos gerenciador = GerenciadorArquivos.getInstance("aluno.txt");
        ArrayList listain = (ArrayList) GerenciadorArquivos.lerArquivo();
        
//        ArrayList lista = new ArrayList();
//        Usuario aluno1 = new Aluno(2, "Diogo Almeida", "diogo.almeida@compasso.com.br", "123456", 2, "2019006999", "99999-9999");
//        Usuario aluno2 = new Aluno(4, "Paulo Serpa Antunes", "pauloserpaantunes@gmail.com", "senha123", 2, "2019006862", "98213-7558");
//        listain.add(aluno1);
//        listain.add(aluno2);
        
        Usuario aluno3 = new Aluno(5, "Henrique", "priv.henrique@gmail.com", "123456", 2, "2019006888", "98888-8888");
        listain.add(aluno3);
        GerenciadorArquivos.gravarArquivo(listain);

        ArrayList listaAtualizada = (ArrayList) GerenciadorArquivos.lerArquivo();
        for (int i = 0; i<listaAtualizada.size(); i++){
            System.out.println(listaAtualizada.get(i));
        }
        
       Usuario prof1 = new Professor(1, "Karen Selbach Borges", "karen.borges@poa.ifrs.edu.br", "123456", 0, "1760001");
       System.out.println(prof1.getNome());
       Usuario prof2 = new Professor(3, "Alex Dias Gonsales", "alex.gonsales@poa.ifrs.edu.br", "123456", 1, "1780001");
       System.out.println(prof2.getNome());

       // conexao com o BD
       //Conexao.getConexao();

    }  
} 