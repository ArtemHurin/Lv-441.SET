package com.academy.max;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Helpers {



    public static int inputIntNumber() throws IOException {

        //  System.out.println("Please enter number. Type 'exit' to quit.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int enteredNumber = 0;
        boolean isEnterenceCorrect = false;

        while (isEnterenceCorrect == false) {
            try {
                String enteredText = br.readLine();
                if (enteredText.toLowerCase().equals("exit")) {
                    System.exit(0);
                }

                enteredNumber = Integer.parseInt(enteredText);
                isEnterenceCorrect = true;

            } catch (Exception e) {
                System.out.println("Please enter int number, nothing else");
                System.out.println();
            }
        }
        return enteredNumber;
    }


    public static float inputFloatNumber() throws IOException {

        //  System.out.println("Please enter float number. Type 'exit' to quit.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float enteredNumber = 0;
        boolean isEnterenceCorrect = false;

        while (isEnterenceCorrect == false) {
            try {
                String enteredText = br.readLine();
                if (enteredText.toLowerCase().equals("exit")) {
                    System.exit(0);
                }

                enteredNumber = Float.parseFloat(enteredText);
                isEnterenceCorrect = true;

            } catch (Exception e) {
                System.out.println("Please enter float number, nothing else");
                System.out.println();
            }
        }
        return enteredNumber;
    }


    public static int[] createAndPopulateArrayOfInts(int amount) throws IOException {
        int[] arrayOfInts = new int[amount];
        for (int i = 0; i < amount; i++) {
            arrayOfInts[i] = inputIntNumber();
        }
        return arrayOfInts;
    }

    public static float[] createAndPopulateArrayOfFloats(int amount) throws IOException {
        float[] arrayOfFloats = new float[amount];
        for (int i = 0; i < amount; i++) {
            arrayOfFloats[i] = inputFloatNumber();
        }
        return arrayOfFloats;
    }

}

