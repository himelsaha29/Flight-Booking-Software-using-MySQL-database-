/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HimelSaha
 */
public class DbConnection {
    private static final String HOST = "jdbc:mysql://localhost:3306";
    private static final String dbName = "air";
    private static final String URL = HOST + "/" + dbName;
    private static Connection conn = null;
    
    public static Connection getConnection() {
        try {
            conn = DriverManager.getConnection(URL, "root", "1234");
            System.out.println("::Database Connected::");
        } catch (SQLException ex) {
            System.out.println("::Database Already Created::");
        }
        return conn;
    }
    
    
}
