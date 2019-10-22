package com.academy.max.Individual_HT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class Employee extends Person {

    static WageComparator wageComparator = new WageComparator();
    static EmploymentDateComparator employmentDateComparator = new EmploymentDateComparator();

    private String employmentDate;
    private double wage;
    private Date employmentDateInDateFormat;


    /* Constructors */

    public Employee(String taxNumber, String firstName, String lastName, String birthday, String employmentDate, double wage) throws ParseException {
        super(taxNumber, firstName, lastName, birthday);
        this.employmentDate = employmentDate;
        this.wage = wage;
        this.employmentDateInDateFormat = calculateDateInDateFormat(employmentDate);
    }

    public Employee(String firstName, String lastName, String birthday) throws ParseException {
        super(firstName, lastName, birthday);
    }

    public Employee() {
    }


    /* Getters and setters for fields specific to Employee class */

    public static WageComparator getWageComparator() {
        return wageComparator;
    }

    public static EmploymentDateComparator getEmploymentDateComparator() {
        return employmentDateComparator;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(String employmentDate) {
        this.employmentDate = employmentDate;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }



    /* Methods */

    /* Static method create an empty person of Employee type and uses input method to fill all fields */
    public static Employee createNewEmployee() throws IOException, ParseException {
        Employee newEmployee = new Employee();
        newEmployee.inputPersonData();
        return newEmployee;
    }


    public void inputPersonData() throws IOException, ParseException {

        super.inputPersonData();

        System.out.printf("Please enter employment date (dd-mm-yyyy) \n");
        this.employmentDate = Helpers.inputDate();

        System.out.printf("Please enter wage\n");
        this.wage = Helpers.inputWage();

        this.employmentDateInDateFormat = calculateDateInDateFormat(employmentDate);

        System.out.println("\nNew Employee created");
        output();
    }

    @Override
    public void output() {
        System.out.println(toString());
        System.out.println();
    }


    @Override
    public String toString() {

        String template = "Employee: %s %s \t  Born: %s    Age: %d    Tax Number: %s    Employment Date: %s    Wage: %f ";
        return (String.format(template, lastName, firstName, birthday, age, taxNumber, employmentDate, wage));
    }


    /* Comparators */

    private static class WageComparator implements Comparator<Employee> {
        public int compare(Employee employee1, Employee employee2) {
            return (int) (employee1.getWage() - employee2.getWage());
        }
    }

    private static class EmploymentDateComparator implements Comparator<Employee> {
        public int compare(Employee employee1, Employee employee2) {
            return employee1.getBirthdayInDateFormat().compareTo(employee2.getBirthdayInDateFormat());
        }
    }

}




