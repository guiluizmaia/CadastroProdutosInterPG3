/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConectionLogin {
    
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/login";
    private static final String USER = "root";
    private static final String PASS = "4527";
    
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException ("erro na conexão", ex);
        }
    }
    
    
    public static void closeConnection(Connection con){
        if(con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("erro:" + ex);

            }
        }
    }
    public static void closeConnection(Connection con, PreparedStatement stmt){
        if(stmt != null){
            try {
                stmt.close();
            } catch (SQLException ex) {
                System.err.println("erro:" + ex);

            }
        }
        closeConnection(con);
    }
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("erro:" + ex);
            }
        }
        closeConnection(con, stmt);
        
    }
            
}
