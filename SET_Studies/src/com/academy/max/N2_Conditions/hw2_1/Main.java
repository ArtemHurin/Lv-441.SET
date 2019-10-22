//     Enter three numbers. Find out how many of them are odd.

package com.academy.max.N2_Conditions.hw2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int counter = 0;

    public static void main(String[] args) throws IOException {

        final int NUMBER_OF_NUMBERS = 3;

        for (int i=0; i< NUMBER_OF_NUMBERS; i++) {
            inputNumberCountIfEven("Enter number " + i + " :");
        }

        System.out.println("The amount of even numbers is: " + counter);
    }


    private static void inputNumberCountIfEven(String s) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(s);

        int number = Integer.parseInt(br.readLine());

        if (number % 2 == 0) {
            counter += 1;
        }
    }
}


