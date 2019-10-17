package com.Goriander.Inheritance.PT2;

import com.Goriander.Inheritance.PT2.Staff;

public class Teacher extends Staff {

    final String TYPE_PERSON = "Teacher";

    public Teacher(String name)
    {
        super(name);
        System.out.printf("My profession is %s \n",TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.printf("I am %s \n",_name);
    }

    public void Salary()
    {
        System.out.println("Teacher salary");
    }

}
