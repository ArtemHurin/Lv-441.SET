package com.company.homework5.inheritance.homework;

public class BirdMain {

    public static void main(String[] args) {

        Bird[] bird = new Bird[4];
        bird[0] = new Eagle("brown feathers", "big eggs");
        bird[1] = new Swallow("black feathers", "small eggs");
        bird[2] = new Penguin("black and white feathers", "large eggs");
        bird[3] = new Chicken("white feathers", "middle eggs");

        for (int i = 0; i < bird.length; i++) {
            bird[i].fly();
            System.out.println(" I am " + bird[i].getClass().getSimpleName() + ", " + bird[i]);
        }

    }
}
