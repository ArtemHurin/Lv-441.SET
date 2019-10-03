package edu.Lv441.Loops.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int departmentNumber;
		Employee tmp;

		Employee[] employee = new Employee[5];
		employee[0] = new Employee("Petro", 1, 2000);
		employee[1] = new Employee("Ivan", 2, 2500);
		employee[2] = new Employee("Vasya", 2, 1500);
		employee[3] = new Employee("Oleg", 1, 3000);
		employee[4] = new Employee("Taras", 2, 2800);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of the department");
		departmentNumber = Integer.parseInt(br.readLine());

		for (int i = 0; i < employee.length; i++) {
			if (employee[i].getDepartment() == departmentNumber) {
				System.out.println(employee[i].getName());
			}
		}

		for (int i = 0; i < employee.length - 1; i++) {
			for (int j = i + 1; j < employee.length; j++) {
				if (employee[i].getSalary() > employee[j].getSalary()) {
					tmp = employee[i];
					employee[i] = employee[j];
					employee[j] = tmp;

				}
			}

		}

		for (int i = 0; i < employee.length; i++) {
			System.out.println(employee[i]);
		}

	}

}
