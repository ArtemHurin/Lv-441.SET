//Develop abstract class Bird with attributes feathers and layEggs and an abstarct method fly(). ?Develop classes FlyingBird and NonFlyingBird. Create class Eagle, Swallow, Penguin and Chicken.
//        Create array Bird and add different birds to it.
//        Call fly() method for all
//        of it. Output the
//        information about
//        each type of
//        created bird

package com.academy.max.N5_Inheritance.hw5_1;

public class Main {

    public static void main(String[] args)  {

        Bird[] birds = new Bird[5];

        birds[0] = new Penguin() {};
        birds[1] = new Swallow() {};
        birds[2] = new Eagle() {};
        birds[3] = new Penguin() {};
        birds[4] = new Chicken() {};


        for (int i = 0; i<5; i++){
            System.out.print(birds[i]); //bird say about yourself
            System.out.print(". ");
            birds[i].fly();             //bird can you fly?
        }
    }
}