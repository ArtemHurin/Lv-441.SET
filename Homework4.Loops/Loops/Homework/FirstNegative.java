package edu.Lv441.Loops.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstNegative {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter number");

		int number = Integer.parseInt(br.readLine());
		int product = number;

		while (number >= 0) {
			System.out.println("Enter number");
			number = Integer.parseInt(br.readLine());
			product *= number;
		}

		System.out.println("The product of entered numbers is " + product);

	}

}
