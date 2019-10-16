package com.company.homework5.inheritance.homework;

public class NonFlyingBird extends Bird {

    public NonFlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.print("I can`t fly,");
    }
}
