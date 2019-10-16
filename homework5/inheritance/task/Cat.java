package com.company.homework5.inheritance.task;

public class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("Meow");
    }

    @Override
    public void feed() {
        System.out.println("Cats eat fish");
    }
}
