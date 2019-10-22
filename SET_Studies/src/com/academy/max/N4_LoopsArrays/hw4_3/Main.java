//        Enter 5 integer numbers. Find  position of second positive number; minimum and its position in the array.

package com.academy.max.N4_LoopsArrays.hw4_3;

import java.io.IOException;

import static com.academy.max.Helpers.inputIntNumber;

public class Main {

    public static void main(String[] args) throws IOException {


        int[] arrayOfInts = new int[5];

        int minimum;
        int minimumPosition;
        boolean wasFirstPositiveFound = false;

        System.out.println("Please enter 5 integer numbers, one by one");
        System.out.println();

        for (int i = 0; i < 5; i++) {
            arrayOfInts[i] = inputIntNumber();
        }

        int counter=0;
        for (int i = 0; i < arrayOfInts.length; i++) {
            if ((arrayOfInts[i] > 0) && (counter == 0)) {
                counter += 1;

            } else if ((arrayOfInts[i] > 0) && (counter == 1)) {
                System.out.println("The position of second positive number is: " + (i + 1));
                break;

            } else if (i == arrayOfInts.length -1) { //the last iteration
                System.out.println("There was no two positive numbers");
            }
        }

        findAndPrintMinimumIntFromArray(arrayOfInts);
    }

    private static void findAndPrintMinimumIntFromArray(int[] arrayOfInts) {
        int minimum = arrayOfInts[0];
        int minimumPosition = 0;

        for (int i = 1; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] < minimum) {
                minimum = arrayOfInts[i];
                minimumPosition = i;
            }
        }
        System.out.printf("The minimum number is: %d, it's position is: %d", minimum, (minimumPosition + 1));
    }
}
