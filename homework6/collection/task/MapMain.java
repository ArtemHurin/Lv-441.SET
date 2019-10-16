package com.company.homework6.collection.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) throws IOException {

        Map<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(1, "Natalya");
        employeeMap.put(2, "Vova");
        employeeMap.put(3, "Oleg");
        employeeMap.put(4, "Roman");
        employeeMap.put(5, "Maksym");
        employeeMap.put(6, "Oleg");
        employeeMap.put(7, "Artem");

        System.out.println(employeeMap);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter ID, please");

        int id = Integer.parseInt(br.readLine());

        //System.out.println(employeeMap.getOrDefault(id, "Error ID"));

        if (employeeMap.containsKey(id)) {
            System.out.println(employeeMap.get(id));
        } else {
            System.out.println("Error ID");
        }

        System.out.println("Enter name, please");

        String name = br.readLine();

        if (employeeMap.containsValue(name)) {
            for (Iterator i = employeeMap.entrySet().iterator(); i.hasNext(); ) {
                Map.Entry entry = (Map.Entry) i.next();
                if (entry.getValue().equals(name)) {
                    System.out.println("Key of " + entry.getValue() + " is " + entry.getKey());
                }
//                if (!i.hasNext()) {
//                    System.out.println("Error name");
//                }
            }
        } else {
            System.out.println("There are no such name");
        }
    }
}


