//    Solve the next task:
//    read 3 float numbers and check: are they all belong to the range [-5,5];

package com.academy.max.N2_Conditions.hw2_5;
import java.io.IOException;

import static com.academy.max.Helpers.createAndPopulateArrayOfFloats;

public class Main {

    public static void main(String[] args) throws IOException {

        final int AMOUNT_OF_NUMBERS = 3;
        float arrayOfNumbers[] = createAndPopulateArrayOfFloats(AMOUNT_OF_NUMBERS);

        // check if numbers belong to range
        boolean positiveResult = true;
        for (int i = 0; i <= AMOUNT_OF_NUMBERS-1; i++) {
            if (arrayOfNumbers[i] < -5 || arrayOfNumbers[i] > 5) {
                System.out.println(arrayOfNumbers[i] + " is not in range from -5 to +5");
                positiveResult = false;
            }
        }

        if (!positiveResult) {
            System.out.println();
            System.out.println("Not all numbers are in range from -5 to 5");
        } else {
            System.out.println("Congratulation! All numbers are in range from -5 to 5");
        }

    }
}
