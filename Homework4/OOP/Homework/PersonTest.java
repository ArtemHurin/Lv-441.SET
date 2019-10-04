package com.company.Homework4.OOP.Homework;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class PersonTest {


    @Test(priority = 1)
    public void testInput() {
        //Arrange
        Person person= new Person("Vova",1987);
        String expectedName = "Vova";
        int expectedBirthYear = 1987;
        //Act
        String actualNAme = person.getName();
        int actualBirthYear = person.getBirthYear();
        //Assert
        assertEquals(expectedName, actualNAme);
        assertEquals(expectedBirthYear, actualBirthYear);

    }

    @Test(priority = 2)
    public void testCountAge() {
        //Arrange
       Person person = new Person("Vova",1987);
        int expected = 32;
        //Act
        int actual = person.countAge();
        //Assert
        assertEquals(expected, actual);
    }


    @Test(priority = 3)
    public void testChangeName() {
        //Arrange
        Person person = new Person("Vova",1987);
        person.changeName("Oleg");
        String expected = "Oleg";
        //Act
        String actual = person.getName();
        //Assert
        assertEquals(expected, actual);
    }
}