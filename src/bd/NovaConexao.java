/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author paulo
 */
public class NovaConexao {

    public Connection getConexao() {
        Connection conn = null;
        
        
           
           //CONEXAO EM TEMPO DE EXECUçÃO
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            conn = DriverManager.getConnection("jdbc:derby:tcc", "tcc", "tcc");
            
            //System.out.println("Conectado!");
            
        }catch(ClassNotFoundException e){
            System.out.println("Não encontrado o driver: " + e.getMessage());
                    
        } catch(SQLException e) {
            System.out.println("Não foi possivel comunicar: " + e.getMessage());
        }
        
        return conn;
        
        
    }

}
