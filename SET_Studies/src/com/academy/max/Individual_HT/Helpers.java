package com.academy.max.Individual_HT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helpers {


    public static boolean answerYes() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String enteredText = "";
        boolean answer;
        boolean isEnterenceCorrect = false;

        while (isEnterenceCorrect == false) {
            enteredText = (br.readLine()).toLowerCase();
            Pattern p = Pattern.compile("yes|y|no|n");
            Matcher m = p.matcher(enteredText);
            if (!m.matches()) {
                System.out.println("\nPlease enter just yes or no");
                continue;
            } else {
                isEnterenceCorrect = true;
            }
        }
        switch (enteredText.toLowerCase()){
            case "yes" :
            case "y" : {
                return true;
                }
            case "no" :
            case "n" :
                return false;
        }
        return false;
    }


    public static int inputIntNumber() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int enteredNumber = 0;
        boolean isEnterenceCorrect = false;

        while (isEnterenceCorrect == false) {
            try {
                String enteredText = br.readLine();
                enteredNumber = Integer.parseInt(enteredText);
                isEnterenceCorrect = true;
            } catch (Exception e) {
                System.out.println("Please enter int number, nothing else");
                System.out.println();
            }
        }
        return enteredNumber;
    }


    public static float inputWage() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float enteredNumber = 0;
        boolean isEnterenceCorrect = false;

        while (isEnterenceCorrect == false) {
            try {
                String enteredText = br.readLine();
                enteredNumber = Float.parseFloat(enteredText);

                if ((enteredNumber <= 0) || (enteredNumber > 100000)) {
                    System.out.println("\nNOT Valid wage: " + enteredText);
                    continue;
                }
                isEnterenceCorrect = true;
            } catch (Exception e) {
                System.out.println("Please enter float number, nothing else");
                System.out.println();
            }
        }
        return enteredNumber;
    }


    public static String inputName() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String enteredText = "";
        boolean isEnterenceCorrect = false;

        while (isEnterenceCorrect == false) {
            enteredText = br.readLine();
            Pattern p = Pattern.compile("[A-Z]{1}[a-zA-Z]{1,15}");
            Matcher m = p.matcher(enteredText);
            if (!m.matches()) {
                System.out.println("\nNOT Valid Username: " + enteredText);
                continue;
            } else {
                isEnterenceCorrect = true;
            }
        }
        return enteredText;
    }


    public static String inputTaxNumber() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String enteredText = "";
        boolean isEnterenceCorrect = false;

        while (isEnterenceCorrect == false) {
            enteredText = br.readLine();
            Pattern p = Pattern.compile("^TN[0-9]{7}");
            Matcher m = p.matcher(enteredText);
            if (!m.matches()) {
                System.out.println("NOT Valid Tax number: " + enteredText);
                continue;
            } else {
                isEnterenceCorrect = true;
            }
        }
        return enteredText;
    }

    public static String inputDate() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String enteredDate = "";
        boolean isEnterenceCorrect = false;

        while (isEnterenceCorrect == false) {
            enteredDate = br.readLine();

            Pattern p = Pattern.compile("[0-9]{2}-[0-9]{2}-[0-9]{4}"); // format expected: dd-mm-yyyy
            Matcher m = p.matcher(enteredDate);

            if (!m.matches()) {
                System.out.println("\nNOT Valid birth date: " + enteredDate);
                continue;
            }

            String[] dateArray = enteredDate.split("-");
            int dd = Integer.parseInt(dateArray[0]);
            int mm = Integer.parseInt(dateArray[1]);
            int yyyy = Integer.parseInt(dateArray[2]);

            Calendar cal = Calendar.getInstance();
            int currentYear = cal.get(Calendar.YEAR);

            if ((dd <= 0) || (dd > 31) || (mm <= 0) || (mm > 12) || (yyyy <= 1935) || (yyyy > currentYear)) {
                System.out.println("\nNOT Valid birth date: " + enteredDate);
                continue;
            }
            isEnterenceCorrect = true;
        }
        return enteredDate;
    }

}


