import javax.swing.JOptionPane;

public class TesSwitch {
	public static void main(String[] args) {
	
		//char ch = 'z';
		
		// Prompt the user for input
		String stringSubtotal = JOptionPane.showInputDialog(null, "Enter a, b or c:", 
				"DisplayTime.java", JOptionPane.QUESTION_MESSAGE);
		// Parse subtotal
		String ch = stringSubtotal;
		
		switch (ch) {
		case "a": JOptionPane.showMessageDialog(null, ch); break;
		case "b": JOptionPane.showMessageDialog(null, ch); break;
		case "c": JOptionPane.showMessageDialog(null, ch); break;
		}
	}
}
