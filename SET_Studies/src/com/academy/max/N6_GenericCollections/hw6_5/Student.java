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

import java.util.Iterator;
import java.util.List;

public class Student {

    int course;
    private String firstName;
    private String lastName;


    public Student(String firstName, String lastName, int course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
    }

    public Student() {
    }

    /* Method prints students which fits some course*/

    public static void printStudents(List students, Integer course) {

        Student tmpStd = new Student();
        Iterator <Student> it = students.iterator();
        while (it.hasNext()) {
            tmpStd = it.next();
            if (tmpStd.getCourse() == course) {
                System.out.println(tmpStd.toString());
            }
        }


    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fn) {
        this.firstName = fn;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int c) {
        this.course = c;
    }

    @Override
    public String toString() {
        return "Student {" +
                "course = " + course + "  " +
                lastName + ' ' + firstName +
                " }";
    }
}


