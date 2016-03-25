/**
 *   File Name: FarewellMessage.java<br>
 *
 *   Nepton, Jean-francois<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 24, 2016
 *
 */

package com.sqa.jf.farewell;

import java.util.*;

/**
 * FarewellMessage //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 *
 */
public class FarewellMessage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Welcome the user
		System.out.println("Welcome to my Farewell Application!");
		// Ask the user for their name
		System.out.print("Could I have your name please:");
		// Create the Scanner Object to allow input from console
		Scanner scanner = new Scanner(System.in);
		// Collect their name in a local variable name of type String
		String name = scanner.nextLine();
		// Say Good bye to the user
		System.out.println("Thank you for using my simple application, " + name);
		// Wish them a great day
		System.out.println("Have a great day!");
	}
}
