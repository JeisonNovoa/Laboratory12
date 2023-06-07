/**

made by Jason Novoa
for Cristian Henao
Calculate area without methods
*/
package AreaWithoutMethods;

import javax.swing.JOptionPane;

public class Application {
/**
*
* @param args
*
*/
	public static void main(String args[]) {

		// Declaration of variables to store the input values and the calculation result.
		String input;
		double sideA;
		double sideB;
		double result;

		input = JOptionPane.showInputDialog(null, "Enter the length of side A:");
		sideA = Double.parseDouble(input);

		// A popup window is displayed asking for the data
		input = JOptionPane.showInputDialog(null, "Enter the length of side B:");
		sideB = Double.parseDouble(input);

		result = sideA * sideB;

		JOptionPane.showMessageDialog(null, "The result is: " + result);
		// Display the popup window with the result

	}
}
