//Write class Student that provides information about the name of the student and his course. Class Student should consists of
//        properties for access to these fields
//        constructor with parameters
//        method printStudents (List students, Integer course), which receives a list of students and the course number and prints to the console the names of the students from the list, which are taught in this course (use an iterator)
//        methods to compare students by name and by course

//        In the main() method
//        declare List students and add to the list five different students
//        display the list of students ordered by name
//        display the list of students ordered by course.

package com.academy.max.N6_GenericCollections.hw6_5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> ourStudents = new ArrayList<>();

        ourStudents.add (new Student("Yaroslav", "Pisotsky", 2));
        ourStudents.add (new Student("Vasyl", "Yavorsky", 1));
        ourStudents.add (new Student("Olha", "Omelchenko", 2));
        ourStudents.add (new Student("Svetlana", "Grusha", 3));
        ourStudents.add (new Student("Ivan", "Deresh", 1));


        ourStudents.sort(new NameComparator());
        for (Student st : ourStudents) {
            System.out.println(st);
        }

        System.out.println();


        ourStudents.sort(new CourseComparator());
        for (Student st : ourStudents) {
            System.out.println(st);
        }


    }

}
