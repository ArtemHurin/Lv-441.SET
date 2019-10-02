package com.Goriander;

import java.util.ArrayList;

public class Employee {
    //static fields
    public static int maxSalary=0;
    public static ArrayList<Employee> Objects = new ArrayList<>();
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
    Employee(String name, int departmentNumber, int salary)
    {
        this.setName(name);
        this.setDepartmentNumber(departmentNumber);
        this.setSalary(salary);
        Employee.Objects.add(this);
        if (salary>Employee.maxSalary)
        {
            Employee.maxSalary=salary;
        }
    }
    //Methods
    public static String findDepartment(int depNumber)
    {
        for (Employee i : Objects)
        {
            if (i.getDepartment()==depNumber)
            {
                return i.getName();
            }
        }
        return "";
    }
}
