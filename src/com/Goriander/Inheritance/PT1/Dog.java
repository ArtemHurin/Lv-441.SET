package com.Goriander.Inheritance.PT1;

import com.Goriander.Inheritance.PT1.Animals;

public class Dog extends Animals {

    @Override
    public void Voice() {
        System.out.println("Dog voice: Gaf gaf");
    }

    @Override
    public void Feed() {
        System.out.println("Dog feed");
    }
}
