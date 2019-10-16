package com.company.homework5.inheritance.task;

public class Student extends Person {

    private final String TYPE_PERSON;

    public Student(String name) {
        super(name);
        TYPE_PERSON = "Student";
    }

    @Override
    public void print() {
        System.out.println("I am " + TYPE_PERSON);
    }
}
