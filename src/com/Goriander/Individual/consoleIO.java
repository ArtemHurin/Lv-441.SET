package com.Goriander.Individual;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;

public interface consoleIO {

     default String readString() {
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

    default int readInt()
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

    default double readDouble()
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

    default LocalDate readDate() {
        LocalDate result;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            try
            {
                var tmp = br.readLine();
                result = LocalDate.parse(tmp);
                return result;
            }
            catch(Exception DateTimeParseException)
            {
                System.out.println("Wrong parameter please try again");
            }
        }
    }

}
