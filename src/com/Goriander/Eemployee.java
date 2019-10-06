package com.Goriander;

import java.util.ArrayList;

public class Eemployee {
    //static fields
    public static int maxSalary=0;
    public static ArrayList<Eemployee> Objects = new ArrayList<>();
    //Private fields
    private String _name;
    private int _departmentNumber;
    private int _salary;
    //Set
    public void setName(String name) { _name=name; }
    public void setDepartmentNumber(int departmentNumber) { _departmentNumber=departmentNumber; }
    public void setSalary(int salary) { _salary=salary; }
    //Get
    public String getName() { return _name; }
    public int getDepartment() { return _departmentNumber; }
    public int getSalary() { return _salary; }
    //Constructor
    Eemployee(String name, int departmentNumber, int salary)
    {
        this.setName(name);
        this.setDepartmentNumber(departmentNumber);
        this.setSalary(salary);
        Eemployee.Objects.add(this);
        if (salary>Eemployee.maxSalary)
        {
            Eemployee.maxSalary=salary;
        }
    }

    @Override
    public String toString() {
        return "Employee [" +
                "Name: '" + _name + "; " +
                "Department: " + _departmentNumber +
                ": Salary: " + _salary +
                "]";
    }
}
