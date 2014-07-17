import java.util.Scanner;

public class ComputeArea {
	public static void main (String[] args) {
		
	// Create the Scanner object
	Scanner input = new Scanner(System.in);
	
	// Ask the user for the radius of the circle
	System.out.print("Enter the radius of your circle: ");
	
	// Step 1: Read in radius
	double radius = input.nextDouble();
	
	// Step 2: Compute Area
	double area = radius * radius * 3.14159;
	
	// Step 3: Display the area
	System.out.println("The area of a circle with radius " + radius + " is " + area + ".");
	}
}
