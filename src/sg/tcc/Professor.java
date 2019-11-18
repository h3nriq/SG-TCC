package sg.tcc;
public class Professor extends Usuario{

    private String siape;
    private int nrOrientacoes;
    private int nrAvaliacoes;
    
    public Professor(String nome, String email, String senha, int nivelAcesso, String siape){
        super(nome, email, senha, nivelAcesso);
        this.siape = siape;
        
    }
    
}
