package sg.tcc;
public class Aluno extends Usuario{
    
    private String tefefone;
    
    public Aluno(int codigo, String nome, String email, String senha, int nivelAcesso){
        super(codigo, nome, email, senha, nivelAcesso);
    }

    public String getTefefone() {
        return tefefone;
    }

    public void setTefefone(String tefefone) {
        this.tefefone = tefefone;
    }    
}
