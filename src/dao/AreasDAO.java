package dao;
import bd.NovaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sg.tcc.Areas;

public class AreasDAO implements InterfaceDAO {
    private final Connection connection;
    private int codArea;
    private String nomeArea;
    
public AreasDAO(){ 
        this.connection = new NovaConexao().getConexao();
    }

    @Override
    public void create(Object obj) {
        String sql = "INSERT INTO area_interesse (area_interesse) VALUES(?)";
        Areas area = (Areas) obj;
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, area.getNomeArea());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        }
    }


    @Override
    public Object read(int id) { 
        Areas area = null;
        String sql = "SELECT * FROM area_interesse WHERE id=? ORDER BY id ASC";
            try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
 
            if (rs.next()) {
                    area = new Areas();
                    area.setCodArea(rs.getInt("id"));
                    area.setNomeArea(rs.getString("area_interesse"));
            }
 
            rs.close();
            stmt.close();
            return area;

        } catch (SQLException e) {
            //e.printStackTrace();
            throw new RuntimeException(e);
        } 
}

    @Override
    public void update(Object obj) {
        Areas area = (Areas) obj;
        String sql = "UPDATE area_interesse SET area_interesse=? WHERE id=?";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, area.getNomeArea());
            stmt.setInt(2, area.getCodArea());

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

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM area_interesse WHERE ID=?";
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

    public List<Areas> readLista() {
             try {
                 List<Areas> listaAreas = new ArrayList<>();
                 PreparedStatement stmt = this.connection.prepareStatement("select * from area_interesse");
                 ResultSet rs = stmt.executeQuery();
                 
                 while (rs.next()) {
                     // cria os objetos para receber os dados do BD
                     Areas area = new Areas();
                     area.setCodArea(rs.getInt("id"));
                     area.setNomeArea(rs.getString("area_interesse"));
                     // adicionando o objeto à lista
                     listaAreas.add(area);
                 }
                 rs.close();
                 stmt.close();
                 return listaAreas;
             } catch (SQLException e) {
                 throw new RuntimeException(e);
             }
         }

}