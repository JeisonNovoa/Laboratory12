package Numbers;

import javax.swing.JOptionPane;

public class Numbers {
	int number;
	int i, negative=0, even=0;

	public void enterData() {
		// Method to enter numbers and count the even and negative numbers.
		for(i=0; i< 5; i++){
			number = enterNumber("Enter a number:");
			if(number %2==0) {
				even++;
				
			}
			if(number <0) {
				negative++;
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "The number of even numbers is: "+ even+ "\n"
				+ " and the number of negative numbers is "+ negative);
		// Display a popup window with the count of even and negative numbers.
	}

	public static int enterNumber(String message) {
		 // Method to enter data from a popup window.
		
		String input;
		int value;
		input = JOptionPane.showInputDialog(null, message);
		value = Integer.parseInt(input);
		
		return value;
		// Return the entered value converted to int.
	}
}