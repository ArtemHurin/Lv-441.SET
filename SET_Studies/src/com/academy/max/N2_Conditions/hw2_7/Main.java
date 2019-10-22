//    Solve the next task:
//    read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)

package com.academy.max.N2_Conditions.hw2_7;

import java.io.IOException;

import static com.academy.max.Helpers.inputIntNumber;

public class Main {

    public static void main(String[] args) throws IOException {


        // User is requested to enter error numbers until 'exit' is typed
        do {
            System.out.println("Enter code of 4xx HTTP error to get its description. Type Exit to quit.");
            int number = inputIntNumber(); // method asks user to enter int number until it is int number. Exit to quit.

            try {
                HttpErrors httpError = HttpErrors.valueOf("E" + number); // creating Enum httpError E4xx out of int 4xx
                System.out.printf("HTTP httpError %d: %s", number, httpError.getErrorDescription()); // will fail in case HTTP error is not in ENUM
                System.out.println();
                System.out.println();
            } catch (IllegalArgumentException e) {
                System.out.println("The the error code you entered isn't an appropriate 4xx HTTP error");
                System.out.println();
            }

        }
        while (1 == 1); // User will go out of cycle by typing 'exit'
    }
}

