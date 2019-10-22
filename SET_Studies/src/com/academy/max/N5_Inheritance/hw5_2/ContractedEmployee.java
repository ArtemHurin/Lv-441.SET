package com.academy.max.N5_Inheritance.hw5_2;

public class ContractedEmployee extends Employee {

    private String federalTaxIdmember;
    private double fixedMonthlyPayment;

    private double avgMonthlyWage;

    public ContractedEmployee(String name, String employeeId, String federalTaxIdmember, double fixedMonthlyPayment) {
        super(name, employeeId);
        this.federalTaxIdmember = federalTaxIdmember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;

        this.avgMonthlyWage = calculatePay();
    }

    @Override
    public String toString() {
        return "ContractedEmployee - fixed paid worker. ";
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public double getAvgMonthlyWage() {
        return avgMonthlyWage;
    }
}
