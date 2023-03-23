/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.JFrame;

/**
 *
 * @author LENOVO
 */
public class Vpanel_Superclass {
    
    public double ChickenBurger;
    public double ChickenBurgerM;
    public double CheeseBurger;
    public double VegBurger;
    public double CheeseBurgerM;
    
    public double CocaCola;
    public double Sprite;
    public double VanilaMilkshake;
    public double ChocolateMilkshake;
    public double Coffee;
    
        
    
    public double Meals;
    public double Drinks;
    public double TotalofMD;
    
    public double AllTotalofMD;
    
        public double GetAmount()
        {
            Meals = ChickenBurger + CheeseBurgerM + ChickenBurgerM + VegBurger + CheeseBurger;
            Drinks = CocaCola + Sprite + VanilaMilkshake + ChocolateMilkshake + Coffee;
            TotalofMD = Meals + Drinks;
                    
            AllTotalofMD= Meals + Drinks;
            return AllTotalofMD;
        }
        
    public double pChickenBurger = 400.00;
    public double pChickenBurgerM = 800.00;
    public double pCheeseBurger = 380.00;
    public double pVegBurger = 350.00;
    public double pCheeseBurgerM = 750.00;
    
    public double pCocaCola = 180.00;
    public double pSprite = 180.00;
    public double pVanilaMilkshake = 250.00;
    public double pChocolateMilkshake = 270.00;
    public double pCoffee = 200.00;  
    
    
    public double mcTax = 0.50;
            public Double cFindTax(double cAmount)
            {
                double FindTax = cAmount -(cAmount * mcTax);
                return FindTax;
            }
}
