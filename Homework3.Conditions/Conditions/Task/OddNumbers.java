package edu.Lv441.Conditions.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int firstNumber;
		int secondNumber;
		int thirdNumber;
		int countOdd = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input first number");
		firstNumber = Integer.parseInt(br.readLine());
		System.out.println("Input second number");
		secondNumber = Integer.parseInt(br.readLine());
		System.out.println("Input third number");
		thirdNumber = Integer.parseInt(br.readLine());

		if (firstNumber % 2 != 0) {
			countOdd++;
		}

		if (secondNumber % 2 != 0) {
			countOdd++;
		}

		if (thirdNumber % 2 != 0) {
			countOdd++;
		}

		System.out.println("Amount of odd numbers is " + countOdd + ".");
	}

}
