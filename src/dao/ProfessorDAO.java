package dao;
import bd.NovaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sg.tcc.Professor;

/**
 *
 * @author paulo
 */
public class ProfessorDAO {
    private final Connection connection;
    String id;
    String nome;
    String nrMatricula;
    String email;
    String telefone;
    
public ProfessorDAO(){ 
        this.connection = new NovaConexao().getConexao();
    }     

public void create(Professor Professor)  {
        String sql = "INSERT INTO usuario (tipo, nome, email ) VALUES('P',?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, Professor.getNome());
            stmt.setString(2, Professor.getEmail());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        }
    }

public Professor read(int id) { 
        Professor Professor = null;
        String sql = "SELECT * FROM usuario WHERE id=?";
            try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id); // Set 1st WHERE to int
 
            ResultSet rs = stmt.executeQuery();
 
            if (rs.next()) {
                    Professor = new Professor();
                    Professor.setId(rs.getInt("id"));
                    Professor.setNome(rs.getString("nome"));
                    Professor.setEmail(rs.getString("email"));
            }
 
            rs.close();
            stmt.close();
            return Professor;

        } catch (SQLException e) {
            //e.printStackTrace();
            throw new RuntimeException(e);
        } 
}

public List<Professor> readLista() {
             try {
                 List<Professor> listaProfessors = new ArrayList<>();
                 PreparedStatement stmt = this.connection.prepareStatement("select * from usuario where tipo = 'P'");
                 ResultSet rs = stmt.executeQuery();
                 
                 while (rs.next()) {
                     // criando o objeto Contato
                     Professor Professor = new Professor();
                     Professor.setId(rs.getInt("id"));
                     Professor.setNome(rs.getString("nome"));
                     Professor.setEmail(rs.getString("email"));
                     
                     // adicionando o objeto à lista
                     listaProfessors.add(Professor);
                 }
                 rs.close();
                 stmt.close();
                 return listaProfessors;
             } catch (SQLException e) {
                 throw new RuntimeException(e);
             }
         }

public void update(Professor professor) {
        String sql = "UPDATE usuario SET nome=?, email=?  WHERE id=?";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, professor.getNome());
            stmt.setString(2, professor.getEmail());
            stmt.setInt(3, professor.getId());

            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Objeto Professor atualizado com sucesso!");
            }
                stmt.execute();
                stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        }
}

public void delete(int id) {
        String sql = "DELETE FROM usuario WHERE ID=?";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            
            int rowsDeleted = stmt.executeUpdate();

            stmt.execute();
            stmt.close();

        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        }
    }   



}