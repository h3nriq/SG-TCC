package dao;
import bd.NovaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sg.tcc.Aluno;

/**
 *
 * @author paulo
 */
public class AlunoDAO {
    private final Connection connection;
    String id;
    String nome;
    String nrMatricula;
    String email;
    String telefone;
    
public AlunoDAO(){ 
        this.connection = new NovaConexao().getConexao();
    }     

public void create(Aluno aluno)  {
        String sql = "INSERT INTO usuario (tipo, nome, identificador, email, telefone) VALUES('A',?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getNrMatricula());
            stmt.setString(3, aluno.getEmail());
            stmt.setString(4, aluno.getTelefone());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        }
    }

public Aluno read(int id) { 
        Aluno aluno = null;
        String sql = "SELECT * FROM usuario WHERE id=?";
            try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id); // Set 1st WHERE to int
 
            ResultSet rs = stmt.executeQuery();
 
            if (rs.next()) {
                    aluno = new Aluno();
                    aluno.setId(rs.getInt("id"));
                    aluno.setNome(rs.getString("nome"));
                    aluno.setNrMatricula(rs.getString("identificador"));
                    aluno.setEmail(rs.getString("email"));
                    aluno.setTelefone(rs.getString("telefone"));
            }
 
            rs.close();
            stmt.close();
            return aluno;

        } catch (SQLException e) {
            //e.printStackTrace();
            throw new RuntimeException(e);
        } 
}

public List<Aluno> readLista() {
             try {
                 List<Aluno> listaAlunos = new ArrayList<>();
                 PreparedStatement stmt = this.connection.prepareStatement("select * from usuario where tipo = 'A'");
                 ResultSet rs = stmt.executeQuery();
                 
                 while (rs.next()) {
                     // criando o objeto Contato
                     Aluno aluno = new Aluno();
                     aluno.setId(rs.getInt("id"));
                     aluno.setNome(rs.getString("nome"));
                     aluno.setNrMatricula(rs.getString("identificador"));
                     aluno.setEmail(rs.getString("email"));
                     aluno.setTelefone(rs.getString("telefone"));
                     
                     // adicionando o objeto à lista
                     listaAlunos.add(aluno);
                 }
                 rs.close();
                 stmt.close();
                 return listaAlunos;
             } catch (SQLException e) {
                 throw new RuntimeException(e);
             }
         }

public void update(Aluno aluno) {
        String sql = "UPDATE usuario SET nome=?, identificador=?, email=?, telefone=? WHERE id=?";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getNrMatricula());
            stmt.setString(3, aluno.getEmail());
            stmt.setString(4, aluno.getTelefone());
            stmt.setInt(5, aluno.getId());

            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Objeto Aluno atualizado com sucesso!");
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