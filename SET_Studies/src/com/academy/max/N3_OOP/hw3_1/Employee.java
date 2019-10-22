package com.academy.max.N3_OOP.hw3_1;

public class Employee {
    private String name;
    private double rate; // USD per hour
    private int hours;
    private static double totalSum = 0;
    private double salary = 0;
    private double bonus = 0;


    public Employee() {
    }

    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        this.salary = calculateSalary();
        this.bonus = calculateBonuses();
        totalSum += this.salary + this.bonus;
    }

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public double calculateSalary(){
        this.salary = rate * hours;
        return salary;
    }

    public double calculateBonuses(){
    this.bonus = salary*0.1;
        return bonus;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }


    public void setRate(float rate) {
        this.rate = rate;
        totalSum -= this.salary + this.bonus;
        // recalculating salary and bonus according to new Rate
        this.salary = calculateSalary();
        this.bonus = calculateBonuses();
        totalSum += this.salary + this.bonus;
    }

    public int getHours() {
        return hours;
    }


    public void setHours(int hours) {
        this.hours = hours;
        totalSum -= this.salary + this.bonus;
        // recalculating salary and bonus according to new hours
        this.salary = calculateSalary();
        this.bonus = calculateBonuses();
        totalSum += this.salary + this.bonus;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(float totalSum) {
        Employee.totalSum = totalSum;
    }
}
