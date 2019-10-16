package set.oop.inheritance.HW1;

public abstract class Employee implements CalculatePay {
    int employId;

    Employee(int employId) {
        this.employId = employId;
    }

    public Employee() {
    }

    public int getEmployId() {
        return employId;
    }

    public void setEmployId(int employId) {
        this.employId = employId;
    }
}

