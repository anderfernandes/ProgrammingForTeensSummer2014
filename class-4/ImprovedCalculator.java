import javax.swing.JOptionPane;

public class ImprovedCalculator {
	public static void main(String[] args) {
		
		startCalculator();		
	}
	
	public static void startCalculator(){
		// Variables that will hold the number used in the operations in each case statement
				String twoOrThree;
				int n1, n2, n3;
				
				boolean loop = true;
				
				while (loop) {
				
				// Step 1: Show a Dialog Box with options
				String option = JOptionPane.showInputDialog("Enter 1 for addition, 2 for subtraction, "
						+ "3 for multiplication and 4 for division. Enter 0 to exit.");
				
					// Step 2: Set up a "switch" for each option
					switch (option){
					
					// Step 2.1: Setup a case for addition
					case "1": twoOrThree = JOptionPane.showInputDialog(null, "Would you like to add 2 or 3 numbers?");
							  if (twoOrThree == "2") {
								  n1 = askForNumber();
								  n2 = askForNumber();
								  sum(n1, n2);
							  }
							  else {
								  n1 = askForNumber();
							  	  n2 = askForNumber();
							  	  n3 = askForNumber();
							  	  sum(n1, n2, n3);
							  }
							  break;
					
					// Step 2.2: Setup a case for subtraction
					case "2": n1 = askForNumber();
							  n2 = askForNumber();
							  
							  // Call subtract function
							  subtract(n1, n2);
							  break;
							  
					// Step 2.3: Setup a case for multiplication
					case "3": n1 = askForNumber();
					          n2 = askForNumber();
							  
					          // Call multiply function
							  multiply(n1, n2);
							  break;
					
					// Step 2.4: Setup a case for division
					case "4": n1 = askForNumber();
					          n2 = askForNumber();
			
					          // Call divide function
					          divide(n1, n2);
							  break;
							  
					case "0": loop = false;
							  break;
					
					default: JOptionPane.showMessageDialog(null, "Please enter a valid option.");
					}
				}
	}
	
	public static int askForNumber() {
		String stringNumber = JOptionPane.showInputDialog("Enter a number:");
		int number = Integer.parseInt(stringNumber);
		return number;
	}
	
	public static void sum(int n1, int n2) {

		// Calculate n1 + n2 and display result
		JOptionPane.showMessageDialog(null, n1 + " + " + n2 + " = " + (n1 + n2));
	}
	
	public static void sum(int n1, int n2, int n3){
		JOptionPane.showMessageDialog(null, n1 + " + " + n2 + " + " + n3 + " = " + (n1 + n2 + n3));
	}
	
	public static void subtract(int n1, int n2) {
		// Calculate n1 - n2 and display result
		JOptionPane.showMessageDialog(null, n1 + " - " + n2 + " = " + (n1 - n2));
	}
	
	public static void multiply(int n1, int n2){
		// Calculate n1 * n2 and display result
		JOptionPane.showMessageDialog(null, n1 + " * " + n2 + " = " + (n1 * n2));
	}
	
	public static void divide(int n1, int n2) {
		// Calculate n1 / n2 and display result
		JOptionPane.showMessageDialog(null, n1 + " / " + n2 + " = " + (n1 / n2));
	}
}