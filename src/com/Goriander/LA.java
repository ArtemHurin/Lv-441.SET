package com.Goriander;

import java.util.Random;

/*
 * Loops, Arrays - homework
 */
public class LA {
    /*
     * Practical tasks
     * Task one: Create an array of ten integers. Display 
        the biggest of these numbers;
        the sum of positive numbers in the array;
        the amount of negative numbers in the array.
        What values there are more: negative or positive?
     */
    public static void taskOne()
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
}
