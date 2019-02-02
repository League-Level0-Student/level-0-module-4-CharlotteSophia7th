package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nickels = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
		int hi = Integer.parseInt(nickels);
		// Ask the user how many dimes they have, and convert their answer
		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		// Ask the user how many quarters they have, and convert their answer
		int hii = Integer.parseInt(dimes);
		// Calculate how much money the user has and save it in a double variable
		double hiii = (double) (hi * 0.05 + hii * 0.1);
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, hiii);
	}
}
