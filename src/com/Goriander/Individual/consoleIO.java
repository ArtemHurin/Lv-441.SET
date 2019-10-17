package com.Goriander.Individual;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface consoleIO {

     static String readString() {
        String result;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            try
            {
                var tmp = br.readLine();
                if  (tmp.equals(""))
                {
                    throw new Exception("Empty field");
                }
                else
                {
                    result=tmp;
                    return result;
                }
            }
            catch(Exception ex)
            {
                System.out.println("Wrong parameter please try again");
            }
        }
    }

    static int readInt()
    {
        int result;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true)
        {
            try
            {
                var tmp = br.readLine();
                result = Integer.parseInt(tmp);
                return result;
            }
            catch (Exception ex)
            {
                System.out.println("Wrong parameter, please try again");
            }
        }
    }

    static double readDouble()
    {
        double result;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true)
        {
            try
            {
                var tmp = br.readLine();
                result = Double.parseDouble(tmp);
                return result;
            }
            catch(Exception ex)
            {
                System.out.println("Wrong argument please try again.");
            }
        }
    }

    static LocalDate readDate() {
        LocalDate result;
        DateTimeFormatter dtFormat =  DateTimeFormatter.ofPattern("dd-mm-yyyy");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            try
            {
                var tmp = br.readLine();
                result = LocalDate.parse(tmp, dtFormat);
                return result;
            }
            catch(Exception DateTimeParseException)
            {
                System.out.println("Wrong parameter please try again");
            }
        }
    }

}
