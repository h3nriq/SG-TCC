package dao;
import bd.NovaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sg.tcc.Professor;
import sg.tcc.ProjetosPesquisa;
import sg.tcc.TemasSugeridos;

public class TemasSugeridosDAO implements InterfaceDAO {
    private final Connection connection;
    
public TemasSugeridosDAO(){ 
        this.connection = new NovaConexao().getConexao();
    }

    @Override
    public void create(Object obj) {
        String sql = "INSERT INTO tema (tema, id_professor, id_projeto, reservado) VALUES(?,?,?,0)";
        TemasSugeridos tema = (TemasSugeridos) obj;

        Professor pegaProfessor = tema.getProfessor();
        int pegaIdProfessor = pegaProfessor.getId();
        ProjetosPesquisa pegaProjeto = tema.getProjetospesquisa();
        int pegaIdProjeto = pegaProjeto.getId();
  

        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, tema.getNomeTema());
            stmt.setInt(2, pegaIdProfessor);
            stmt.setInt(3, pegaIdProjeto);
            stmt.setInt(4, 0);
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        }
    }


    @Override
    public Object read(int id) { 
        TemasSugeridos tema = null;
        String sql = "SELECT * FROM tema WHERE id=? ORDER BY id ASC";
            try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
 
            if (rs.next()) {
                    tema = new TemasSugeridos();
                    tema.setCodTema(rs.getInt("id"));
                    tema.setNomeTema(rs.getString("tema"));
            }
 
            rs.close();
            stmt.close();
            return tema;

        } catch (SQLException e) {
            //e.printStackTrace();
            throw new RuntimeException(e);
        } 
}

    @Override
    public void update(Object obj) {
        TemasSugeridos tema = (TemasSugeridos) obj;
        String sql = "UPDATE tema SET tema=? WHERE id=?";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, tema.getNomeTema());
            stmt.setInt(2, tema.getCodTema());

            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Tema atualizado com sucesso!");
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
        String sql = "DELETE FROM tema WHERE ID=?";
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

    public List<TemasSugeridos> readLista() {
             try {
                 List<TemasSugeridos> listaTemas = new ArrayList<>();
                 PreparedStatement stmt = this.connection.prepareStatement("select * from tema");
                 ResultSet rs = stmt.executeQuery();
                 
                 while (rs.next()) {
                     // cria os objetos para receber os dados do BD
                     TemasSugeridos tema = new TemasSugeridos();
                     tema.setCodTema(rs.getInt("id"));
                     tema.setNomeTema(rs.getString("tema"));

                     //tema.setProfessor(rs.getInt("id_professor"));
                     //tema.setProjetospesquisa(rs.getInt("id_projeto"));

                     if (rs.getString("reservado").charAt(0) != 0) {
                         tema.setReservado(true);
                     } else {
                         tema.setReservado(false);                         
                     }
                     // adicionando o objeto à lista
                     listaTemas.add(tema);
                 }
                 rs.close();
                 stmt.close();
                 return listaTemas;
             } catch (SQLException e) {
                 throw new RuntimeException(e);
             }
         }

}