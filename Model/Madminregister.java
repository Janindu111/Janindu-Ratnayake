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
public class Madminregister {
    public int adminregister(String ID, String First_Name, String Last_Name, String Phone_Number, String Email, String Username, String Password )
    {
        int count =0;
        try
        {
            Statement st = rstadmindb.createconnection().createStatement();
            count = st.executeUpdate("INSERT INTO `rst_admin` (`ID`, `First_Name`, `Last_Name`, `Phone_Number`, `Email`, `Username`, `Password`) VALUES ('"+ID+"', '"+First_Name+"', '"+Last_Name+"', '"+Phone_Number+"', '"+Email+"', '"+Username+"', '"+ Password+"')");
            
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
