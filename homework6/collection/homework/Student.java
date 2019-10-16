package com.company.homework6.collection.homework;

import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    public Student() {
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public void printStudents(List students, Integer course) {
        Iterator i = students.iterator();
        while (i.hasNext()) {
            Student student = (Student) i.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

}
