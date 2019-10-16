package com.company.Homework2.src.edu.Lv441.Introduction.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HowAreYou {

	public static void main(String[] args) throws IOException {
		String answer;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How are you?");
		answer = br.readLine();
		System.out.println("Your are " + answer);

	}

}
