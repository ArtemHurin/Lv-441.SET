package com.academy.max.N1_Introduction.hw1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        String name;
        String address;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("What's your name?");
        name = br.readLine();

        System.out.println("Where do you live, " + name + "?");
        address = br.readLine();

        System.out.println(name + "! You are living in: " + address);

    }
}

//    Create Java project.
//        Create console application. In method main() write code for solving next tasks:

//        2 Define String variables name and address. Output question "What is your name?" Read the value name and output
//        next question: “Where are you live, (name)?". Read address and write whole information.

