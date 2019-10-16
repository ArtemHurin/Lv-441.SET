package com.company.homework5.inheritance.task;

public class PersonMain {

    public static void main(String[] args) {
        Person[] person = new Person[6];
        person[0] = new Teacher("Ivan");
        person[1] = new Cleaner("Vasyl");
        person[2] = new Cleaner("Taras");
        person[3] = new Student("Vova");
        person[4] = new Teacher("Taras");
        person[5] = new Student("Petro");

        for (int i = 0; i < person.length; i++) {
            person[i].print();
            if (person[i] instanceof Staff) {
                ((Staff) person[i]).salary();
            }
        }
    }
}
