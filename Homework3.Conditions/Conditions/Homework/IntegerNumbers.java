package com.company.Homework3.Conditions.src.edu.Lv441.Conditions.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntegerNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int number1;
		int number2;
		int number3;
		int maxNumber;
		int minNumber;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first number");
		number1 = Integer.parseInt(br.readLine());
		System.out.println("Enter second number");
		number2 = Integer.parseInt(br.readLine());
		System.out.println("Enter third number");
		number3 = Integer.parseInt(br.readLine());

		maxNumber = number1;

		if (maxNumber < number2) {
			maxNumber = number2;
		}

		if (maxNumber < number3) {
			maxNumber = number3;
		}

		minNumber = number1;

		if (minNumber > number2) {
			minNumber = number2;
		}

		if (minNumber > number3) {
			minNumber = number3;
		}

		System.out.println("Max number is " + maxNumber + ".");
		System.out.println("Min number is " + minNumber + ".");

	}

}
