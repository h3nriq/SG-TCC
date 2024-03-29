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
public class ProfessorDAO implements InterfaceDAO {
    private final Connection connection;
    String id;
    String nome;
    String email;
    
public ProfessorDAO(){ 
        this.connection = new NovaConexao().getConexao();
    }     

    @Override
    public void create(Object obj)  {
        String sql = "INSERT INTO usuario (tipo, nome, email ) VALUES('P',?,?)";
        Professor professor = (Professor) obj;
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, professor.getNome());
            stmt.setString(2, professor.getEmail());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        }
    }
    
     @Override
    public Object read(int id) { 
        Professor professor = null;
        String sql = "SELECT * FROM usuario WHERE id=? ORDER BY id ASC";
            try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id); // Set 1st WHERE to int
 
            ResultSet rs = stmt.executeQuery();
 
            if (rs.next()) {
                    professor = new Professor();
                    professor.setId(rs.getInt("id"));
                    professor.setNome(rs.getString("nome"));
                    professor.setEmail(rs.getString("email"));
            }
 
            rs.close();
            stmt.close();
            return professor;

        } catch (SQLException e) {
            //e.printStackTrace();
            throw new RuntimeException(e);
        } 
}

    @Override
    public void update(Object obj) {
        String sql = "UPDATE usuario SET nome=?, email=?  WHERE id=?";
        Professor professor = (Professor) obj;
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, professor.getNome());
            stmt.setString(2, professor.getEmail());
            stmt.setInt(3, professor.getId());

            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Professor atualizado com sucesso!");
            }
                stmt.execute();
                stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        }
}

    @Override
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

    public List<Professor> readLista() {
             try {
                 List<Professor> listaProfessores = new ArrayList<>();
                 PreparedStatement stmt = this.connection.prepareStatement("select * from usuario where tipo = 'P' ORDER BY id ASC");
                 ResultSet rs = stmt.executeQuery();
                 
                 while (rs.next()) {
                     // cria os objetos para receber os dados do BD
                     Professor professor = new Professor();
                     professor.setId(rs.getInt("id"));
                     professor.setNome(rs.getString("nome"));
                     professor.setEmail(rs.getString("email"));
                     // adicionando o objeto à lista
                     listaProfessores.add(professor);
                 }
                 rs.close();
                 stmt.close();
                 return listaProfessores;
             } catch (SQLException e) {
                 throw new RuntimeException(e);
             }
         }

    public List<Professor> readBanca(int i) {
             try {
                 List<Professor> listaBanca = new ArrayList<>();

                 PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM usuario WHERE ID != ? AND tipo = 'P' ORDER BY id ASC");
                 stmt.setInt(1, i);
                 ResultSet rs = stmt.executeQuery();                 
                 
                 while (rs.next()) {
                     // cria os objetos para receber os dados do BD
                     Professor professor = new Professor();
                     professor.setId(rs.getInt("id"));
                     professor.setNome(rs.getString("nome"));
                     professor.setEmail(rs.getString("email"));
                     // adicionando o objeto à lista
                     listaBanca.add(professor);
                 }
                 rs.close();
                 stmt.close();
                 return listaBanca;
             } catch (SQLException e) {
                 throw new RuntimeException(e);
             }
         }

}