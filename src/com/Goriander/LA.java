package com.Goriander;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

/**
 * Loops, Arrays - homework
 */
public class LA {
    /**
     * Practical tasks
     * Task one: Create an array of ten integers.
     * Display 
     *  the biggest of these numbers;
     *  the sum of positive numbers in the array;
     *  the amount of negative numbers in the array.
     *  What values there are more: negative or positive?
     */
    public void taskOne()
    {
        //Create array
        int[] array = new int[10];
        //initialization random object and range
        Random random = new Random();
        int randomRange = 50;
        //Fill loop
        for(int i=0;i<array.length;i++)
        {
            array[i]=random.nextInt(randomRange*2)-randomRange; //range [-50,50]
        }
        //Search loop
        int biggest=-2147483648;
        int sumPositive=0;
        int amountPositive = 0;
        int amountNegative = 0;
        String more;
        for(int i=0;i<array.length;i++)
        {
            //check biggest
            if (biggest<array[i])
            {
                biggest=array[i];
            }
            //Check positive
            if (array[i]>=0)
            {
                sumPositive+=array[i];
                amountPositive+=1;
            }
            else //If number negative
            {
                amountNegative+=1;
            }
        }
        //Check what values more
        if (amountPositive>amountNegative)
        {
            more="Prositive";
        }
        else
        {
            more="Negative";
        }
        //Task output
        System.out.printf("The biggest number in array: %d \n" +
                          "Sum of positive numbers: %d \n" +
                          "Amount of negative numbers: %d \n" +
                          "In array more %s numbers.",
                          biggest,sumPositive,amountNegative,more );
    }

    /**
     * Task two:
     * Create a class Employee with fields name, department number, salary.
     * Create five objects of class Employee.
     * Display all employees of a certain department (enter department number in the console);
     * arrange workers by the field salary in descending order.
     */
    public void taskTwo()
    {
        //Declaration and initialization
        Eemployee e1 = new Eemployee("Petro", 1, 300);
        Eemployee e2 =new Eemployee("Ivan", 1, 600);
        Eemployee e3 =new Eemployee("Vova", 1, 300);
        Eemployee e4 =new Eemployee("Ira", 2, 700);
        Eemployee e5 =new Eemployee("Vasya", 2, 600);



        //Find department
        System.out.println("Enter the department number:");
        int needDep = readInt();
        boolean finded=false;
        for (Eemployee i : Eemployee.Objects)
        {
            if (i.getDepartment()==needDep)
            {
                System.out.printf("In this department work: %s \n",i.getName());
                finded=true;
            }
        }
        if (!finded)
        {
            System.out.println("No employee for this department index.");
        }

        //Max Salary
        System.out.printf("Max Salary: %d \n",Eemployee.maxSalary);

        //Sort
        Eemployee maxIndex;//=Employee.Objects.get(0);
        Eemployee tmp;
        for(int i=0; i<Eemployee.Objects.size() ;i++)
        {
            maxIndex=Eemployee.Objects.get(i);
            for(int j=i; j<Eemployee.Objects.size(); j++)
            {
                if (maxIndex.getSalary()<Eemployee.Objects.get(j).getSalary())
                {
                    maxIndex=Eemployee.Objects.get(j);
                    tmp=Eemployee.Objects.get(i);
                    Eemployee.Objects.set(i,maxIndex);
                    Eemployee.Objects.set(j,tmp);
                }
            }
        }

        //Print sorted
        System.out.println("Sorted employee list:");
        for (Eemployee emp : Eemployee.Objects)
        {
            System.out.println(emp.toString());
        }
    }

    /**
     * Homework task one:
     * Ask user to enter the number of month.
     * Read the value and write the amount of days in this month
     * (create array with amount days of each month).
     */
    public void homeworkTaskOne()
    {
        //Creating the month array
        int[] months = new int[12];
        boolean up = true;
        for(int i=0;i<12;i++)
        {
            if (up)
            {
                months[i] = 31;
                up = false;
            }
            else
            {
                months[i] = 30;
                up = true;
            }
            if (i==1) //February
            {
                months[i] = 28;
                up = true;
            }
        }

        //Enter the value and print the result
        System.out.println("Enter the month number");
        int monthsNum = readInt();

        if ((monthsNum>0)&&(monthsNum<13))
        {
            System.out.printf("In this month %d days",months[monthsNum-1]);
        }
        else
        {
            System.out.println("No such month");
        }
    }

    /**
     * Homework task two:
     * Enter 10 integer numbers.
     * Calculate the sum of first 5 elements if they are positive
     * or product of last 5 element in the other case.
     *
     */
    public void homeworkTaskTwo()
    {
        //Define
        int tmp;
        int sum=0;
        boolean task=true;

        //Data input
        System.out.println("Write 10 integers ");
        for(int i=0;i<10;i++)
        {
            tmp=readInt();
            if (task && i<5)  //first five positive
            {
                if (tmp>=0)
                {
                    sum+=tmp;
                }
                else         //entered negative
                {
                    task=false;
                    sum=0;
                }
            }
            else if (!task && i>=5)     //sum second five
            {
                sum+=tmp;
            }
        }

        //data output
        if (task)
        {
            System.out.printf("Sum first five: %d",sum);
        }
        else
        {
            System.out.printf("Sum second five: %d",sum);
        }

    }

    /**
     * Homework task three:
     * Enter 5 integer numbers. Find
     * position of second positive number;
     * minimum and its position in the array.
     */
    public void homeworkTaskThree()
    {
        //Define
        int[] array = new int[5];
        int min;
        int minPos=0;
        int positiveIndex=-1;
        boolean firstPos=false;

        //Data input
        System.out.println("Enter 5 integers");
        for(int i=0;i<array.length;i++)
        {
            array[i]=readInt();
        }

        //Data processing
        min=array[0];
        minPos=0;
        for(int i=0;i<array.length;i++)
        {
            //Find min
            if (min>array[i])
            {
                min=array[i];
                minPos=i;
            }
            //Find first positive
            if ((array[i]>=0)&&(firstPos)&&(positiveIndex==-1))
            {
                positiveIndex = i;
            }
            //Find second positive
            if ((array[i]>=0)&&(!firstPos))
            {
                firstPos=true;
            }
        }

        //Data output
        if ((firstPos)&&(positiveIndex>=0))
        {
            System.out.printf("The position of second positive number = %d \n",positiveIndex);
        }
        else
        {
            System.out.println("Array does not have second positive number");
        }

        System.out.printf("The minimum number is %d, on position %d",min,minPos);
    }



    //BufferedReader
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
