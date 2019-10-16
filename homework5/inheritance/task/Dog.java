package com.company.homework5.inheritance.task;

public class Dog implements Animal {

    @Override
    public void voice() {
        System.out.println("Wow");
    }

    @Override
    public void feed() {
        System.out.println("Dogs eat meat");
    }
}
