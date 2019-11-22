/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author paulo
 */
public class NovaConexao {

    public Connection getConexao() {
        Connection conn = null;
        // CRIA CONEXAO
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jornalismodigi03", "jornalismodigi03", "appjava01");
        } catch (SQLException excecao) {
            System.out.println("Erro ao conectar" + excecao );
        }
        return conn;
    }

}
