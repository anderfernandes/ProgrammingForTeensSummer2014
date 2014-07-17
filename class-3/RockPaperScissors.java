import javax.swing.JOptionPane;

public class RockPaperScissors {
	public static void main(String[] args) {
		
		// Generate randomly 0 or 1
		int computer = (int)(Math.random() * 3);
		
		// Prompt the user for input
		String stringUser = JOptionPane.showInputDialog(null, "Enter 0 for scissors, 1 for rock and 2 for paper or anything else to exit:", 
				"DisplayTime.java", JOptionPane.QUESTION_MESSAGE);
		// Parse option
		int user = Integer.parseInt(stringUser);
		
		int count = 0;
		
		while (count < 5){
		
		// Computer Winning Conditions
		if ((computer == 0 && user == 2) || (computer == 1 && user == 0) || (computer == 2 && user == 1))
			JOptionPane.showMessageDialog(null, "The computer wins! " +  computer + " beats " + user + "!");
		
		// Player Winning Conditions
		else if ((user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1))
			JOptionPane.showMessageDialog(null, "You win! " +  user + " beats " + computer + "!");
		
		// If nobody wins, than it's a draw
		else
			JOptionPane.showMessageDialog(null, computer + " and " + user + " is a draw!");
		count++;
		}
	}
}
