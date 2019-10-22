package com.academy.max.N5_Inheritance.hw5_2;

public class SalariedEmployee extends Employee {

    private String socialSecurityNumber;
    private double hourlyRate;
    private double numberOfHoursWorked;

    private double avgMonthlyWage;


    public SalariedEmployee(String name, String employeeId, String socialSecurityNumber, double hourlyRate, double numberOfHoursWorked) {
        super (name, employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;

        this.avgMonthlyWage = calculatePay();

    }

    @Override
    public String toString() {
        return "SalariedEmployee - hourly paid worker. ";
    }

    @Override
    public double calculatePay() {
        return numberOfHoursWorked * hourlyRate;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(double numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public double getAvgMonthlyWage() {
        return avgMonthlyWage;
    }
}
