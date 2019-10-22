package com.academy.max.N5_Inheritance.hw5_2;

public abstract class Employee implements IEmployee{
    private String name;
    private String employeeId;
    private double avgMonthlyWage;


    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }


    // Getters and setters are needed to access same methods in children class from Employee class    ////
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getAvgMonthlyWage() {
        return avgMonthlyWage;
    }

    public void setAvgMonthlyWage(double avgMonthlyWage) {
        this.avgMonthlyWage = avgMonthlyWage;
    }
}


