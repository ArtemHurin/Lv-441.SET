package com.Goriander.Condition;

import java.util.ArrayList;

public class Dog {
    //privat fields
    public static ArrayList<Dog> Objects = new ArrayList<>();
    private String _name;
    private BREED _breed;
    private int _age;
    //set
    public void setName(String name){_name=name;}
    public void setBreed(BREED breed){_breed=breed;}
    public void setAge(int age){_age=age;}
    //get
    public String getName(){return _name;}
    public BREED getBreed(){return _breed;}
    public int getAge() {return _age;}
    //constructor
    Dog(String name, BREED breed, int age)
    {
        this._name=name;
        this._breed=breed;
        this._age=age;
    }

}

enum BREED
{
    LABLADOR,
    PITBULL,
    PUDEL
}

