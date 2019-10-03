package edu.Lv441.Conditions.Homework;

import edu.Lv441.Conditions.Homework.DogBreed.Breed;

public class DogMain {

	public static void main(String[] args) {

		Dog dog1 = new Dog("Richard", Breed.Sheepdog, 5);
		Dog dog2 = new Dog("Arni", Breed.Akita, 8);
		Dog dog3 = new Dog("Fine", Breed.labrador, 2);

		if (dog1.getName().equals(dog2.getName()) || dog1.getName().equals(dog3.getName())
				|| dog2.getName().equals(dog3.getName())) {
			System.out.println("You have some dogs with the same name");
		}
		
		if(dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {
			System.out.println("The odest dog is " + dog1.getName());
		}

	}

}
