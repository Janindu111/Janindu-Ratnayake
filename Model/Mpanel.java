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
public class Mpanel {
    public int customersales(String Cus_ID, String Cus_Name, String Cus_Pn, String Cus_Total)
    {
    int count =0;
        try
        {
            Statement st = rstadmindb.createconnection().createStatement();
            count = st.executeUpdate("INSERT INTO `rst_customer` (`Cus_ID`, `Cus_Name`, `Cus_Pn`, `Cus_Total`) VALUES ('"+Cus_ID+"', '"+Cus_Name+"', '"+Cus_Pn+"', '"+Cus_Total+"')");
            
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
        catch(SQLException c)
                {
                    JOptionPane.showMessageDialog(null, c);
                }
        return count;
    }
}
