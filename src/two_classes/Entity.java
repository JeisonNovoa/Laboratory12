package two_classes;

import javax.swing.JOptionPane;

public class Entity {
private double sideA;
private double sideB;
public void enterData() {
	// Method to enter the sides of the rectangle.
	
	String input;
	// A popup window is displayed to enter the length of side A and it is converted to double.
	input = JOptionPane.showInputDialog(null, "Enter the length of side A:");
	sideA = Double.parseDouble(input);
	 
	// A popup window is displayed to enter the length of side B and it is converted to double.
	input = JOptionPane.showInputDialog(null, "Enter the length of side B:");
	sideB = Double.parseDouble(input);
}

public void calculateArea() {
	// Method to calculate the area of the rectangle.
	double result;
	result = sideA * sideB;
			
	JOptionPane.showMessageDialog(null, "The result is " + result);
	// Display a popup window with the result of the rectangle's area calculation.
}
}
