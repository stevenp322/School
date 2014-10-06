/*Chapter 4 Challenge 1*/

import javax.swing.JOptionPane;
import java.util.Scanner;

public class SumOfNumber
{
   public static void main(String[] args){
   
   //Declare Variables
   int points, total = 0;
   int number = 0;
   String numberOne;
   
   
   Scanner keyboard = new Scanner(System.in);
   
   //Get input
   numberOne=JOptionPane.showInputDialog(null,"Enter a positive nonzero integer number: ");
				points = Integer.parseInt(numberOne);        
   
   while (number <= points){
   total = number + total;
   number++;
   
      
   }
   System.out.println("The total sum up to "+ points + " is: "+ total);
      }
      }