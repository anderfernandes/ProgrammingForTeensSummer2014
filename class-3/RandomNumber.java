import javax.swing.JOptionPane;

public class RandomNumber {
	public static void main(String[] args) {
		
		int number = (int)(Math.random() * 10);
		
		JOptionPane.showMessageDialog(null, number);

	}
}
