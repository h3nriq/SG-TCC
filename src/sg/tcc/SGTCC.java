package sg.tcc;
public class SGTCC {
    public static void main(String[] args) {

        Usuario aluno = new Usuario(12, "Diogo", "Diogo.almdoa", "diogo", 1);
        
        System.out.println(aluno.getNome());
        
        
       Professor prof = new Professor(1, "Kare", "karem@if.com.br", "123654", 9);
       
        System.out.println(prof.getNome());
       
    }
    
} 
