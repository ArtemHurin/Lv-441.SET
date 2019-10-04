package com.company.Homework4.OOP.Task;

/**
 * Main class for Employee
 */
public class EmployeeMain {

    public static void main(String[] args) {
        /**
         * Instances of Employee
         */
        Employee[] employee = new Employee[3];
        employee[0] = new Employee();
        employee[0].setName("Ivan");
        employee[0].setRate(25.50);
        employee[0].setHours(95);
        employee[1] = new Employee("Petro", 18.30);
        employee[1].setHours(102);
        employee[2] = new Employee("Vasya", 30.80, 67);

        /**
         * print info about employees
         */
        for (int i = 0; i < employee.length; i++) {
            employee[i].print();
        }

        /**
         * print total salary
         */
        Employee.getTotalSum();
    }
}
