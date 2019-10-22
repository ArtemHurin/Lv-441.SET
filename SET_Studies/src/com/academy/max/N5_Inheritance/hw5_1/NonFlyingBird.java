package com.academy.max.N5_Inheritance.hw5_1;

public abstract class NonFlyingBird extends Bird{

    @Override
    public void fly(){
        System.out.println("This bird can't fly");
    }
}
