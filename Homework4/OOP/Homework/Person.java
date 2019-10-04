package com.company.Homework4.OOP.Homework;

import java.time.YearMonth;

public class Person {
    private String name;
    private int birthYear;
    private int age;

    public Person() {
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
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

    public void input(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public int countAge() {
        int year = YearMonth.now().getYear();
        age = year - this.birthYear;
        return age;
    }

    public void output() {
        System.out.println("Name - " + this.name + ", year of birth - " + this.birthYear + ", is " + age + " years old");
    }

    public void changeName(String name) {
        this.name = name;
    }
}
