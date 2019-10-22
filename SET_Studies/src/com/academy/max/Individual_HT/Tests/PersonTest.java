package com.academy.max.Individual_HT.Tests;

import com.academy.max.Individual_HT.Person;
import com.academy.max.Individual_HT.Student;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.util.Date;

import static org.testng.Assert.*;

public class PersonTest {

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testCalculateDateInDateFormat() throws ParseException {
        //Arrange
        Person testPerson = new Student("Oleh", "Barancev", "TN6545678", "03-12-1997");
        String expectedDate = "Wed Dec 03 00:00:00 EET 1997";
        // Act
        Date calculated = testPerson.calculateDateInDateFormat(testPerson.getBirthday());
        String actualDate = calculated.toString();
        //Assert
        assertEquals(expectedDate, actualDate);
    }

    @Test
    public void testCalculateAge() throws ParseException {
        //Arrange
        Person testPerson = new Student("Oleh", "Barancev", "TN6545678", "03-12-1997");
        int expected = 22;
        //Act
        int actual = testPerson.calculateAge();
        //Assert
        assertEquals(actual,expected);
    }
}