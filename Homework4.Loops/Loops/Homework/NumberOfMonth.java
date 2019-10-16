package com.company.Homework4.Loops.src.edu.Lv441.Loops.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfMonth {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int number;
		int[] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of the month");
		number = Integer.parseInt(br.readLine());

		for (int i = 0; i < month.length; i++) {
			if (number == i) {
				System.out.println("This month includes " + month[i - 1] + " days.");
			}
		}

	}

}
