package com.company.homework5.inheritance.homework;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee[] employee = new Employee[6];
        employee[0] = new SalariedEmployee("A111", "Ivan", "111111",
                2000);
        employee[1] = new SalariedEmployee("A222", "Stepan", "222222",
                3500);
        employee[2] = new SalariedEmployee("A333", "Vasyl", "333333",
                1200);
        employee[3] = new ContractEmployee("A444", "Oleg", "4444444444",
                15.5, 160);
        employee[4] = new ContractEmployee("A555", "Taras", "5555555555",
                28.4, 195);
        employee[5] = new ContractEmployee("A666", "Vova", "6666666666",
                11.5, 170);


        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i] + " salary is " + employee[i].getWage());
        }

        Employee tmp;

        for (int i = 0; i < employee.length - 1; i++) {
            for (int j = i + 1; j < employee.length; j++) {
                if (employee[i].getWage() < employee[j].getWage()) {
                    tmp = employee[i];
                    employee[i] = employee[j];
                    employee[j] = tmp;
                }
            }

        }

        System.out.println("Sorted");

        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i] + " salary is " + employee[i].getWage());
        }


    }
}
