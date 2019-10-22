package com.academy.max.N1_Introduction.hw1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        int a;
        int b;
        String answer;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Type A");
        a = Integer.parseInt(br.readLine());

        System.out.println("Type B");
        b = Integer.parseInt(br.readLine());

        System.out.println("a + b = " + String.valueOf(a+b));
        System.out.println("a - b = " + String.valueOf(a-b));
        System.out.println("a * b = " + String.valueOf(a*b));
        System.out.println("a / b = " + String.valueOf(a/b));

        System.out.println("How are you?");
        answer = br.readLine();

        System.out.println("You are " + answer);
    }
}



//    Create Console Application project in Java.
//        In method main() write code for solving next tasks:
//      1  Define integer variables a and b. Read values a and b from Console and calculate:
//        a + b
//        a - b
//        a * b
//        a / b.
//        Output obtained results.
//      2  Output question “How are you?“. Define string variable answer. Read the value answer and output: “You are (answer)".