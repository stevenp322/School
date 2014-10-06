/*Chapter 4 Challenge 2*/

import javax.swing.JOptionPane;
import java.util.Scanner;

public class MilePerHourDistance
{
   public static void main(String[] args){
   
   //Declare Variables
   String fast, hours;
   int speed, time, distance, total = 0;
   int number = 1, sequence = 0, traveled = 1;
   
   //Get input
   fast=JOptionPane.showInputDialog(null,"Enter, in miles-per-hour, the speed: ");
				speed = Integer.parseInt(fast);
   hours=JOptionPane.showInputDialog(null,"Enter the hours traveled: ");
				time = Integer.parseInt(hours);    
   
   System.out.println("Hour          Distance Traveled");
   System.out.println("-------------------------------");     
            
   while (number <= time){
   total = number + total;
   distance = speed*traveled;
   number++;
   sequence++;
   traveled++;
      
   System.out.println("  "+ sequence +"                  "+ distance);
   }
      }
      }