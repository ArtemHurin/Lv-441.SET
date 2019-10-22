package com.academy.max.Individual_HT;

import java.util.Comparator;

public abstract class Comparators {

    static FirstNameComparator firstNameComparator = new FirstNameComparator();
    static LastNameComparator lastNameComparator = new LastNameComparator();
    static BirthDayComparator birthDayComparator = new BirthDayComparator();
    static UserTypeComparator userTypeComparator = new UserTypeComparator();

    /* Comparator getters */

    public static Comparator getFirstNameComparator() {
        return firstNameComparator;
    }
    public static LastNameComparator getLastNameComparator() {
        return lastNameComparator;
    }
    public static BirthDayComparator getBirthDayComparator() {
        return birthDayComparator;
    }
    public static UserTypeComparator getUserTypeComparator() {
        return userTypeComparator;
    }


    /* Comparator nested classes */

    private static class LastNameComparator implements Comparator<Person> {
        public int compare(Person person1, Person person2) {
            return person1.getLastName().compareTo(person2.getLastName());
        }
    }

    private static class FirstNameComparator implements Comparator<Person> {
        public int compare(Person person1, Person person2) {
            return person1.getFirstName().compareTo(person2.getFirstName());
        }
    }

    private static class BirthDayComparator implements Comparator<Person> {
        public int compare(Person person1, Person person2) {
            return person2.getBirthdayInDateFormat().compareTo(person1.getBirthdayInDateFormat());
        }
    }

    private static class UserTypeComparator implements Comparator<Person> {
        public int compare(Person person1, Person person2) {
            return ((person1.getClass()).toString()).compareTo(((person2.getClass()).toString()));
        }
    }






}
