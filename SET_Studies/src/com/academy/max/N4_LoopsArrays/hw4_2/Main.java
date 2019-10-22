//        Enter 10 integer numbers. Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.


package com.academy.max.N4_LoopsArrays.hw4_2;

import java.io.IOException;

import static com.academy.max.Helpers.createAndPopulateArrayOfInts;

public class Main {

    public static void main(String[] args) throws IOException {


        boolean doesArrayHasNegativeNumberInFirstFive = false;
        int sumOfFirstFive = 0;
        int productionOfLastFive = 1;
        final int AMOUNT_OF_NUMBERS_IN_ARRAY = 10;

        System.out.println("Please enter 10 integer numbers, one by one");
        System.out.println();

        int[] arrayOfInts = createAndPopulateArrayOfInts(AMOUNT_OF_NUMBERS_IN_ARRAY);

        for (int i = 0; i < 5; i++) {
            if (arrayOfInts[i] <= 0) {
                doesArrayHasNegativeNumberInFirstFive = true;
                break;
            } else {
                sumOfFirstFive += arrayOfInts[i];
            }
        }

        if (doesArrayHasNegativeNumberInFirstFive == true) {
            for (int i = 5; i < 10; i++) {
                productionOfLastFive *= arrayOfInts[i];
            }
            System.out.println("At least one of first five numbers was't positive");
            System.out.printf("The production of last five numbers is: %s", productionOfLastFive);
        } else {
            System.out.println("All first five numbers was positive");
            System.out.printf("Their total sum is: %s", sumOfFirstFive);
        }
    }


}

