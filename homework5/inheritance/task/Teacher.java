package com.company.homework5.inheritance.task;

public class Teacher extends Staff {

    private final String TYPE_PERSON;

    public Teacher(String name) {
        super(name);
        this.TYPE_PERSON = "Teacher";
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }



    @Override
    public void print() {
        System.out.println("I am a " + getTYPE_PERSON());
    }

    @Override
    public void salary() {
        System.out.println("As a " + TYPE_PERSON + " I earn 4000$");
    }
}
