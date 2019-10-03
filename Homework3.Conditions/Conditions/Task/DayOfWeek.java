package edu.Lv441.Conditions.Task;

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
			System.out.println("Monday, Montag, Понеділок");
			break;
		case 2:
			System.out.println("Tuesday, Dienstag, Вівторок");
			break;
		case 3:
			System.out.println("Wednesday, Mittwoch, Середа");
			break;
		case 4:
			System.out.println("Thursday, Donnerstag, Четвер");
			break;
		case 5:
			System.out.println("Friday, Freitag, П'ятниця");
			break;
		case 6:
			System.out.println("Saturday, Samstag, Субота");
			break;
		case 7:
			System.out.println("Sunday, Sonntag, Неділя");
			break;
		default:
			System.out.println("Wrong number of the day of the week");
		}

	}

}
