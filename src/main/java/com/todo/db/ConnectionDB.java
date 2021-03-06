/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.todo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static com.todo.config.Database.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ConnectionDB {
     private Connection conn;
    
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(DB_HOST + DB_NAME + QUERY_PARAMS, DB_USER, DB_PASSWORD);
        return this.conn;
    }
    
    public void close() {
        if(this.conn != null) {
            try {
                this.conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
