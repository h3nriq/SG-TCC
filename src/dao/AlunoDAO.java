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

public List<Aluno> readLista() {
             try {
                 List<Aluno> listaAlunos = new ArrayList<>();
                 PreparedStatement stmt = this.connection.prepareStatement("select * from usuario where tipo = 'a'");
                 ResultSet rs = stmt.executeQuery();
                 
                 while (rs.next()) {
                     // criando o objeto Contato
                     Aluno aluno = new Aluno();
                     aluno.setNome(rs.getString("nome"));
                     
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

public boolean read(Aluno aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public boolean update(Aluno aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public boolean delete(Aluno aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   

public boolean loga(String email, String senha) {
        boolean acessovalido = false;
        String sql = "SELECT * FROM usuario WHERE email = ? AND senha = ?";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                 acessovalido = true;
             }
            stmt.close();

        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        }
        return acessovalido;
    }


}