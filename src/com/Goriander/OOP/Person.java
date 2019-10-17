package com.Goriander.OOP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Person {
    /**
     * Add class Person to the project.
     * Class Person should consists of
     * two private fields: name and birthYear (the birthday year)
     * properties for access to these fields
     * default constructor and constructor with 2 parameters
     * methods:
     * age - to calculate the age of person
     * input - to input information about person
     * output - to output information about person
     * changeName - to change the name of person
     * In the method main() create 5 objects of Person type and input information about them.
     */
    //Private
    private String _name;
    private int _birthYear;

    //Set
    public void setName(String name) {_name=name;}
    public void setBirthYear(int birthYear) {_birthYear=birthYear;}

    //Get
    public String getName() {return _name;}
    public int getBirthYear() {return _birthYear;}

    //Constructors
    Person()
    {
        _name="Undefined";
        _birthYear=2019;
    }
    Person(String name, int birthYear)
    {
        _name=name;
        _birthYear=birthYear;
    }

    @Override
    public String toString() {
        return "Person [" +
                " Name=" + _name + ";" +
                " BirthYear=" + _birthYear +
                " ]";
    }

    //Methods
    public int age()
    {
        return 2019-_birthYear;
    }
    public void input()
    {
        System.out.println("Write name:");
        _name=readString();

        System.out.println("Write birth year");
        _birthYear=readInt();
    }
    public void output()
    {
        System.out.println(this.toString());
    }
    public void changeName (String name)
    {
        _name=name;
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
