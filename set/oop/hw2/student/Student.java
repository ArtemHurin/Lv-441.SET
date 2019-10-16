/*
 * This application is created  for handling list of Students and theirs courses.
 */

package set.oop.set.oop.hw2.student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * Class Student that contains the name of the student and his course. Class has: properties for access to these fields,
 * constructor with parameters,
 * method printStudents (List students, Integer course),
 * methods to compare students by name and by course.
 *
 * @version 1.1
 * @author Nataliia
 */
public class Student {
    /**
     * field lastName for inputing lastName of the Student
     */
    private String lastName;
    /**
     * field course for inputing course of Student.
     */
    private String course;
    /**
     * ArrayList for handling all Students in one framework.
     */
    private static List<Student> studentList= new ArrayList<>();

    /**
     * default constructor.
     */
    public Student(){};

    /**
     * constructor with 2 parameters.
     * @param lastName of Student.
     * @param course of Student.
     */
    public Student(String lastName, String course) {
        this.lastName = lastName;
        this.course = course;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public static List<Student> getStudentList() {
        return studentList;
    }

    public static void setStudentList(List<Student> studentList) {
        Student.studentList = studentList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(getLastName(), student.getLastName()) &&
                Objects.equals(getCourse(), student.getCourse());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLastName(), getCourse());
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    /**
     * method that returns empty value, add Object Student to the list.
     * Static method, relates to all class.
     * @param s Object Student.
     */
    public static void addingStudent(Student s){

        studentList.add(s);
    }
    /**
     * method that returns empty List of Students.
     * Static method, relates to all class.
     */
    public static List printing (){
        return studentList;
    }

    /**
     * method returns empty values, except Iterator that pass through Student objects thanks to iterator.hasNext.
     * @param iterator Iterator.
     */
    public static void printIterator(Iterator<Student> iterator){
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
