package sg.tcc;
public class Aluno extends Usuario{

    private String nrMatricula;
    private String telefone;
    
    public Aluno(int codigo, String nome, String email, String senha, int nivelAcesso, String nrMatricula, String telefone){
        super(codigo, nome, email, senha, nivelAcesso);
        this.nrMatricula = nrMatricula;
        this.telefone = telefone;
    }

    public String getNrMatricula() {
        return nrMatricula;
    }

    public void setNrMatricula(String nrMatricula) {
        this.nrMatricula = nrMatricula;
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
