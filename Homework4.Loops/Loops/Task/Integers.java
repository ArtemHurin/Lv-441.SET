package com.company.Homework4.Loops.src.edu.Lv441.Loops.Task;

public class Integers {

	public static void main(String[] args) {
		int[] integers = { -10, 5, 18, -25, 2, 58, -34, 25, 97, -17 };
		int max = integers[0];
		int sum = 0;
		int amountPos = 0;
		int amountNeg = 0;
		for (int i = 1; i < integers.length; i++) {
			if (integers[i] > max) {
				max = integers[i];
			}
		}

		for (int i = 0; i < integers.length; i++) {
			if (integers[i] > 0) {
				sum += integers[i];
				amountPos++;
			}
		}

		for (int i = 0; i < integers.length; i++) {
			if (integers[i] < 0) {
				amountNeg++;
			}
		}

		System.out.println("The bigest number is " + max + ".");
		System.out.println("The sum of positive numbers is " + sum + ".");
		System.out.println("The amount of negative numbers is " + amountNeg + ".");

		if (amountPos > amountNeg) {
			System.out.println("There are more positive numbers");
		} else if (amountPos == amountNeg) {
			System.out.println("Positive numbers equals negative numbers");
		} else {
			System.out.println("There are more negative numbers");
		}

	}

}
