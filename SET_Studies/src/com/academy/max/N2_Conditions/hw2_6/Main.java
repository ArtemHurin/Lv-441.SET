//    Solve the next tasks:
//    read 3 integer numbers and write max and min of them;

package com.academy.max.N2_Conditions.hw2_6;

import java.io.IOException;

import static com.academy.max.Helpers.inputIntNumber;

public class Main {

    private static final int NUMBER_OF_INTS = 4;

    public static void main(String[] args) throws IOException {

        int arrayOfInts[] = new int[NUMBER_OF_INTS];
        System.out.printf("Please enter %d 'int' numbers. Type Exit to quit", NUMBER_OF_INTS);
        System.out.println();

        // filling array of ints with ints using helper inputIntNumber
        for (int i = 0; i < arrayOfInts.length; i++) {
            System.out.printf("Enter number #%d: ", (i+1));
            arrayOfInts[i] = inputIntNumber();
        }

        // search for MAX and MIN
        int largestNumber = arrayOfInts[0];
        int smallestNumber = arrayOfInts[0];

        for (int i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] > largestNumber) {
                largestNumber = arrayOfInts[i];
            }
            if (arrayOfInts[i] < smallestNumber) {
                smallestNumber = arrayOfInts[i];
            }
        }

        System.out.println();
        System.out.println("RESULT:");
        System.out.printf("LargestNumber of all entered numbers is: \t %d", largestNumber);
        System.out.println();
        System.out.printf("SmallestNumber of all entered numbers is: \t %d", smallestNumber);
    }
}



