/*
 * This application is created  for handling list of Students and theirs courses.
 */
package set.oop.set.oop.hw2.student;

import java.util.Comparator;
/**
 * class SortByName that implements Comparator <Student> .
 * Class is created for comparing values Student's LastName.
 *
 * @version 1.1
 * @author Nataliia.
 */

public class SortByName implements Comparator<Student> {
    /**
     * Overrided method for comparing values Student's LastName.
     * @param o1 instance of Student.
     * @param o2 instance of Student
     * @return result of comparing to Objects.
     */
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
