package dao;
import bd.NovaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sg.tcc.ProjetosPesquisa;

public class ProjetosPesquisaDAO implements InterfaceDAO {
    private final Connection connection;
    String id;
    String nome;
    String email;
    
public ProjetosPesquisaDAO(){ 
        this.connection = new NovaConexao().getConexao();
    }     

    @Override
    public void create(Object obj)  {
        String sql = "INSERT INTO projeto (nome_projeto, descricao) VALUES(?,?)";
        ProjetosPesquisa projeto = (ProjetosPesquisa) obj;
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, projeto.getNomeProjeto());
            stmt.setString(2, projeto.getDescricao());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        }
    }
    
     @Override
    public Object read(int id) { 
        ProjetosPesquisa projeto = null;
        String sql = "SELECT * FROM projeto WHERE id=? ORDER BY id ASC";
            try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id); // Set 1st WHERE to int
 
            ResultSet rs = stmt.executeQuery();
 
            if (rs.next()) {
                    projeto = new ProjetosPesquisa();
                    projeto.setId(rs.getInt("id"));
                    projeto.setNomeProjeto(rs.getString("nome_projeto"));
                    projeto.setDescricao(rs.getString("descricao"));
            }
 
            rs.close();
            stmt.close();
            return projeto;

        } catch (SQLException e) {
            //e.printStackTrace();
            throw new RuntimeException(e);
        } 
}

    @Override
    public void update(Object obj) {
        String sql = "UPDATE projeto SET nome_projeto=?, descricao=?  WHERE id=?";
        ProjetosPesquisa projeto = (ProjetosPesquisa) obj;
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, projeto.getNomeProjeto());
            stmt.setString(2, projeto.getDescricao());
            stmt.setInt(3, projeto.getId());

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

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM projeto WHERE ID=?";
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

    public List<ProjetosPesquisa> readLista() {
             try {
                 List<ProjetosPesquisa> listaProjetos = new ArrayList<>();
                 PreparedStatement stmt = this.connection.prepareStatement("select * from projeto");
                 ResultSet rs = stmt.executeQuery();
                 
                 while (rs.next()) {
                     // cria os objetos para receber os dados do BD
                     ProjetosPesquisa projeto = new ProjetosPesquisa();
                     projeto.setId(rs.getInt("id"));
                     projeto.setNomeProjeto(rs.getString("nome_projeto"));
                     projeto.setDescricao(rs.getString("descricao"));
                     // adicionando o objeto à lista
                     listaProjetos.add(projeto);
                 }
                 rs.close();
                 stmt.close();
                 return listaProjetos;
             } catch (SQLException e) {
                 throw new RuntimeException(e);
             }
         }

}