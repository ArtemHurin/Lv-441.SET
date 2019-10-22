
//	// The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores.
//	Using regular expressions implement checking the user name for validity. Input five names in the main method .
//	Output a message to the console of the validation of each of the entered names.
//

package com.academy.max.N7_Regex.hw7_3_UserName_Verification;

public class Main {

	public static void main(String[] args) {

		Username[] usernames = new Username[5];
		usernames[0] = new Username("Li");
		usernames[1] = new Username("Taras_Shevchenko");
		usernames[2] = new Username("Ukrainka!");
		usernames[3] = new Username("Maksym1");
		usernames[4] = new Username("VeryVeryVeryLongName");
			
		for (int i=0; i<usernames.length; i++) {
			usernames[i].checkForValidity();
		}
			
	}

}
