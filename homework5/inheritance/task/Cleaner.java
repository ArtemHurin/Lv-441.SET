
package com.company.homework5.inheritance.task;

public class Cleaner extends Staff {

    private final String TYPE_PERSON;

    public Cleaner(String name) {
        super(name);
        this.TYPE_PERSON = "Cleaner";
    }

    @Override
    public void print() {
        System.out.println("I am " + TYPE_PERSON);
    }

    @Override
    public void salary() {
        System.out.println("As a " + TYPE_PERSON + " I earn 500$");
    }
}
