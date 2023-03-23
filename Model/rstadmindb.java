/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class rstadmindb {
    public static Connection con;
    public static Connection createconnection()
    {
        try{
            String path = "jdbc:mysql://localhost/rstadmindb";
            con = DriverManager.getConnection(path,"root","");
        }
        catch(SQLException ex)
        {
        Logger.getLogger(rstadmindb.class.getName()).log(Level.SEVERE, null, ex );
        }
        return con;
    }
}
