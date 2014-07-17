import javax.swing.JOptionPane;

public class Factorial {
	public static void main(String[] args) {
		
		int result = 0, temp = 0;
		
		// Prompt the user for input
		String stringNumber = JOptionPane.showInputDialog(null, "Enter a number to calculate factorial:", 
					"Factorial.java", JOptionPane.QUESTION_MESSAGE);
		// Parse number
		int number = Integer.parseInt(stringNumber);
	
		temp = number - 1;
		result = number * temp;
		
		if (number != 1){

			while (temp != 1) {
			temp--;
			result = result * temp;
			}
			JOptionPane.showMessageDialog(null, result);
		}
			
		else		
			JOptionPane.showMessageDialog(null, 1);
	}
}