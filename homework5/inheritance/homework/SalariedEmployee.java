package com.company.homework5.inheritance.homework;

public class SalariedEmployee extends Employee implements Pay {

    private String socialSecurityNumber;
    private double monthlyPayment;
    private double salariedSalary;
    private double wage;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double monthlyPayment) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.monthlyPayment = monthlyPayment;
        this.wage = calculatePay();
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public double getSalariedSalary() {
        return salariedSalary;
    }

    @Override
    public double getWage() {
        return wage;
    }

    @Override
    public double calculatePay() {
        this.salariedSalary = monthlyPayment;
        return salariedSalary;
    }
}
