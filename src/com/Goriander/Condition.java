package com.Goriander;
/*
 * @author Goriander
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Condition {
    /*
     * Practical tasks
     * Task one:
     * Enter three numbers. Find out how many of them are odd.
     */
    public void practicalTaskOne ()
    {
        //define
        int[] threeNumbers = new int[3];

        //Data input
        System.out.println("Enter three numbers: ");
        for(int i=0;i<threeNumbers.length;i++)
        {
            threeNumbers[i]=readInt();
        }

        //Data processing and output
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

    /*
     * Practical task two:
     * Enter the number of the day of the week.
     * Display the name in three languages.
     */
    public void practicalTaskTwo()
    {
        //Define
        int day;

        //Data input
        System.out.println("Введіть назву дня: ");
        day=readInt();

        //Data processing and output
        switch(day)
        {
            case 1:
                System.out.println("Понеділок, Понедельник, Monday");
                break;
            case 2:
                System.out.println("Вівторок, Вторник, Tuesday");
                break;

            case 3:
                System.out.println("Середа, Среда, Wednesday");
                break;

            case 4:
                System.out.println("Четвер, Четверг, Thursday");
                break;

            case 5:
                System.out.println("П'ятниця, Пятница, Friday");
                break;

            case 6:
                System.out.println("Субота, Суббота, Saturday");
                break;

            case 7:
                System.out.println("Неділя, Воскресенье, Sunday");
                break;

            default:
                System.out.println("Wrong parameter, please try again");
                practicalTaskTwo();
        }
    }

    /*
     * Practical task three:
     * Enter the name of the country.
     * Print the name of the continent.
     * (Declare enum with names of continents)
     */
    public void practicalTaskThree()
    {
        //Define
        String country;
        String[][] Continents = new String[7][];
        Continents[0] = new String[] {"China","India","Pakistan"};
        Continents[1] = new String[] {"Egypt", "Congo"};
        Continents[2] = new String[] {"Ukraine","Poland","Germany"};
        Continents[3] = new String[] {"Australia"};
        Continents[4] = new String[] {"USA","Canada"};
        Continents[5] = new String[] {"Brasilia","Chili"};
        Continents[6] = new String[] {"Science station"};

        //Data input
        System.out.println("Write the country name: ");
        country = readString();

        //Data processing
        String finded="";
        ContinentName[] ContinentNames = ContinentName.values();
        for(int i=0;i<Continents.length && finded.equals("");i++)
        {
            for(int j=0;j<Continents[i].length && finded.equals("");j++)
            {
                if (country.equals(Continents[i][j]))
                {
                    finded=ContinentNames[i].toString();
                }
            }
        }

        //Data output
        if (!finded.equals(""))
        {
            System.out.printf("Your continent: %s",finded);
        }
        else
        {
            System.out.println("Unfortunately your country is not identified, please try again");
        }
    }


    public static void getProduct()
    {
        Product[] products = new Product[3];
        products[0] = new Product("Cheese",20,5);
        products[1] = new Product("Water",10,8);
        products[2] = new Product("Potato",2,4);

        int bestquantity=0;
        int mostprice=0;

        for(int i=1;i<3;i++)
        {
            if (products[i].getQuality()>products[bestquantity].getQuality())
            {
                bestquantity=i;
            }
            if (products[i].getPrice()>products[mostprice].getPrice())
            {
                mostprice=i;
            }
        }
        System.out.printf("Best quality: %s. Most price: %s",
                products[bestquantity].getName(),
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
    /*
     *Сreate class Dog with fields name, breed, age.
     * Declare enum for field breed.
     * Create 3 instances of type Dog.
     * Check if there is no two dogs with the same name.
     * Display the name and the kind of the oldest dog.
     */
    public static void taskThree()
    {
        Dog.Objects.add(new Dog("Barbos",BREED.LABLADOR,3));
        Dog.Objects.add(new Dog("Bima",BREED.PITBULL,4));
        Dog.Objects.add(new Dog("Reks",BREED.PUDEL,5));
        Dog.Objects.add(new Dog("Vasya",BREED.PUDEL,2));

        for (Dog i : Dog.Objects)
        {
            for (Dog j : Dog.Objects)
            {
                if((i.getBreed()==j.getBreed()) && (i.equals(j)==false))
                {
                    System.out.printf("Dog %s has same breed as dog %s \n",i.getName(),j.getName());
                }
            }
        }
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



