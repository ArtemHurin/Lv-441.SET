package set.oop.inheritance.HW1;

import set.oop.inheritance.Animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee.add(new SalariedEmployee(9, 160.0, 12.0, "123"));
        listEmployee.add(new ContractEmployee(2, 1800.0, "123321"));
        listEmployee.add(new ContractEmployee(6, 2000.0, "987789"));
        listEmployee.add(new SalariedEmployee(1, 1200.0, 10.0, "456"));


        listEmployee.sort((Employee e1, Employee e2) -> e1.getEmployId() - e2.getEmployId());
        listEmployee.forEach(employee -> System.out.println(employee));
        listEmployee.sort(((Employee e1, Employee e2) -> (int) (e1.calculatePay() - e2.calculatePay())));///WHy cast to int??????
        listEmployee.forEach((employee -> System.out.println("Id "+employee.getEmployId()+" salary  = "+employee.calculatePay())));
    }
}
