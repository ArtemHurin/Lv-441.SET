package com.Goriander.Inheritance.PT2;

import com.Goriander.Inheritance.PT2.Person;

public class Student extends Person {

    public Student(String name)
    {
        super(name);
    }

    public void print()
    {
        System.out.printf("I am %s \n",_name);
    }
}
