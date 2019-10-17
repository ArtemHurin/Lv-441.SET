package com.Goriander.Inheritance.HW1;

public abstract class Bird {
    String _feathers;
    String _layEggs;

    Bird()
    {
        System.out.printf("My class %s \n",this.getClass().toString());
    }

    public abstract void fly();
}
