/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import Model.*;
/**
 *
 * @author LENOVO
 */
public class Cpanel {
    public int getsales(String Cus_ID, String Cus_Name, String Cus_Pn, String Cus_Total)
    {
     Mpanel pu= new Mpanel();
        int count= pu.customersales(Cus_ID, Cus_Name, Cus_Pn, Cus_Total);
        return count;
    }
}
