/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Muserloging {
    
    
    public int getadmin(String username,String password)
    {
        int count = 0;
        try
        {
            Statement st = rstadmindb.createconnection().createStatement();
            ResultSet rs = st.executeQuery("select * from rst_admin where Username = '"+username+"' and Password = '"+password+"'");
            if(rs .next())
            {
                count = 1;
            }
            else
            {
                count = 0;
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return count;
    }
}
