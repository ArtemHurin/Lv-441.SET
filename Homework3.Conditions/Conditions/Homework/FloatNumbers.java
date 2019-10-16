package com.company.Homework3.Conditions.src.edu.Lv441.Conditions.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FloatNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		float number1;
		float number2;
		float number3;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first number");
		number1 = Float.parseFloat(br.readLine());
		System.out.println("Enter second number");
		number2 = Float.parseFloat(br.readLine());
		System.out.println("Enter third number");
		number3 = Float.parseFloat(br.readLine());
		
		if ((number1 >= -5) && (number1 <= 5)) {
			System.out.println(number1 + " belongs to the range [-5,5]");
		} else {
			System.out.println(number1 + " doesn`t belong to the range [-5,5]");
		}
		
		if ((number2 >= -5) && (number2 <= 5)) {
			System.out.println(number2 + " belongs to the range [-5,5]");
		} else {
			System.out.println(number2 + " doesn`t belong to the range [-5,5]");
		}
		
		if ((number3 >= -5) && (number3 <= 5)) {
			System.out.println(number3 + " belongs to the range [-5,5]");
		} else {
			System.out.println(number3 + " doesn`t belong to the range [-5,5]");
		}

	}

}
