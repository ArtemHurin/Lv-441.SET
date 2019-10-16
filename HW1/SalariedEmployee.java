package set.oop.inheritance.HW1;


public class SalariedEmployee extends Employee implements CalculatePay {
    private double hours;
    private double rate;
    private String socialSecurityNumber;

    public SalariedEmployee(int employId, double hours, double rate, String socialSecurityNumber) {
        super(employId);
        this.hours = hours;
        this.rate = rate;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return getHours() * getRate();
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "hours=" + hours +
                ", rate=" + rate +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", employId=" + employId +
                '}';
    }
}
