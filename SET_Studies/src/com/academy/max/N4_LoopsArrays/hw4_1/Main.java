//    Ask user to enter the number of month. Read the value and write the amount of days in this month (create array with amount days of each month).

package com.academy.max.N4_LoopsArrays.hw4_1;

import java.io.IOException;

import static com.academy.max.Helpers.inputIntNumber;

public class Main {

    public static void main(String[] args) throws IOException {

        final Object[][] monthDays = {
                {"January", 31},
                {"February", 28},
                {"March", 31},
                {"April", 30},
                {"May", 31},
                {"June", 30},
                {"July", 31},
                {"August", 31},
                {"September", 30},
                {"October", 31},
                {"November", 30},
                {"December", 31}};



        System.out.println("Please enter number of the month, from 1 to 12");
        System.out.println();

        int inputMonth = inputCorrectNumberOfMonth();

        String selectedMonthName = (monthDays[inputMonth - 1][0]).toString();
        int selectedMonthNumberOfDays = Integer.parseInt((monthDays[inputMonth - 1][1]).toString());
        System.out.printf("The month you have chosen is %s and it has %d days", selectedMonthName, selectedMonthNumberOfDays);
    }


    private static int inputCorrectNumberOfMonth() throws IOException {
        boolean isCorrectedMonthNumber = false;
        int inputMonth = 0;
        while (!isCorrectedMonthNumber) {
            inputMonth = inputIntNumber();
            if (inputMonth >= 1 && inputMonth <= 12) {
                break;
            } else {
                System.out.println("Please enter number of the month, from 1 to 12");
                System.out.println();
            }
        }
        return inputMonth;
    }
}

//        Organize entering integers until the first negative number. Count the product of all entered even numbers.

//        Create class Car with fields type, year of production and engine capacity. Create and initialize four instances of class Car. Display cars
//        certain model year  (enter year in the console);
//        ordered by the field year.
