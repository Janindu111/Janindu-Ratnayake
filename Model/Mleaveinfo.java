/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class Mleaveinfo {
    public int adminleaveinfo(  String casual_l, String anual_l, String medical_l, String year )
    {
        int count = 0;
        try
        {
            Statement st = rstadmindb.createconnection().createStatement();
            count = st.executeUpdate("INSERT INTO `rst_leaveinfo` (  `casual_l`, `anual_l`, `medical_l`, `year`) VALUES (  '"+casual_l+"', '"+anual_l+"', '"+medical_l+"', '"+year+"')");
            if(count>0)
                {
                    count=1;
                }
                else
                {
                    count=0;
                }
                return count;
        }
        catch(SQLException e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
        return count;
    }
}
