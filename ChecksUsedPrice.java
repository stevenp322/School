/*Chapter 3 Challenge 15*/

import javax.swing.JOptionPane;

public class ChecksUsedPrice
{
		public static void main(String[] args)
		{
         //Declare Variables
         String checkSt;
         int checks;
         double checkA, checkB, checkC, checkD, totalA, totalB, totalC, totalD;

         //Print prompts and get input
			checkSt=JOptionPane.showInputDialog(null,"Enter the amount of checks you used: ");
				checks = Integer.parseInt(checkSt);
            
         //Outputs
         if (checks<21){
            checkA = checks*.10;
            totalA = checkA+10;
            System.out.println("Your Service fee is $" + totalA + "!");
         }
         else if (checks<40){
            checkB = checks*.08;
            totalB = checkB+10;
            System.out.println("Your Service fee is $" + totalB + "!");
         }
         else if (checks<60){
            checkC = checks*.06;
            totalC = checkC+10;
            System.out.println("Your Service fee is $" + totalC + "!");
         }
         else {
            checkD = checks*.04;
            totalD = checkD+10;
            System.out.println("Your Service fee is $" + totalD + "!");
         }

      }
}