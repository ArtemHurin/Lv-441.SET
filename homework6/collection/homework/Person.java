package com.company.homework6.collection.homework;

import java.util.*;

public class Person {
    public static void main(String[] args) {
        Map<String, String> mapPerson = new HashMap<>();
        mapPerson.put("Ivanov", "Ivan");
        mapPerson.put("Viktorenko", "Viktor");
        mapPerson.put("Oleksandriv", "Oleksandr");
        mapPerson.put("Artemiv", "Artem");
        mapPerson.put("Vasyliv", "Vasyl");
        mapPerson.put("Pupkin", "Vasyl");
        mapPerson.put("Tarasenko", "Taras");
        mapPerson.put("Petrov", "Petro");
        mapPerson.put("Sydorov", "Sydor");
        mapPerson.put("Orestov", "Orest");

        System.out.println(mapPerson);

        Set<String> set = new HashSet<String>();
        set.addAll(mapPerson.values());
        System.out.println("There are " + (mapPerson.size() - set.size()) + " same name");

        for (Iterator i = mapPerson.entrySet().iterator(); i.hasNext(); ) {
            Map.Entry entry = (Map.Entry) i.next();
            if (entry.getValue().equals("Orest")) {
                i.remove();
            }
        }

        System.out.println(mapPerson);
    }
}
