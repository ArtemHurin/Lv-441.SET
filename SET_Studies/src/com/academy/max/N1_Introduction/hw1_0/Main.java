package com.academy.max.N1_Introduction.hw1_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        int radiusFlower;
        double perimeterFlower;
        double areaFlower;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Radius of the flower");
        radiusFlower = Integer.parseInt(br.readLine());

        perimeterFlower = 2*3.14*radiusFlower;
        areaFlower = 3.14*(radiusFlower^2);
        System.out.println("Perimeter of the flower bed is: " + perimeterFlower);
        System.out.println("Area of the flower bed is: " + areaFlower);
    }
}

//    Create Java project.
//        Create console application. In method main() write code for solving next tasks:
//
//        Flower bed is shaped like a circle. Calculate the perimeter and area by entering the radius. Output obtained results.
