package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBDerby {
    
    private Connection con;
    
    public DBDerby(){
        
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            con = DriverManager.getConnection("jdbc:derby:tcc", "tcc", "tcc");
            
            System.out.println("Conectado!");
            
        }catch(ClassNotFoundException e){
            System.out.println("Não encontrado o driver: " + e.getMessage());
                    
        } catch(SQLException e) {
            System.out.println("Não foi possivel comunicar" + e.getMessage());
        }
    }

}
