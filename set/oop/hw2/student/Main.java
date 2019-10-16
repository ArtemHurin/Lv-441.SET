/*
 * This application is created  for handling list of Students and theirs courses.
 */
package set.oop.set.oop.hw2.student;

import java.util.Collections;
import java.util.Iterator;

/**
 * Class Main is created to test class Student  with methods printing, addingStudent, printIterator, class SortbyCourse,
 * class SortByName.
 *
 *  * @version 1.1
 *  * author Nataliia
 */
public class Main {
    public static void main(String[] args) {
        /**
         * adding objects od Students via addingStudent method from Student class.
         */
        Student.addingStudent(new Student("Janky", "Math"));
Student.addingStudent(new Student("Lin", "Biology"));
Student.addingStudent(new Student("Sand", "English"));
Student.addingStudent(new Student("Janky", "Chemistry"));
Student.addingStudent(new Student("Oushen", "Physics"));
/**
 * printing method from class Student from Student class.
 */
        System.out.println(Student.printing());
        /**
         * sorting method with SortByName class.
         */
        Collections.sort(Student.getStudentList(), new SortByName());
        /**
         * creating an object of Iterator.
         */
        Iterator<Student> iterator = Student.getStudentList().iterator();
        /**
         * printing sorted list via method printIterator from Student class.
         */
        Student.printIterator(iterator);
        /**
         * sorting method with SortBycourse class.
         */
        Collections.sort(Student.getStudentList(), new SortbyCourse());
        System.out.println("-------------------");
        /**
         * creating an object of Iterator.
         */
        Iterator<Student> iterator1 = Student.getStudentList().iterator();
        /**
         * printing sorted list via method printIterator from Student class.
         */
        Student.printIterator(iterator1);

    }
}
