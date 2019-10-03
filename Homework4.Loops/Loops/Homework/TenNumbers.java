package edu.Lv441.Loops.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TenNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		boolean positive = true;
		int sum = 0;
		int product = 1;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter 10 integers");

		int[] integers = new int[10];

		for (int i = 0; i < integers.length; i++) {
			integers[i] = Integer.parseInt(br.readLine());
		}

		for (int i = 0; i < integers.length; i++) {
			if (integers[i] >= 0) {
				positive = true;
				continue;
			} else {
				positive = false;
				break;

			}
		}

		if (positive == true) {
			for (int i = 0; i < 5; i++) {
				sum += integers[i];
			}
			System.out.println("The sum of first 5 elements = " + sum);
		} else {
			for (int i = 5; i < integers.length; i++) {
				product *= integers[i];
			}
			System.out.println("The product of last 5 elements = " + product);
		}

	}

}
