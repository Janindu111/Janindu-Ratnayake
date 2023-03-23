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
public class Cregister {
    public int getregister(String ID, String First_Name, String Last_Name, String Phone_Number, String Email, String Username, String Password)
    {
        Madminregister ru= new Madminregister();
        int count= ru.adminregister(ID, First_Name, Last_Name, Phone_Number, Email, Username, Password);
        return count;
    }
}
