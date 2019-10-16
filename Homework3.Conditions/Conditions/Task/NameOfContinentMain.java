package com.company.Homework3.Conditions.src.edu.Lv441.Conditions.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameOfContinentMain implements NameOfContinent {

	public static void main(String[] args) throws IOException {

		Continent continent = null;
		String country;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the country");
		country = br.readLine();

		switch (country) {
		case "USA":
		case "Canada":
		case "Mexico":
			continent = Continent.SOUTH_AMERICA;
			break;
		case "Brazil":
		case "Argentina":
		case "Peru":
			continent = Continent.SOUTH_AMERICA;
			break;
		case "Ukrain":
		case "Germany":
		case "China":
			continent = Continent.EURASIA;
			break;
		case "Nigeria":
		case "Senegal":
		case "Zimbabwe":
			continent = Continent.AFRICA;
			break;
		case "Antarctica":
			continent = Continent.ANTARCTICA;
			break;
		case "Australia":
			continent = Continent.AUSTRALIA;
			break;
		default:
			System.out.println("Choose another country");

		}
		if (continent != null) {
			System.out.println(country + " is located in " + continent + " continent");
		}
	}

}
