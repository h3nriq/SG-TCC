package dao;
import bd.NovaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sg.tcc.Areas;
import sg.tcc.Professor_Areas;
import sg.tcc.Professor;

public class Professor_AreasDAO implements InterfaceDAO {
    private final Connection connection;
    Areas area;
    Professor professor;

    
public Professor_AreasDAO(){ 
        this.connection = new NovaConexao().getConexao();
    }

    @Override
    public void create(Object obj) {
        String sql = "INSERT INTO professor_areainteresse (id_professor, id_areainteresse) VALUES(?, ?)";
        // para gravar na base desmembramos o objeto AreasdeInteresse para recuperar o id da area e do professor
        Professor_Areas areaprof = (Professor_Areas) obj;
        Areas pegaArea = areaprof.getArea();
        int pegaIdArea = pegaArea.getCodArea();
        Professor pegaProfessor = areaprof.getProfessor();
        int pegaIdProfessor = pegaProfessor.getId();
        
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, pegaIdProfessor);
            stmt.setInt(2, pegaIdArea);
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        }
    }

    @Override
    public Object read(int id) {
        System.out.println("Não é possível dar read.");     
        return null;
    }
    

    @Override
    public void update(Object obj) {
        System.out.println("Não é possível dar update.");
        }

    
    @Override
    public void delete(int id) {
        System.out.println("Função inutilizada.");
    }   

    
    public void delete(int id_prof, int id_area) {
        String sql = "DELETE FROM professor_areainteresse WHERE id_professor=? AND id_areainteresse=?";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id_prof);
            stmt.setInt(2, id_area);
            
            int rowsDeleted = stmt.executeUpdate();

            stmt.execute();
            stmt.close();

        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        }
    }   

    public List<Professor_Areas> readLista(char tipo, int id) {
             try {
                 List<Professor_Areas> listaProfessor_Areas = new ArrayList<>();
                 String sql;
                 if (tipo == 'p') {   
                     sql = "select * from professor_areainteresse where id_professor = ?";
                 } else {
                     sql = "select * from professor_areainteresse where id_areainteresse=?";                    
                 }
                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setInt(1, id);

                 ResultSet rs = stmt.executeQuery();
                 while (rs.next()) {
                     // cria os objetos para receber os dados do BD
                     Professor_Areas profarea = new Professor_Areas();

                     int pegaprof = rs.getInt("id_professor");
                     ProfessorDAO profdao = new ProfessorDAO();
                     Professor prof = (Professor) profdao.read(pegaprof);
                     profarea.setProfessor(prof);

                     int pegaarea = rs.getInt("id_areainteresse");
                     AreasDAO areadao = new AreasDAO();
                     Areas areaint = (Areas) areadao.read(pegaarea);
                     profarea.setArea(areaint);
                     
                     // adicionando o objeto à lista
                     listaProfessor_Areas.add(profarea);
                 }
                 rs.close();
                 stmt.close();
                 return listaProfessor_Areas;
             } catch (SQLException e) {
                 throw new RuntimeException(e);
             }
         }

}