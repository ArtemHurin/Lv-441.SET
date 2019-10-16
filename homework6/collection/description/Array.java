package com.company.homework6.collection.description;

import java.util.ArrayList;

public class Array {

    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<String>();
        student.add("Natalya");
        student.add("Oleg");
        student.add("Roman");
        student.add("Vova");
        student.add("Artem");
        student.add(1, "Maksym");
        student.add("Oleg");

        System.out.println(student);

        System.out.println(student.size());

        student.add(4, "Vasya");

        student.add("Pupkin");

        System.out.println(student);

        student.remove("Vasya");

        student.remove(7);

        System.out.println(student);

        if (student.contains("Artem")) {
            System.out.println("true");
        }

        System.out.println(student.get(0));

        System.out.println(student.indexOf("Oleg"));

        System.out.println(student.lastIndexOf("Oleg"));

        System.out.println(student.isEmpty());

        student.ensureCapacity(20);

        System.out.println(student);

        student.set(2, "Vova");

        System.out.println(student);






    }
}
