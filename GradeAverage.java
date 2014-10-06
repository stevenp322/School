/*Chapter 3 Challenge 4*/

import javax.swing.JOptionPane;

public class GradeAverage
{
		public static void main(String[] args)
		{
         //Declare Variables
         String gradeOne, gradeTwo, gradeThree;
         int grade1, grade2, grade3, gradeTotal, average;
         
         //Print prompts and get input
			gradeOne=JOptionPane.showInputDialog(null,"Enter your first grade: ");
				grade1 = Integer.parseInt(gradeOne);
			gradeTwo=JOptionPane.showInputDialog(null,"Enter your second grade: ");
				grade2 = Integer.parseInt(gradeTwo);
         gradeThree=JOptionPane.showInputDialog(null,"Enter your Third grade: ");
				grade3 = Integer.parseInt(gradeThree);   
            
         //Calculations
         gradeTotal = grade1 + grade2 + grade3;
         average = gradeTotal/3;
         
         //If Else to determine grade
         if (average<60)
            System.out.println("You got an F.");
         else if (average<70)
            System.out.println("You got a D.");
         else if (average<80)
            System.out.println ("You got a C.");
         else if (average<90)
            System.out.println ("You got a B.");
         else
            System.out.println ("You got an A.");         
      }
}