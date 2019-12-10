package sg.tcc;
//extends Usuario

import java.io.Serializable;

public class Aluno extends Usuario implements Serializable {
    private String nrMatricula;
    private String telefone;

    public Aluno(int id, String nome, String email, String nrMatricula, String telefone){
        super(id, nome, email);
        this.nrMatricula = nrMatricula;
        this.telefone = telefone;
    }

    public Aluno(){ }    

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
        return "Aluno{" + "id=" + getId() + ", nome=" + getNome() + ", email=" + getEmail() + ", nrMatricula=" + nrMatricula + ", telefone=" + telefone + '}';
    }
}
