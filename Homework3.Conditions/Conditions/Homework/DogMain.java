package com.company.Homework3.Conditions.src.edu.Lv441.Conditions.Homework;



public class DogMain implements DogBreed{

	public static void main(String[] args) {

		Dog dog1 = new Dog("Richard", Breed.Sheepdog, 5);
		Dog dog2 = new Dog("Arni", Breed.Akita, 8);
		Dog dog3 = new Dog("Fine", Breed.labrador, 2);

		if (dog1.getName().equals(dog2.getName()) || dog1.getName().equals(dog3.getName())
				|| dog2.getName().equals(dog3.getName())) {
			System.out.println("You have some dogs with the same name");
		}

		if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {
			System.out.println("The oldest dog is " + dog1.getName());
		} else if (dog2.getAge() > dog1.getAge() && dog2.getAge() > dog3.getAge()) {
			System.out.println("The oldest dog is " + dog2.getName());
		} else if (dog1.getAge() == dog2.getAge()) {
			System.out.println(dog1.getName() + " and " + dog3.getName() + " have the same age and are the oldest");
		} else if (dog1.getAge() == dog3.getAge()) {
			System.out.println(dog1.getName() + " and " + dog3.getName() + " have the same age and are the oldest");
		} else if (dog2.getAge() == dog3.getAge()) {
			System.out.println(dog2.getName() + " and " + dog3.getName() + " have the same age and are the oldest");
		} else {
			System.out.println("The oldest dog is " + dog3.getName());
		}

	}

}
