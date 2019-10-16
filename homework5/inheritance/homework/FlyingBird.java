package com.company.homework5.inheritance.homework;

public class FlyingBird extends Bird {

    public FlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.print("I can fly,");
    }
}
