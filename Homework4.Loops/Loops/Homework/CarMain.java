package com.company.Homework4.Loops.src.edu.Lv441.Loops.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Car tmp;
		Car[] car = new Car[4];
		car[0] = new Car("BMW", 2018, 3.0);
		car[1] = new Car("Audi", 2019, 2.5);
		car[2] = new Car("Volga", 1980, 1.3);
		car[3] = new Car("Volvo", 2005, 1.5);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the year of production");

		int carYear = Integer.parseInt(br.readLine());
		for (int i = 0; i < car.length; i++) {
			if (carYear == car[i].getYear()) {
				System.out.println(car[i]);
			}
		}

		for (int i = 0; i < car.length - 1; i++) {
			for (int j = i + 1; j < car.length; j++) {
				if (car[i].getYear() > car[j].getYear()) {
					tmp = car[i];
					car[i] = car[j];
					car[j] = tmp;
				}
			}

		}
		for (int i = 0; i<car.length; i++) {
			System.out.println(car[i]);
		}
	}

}
