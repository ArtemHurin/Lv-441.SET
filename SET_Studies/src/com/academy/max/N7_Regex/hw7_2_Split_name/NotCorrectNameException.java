package com.academy.max.N7_Regex.hw7_2_Split_name;
public class NotCorrectNameException extends Exception {
	public NotCorrectNameException(String arg0) {
		super(arg0);
		System.out.println("Three words are expected: surname, name and patronymic of a person ");
    }
}
