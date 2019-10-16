package com.company.homework6.collection.homework;

import java.util.LinkedList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {

        List<Student> students = new LinkedList<Student>();
        students.add(new Student("Ivan", 1));
        students.add(new Student("Vasya", 2));
        students.add(new Student("Petro", 1));
        students.add(new Student("Taras", 3));
        students.add(new Student("Sava", 2));

        Student student = new Student();
        student.printStudents(students, 2);

        students.sort(new NameComparator());
        System.out.println(students);

        students.sort(new CourseComparator());
        System.out.println(students);

    }
}
