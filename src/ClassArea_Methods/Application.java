/**

made by Jason Novoa
for Cristian Henao
Calculate area without methods
*/
package ClassArea_Methods;

import javax.swing.JOptionPane;

public class Application {
	/**
	 * 
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sideA;
		double sideB;

		sideA = enterData("Enter the length of side A: ");
		sideB = enterData("Enter the length of side B: ");

		calculateArea(sideA, sideB);

	}

	/**
	 * 
	 * @param message
	 * @return value
	 * 
	 */
	public static double enterData(String message) {

		String input;
		double value;

		input = JOptionPane.showInputDialog(null, message);
		value = Double.parseDouble(input);

		return value;

	}

	/**
	 * 
	 * @param a
	 * @param b
	 * 
	 */
	public static void calculateArea(double a, double b) {

		double result;
		result = a * b;

		JOptionPane.showMessageDialog(null, "The result is " + result);

	}
}

