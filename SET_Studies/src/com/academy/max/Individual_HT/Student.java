package com.academy.max.Individual_HT;

import java.io.IOException;
import java.text.ParseException;

public class Student extends Person {

    /* Constructors */

    public Student(String taxNumber, String firstName, String lastName, String birthday) throws ParseException {
        super(taxNumber, firstName, lastName, birthday);
    }

    public Student(String firstName, String lastName, String birthday) throws ParseException {
        super(firstName, lastName, birthday);
    }

    public Student() {
    }

    public String input(String enteredText) throws IOException {
//        super.input();
        System.out.printf("Thank you. This was related to Student %s %s.");
        return enteredText;
    }

    @Override
    public void output() {
        System.out.println(toString());
        System.out.println();
    }

    @Override
    public String toString() {
        String template = "Student : %s %s \t  Born: %s    Age: %d    Tax Number: %s   ";
        return (String.format(template, lastName, firstName, birthday, age, taxNumber));
    }

    /* Static method create an empty person of Employee type and uses input method to fill all fields */
    public static Student createNewStudent() throws IOException, ParseException {
        Student newStudent = new Student();
        newStudent.inputPersonData();
        return newStudent;
    }

    /*  Method to fill Student's fields */
    public void inputPersonData() throws IOException, ParseException {
        super.inputPersonData();
    }

}
