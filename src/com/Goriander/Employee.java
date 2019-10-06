package com.Goriander;

public class Employee {
    /**Class Employee should consists of
     * 	    three private fields: name, rate and hours;
     * 	    static field totalSum
     * 	    properties for access to these fields;
     * 	    default constructor, constructor with 2 parameters (name and rate) and constructor with 3 parameters;
     * methods:
     *       getSalary - to calculate the salary of person (rate * hours)
     *      toString - to output information about employee
     *      getBonuses – to calculate 10% from salary
     *
     */
    //Static
    public static double totalSum=0;

    //Private
    private String _name;
    private double _rate,_hours;

    //Set
    public void setName(String name) {_name=name;}
    public void setRate(int rate)
    {
        Employee.totalSum-=_rate*_hours;
        _rate=rate;
        Employee.totalSum+=rate*_hours;
    }
    public void setHours(int hours)
    {
        Employee.totalSum-=_rate*_hours;
        _hours=hours;
        Employee.totalSum+=_rate*hours;
    }

    //Get
    public String getName() {return _name;}
    public double getRate() {return _rate;}
    public double getHours() {return _hours;}

    //Constructors
    Employee()
    {
        _name="Undefined";
        _rate=0;
        _hours=0;
    }
    Employee(String name, double rate)
    {
        _name=name;
        _rate=rate;
        _hours=0;
    }
    Employee(String name, double rate, double hours)
    {
        _name=name;
        _rate=rate;
        _hours=hours;
        Employee.totalSum+=rate*hours;
    }

    @Override
    public String toString() {
        return "Employee[" +
                " Name=" + _name + ";" +
                " Rate=" + _rate +
                "; Hours=" + _hours +
                ']';
    }

    //Methods
    public double getSalary()
    {
        return _rate*_hours;
    }

    public double getBonuses()
    {
        return getSalary()/10;
    }
}
