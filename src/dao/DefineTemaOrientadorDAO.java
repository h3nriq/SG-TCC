package dao;
import bd.NovaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sg.tcc.Aluno;
import sg.tcc.DefineTemaOrientador;
import sg.tcc.Professor;
import sg.tcc.TemasSugeridos;

/**
 *
 * @author paulo
 */
public class DefineTemaOrientadorDAO implements InterfaceDAO {
    private final Connection connection;
	private int id;
	private String descricao;
	private double notaFinal;
        Aluno aluno;
        Professor orientador;
        TemasSugeridos tema;
    
public DefineTemaOrientadorDAO(){ 
        this.connection = new NovaConexao().getConexao();
    }     

    @Override
    public void create(Object obj)  {
        String sql = "INSERT INTO proposta (descricao, id_aluno, id_professor, id_tema) VALUES(?,?,?,?)";
        DefineTemaOrientador proposta = (DefineTemaOrientador) obj;

        Aluno pegaAluno = proposta.getAluno();
        int pegaIdAluno = pegaAluno.getId();
        TemasSugeridos pegaTema = proposta.getTema();
        int pegaIdTema = pegaTema.getCodTema();
        Professor pegaProfessor = proposta.getOrientador();
        int pegaIdProfessor = pegaProfessor.getId();
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, proposta.getDescricao());
            stmt.setInt(2, pegaIdAluno);
            stmt.setInt(3, pegaIdProfessor);
            stmt.setInt(4, pegaIdTema);
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        }

    }
    
     @Override
    public Object read(int id) { 
        DefineTemaOrientador proposta = null;
        String sql = "SELECT * FROM proposta WHERE id=? ORDER BY id ASC";
            try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id); // Set 1st WHERE to int
 
            ResultSet rs = stmt.executeQuery();
 
            if (rs.next()) {
                    proposta = new DefineTemaOrientador();
                    proposta.setId(rs.getInt("id"));
                    proposta.setDescricao(rs.getString("descricao"));
                    proposta.setNotaFinal(rs.getDouble("nota_final"));

                    AlunoDAO dao2 = new AlunoDAO();
                    Aluno pegaAluno = (Aluno) dao2.read(rs.getInt("id_aluno"));
                    proposta.setAluno(pegaAluno);
                    ProfessorDAO dao = new ProfessorDAO();
                    Professor pegaOrientador = (Professor) dao.read(rs.getInt("id_orientador"));
                    proposta.setOrientador(pegaOrientador);
            }
 
            rs.close();
            stmt.close();
            return proposta;

        } catch (SQLException e) {
            //e.printStackTrace();
            throw new RuntimeException(e);
        } 
}

    @Override
    public void update(Object obj) {
        String sql = "UPDATE proposta SET descricao=? WHERE id=?";
        DefineTemaOrientador proposta = (DefineTemaOrientador) obj;
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, proposta.getDescricao());
            stmt.setInt(2, proposta.getId());

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
        String sql = "DELETE FROM proposta WHERE ID=?";
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

    public List<DefineTemaOrientador> readLista() {
             try {
                 List<DefineTemaOrientador> listaPropostas = new ArrayList<>();
                 PreparedStatement stmt = this.connection.prepareStatement("select * from proposta ORDER BY id ASC");
                 ResultSet rs = stmt.executeQuery();
                 
                 while (rs.next()) {
                     // cria os objetos para receber os dados do BD
                     DefineTemaOrientador proposta = new DefineTemaOrientador();
                     proposta.setId(rs.getInt("id"));
                     proposta.setDescricao(rs.getString("descricao"));
                     // adicionando o objeto à lista
                     listaPropostas.add(proposta);
                 }
                 rs.close();
                 stmt.close();
                 return listaPropostas;
             } catch (SQLException e) {
                 throw new RuntimeException(e);
             }
         }

}