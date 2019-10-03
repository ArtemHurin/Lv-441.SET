package edu.Lv441.Conditions.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HttpErrorsMain implements HttpErrors {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Error error = null;
		int errorNumber;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of Http error");
		errorNumber = Integer.parseInt(br.readLine());

		switch (errorNumber) {
		case 400:
			error = Error.Bad_Request;
			break;
		case 401:
			error = Error.Unauthorized;
			break;
		case 402:
			error = Error.Payment_Required;
			break;
		case 403:
			error = Error.Forbidden;
			break;
		case 404:
			error = Error.Not_Found;
			break;
		case 405:
			error = Error.Method_Not_Allowed;
			break;
		case 406:
			error = Error.Not_Acceptable;
			break;
		default:
			System.out.println("Wrong number of error");

		}

		if (errorNumber >= 400 && errorNumber <= 406) {
			System.out.println(error);
		}

	}

}
