//        Organize entering integers until the first negative number. Count the product of all entered even numbers.

package com.academy.max.N4_LoopsArrays.hw4_4;

import java.io.IOException;

import static com.academy.max.Helpers.inputIntNumber;

public class Main {

    public static void main(String[] args) throws IOException {

        int enteredNumber;
        int product = 1;
        boolean noPositives = true;
        boolean noPositiveEven = true;
        boolean wasFirstNegativeFound = false;

        System.out.println("Please enter zero or positive integer numbers, one by one, finish with negative number");
        System.out.println();

        while (wasFirstNegativeFound == false) {

            enteredNumber = inputIntNumber();
            if (enteredNumber >= 0) {
                noPositives = false; // put a flag that at least one positive number was entered
            }

            if (enteredNumber >= 0 && enteredNumber % 2 == 0) {
                product *= enteredNumber;
                noPositiveEven = false;     // put a flag that at least one even positive number was entered
            } else if (enteredNumber < 0 && noPositives) {   //handle situation of first negative number entered
                System.out.println("There was no positive numbers at all. So there is no product of even positive numbers.");
                break;
            } else if (enteredNumber < 0 && noPositiveEven) {   //handle situation when no even positive numbers entered
                System.out.println("There were positive numbers. But none of them was even. So there is no product of even positive numbers.");
                break;
            } else if (enteredNumber < 0) {     // handle situation when even positive numbers were entered so product is possible
                System.out.printf("The product of odd positive numbers is %d", product);
                break;
            }
        }
    }
}
