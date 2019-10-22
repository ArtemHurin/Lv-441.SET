//        Create class Car with fields type, year of production and engine capacity. Create and initialize four instances
//        of class Car. Display cars:

//        - certain model year  (enter year in the console);
//        - ordered by the field year.

package com.academy.max.N4_LoopsArrays.hw4_5;
import org.testng.annotations.Test;

import java.io.IOException;
import static com.academy.max.Helpers.inputIntNumber;

public class Main {

    public Main() throws IOException {
    }

    public static void main(String[] args) throws IOException {

        Car[] cars = new Car[4];

        cars[0] = new Car("Porsche", 2015, 3.5);
        cars[1] = new Car("Ferrari", 2013, 4.4);
        cars[2] = new Car("Maybach", 2019, 2.5);
        cars[3] = new Car("Mercedes", 2013, 3.0);

        System.out.println("Printing all cars (unsorted): ");
        printAllCars(cars);
        System.out.println();

        System.out.println("Please enter the year of the cars you are interested in");
        int yearEntered = inputIntNumber();
        printSelectedCars(cars, yearEntered);

        sortCars(cars);
        System.out.println("Printing all cars (sorted): ");
        printAllCars(cars);

    }

    @Test
    private static void printAllCars(Car[] cars) {
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.println(cars[i]);
        }
    }

    private static void printSelectedCars(Car[] cars, int yearEntered) {
        System.out.println();
        System.out.println("Printing only cars from the entered year, if any: ");
        for (int i = 0; i < 4; i++) {
            if (cars[i].getYear() == yearEntered) {
                System.out.println(cars[i]);
            }
        }
    }

    private static void sortCars(Car[] cars) {
        Car tempCar;
        int length = cars.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < (length - 1 - i); j++) {
                if (cars[j].getYear() > cars[j + 1].getYear()) {
                    // swap cars[j+1] and cars[i]
                    tempCar = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = tempCar;
                }
            }
        }
    }
}


