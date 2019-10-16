package com.company.HomeWork1.src.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloName {


    private String name;


    public void print() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input your name");

            name = br.readLine();

            System.out.println("Hello " + name + "!");
        } catch (IOException e) {
            System.out.println("Wrong format");
        }
    }


}
