package com.company.Homework4.OOP.Homework;

public class PersonMain {

    public static void main(String[] args) {
        Person[] person = new Person[5];
        person[0] = new Person("Ivan", 1989);
        person[1] = new Person("Oleg", 2000);
        person[2] = new Person("Vova", 1987);
        person[3] = new Person();
        person[3].setName("Vasya");
        person[3].setBirthYear(1965);
        person[4] = new Person();

        person[3].changeName("Vanya");

        person[4].input("Taras", 2001);


        for (int i = 0; i < person.length; i++) {
            person[i].countAge();
            person[i].output();
        }


    }
}
