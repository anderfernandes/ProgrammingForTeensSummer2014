import javax.swing.JOptionPane;

public class Problem5 {
	public static void main(String[] args) {
		
		// Prompt the user for input
		String stringSubtotal = JOptionPane.showInputDialog(null, "Enter subtotal:", 
				"DisplayTime.java", JOptionPane.QUESTION_MESSAGE);
		// Parse subtotal
		double subtotal = Double.parseDouble(stringSubtotal);
		
		// Prompt the user for input
		String stringGratuityRate = JOptionPane.showInputDialog(null, "Enter % of gratutity:", 
				"DisplayTime.java", JOptionPane.QUESTION_MESSAGE);
		// Parse gratuity rate
		double gratuityRate = Double.parseDouble(stringGratuityRate);
		
		double total = subtotal + (subtotal * (gratuityRate/100));
		
		JOptionPane.showMessageDialog(null, "Your total is: $" + total);

	}
}
