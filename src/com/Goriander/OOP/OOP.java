package com.Goriander.OOP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OOP {

    /**
     * Add class Employee to the project.
     * Class Employee should consists of
     * 	    three private fields: name, rate and hours;
     * 	    static field totalSum
     * 	    properties for access to these fields;
     * 	    default constructor, constructor with 2 parameters (name and rate) and constructor with 3 parameters;
     * methods:
     *      getSalary - to calculate the salary of person (rate * hours)
     *      toString - to output information about employee
     *      getBonuses – to calculate 10% from salary
     * In the method main() create 3 objects of Employee type.
     * Input information about them.
     * Display the total salary of all workers to screen
     *
     */
    public void taskOne()
    {
        //Define
        Employee[] Emp = new Employee[5];
        Emp[0]= new Employee("Ivan",2,50);
        Emp[1]= new Employee("Petro",3,40);
        Emp[2]= new Employee("Vasil",2,80);
        Emp[3]= new Employee("Artem",5,60);
        Emp[4]= new Employee("Ira",3,50);

        //Data processing
        for(Employee i : Emp)
        {
            System.out.println(i.toString());
        }

        //Data output
        System.out.printf("Total salary of all workers: %.2f", Employee.totalSum);
    }

    /**
     * Add class Person to the project.
     * Class Person should consists of
     *  two private fields: name and birthYear (the birthday year)
     *  properties for access to these fields
     *  default constructor and constructor with 2 parameters
     * methods:
     *  age - to calculate the age of person
     *  input - to input information about person
     *  output - to output information about person
     *  changeName - to change the name of person
     * In the method main() create 5 objects of Person type and input information about them.
     */
    public void taskTwo()
    {
        //Define
        Person[] People = new Person[5];

        //Data input
        People[0] = new Person();
        People[0].changeName("Ivan");
        People[0].setBirthYear(1990);

        People[1] = new Person("Petro",1995);
        People[2] = new Person("Artur",1993);
        People[3] = new Person("Olya", 2000);

        People[4] = new Person();
        People[4].input();



        //Data output
        for(Person i : People)
        {
            i.output();
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
