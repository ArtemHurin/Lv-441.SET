package com.company.Homework2.src.edu.Lv441.Introduction.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int a;
		int b;
		int sum;
		int diff;
		int mult;
		double dev;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input value of 'a'");
		a = Integer.parseInt(br.readLine());
		System.out.println("Input value of 'b'");
		b = Integer.parseInt(br.readLine());

		sum = a + b;
		diff = a - b;
		mult = a * b;
		dev = a / b;

		System.out.println("a + b = " + sum);
		System.out.println("a - b = " + diff);
		System.out.println("a * b = " + mult);
		System.out.println("a / b = " + dev);

	}

}
