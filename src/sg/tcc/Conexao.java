package sg.tcc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Paulo
 */
public class Conexao {

    public static Connection getConexao() {
        
        
        // CRIA CONEXAO
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://mysql10-farm76.kinghost.net:3306/jornalismodigi03", "jornalismodigi03", "appjava01");
            System.out.println("Conectado com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar");
        }
    
        // TENTA GRAVAR ALGO NA BASE TESTE
        try {
            Statement st = conn.createStatement();
            // note that i'm leaving "date_created" out of this insert statement
            st.executeUpdate("INSERT INTO teste (nome, senha) "
                    +"VALUES ('´loginentraaqui', 'senha')");
           System.out.println("Gravei na base teste com sucesso");
        } catch (SQLException ex) {
            System.out.println("Não consegui gravar");
        }
        
        
        // FECHA CONEXAO
        try {
            conn.close();
            System.out.println("Desconetado");
        } catch (SQLException ex) {
            System.out.println("Erro ao desconectar");
        }
        
        return conn;


    
    }
    




}
