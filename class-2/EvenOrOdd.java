import javax.swing.JOptionPane;

public class EvenOrOdd {
	public static void main(String[] args) {
		
		// Prompt the user for input
		String stringNumber = JOptionPane.showInputDialog(null, "Please enter a number:", 
				"DisplayTime.java", JOptionPane.QUESTION_MESSAGE);
		// Parse subtotal
		double number = Double.parseDouble(stringNumber);
		
		if (number % 2 == 0)
			JOptionPane.showMessageDialog(null, number + " is even.");
		else
			JOptionPane.showMessageDialog(null, number + " is odd.");
	}
}
