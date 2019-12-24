/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HimelSaha
 */
public class DbConnectionAux {
    private static final String HOST = "jdbc:mysql://localhost:3306";
    private static final String dbName = "information_schema";
    private static final String URL = HOST + "/" + dbName;
    private static Connection conne = null;
    
    public static Connection getConnection() {
        try {
            conne = DriverManager.getConnection(URL, "root", "1234");
            System.out.println("::Database Connected::");
        } catch (SQLException ex) {
            System.out.println("::Database Already Created::");
        }
        return conne;
    }
}
