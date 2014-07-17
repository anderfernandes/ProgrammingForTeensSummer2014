import javax.swing.JOptionPane;

public class FactorialWithFor {

   public static void main(String[] args) {
	   
	   // Prompt the user for input
	   String stringNumber = JOptionPane.showInputDialog(null, "Enter a number to calculate factorial:", 
						"Factorial.java", JOptionPane.QUESTION_MESSAGE);
	   // Parse number
	   int number = Integer.parseInt(stringNumber);
	   
       int result = 1;
       for (int i = 1; i <= number; i++) {
           result = result * i;
       }
       JOptionPane.showMessageDialog(null, "The factorial of " + number + " is " + result);
   }
}