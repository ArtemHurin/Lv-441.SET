package set.oop.inheritance.HW1;

public class ContractEmployee extends Employee implements CalculatePay {
    private double fixedSalary;
    private String federalTaxIdMember;

    public ContractEmployee(int employId, double fixedSalary, String federalTaxIdMember) {
        super(employId);
        this.fixedSalary = fixedSalary;
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override
    public double calculatePay() {
        return getFixedSalary();
    }


    @Override
    public String toString() {
        return "ContractEmployee{" +
                "fixedSalary=" + fixedSalary +
                ", federalTaxIdMember='" + federalTaxIdMember + '\'' +
                ", employId='" + employId + '\'' +
                '}';
    }
}
