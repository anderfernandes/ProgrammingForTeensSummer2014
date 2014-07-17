import javax.swing.JOptionPane;

public class DisplayTime {
	public static void main(String[] args) {
		
		// Prompt the user for input
		String data = JOptionPane.showInputDialog(null, "Enter the amount of seconds:", 
				"DisplayTime.java", JOptionPane.QUESTION_MESSAGE);
		
		int seconds = Integer.parseInt(data);
		int minutes = seconds / 60; // Find minutes in seconds
		int remainingSeconds = seconds % 60; // Seconds remaining
		JOptionPane.showMessageDialog(null, seconds + " seconds is " + minutes +
				" minutes and " + remainingSeconds + " seconds");

	}
}
