package sg.tcc;
//extends Usuario

import java.io.Serializable;

public class Aluno implements Serializable {
    private int id;
    private String nome;
    private String email;
    private String nrMatricula;
    private String telefone;

    /* 
        NOTA PARA O PROFESSOR. OPTAMOS POR DEIXAR O CONSTRUTOR VAZIO E PREENCHER O OBJETO ATRAVÉS DE SETTERS
    public Aluno(String nome, String email, String senha, int nivelAcesso, String nrMatricula, String telefone){
        super(nome, email, senha, nivelAcesso);
        this.nrMatricula = nrMatricula;
        this.telefone = telefone;
    }
    }
*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    @Override
    public String toString() {
        return "Aluno{" + "id=" + id + ", nome=" + nome + ", email=" + email + ", nrMatricula=" + nrMatricula + ", telefone=" + telefone + '}';
    }
}
