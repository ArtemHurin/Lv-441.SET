package com.company.Homework3.Conditions.src.edu.Lv441.Conditions.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfWeek {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int day;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of the day of the week");
		day = Integer.parseInt(br.readLine());

		switch (day) {
		case 1:
			System.out.println("Monday, Montag, ��������");
			break;
		case 2:
			System.out.println("Tuesday, Dienstag, ³������");
			break;
		case 3:
			System.out.println("Wednesday, Mittwoch, ������");
			break;
		case 4:
			System.out.println("Thursday, Donnerstag, ������");
			break;
		case 5:
			System.out.println("Friday, Freitag, �'������");
			break;
		case 6:
			System.out.println("Saturday, Samstag, ������");
			break;
		case 7:
			System.out.println("Sunday, Sonntag, �����");
			break;
		default:
			System.out.println("Wrong number of the day of the week");
		}

	}

}
