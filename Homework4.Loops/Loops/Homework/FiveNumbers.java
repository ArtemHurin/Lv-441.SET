package edu.Lv441.Loops.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FiveNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int position = 0;

		int minPosition = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter 5 integers");

		int[] integers = new int[5];

		for (int i = 0; i < integers.length; i++) {
			integers[i] = Integer.parseInt(br.readLine());
		}

		for (int i = 0; i < integers.length; i++) {
			if (integers[i] >= 0) {
				position++;
			}
			if (position == 2) {
				System.out.println("The position of second positive number is " + (i + 1));
				break;
			}
		}

		int min = integers[0];

		for (int i = 1; i < integers.length; i++) {
			if (integers[i] < min) {
				min = integers[i];
				minPosition = i;
			}
		}

		System.out.println("The minimum number is " + min + " at " + (minPosition + 1) + " position.");

	}

}
