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
public class Cloging {
   public int getadmind(String username, String password)
   {
       Muserloging mlog= new Muserloging();
       int count =mlog.getadmin(username, password);
       return count;
   }
}
