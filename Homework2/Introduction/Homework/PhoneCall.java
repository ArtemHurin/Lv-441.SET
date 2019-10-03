package edu.Lv441.Introduction.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneCall {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double firstPricePerMinute;
		double secondPricePerMinute;
		double thirdPricePerMinute;

		double firstTimeCall;
		double secondTimeCall;
		double thirdTimeCall;

		double firstCallCost;
		double secondCallCost;
		double thirdCallCost;

		double totalCost;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input price of the first call");
		firstPricePerMinute = Double.parseDouble(br.readLine());
		System.out.println("Input price of the second call");
		secondPricePerMinute = Double.parseDouble(br.readLine());
		System.out.println("Input price of the third call");
		thirdPricePerMinute = Double.parseDouble(br.readLine());

		System.out.println("Input time of the first call");
		firstTimeCall = Double.parseDouble(br.readLine());
		System.out.println("Input time of the second call");
		secondTimeCall = Double.parseDouble(br.readLine());
		System.out.println("Input time of the third call");
		thirdTimeCall = Double.parseDouble(br.readLine());

		firstCallCost = firstPricePerMinute * firstTimeCall;
		secondCallCost = secondPricePerMinute * secondTimeCall;
		thirdCallCost = thirdPricePerMinute * thirdTimeCall;
		totalCost = firstCallCost + secondCallCost + thirdCallCost;

		System.out.println("Your first time call cost is " + firstCallCost + ".");
		System.out.println("Your second time call cost is " + secondCallCost + ".");
		System.out.println("Your third time call cost is " + thirdCallCost + ".");
		System.out.println("Your total cost is " + totalCost + ".");

	}

}
