package com.academy.max.N3_OOP.hw3_2;

import java.util.Calendar;

public class Person {

    String name;
    int birthYear;
    int age;


    public void calculateAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        this.age = currentYear - birthYear;
    }

    public Person() {
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        calculateAge();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        return age;
    }
}






