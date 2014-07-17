import javax.swing.JOptionPane;

public class Welcome {
	public static void main(String[] args) {
		// Display message Welcome to Java! on the console
		System.out.print("Welcome to Java!");
		System.out.print("Java is fun!");
		JOptionPane.showMessageDialog(null, "Welcome to Java!", 
				"Window Title", JOptionPane.INFORMATION_MESSAGE);
	}
}