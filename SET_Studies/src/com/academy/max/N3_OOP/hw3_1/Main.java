//    Create Console Application project in Java.
//        Add class EmployeeEmployee to the project.
//        Class Employee should consists of
//        three private fields: name, rate and hours, static field totalSum
//        properties for access to these fields;
//default constructor, constructor with 2 parameters (name and rate) and constructor with 3 parameters;
//        methods:
//        getSalary - to calculate the salary of person (rate * hours)
//        toString - to output information about employee
//        getBonuses – to calculate 10% from salary
//        In the method main() create 3 objects of Employee type. Input information about them.
//        Display the total salary of all workers to screen

package com.academy.max.N3_OOP.hw3_1;

public class Main {

    public static void main(String[] args)  {

        Employee employee1 = new Employee ();
        employee1.setName("Ivanenko S.A.");
        employee1.setRate(4);
        employee1.setHours(30);

        Employee employee2 = new Employee("Petrenko R.D.", 5, 40);

        Employee employee3 = new Employee("Bozhenko D.A.",3);
        employee3.setHours(20);

        System.out.println("Salary of " + employee1 + " is " + employee1.calculateSalary() + " USD");
        System.out.println("Salary of " + employee2 + " is " + employee2.calculateSalary() + " USD");
        System.out.println("Salary of " + employee3 + " is " + employee3.calculateSalary() + " USD");

        System.out.println("The total salary of three employees is: " + Employee.getTotalSum() + " USD");
    }
}