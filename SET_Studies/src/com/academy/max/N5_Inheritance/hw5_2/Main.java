//Develop abstract class Bird with attributes feathers and layEggs and an abstarct method fly().  Develop classes FlyingBird and NonFlyingBird. Create class Eagle, Swallow, Penguin and Chicken.
//        Create array Bird and add different birds to it.
//        Call fly() method for all
//        of it. Output the
//        information about
//        each type of
//        created bird

package com.academy.max.N5_Inheritance.hw5_2;

public class Main {

    public static void main(String[] args) {

        Employee[] ourEmployees = new Employee[5];

        ourEmployees[0] = new ContractedEmployee("Ivan", "001", "FTID2183718", 4500);
        ourEmployees[1] = new SalariedEmployee("Vasyl", "012", "SSN353562", 30.5, 125);
        ourEmployees[2] = new ContractedEmployee("Maria", "034", "FTID2164365", 5000);
        ourEmployees[3] = new SalariedEmployee("Petro", "009", "SSN664382", 45.5, 120);
        ourEmployees[4] = new ContractedEmployee("Svetlana", "014", "FTID6456646", 7550);


        // Print array of Employees unsorted
        System.out.println("All employees unsorted");
        printAllEmployees(ourEmployees);

        // Sort array of employees
        SortEmployeesBySalaryDesc(ourEmployees);

        // Print array of Employees sorted
        System.out.println("All employees sorted by average salary (descending)");
        printAllEmployees(ourEmployees);
    }

    private static void printAllEmployees(Employee[] ourEmployees) {
        for (int i = 0; i < ourEmployees.length; i++) {
            String template = "Employee ID: %s \t  Name: %s \t Average salary is: %f \t ";
            System.out.println(String.format(template, ourEmployees[i].getEmployeeId(), ourEmployees[i].getName(), ourEmployees[i].getAvgMonthlyWage()));
        }
        System.out.println();
    }

    private static void SortEmployeesBySalaryDesc(Employee[] ourEmployees) {
        Employee temp;
        for (int i = 0; i < ourEmployees.length - 1; i++) {
            for (int j = i + 1; j < ourEmployees.length; j++) {
                if (ourEmployees[j].getAvgMonthlyWage() > ourEmployees[i].getAvgMonthlyWage()) {
                    temp = ourEmployees[j];
                    ourEmployees[j] = ourEmployees[i];
                    ourEmployees[i] = temp;
                }
            }
        }
    }
}