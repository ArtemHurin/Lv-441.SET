package com.Goriander;
/*
 * @author Goriander
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.math.*;

public class Introduction {
    /*
     *  Practical task one:
     *  Define integer variables a and b. Read values a and b from Console and calculate:
     *  a + b
     *  a - b
     *  a * b
     *  a / b.
     *  Output obtained results.
     */
    public void practicalTaskOne ()
    {
        //Define
        int a,b;

        //Input processing
        System.out.println("Please enter the A: ");
        a=readInt();

        System.out.println("Please enter B: ");
        b=readInt();

        //Data processing
        int result1 = a + b;
        int result2 = a - b;
        int result3 = a * b;
        double result4 = (double)a / (double)b;

        //Data output
        System.out.printf("Result: a+b=%d; a-b=%d; a*b=%d; a/b=%f",result1,result2,result3,result4);
    }

    /*
     * Practical task two:
     * Output question “How are you?“. Define string variable answer.
     * Read the value answer and output: “You are (answer)".
     */
    public void practicalTaskTwo()
    {
        //Define
        String answer;

        //Data processing
        System.out.println("Haw are you?");
        answer=readString();

        //Data output
        System.out.printf("You are %s",answer);
    }

    /*
     * Homework tasks
     *
     * Task one:
     * Flower bed is shaped like a circle.
     * Calculate the perimeter and area by entering the radius.
     * Output obtained results.
     */
    public void homeworkTaskOne()
    {
        //Define
        double radius;

        //Input processing
        System.out.println("Write the flower bad radius:");
        radius=readDouble();

        //Data processing
        double perimeter = 2*Math.PI*radius;
        double area = Math.PI*(radius*radius);

        //Data output
        System.out.printf("Flower bad have: %f - perimeter and %f - area",perimeter,area);
    }

    /*
     * Homework task two:
     * Define String variables name and address.
     * Output question "What is your name?"
     * Read the value name and output next question: “Where are you live, (name)?".
     * Read address and write whole information.
     */
    public void homeworkTaskTwo()
    {
        //Define
        String name, address;

        //Input processing
        System.out.println("What is your name?");
        name=readString();

        System.out.printf("Where are you live, %s? \n",name);
        address=readString();

        //Data output
        System.out.printf("Your name: %s \nYour address: %s",name,address);
    }

    /*
     *Homework task three:
     * Phone calls from three different countries are с1, с2 and с3 standard units per minute.
     * Talks continued t1, t2 and t3 minutes.
     * How much computer will count for each call separately and all talk together?
     * Input all source data from console, make calculations and output to the screen.
     */
    public void homeworkTaskThree()
    {
        //Define
        double c1, c2, c3;
        double t1, t2, t3;

        //Input processing
        System.out.println("Input c1:");
        c1=readDouble();

        System.out.println("Input c2:");
        c2=readDouble();

        System.out.println("Input c3:");
        c3=readDouble();

        System.out.println("Input t1:");
        t1=readDouble();

        System.out.println("Input t2:");
        t2=readDouble();

        System.out.println("Input t3:");
        t3=readDouble();

        //Data processing
        double result1 = c1*t1;
        double result2 = c2*t2;
        double result3 = c3*t3;
        double resultTogether = result1+result2+result3;

        //Output
        System.out.printf("Result separately: %f; %f; %f; \n Result together: %f",
                          result1,result2,result3,resultTogether);
    }

    private String readString()
    {
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

    private int readInt()
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

    private double readDouble()
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
}
