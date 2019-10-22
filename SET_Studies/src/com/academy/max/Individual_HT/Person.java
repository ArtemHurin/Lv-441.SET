package com.academy.max.Individual_HT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

public abstract class Person {

    //static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    String taxNumber;
    String firstName;
    String lastName;
    String birthday;
    int age;
    Date birthdayInDateFormat;
    double wage = 0.0;


    Person(String taxNumber, String firstName, String lastName, String birthday) throws ParseException {
        this.taxNumber = taxNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.birthdayInDateFormat = calculateDateInDateFormat(birthday); // Date format is parsed from string
        this.age = calculateAge();
    }

    public Person(String firstName, String lastName, String birthday) throws ParseException {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.birthdayInDateFormat = calculateDateInDateFormat(birthday); // Date format is parsed from string
        this.age = calculateAge();
    }

    public Person() {
    }


    /* Getters and setters */

    public String getTaxNumber() {
        return taxNumber;
    }
    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public Date getBirthdayInDateFormat() {
        return birthdayInDateFormat;
    }
    public double getWage() {
        return wage;
    }



    /* Methods */

    /* Method asks user to enter data about new Employee or Student. It is called from child classes. */

    public void inputPersonData() throws IOException, ParseException {

        System.out.printf("Please enter taxNumber (TN******* : should start with TN followed by 7 digits)\n");
        this.taxNumber = Helpers.inputTaxNumber();

        System.out.printf("Please enter last name\n");
        this.lastName = Helpers.inputName();

        System.out.printf("Please enter first name\n");
        this.firstName = Helpers.inputName();

        System.out.printf("Please enter birth date (dd-mm-yyyy) \n");
        birthday = Helpers.inputDate();

        this.birthdayInDateFormat = calculateDateInDateFormat(birthday);
        this.age = calculateAge();
    }

    /* Method prints information about Person to console */

    public void output() {
        System.out.println(toString());
        System.out.println();
    }

    /* Method calculates Date format out of string format */

    public Date calculateDateInDateFormat(String stringDateToConvert) {
        Date date = null;
        try {
            date = new SimpleDateFormat("dd-MM-yyyy").parse(stringDateToConvert);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /* Method calculates age of the person */

        public int calculateAge() throws ParseException {
            Calendar cal = Calendar.getInstance();
            int currentYear = cal.get(Calendar.YEAR);

            Date birthdayDate = new SimpleDateFormat("dd-MM-yyyy").parse(birthday);

            cal.setTime(birthdayDate);
            int birthdayYear = cal.get(Calendar.YEAR);
            return currentYear - birthdayYear;
        }
    }


