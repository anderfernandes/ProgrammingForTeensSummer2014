import javax.swing.JOptionPane;

public class Calculator {
	public static void main(String[] args) {
		
		// Variables that will hold the number used in the operations in each case statement
		String stringN1, stringN2;
		int n1, n2;
		
		// Step 1: Show a Dialog Box with options
		String option = JOptionPane.showInputDialog("Enter 1 for addition, 2 for subtraction, "
				+ "3 for multiplication and 4 for division.");
		
		// Step 2: Set up a "switch" for each option
		switch (option){
		
		// Step 2.1: Setup a case for addition
		case "1": stringN1 = JOptionPane.showInputDialog("Enter first number for addition:");
				  n1 = Integer.parseInt(stringN1);
				  
				  // Ask for a second number
				  stringN2 = JOptionPane.showInputDialog("Enter first number for addition:");
				  n2 = Integer.parseInt(stringN2);
				  
				  // Display showMessageDialog with the result calling the function
				  JOptionPane.showMessageDialog(null, n1 + "+" + n2 + " = " + sum(n1, n2));
				  break;
		
		// Step 2.2: Setup a case for subtraction
		case "2": stringN1 = JOptionPane.showInputDialog("Enter first number for subtraction:");
				  n1 = Integer.parseInt(stringN1);
				  
				  // Ask for a second number
				  stringN2 = JOptionPane.showInputDialog("Enter first number for subtraction:");
				  n2 = Integer.parseInt(stringN2);
				  
				  // Display showMessageDialog with the result calling the function
				  JOptionPane.showMessageDialog(null, n1 + "-" + n2 + " = " + subtract(n1, n2));
				  break;
				  
		// Step 2.3: Setup a case for multiplication
		case "3": stringN1 = JOptionPane.showInputDialog("Enter first number for multiplication:");
				  n1 = Integer.parseInt(stringN1);
				  
				  // Ask for a second number
				  stringN2 = JOptionPane.showInputDialog("Enter first number for multiplication:");
				  n2 = Integer.parseInt(stringN2);
				  
				  // Display showMessageDialog with the result calling the function
				  JOptionPane.showMessageDialog(null, n1 + "*" + n2 + " = " + multiply(n1, n2));
				  break;
		
		// Step 2.4: Setup a case for division
		case "4": stringN1 = JOptionPane.showInputDialog("Enter first number for division:");
				  n1 = Integer.parseInt(stringN1);
				  
				  // Ask for a second number
				  stringN2 = JOptionPane.showInputDialog("Enter first number for division:");
				  n2 = Integer.parseInt(stringN2);
				  
				  // Display showMessageDialog with the result calling the function
				  JOptionPane.showMessageDialog(null, n1 + "/" + n2 + " = " + divide(n1, n2));
				  break;
		default: JOptionPane.showMessageDialog(null, "Please enter a valid option.");
		}
		
	}
	
	public static int sum(int n1, int n2) {
		
		int sum = n1 + n2;
		// Return the sum of n1 and n2
		return sum;
	}
	
	public static int subtract(int n1, int n2) {
		int sub = n1 - n2;
		// Return the subtraction of n1 and n2
		return sub;
	}
	
	public static int multiply(int n1, int n2){
		int mul = n1 * n2;
		return mul;
	}
	
	public static int divide(int n1, int n2) {
		int div = n1 / n2;
		return div;
	}
}