package sg.tcc;
//extends Usuario

import java.io.Serializable;

public class Professor extends Usuario implements Serializable {
    
    public Professor(int id, String nome, String email){
        super(id, nome, email);
    }

    public Professor(){ }

    @Override
    public String toString() {
        return "Id: " + getId() + ". Nome: " + getNome() + ". E-mail=" + getEmail();
    }
}