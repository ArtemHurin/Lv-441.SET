package edu.Lv441.Introduction.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlowerBed {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double radius;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input value of radius");
		radius = Double.parseDouble(br.readLine());
		double perimeter = 2 * radius * Math.PI;
		double area = Math.PI * Math.pow(radius, 2);
		System.out.println("Perimeter of Flower bed is " + perimeter);
		System.out.println("Area of Flower bed is " + area);

	}

}
