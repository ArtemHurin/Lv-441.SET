package com.company.homework5.inheritance.homework;

public class ContractEmployee extends Employee implements Pay {

    private String federalTaxIdmember;
    private double hourlyRate;
    private double hours;
    private double contractSalary;
    private double wage;

    public ContractEmployee(String employeeId, String name, String federalTaxIdmember, double hourlyRate, double hours) {
        super(employeeId, name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourlyRate = hourlyRate;
        this.hours = hours;
        this.wage = calculatePay();
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getContractSalary() {
        return contractSalary;
    }

    @Override
    public double getWage() {
        return wage;
    }

    @Override
    public double calculatePay() {
        this.contractSalary = hourlyRate * hours;
        return contractSalary;
    }
}
