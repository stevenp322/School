/*Chapter 3 Challenge 8*/

import javax.swing.JOptionPane;

public class QuantityPriceTool
{
		public static void main(String[] args)
		{
         //Declare Variables
         String quantityS;
         int quantity;
         int packagePrice=99;
         double dis20, dis30, dis40, dis50, total20, total30, total40, total50;
         double per20=.2;
         double per30=.3;
         double per40=.4;
         double per50=.5;
         
         //Print prompts and get input
         System.out.println("You have purchased the $"+ packagePrice +" package.");
         System.out.println();
			quantityS=JOptionPane.showInputDialog(null,"Enter the quantity of your order: ");
				quantity = Integer.parseInt(quantityS);  
            
         //Calculations       
         dis20=packagePrice*per20;
         dis30=packagePrice*per30;
         dis40=packagePrice*per40;
         dis50=packagePrice*per50;
         
         total20=packagePrice - dis20;
         total30=packagePrice - dis30;
         total40=packagePrice - dis40;
         total50=packagePrice - dis50;
         
         //If Else to determine grade
         if (9<quantity && quantity<20)
            System.out.println("Your discount is $"+ dis20 +". and your total price is $"+ total20 +".");
         else if (19<quantity && quantity<50)
            System.out.println("Your discount is $"+ dis30 +". and your total price is $"+ total30 +".");
         else if (49<quantity && quantity<100)
            System.out.println ("Your discount is $"+ dis40 +". and your total price is $"+ total40 +".");
         else if (99<quantity)
            System.out.println ("Your discount is $"+ dis50 +". and your total price is $"+ total50 +".");
         else 
            System.out.println ("You do not recieve a discount. Your price is $"+ packagePrice +".");            
      }
}