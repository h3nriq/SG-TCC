package sg.tcc;
import dao.ProfessorDAO;
import gui.InicioGUI;
import java.util.ArrayList;
import java.util.List;

public class SGTCC {
    public static void main(String[] args) {
        
        new InicioGUI().setVisible(true);;

        ProfessorDAO dao = new ProfessorDAO();
        
//        List<Professor> listaProfessors = dao.readLista();
//        for (Professor Professor : listaProfessors) {
//          System.out.println("Id: " + Professor.getId() + ". Nome: " + Professor.getNome() + ". E-mail: " + Professor.getEmail());
//        }

        // TESTES DE UPDATE, SELECT DE UM USER E DELETE;;;;;
        Professor teste = new Professor();
        teste = dao.read(20);
        System.out.println(teste);
        teste.setNome("Tanisi");
        System.out.println(teste);
        dao.update(teste);      

        //dao.delete(22);     

    }  
} 