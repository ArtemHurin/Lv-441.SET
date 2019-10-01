package com.Goriander;
import java.util.Scanner;

public class Condition {
    /*
     *Praktical tasks
     */
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

    public static void getThreeDays()
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Введіть назву дня: ");
        String str = input.nextLine();

        switch(str)
        {
            case "Monday":
                System.out.println("Понеділок, Понедельник, Monday");
                break;

            case "Tuesday":
                System.out.println("bla bla");
                break;

            case "Wednesday":
                System.out.println("bla bla");
                break;

            case "Thursday":
                System.out.println("bla bla");
                break;

            case "Friday":
                System.out.println("bla bla");
                break;

            case "Saturday":
                System.out.println("bla bla");
                break;

            case "Sunday":
                System.out.println("bla bla");
                break;

            default:
                System.out.println("Ви ввели некоректне значення, попробуйте знову.");
                getThreeDays();
        }

    }

    public static void getContinent()
    {
        String[][] Continents = new String[7][];
        Continents[0] = new String[] {"China","India","Pakistan"};
        Continents[1] = new String[] {"Egypt", "Congo"};
        Continents[2] = new String[] {"Ukraine","Poland","Germany"};
        Continents[3] = new String[] {"Australia"};
        Continents[4] = new String[] {"USA","Canada"};
        Continents[5] = new String[] {"Brasilia","Chili"};
        Continents[6] = new String[] {"Science station"};

        Scanner input = new Scanner(System.in);
        System.out.println("Введіть назву країни: ");
        String str = input.next();


        boolean finded=false;
        ContinentName[] ContinentNames = ContinentName.values();
        for(int i=0;i<Continents.length && !finded;i++)
        {
            for(int j=0;j<Continents[i].length && !finded;j++)
            {
                if (str.equals(Continents[i][j]))
                {
                    System.out.println("Континент данної країни: "+ContinentNames[i]);
                    finded=true;
                }
            }
        }

        if (!finded)
        {
            System.out.println("Нажаль вашу країну не ідентифіковано, попробуйте ще раз");
        }
    }

    public static void getProduct()
    {
        Product[] products = new Product[3];
        products[0] = new Product("Cheese",20,5);
        products[1] = new Product("Water",10,8);
        products[2] = new Product("Potato",2,4);

        int bestquality=0;
        int mostprice=0;

        for(int i=1;i<3;i++)
        {
            if (products[i].getQuality()>products[bestquality].getQuality())
            {
                bestquality=i;
            }
            if (products[i].getPrice()>products[mostprice].getPrice())
            {
                mostprice=i;
            }
        }
        System.out.printf("Best quality: %s. Most price: %s",
                products[bestquality].getName(),
                products[mostprice].getName());
    }
    /*
     *Homework tasks
     */
    public static void taskOne()
    {
        Scanner in = new Scanner(System.in);
        int min=2147483647; //minimal integer value
        int max=-2147483648;
        int intTmp;
        double doubleTmp;

        System.out.println("Введіть три числа з плаваючою комою:");
        for(int i=0;i<3;i++)
        {
            doubleTmp = in.nextDouble();
            if ((doubleTmp>-5.0) && (doubleTmp<5.0))
            {
                System.out.println("Це число входить в проміжок [-5,5]");
            }
            else
            {
                System.out.println("Це число не входить в проміжок [-5,5]");
            }
        }
        System.out.println("Введіть три цілі числа:");
        for(int i=0;i<3;i++)
        {
            intTmp=in.nextInt();
            if (min>intTmp)
            {
                min=intTmp;
            }
            if (max<intTmp)
            {
                max=intTmp;
            }
        }
        System.out.printf("Максимальне число: %d, Мінімальне число: %d",max,min);
    }
    public static void taskTwo()
    {
        System.out.println("Введіть код HTTP помилки (400-405):");
        Scanner in = new Scanner(System.in);
        String str = "E"+in.next();
        errorHTTP errorDescription;
        errorDescription = errorHTTP.valueOf(str);
        str=errorDescription.get();
        System.out.println(str);
    }
}

enum ContinentName
{
    Asia,
    Africa,
    Europe,
    Australia,
    NorthAmerica,
    SouthAmerica,
    Antarctica
}

enum errorHTTP
{
    E400("Bad Request. The server did not understand the request."),
    E401("Unauthorized. The requested page needs a username and a password."),
    E402("Payment Required. You can not use this code yet."),
    E403("Forbidden. Access is forbidden to the requested page."),
    E404("Not Found. The server can not find the requested page."),
    E405("Method Not Allowed. The method specified in the request is not allowed.");

    private String _description;
    errorHTTP(String description)
    {
        this._description=description;
    }
    public String get()
    {
        return _description;
    }
}



