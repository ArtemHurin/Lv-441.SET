//Enter a sentence that contains the words between more than one space. Convert all spaces,
// consecutive, one. For example, if we introduce the sentence
// "I    am      learning     Java   Core», we have to get the "I'm learning Java Core»

package com.academy.max.N7_Regex.hw7_2_Split_name;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static String completeName;
	public static String lastName;
	public static String firstName;
	public static String patronomicName;

	public static void main(String[] args) throws IOException, NotCorrectNameException {
		String enteredName;

		System.out.println("Enter surname, name and patronymic of a person");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		enteredName = br.readLine();
		completeName = enteredName;
		System.out.println("You entered name: " + completeName);
		String[] array = completeName.split(" ");

		if (array.length != 3) {
			throw new NotCorrectNameException("");
		}

		lastName = array[0];
		firstName = array[1];
		patronomicName = array[2];

		printName();
	}


	public static void printName() {

		System.out.printf("Last name, initials: %s, %s.%s.\n", lastName, firstName.charAt(0), patronomicName.charAt(0));
		System.out.println("First name: " + firstName);
		System.out.printf("First name,  Patronomic name, Last name: %s %s, %s\n", firstName, patronomicName, lastName);

	}

}