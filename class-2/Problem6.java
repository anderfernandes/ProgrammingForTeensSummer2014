import javax.swing.JOptionPane;

public class Problem6 {
	public static void main(String[] args) {
		
		// Prompt the user for input
		String stringNumber = JOptionPane.showInputDialog(null, "Enter a number between 0 and 1000:", 
				"DisplayTime.java", JOptionPane.QUESTION_MESSAGE);
		// Parse subtotal
		int number = Integer.parseInt(stringNumber);
		
		if (number < 0 )
			JOptionPane.showMessageDialog(null, "Please select a number greater than 0.");
		else 
		{
			int fourthDigit = number % 10;
			int thirdDigit = (number / 10) % 10;
			int secondDigit = number/ 100;
			int firstDigit = thirdDigit / 10;
			
			int sumOfDigits = firstDigit + secondDigit + thirdDigit + fourthDigit;
					
			JOptionPane.showMessageDialog(null, "The sum of the numbers is " + sumOfDigits);
		}
	}
}
