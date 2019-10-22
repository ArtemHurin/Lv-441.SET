//        Сreate class Dog with fields name, breed, age.
//        Declare enum for field breed.
//        Create 3 instances of type Dog.
//        Check if there is no two dogs with the same name.
//        Display the name and the kind of the oldest dog.

// This task intentionally is made with if-else statements only


package com.academy.max.N2_Conditions.hw2_8;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {


        Dog doggy1 = new Dog("Sirko", 5, Breed.AKITA);
        Dog doggy2 = new Dog("Barsyk", 15, Breed.MOODI);
        Dog doggy3 = new Dog("Jack", 3, Breed.POODLE);


        if (doggy1.getName().equals(doggy2.getName()) ||
                doggy2.getName().equals(doggy3.getName()) ||
                doggy1.getName().equals(doggy3.getName())) {
            System.out.println("Some dogs have same name");
        } else {
            System.out.println("All three dogs have different names");
        }

        if (doggy1.getAge() == doggy2.getAge() && doggy1.getAge() == doggy3.getAge()) {
            System.out.printf("All dogs are of the same age \n");
            System.out.println(doggy1);
            System.out.println(doggy2);
            System.out.println(doggy3);
        } else if (doggy1.getAge() == doggy2.getAge() && doggy1.getAge() >= doggy3.getAge()) {
            System.out.println("There are two oldest dogs with same age.");
            System.out.println(doggy1);
            System.out.println(doggy2);
        } else if (doggy2.getAge() == doggy3.getAge() && doggy2.getAge() >= doggy1.getAge()) {
            System.out.println("There are two oldest dogs with same age.");
            System.out.println(doggy3);
            System.out.println(doggy2);
        } else if (doggy1.getAge() == doggy3.getAge() && doggy1.getAge() >= doggy2.getAge()) {
            System.out.println("There are two oldest dogs with same age.");
            System.out.println(doggy1);
            System.out.println(doggy3);
        } else if (doggy1.getAge() > doggy2.getAge() && doggy1.getAge() > doggy3.getAge()) {
            System.out.printf("The oldest is: "+ doggy1);
        } else if (doggy2.getAge() > doggy3.getAge() && doggy2.getAge() > doggy1.getAge()) {
            System.out.printf("The oldest is: "+ doggy2);
        } else {
            System.out.printf("The oldest is: "+ doggy3);
        }


    }
}

