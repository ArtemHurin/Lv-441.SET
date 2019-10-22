//    Create Console Application project in Java.
//        Add class Person to the project.
//        Class Person should consists of
//        two private fields: name and birthYear (the birthday year)
//        properties for access to these fields
//default constructor and constructor with 2 parameters
//        methods:
//        age - to calculate the age of person
//        input - to input information about person
//        output - to output information about person
//        changeName - to change the name of person
//        In the method main() create 5 objects of Person type and input information about them.


package com.academy.max.N3_OOP.hw3_2;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("Ivan");
        person1.setBirthYear(1987);

        Person person2 = new Person("Petro", 1976);
        Person person3 = new Person("Vasyl", 1992);
        Person person4 = new Person("Iryna", 1988);
        Person person5 = new Person("Maria", 1999);


        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);

    }
}

