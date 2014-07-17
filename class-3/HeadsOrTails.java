import javax.swing.JOptionPane;

public class HeadsOrTails {
	public static void main(String[] args) {
		
		// Generate randomly 0 or 1
		int coin = (int)(Math.random() * 2);
		
		// Prompt the user for input
		String stringOption = JOptionPane.showInputDialog(null, "Enter 0 for heads and 1 for tails:", 
				"DisplayTime.java", JOptionPane.QUESTION_MESSAGE);
		// Parse option
		int option = Integer.parseInt(stringOption);
		
		// If the the randomized seed equals what the user entered, then it's a match
		if (option == 1 && coin == 1)
			JOptionPane.showMessageDialog(null, " Tails and tails is a match!" );
		else if (option == 0 && coin == 0)
			JOptionPane.showMessageDialog(null, " Heads and heads is a match!" );
		// If it isn't, then it's not a match
		else if (option == 1 && coin == 0)
			JOptionPane.showMessageDialog(null, " Tails and heads is not a match!" );
		else
			JOptionPane.showMessageDialog(null, " Heads and tails is not a match!" );

	}
}
