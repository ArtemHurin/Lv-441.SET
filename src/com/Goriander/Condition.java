package com.Goriander;
import java.util.Scanner;

public class Condition {
    public static void getOdd ()
    {
        Scanner input = new Scanner(System.in);
        int[] threeNumbers = new int[3];
        System.out.println("Enter three numbers: ");
        threeNumbers[0] = input.nextInt();
        threeNumbers[1] = input.nextInt();
        threeNumbers[2] = input.nextInt();

        for(int i=0;i<3;i++)
        {
            if (threeNumbers[i] % 2 > 0)
            {
                System.out.printf("\n %d is a odd",threeNumbers[i]);
            }
            else
            {
                System.out.printf("\n %d in not a odd",threeNumbers[i]);
            }
        }

    }
}
