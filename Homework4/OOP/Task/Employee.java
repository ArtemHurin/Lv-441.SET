/**
 * @author Artem Hurin
 * @version 1.0
 * @since 2019-10-03
 * Package for homework of OOP
 */


package com.company.Homework4.OOP.Task;

/**
 * Class Employee to add employees and count salary.
 */
public class Employee {

    /**
     * totalSum - to count salary of all employee.
     */
    private static double totalSum = 0;
    /**
     * name - name of employee.
     */
    private String name;
    /**
     * rate - how much employee earns per hour.
     */
    private double rate = 0;
    /**
     * hours - quantity of employee work hours.
     */
    private double hours = 0;
    /**
     * salary - employee salary per month.
     */
    private double salary = 0;
    /**
     * bonus - employee bonus per month.
     */
    private double bonus = 0;

    /**
     * default constructor.
     */
    public Employee() {
    }

    /**
     * constructor with 2 parameters that call constructor with 3 parameters
     */
    public Employee(String name, double rate) {
        this(name, rate, 0);
    }

    /**
     * constructor with 3 parameters
     * accounting salary, bonus, total salary.
     */
    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum -= this.salary + this.bonus;
        this.counting();
    }


    /**
     * getter for name.
     */
    public String getName() {
        return name;
    }

    /**
     * setter for name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter for rate.
     */
    public double getRate() {
        return rate;
    }

    /**
     * setter for rate
     * accounting salary, bonus, total salary.
     */
    public void setRate(double rate) {
        totalSum -= this.salary + this.bonus;
        this.rate = rate;
        this.counting();
    }

    /**
     * getter for hours.
     */
    public double getHours() {
        return hours;
    }

    /**
     * setter for hours
     * accounting salary, bonus, total salary.
     */
    public void setHours(double hours) {
        totalSum -= this.salary + this.bonus;
        this.hours = hours;
        this.counting();
    }

    /**
     * method that print total salary.
     */
    public static void getTotalSum() {
        System.out.printf("The total salary of all workers is %.2f", totalSum);
    }

    /**
     * method that call counting salary, bonus and total salary
     */
    private void counting() {
        this.salary = getEmployeeSalary();
        this.bonus = getEmployeeBonuses();
        totalSum += this.salary + this.bonus;
    }

    /**
     * method to count salary.
     */
    private double getEmployeeSalary() {
        return rate * hours;
    }

    /**
     * method to count bonus.
     */
    private double getEmployeeBonuses() {
        return salary * 0.1;
    }

    /**
     * method to print all employees.
     */
    public void print() {
        System.out.printf("Name = %s rate = %.2f hours = %.2f salary = %.2f bonus = %.2f%n",
                name, rate, hours, salary, bonus);
    }

    /**
     * overriding toString.
     */
    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", rate=" + rate
                + ", hours=" + hours + ", salary=" + salary + ", bonus="
                + bonus + '}';
    }
}
