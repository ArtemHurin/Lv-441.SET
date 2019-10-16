package com.company.homework7.string.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first String");
        String first = br.readLine();
        System.out.println("Enter second String");
        String second = br.readLine();

        if(second.contains(first)) {
            System.out.println(first + " is a substring of " + second);
        } else {
            System.out.println(first + " is NOT a substring of " + second);
        }

    }
}
