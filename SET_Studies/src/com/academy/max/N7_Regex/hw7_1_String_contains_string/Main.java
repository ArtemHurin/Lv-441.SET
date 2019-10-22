//Enter the two variables of type String. Determine whether the first variable substring second.
//		For example, if you typed «IT» and «IT Academy» you must receive true.


package com.academy.max.N7_Regex.hw7_1_String_contains_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 1st string");
		String str1 = br.readLine();

		System.out.println("Enter 2nd string");
		String str2 = br.readLine();

		String result = (str2.contains(str1)) ? "Second string contains first" : "Second string doesn't contain first";
		System.out.println(result);

	}

}
