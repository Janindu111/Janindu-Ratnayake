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
public class Cleaveinfo {
     public int getleaveinfo( String casual_l, String anual_l, String medical_l, String year)
    {
        Mleaveinfo li= new Mleaveinfo();
        int count= li.adminleaveinfo(  casual_l, anual_l, medical_l, year);
        return count;
    }
}
