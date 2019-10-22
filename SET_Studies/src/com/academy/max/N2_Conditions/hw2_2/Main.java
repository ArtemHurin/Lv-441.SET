//    Enter the number of the day of the week. Display the name in three languages.

package com.academy.max.N2_Conditions.hw2_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        int dayNumber;
        Days theDay;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number of the day of the week");
        dayNumber = Integer.parseInt(br.readLine());

        switch (dayNumber){
            case 1:
                theDay = Days.FirstDay;
                break;
            case 2:
                theDay = Days.SecondDay;
                break;
            case 3:
                theDay = Days.ThirdDay;
                break;
            case 4:
                theDay = Days.FourthDay;
                break;
            case 5:
                theDay = Days.FifthDay;
                break;
            case 6:
                theDay = Days.SixDay;
                break;
            case 7:
                theDay = Days.SeventhDay;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + dayNumber);
        }

        System.out.println(theDay.getAllNames());

    }
}

//    2    Enter the number of the day of the week. Display the name in three languages.
