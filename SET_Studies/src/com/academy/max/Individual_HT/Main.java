//Define a class Person which contains:
//        •	Fields TaxNumber, firstname, lastname, birthdate
//        •	Constructor with parameters
//        •	Input() and output() methods for input/output from/to console
//        •	Getters and setters
//        •	Method GetAge() calculating the person’s age in full years
//        •	Overridden ToString() method
//        Define a descendant class Employee that has:
//        •	Additional field EmploymentDate, Wage
//        •	Constructor with parameters
//        •	Additional getters and setters
//        •	Overridden input() and output() methods

//        Create a collection of persons and add some different persons and students to it.
//        •	Output the data about employees elder than 40 years and wage less than 1000
//        •	Sort the data by firstname and lastname
//        •	Output the collection to a file
//        •	Implement exception handling
//        •	Serialize the collection to XML file
//        •	Deserialize it back
//        •	Write unit tests


package com.academy.max.Individual_HT;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.text.ParseException;
import java.util.*;

import static com.academy.max.Individual_HT.Comparators.*;
import static com.academy.max.Individual_HT.Helpers.inputIntNumber;
import static com.academy.max.Individual_HT.Helpers.answerYes;


public class Main {

    public static void main(String[] args) throws IOException, ParseException {

        final String SERIALIZED_FILE_NAME = "people.xml";
        List<Person> ourPeople = new ArrayList<>();

        ourPeople.add(new Employee("TN1432365", "Anastasia", "Pashko", "14-06-1976", "13-06-2017", 500));
        ourPeople.add(new Employee("TN7365257", "Roman", "Fedoryshyn", "23-03-1990", "13-06-2018", 1500));
        ourPeople.add(new Student("TN1236262", "Mariya", "Akunenko", "12-05-1985"));
        ourPeople.add(new Employee("TN7464532", "Iryna", "Avramenko", "03-03-1975", "13-06-2018", 700));
        ourPeople.add(new Student("TN1533265", "Vasyl", "Yavorsky", "30-05-1977"));
        ourPeople.add(new Employee("TN1236262", "Alex", "Ivanenko", "12-05-1989", "12-05-2017", 450));
        ourPeople.add(new Employee("TN7456543", "Hryhory", "Hrushak", "18-12-1993", "11-07-2017", 600));


        System.out.println("\nCreating new employee.");
        System.out.println("-----------------------");
        Employee newEmployee = Employee.createNewEmployee();
        ourPeople.add(newEmployee);

        System.out.println("\nCreating new student.");
        System.out.println("-----------------------");
        Student newStudent = Student.createNewStudent();
        ourPeople.add(newStudent);

        System.out.println("\nUnsorted List of People:");
        System.out.println("-------------------------");
        printListToConsole(ourPeople);


        /*     	Output the data about employees elder than 40 years and wage less than 1000  */

        System.out.println("Employees elder than 40 years and wage less than 1000: ");
        System.out.println("------------------------------------------------------");
        for (Person p : ourPeople) {
            if ((p instanceof Employee) && (p.calculateAge() > 40) && (p.getWage() < 1000)) {
                System.out.println(p);
            }
        }

        /*     	SORTING   */
        proposeUserToSortCollection(ourPeople);


        /*     Print all people's information to file. */
        printListToFile(ourPeople);
        System.out.println();


        /*   	Serialize the collection to XML file  */

        System.out.println("NOW SERIALIZING LIST OF PEOPLE TO THE FILE: people.xml");

        XMLEncoder encoder=null;
        try{
            encoder=new XMLEncoder(new BufferedOutputStream(new FileOutputStream(SERIALIZED_FILE_NAME)));
        }catch(FileNotFoundException fileNotFound){
            System.out.printf("ERROR: While Creating or Opening the File %s", SERIALIZED_FILE_NAME);
        }
        encoder.writeObject(ourPeople);
        encoder.close();


        /*   	Deserialize it back  */

        System.out.println("\nNOW DESERIALIZING FROM people.xml TO NEW COLLECTION and PRINTING IT\n");

        XMLDecoder decoder=null;
        try {
            decoder=new XMLDecoder(new BufferedInputStream(new FileInputStream(SERIALIZED_FILE_NAME)));
        } catch (FileNotFoundException e) {
            System.out.printf("ERROR: File %s was not found", SERIALIZED_FILE_NAME);
        }

        List<Person> peopleFromXML = new ArrayList<>();
        peopleFromXML=(ArrayList)decoder.readObject();
        printListToConsole(peopleFromXML);

    }


    /* Method proposes user to sort and print sorted collection of persons  */

    private static void proposeUserToSortCollection(List<Person> peopleCollection) throws IOException {
        boolean shouldSort = true;
        while (shouldSort) {
            System.out.println("\nWould you like to sort list of People? (yes/no)");
            if (!answerYes()) {
                shouldSort = false;
                continue;
            } else {
                shouldSort = actualSort(peopleCollection);
            }
        }
    }

    /* Method actually sorts people as per user's choice as many times as needed  */

    private static boolean actualSort(List<Person> listOfPeople) throws IOException {
        boolean shouldSort = true;
        boolean personExit = false;
        while (shouldSort) {
            System.out.println("\nHow to sort?");
            System.out.println("  1 - By Last name\n  2 - By First name\n  3 - By Birth date\n  4 - By type\n  5 - Exit");
            int answer = inputIntNumber();

            switch (answer) {
                case 1:
                    System.out.println("\nSorting by Last Name: ");
                    System.out.println("--------------------- ");
                    sortAndPrintOurPeople(listOfPeople, getLastNameComparator());
                    break;
                case 2:
                    System.out.println("\nSorting by First Name: ");
                    System.out.println("--------------------- ");
                    sortAndPrintOurPeople(listOfPeople, getFirstNameComparator());
                    break;
                case 3:
                    System.out.println("\nSorting by Birthdate: ");
                    System.out.println("--------------------- ");
                    sortAndPrintOurPeople(listOfPeople, getBirthDayComparator());
                    break;
                case 4:
                    System.out.println("\nSorting by Type: ");
                    System.out.println("-------------- ");
                    sortAndPrintOurPeople(listOfPeople, getUserTypeComparator());
                    break;
                case 5:
                    System.out.println("\nExiting...");
                    shouldSort = false;
                    personExit = true;
                    break;
            }

            if (!personExit) {
                System.out.println("Do you want to sort again?");
                if (!answerYes()) {
                    shouldSort = false;
                }
            }
        }
        return shouldSort;
    }


    /* Method prints information about People to console */

    private static void printListToConsole(List<Person> people) {

        for (Person p : people) {
            System.out.println(p);
        }
        System.out.println();
    }


    /* Method prints information about People in file people.txt */

    private static void printListToFile(List<Person> people) throws IOException {

        System.out.println("\nNOW PRINTING LIST OF PEOPLE TO THE FILE: people.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter("people.txt"));

        for (Person p : people) {
            writer.write(p.toString());
            writer.newLine();
        }
        writer.close();
    }

    /* Method sorts people according to comparator and prints information to console  */

    private static void sortAndPrintOurPeople(List<Person> ourPeople, Comparator comp) {

        ourPeople.sort(comp);
        printListToConsole(ourPeople);
    }
}


