package sg.tcc;
public class Professor extends Usuario{

    private String siape;
    private int nrOrientacoes;
    private int nrAvaliacoes;
    
    public Professor(int codigo, String nome, String email, String senha, int nivelAcesso, String siape){
        super(codigo, nome, email, senha, nivelAcesso);
        this.siape = siape;
        
    }
    
}
