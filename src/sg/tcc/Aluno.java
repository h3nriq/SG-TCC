package sg.tcc;
//extends Usuario

import java.io.Serializable;

public class Aluno implements Serializable {

    private String nome;
    private String email;
    private String senha;
    private int nivelAcesso;
    private String nrMatricula;
    private String telefone;
 /*   
    public Aluno(String nome, String email, String senha, int nivelAcesso, String nrMatricula, String telefone){
        super(nome, email, senha, nivelAcesso);
        this.nrMatricula = nrMatricula;
        this.telefone = telefone;
    }

    public Aluno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/

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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
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
